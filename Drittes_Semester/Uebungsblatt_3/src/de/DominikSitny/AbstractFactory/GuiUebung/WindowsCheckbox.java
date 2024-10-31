package de.DominikSitny.AbstractFactory.GuiUebung;

import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

public class WindowsCheckbox implements AbstractCheckbox{

	@Override
	public TitledBorder createMacBorder() {
		// TODO Auto-generated method stub
		return BorderFactory.createTitledBorder("For Windows");
	}

}
