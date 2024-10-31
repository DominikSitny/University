package de.DominikSitny.AbstractFactory.GuiUebung;

import java.util.Scanner;

public class Client{

	public static void main(String[] args) {
		
		System.out.println("Wählen Sie aus: Windows oder Mac Gui? (1/2)");
		Scanner sc = new Scanner(System.in);
		int output = sc.nextInt();
		
		if(output == 1) {
			new WindowsFactory().createGui();
		}
		
		if(output == 2) {
			new MacFactory().createGui();
		}
	}

}
