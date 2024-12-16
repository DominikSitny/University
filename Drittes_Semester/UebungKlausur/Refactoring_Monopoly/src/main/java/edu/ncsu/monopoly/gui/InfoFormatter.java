package edu.ncsu.monopoly.gui;

import java.util.Hashtable;

import edu.ncsu.monopoly.CardCell;
import edu.ncsu.monopoly.Cell;
import edu.ncsu.monopoly.FreeParkingCell;
import edu.ncsu.monopoly.GoCell;
import edu.ncsu.monopoly.GoToJailCell;
import edu.ncsu.monopoly.JailCell;
import edu.ncsu.monopoly.PropertyCell;
import edu.ncsu.monopoly.RailRoadCell;
import edu.ncsu.monopoly.UtilityCell;

public class InfoFormatter {
    static Hashtable cellInfoFormatters = null;

    static {
        if (cellInfoFormatters == null) {
            cellInfoFormatters = new Hashtable();
            addFormatters();
        }
    }

    private static void addFormatters() {
        cellInfoFormatters.put(
                PropertyCell.class, new PropertyCellInfoFormatter());
        cellInfoFormatters.put(
                GoCell.class, new GoCellInfoFormatter());
        cellInfoFormatters.put(
        		JailCell.class, new JailCellInfoFormatter());
        cellInfoFormatters.put(
        		GoToJailCell.class, new GotoJailCellInfoFormatter());
        cellInfoFormatters.put(
        		FreeParkingCell.class, new FreeParkingCellInfoFormatter());
        cellInfoFormatters.put(
                RailRoadCell.class, new RRCellInfoFormatter());
        cellInfoFormatters.put(
                UtilityCell.class, new UtilCellInfoFormatter());
        cellInfoFormatters.put(
                CardCell.class, new CCCellInfoFormatter());
    }

    public static String cellInfo(Cell cell) {
        CellInfoFormatter formatter =
                (CellInfoFormatter) cellInfoFormatters.get(cell.getClass());
        return formatter.format(cell);
    }

}
