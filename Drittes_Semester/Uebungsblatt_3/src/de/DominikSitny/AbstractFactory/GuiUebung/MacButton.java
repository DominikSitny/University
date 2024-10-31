package de.DominikSitny.AbstractFactory.GuiUebung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class MacButton implements AbstractButton{

	@Override
	public JButton createButton(JPanel panel) {
		// TODO Auto-generated method stub
		JButton btn = new JButton("absenden");
        btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Das ist die Mac-Version");
				
				JCheckBox jb1 = (JCheckBox) panel.getComponent(0);

				JCheckBox jb2 = (JCheckBox) panel.getComponent(1);
			
				JCheckBox jb3 = (JCheckBox) panel.getComponent(2);
				
				if(jb1.isSelected() && jb2.isSelected()) {
					System.out.println("Sie lagen richtig");
				}else {
					System.out.println("Sie lagen nicht richtig");
				}
			}
		});
		return btn;
	}

}
