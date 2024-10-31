package de.DominikSitny.AbstractFactory.GuiUebung;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MacFactory implements AbstractFactory{

	@Override
	public JFrame createGui() {
		// TODO Auto-generated method stub
		GridLayout gl = new GridLayout(3,1);
        JPanel outerPanel = new JPanel(gl);
        outerPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        outerPanel.add(new JLabel("Wer war der letzte Europameister?"));
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JCheckBox checkBox1 = new JCheckBox("A: Lionel Messi");  
        JCheckBox checkBox2 = new JCheckBox("B: Angel Di Maria");
        JCheckBox checkBox3 = new JCheckBox("C: Jamal Musiala");
        panel.add(checkBox1);    
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.setBorder(new MacCheckbox().createMacBorder());
        outerPanel.add(panel);
        outerPanel.add(new MacButton().createButton(panel));
        JFrame frame = new JFrame();
        frame.setContentPane(outerPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Quiz");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		return frame;
	}



}
