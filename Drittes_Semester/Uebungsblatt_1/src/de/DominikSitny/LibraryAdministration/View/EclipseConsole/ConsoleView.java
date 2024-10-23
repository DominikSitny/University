package de.DominikSitny.LibraryAdministration.View.EclipseConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import de.DominikSitny.LibraryAdministration.Controller.Library;
import de.DominikSitny.LibraryAdministration.Controller.LibraryInterface;
import de.DominikSitny.LibraryAdministration.Model.Book;

public class ConsoleView {

	private Scanner sc = new Scanner(System.in);
	LibraryInterface lib;

	public ConsoleView() {
		this.lib = new Library(new ArrayList<Book>());
		start();
		boolean program = true;
		while(program){
			program = getMenue();
		}
		finish();
	}
	
	public void start() {
		System.out.println("Willkommen bei der Bibliotheksverwaltung.");
	}
	
	public void finish() {
		System.out.println("Die Bibliotheksverwaltung wird geschlossen.");
	}
	
	public boolean getMenue() {
		 System.out.println("Möchten Sie ein Buch erstellen, suchen oder löschen?. Das Programm beenden können Sie mit \"beenden\"");
		 String input = sc.nextLine();
		 switch(input) {
		 case "erstellen": createBook();return true;
		 case "löschen" : deleteBook();return true;
		 case "suchen": searchBook();return true;
		 case "beenden": return false;
		 default: System.out.println("Bitte geben Sie erstellen, suchen oder löschen ein.");
			 return true;
		 }
	}

	public void createBook() {
		System.out.println("Sie haben \"erstellen\" eingegeben. Sie erstellen jetzt ein neues Buch.");
		System.out.println("Geben Sie den Titel an:");
		String titel = sc.nextLine();
		System.out.println("Geben Sie das Jahr an:");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println("Geben Sie den Autor an:");
		String autor = sc.nextLine();
		this.lib.createBook(new Book(titel, year, autor));
		System.out.println("Das Buch wurde erstellt.");
	}
	
	public void deleteBook() {
		System.out.println("Sie haben \"löschen\" eingegeben. Sie können jetzt ein Buch löschen.");
		System.out.println("Suchen Sie nach einem Buch, dass Sie löschen möchten. Sie können nach Titel, Jahr & Autor filtern.");
		String searchCriteria = sc.nextLine();
		List<Book>bookList = this.lib.searchBooks(searchCriteria);
		if(bookList.size()==0) {
			System.out.println("Es wurde leider kein Buch gefunden.");
		}
		else if(bookList.size() == 1) {
			System.out.println("Sind Sie sich sicher, dass das Buch " + bookList.get(0).toString() + " löschen? (J/N)");
			String output = sc.nextLine();
			if(output.equalsIgnoreCase("j")) {
				lib.deleteBook(bookList.get(0));
			}else {
				System.out.println("Die Aktion wurde abgebrochen.");
			}
		}
		else {
			System.out.println("Wählen Sie das Buch aus:");
			int i=1;
			for(Book book : bookList) {
				System.out.println(i + ". " + book.toString());
				i++;
			}
			lib.deleteBook(bookList.get(sc.nextInt() - 1));
		}
		
	}	
	public void searchBook() {
		System.out.println("Sie haben \"suchen\" eingegeben. Sie können jetzt ein Bücher suchen.");
		System.out.println("Suchen Sie nach einem Buch. Sie können nach Titel, Jahr & Autor filtern.");
		String searchCriteria = sc.nextLine();
		List<Book>bookList = this.lib.searchBooks(searchCriteria);
		for(Book book : bookList) {
			System.out.println(book.toString());
		}
	}
	
}
