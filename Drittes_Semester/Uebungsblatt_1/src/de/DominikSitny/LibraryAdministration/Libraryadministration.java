package de.DominikSitny.LibraryAdministration;

import de.DominikSitny.LibraryAdministration.View.EclipseConsole.ConsoleView;

/*
In dieser Aufgabe werden Sie grundlegende Architekturprinzipien wie Kapselung,
Modularität, Abstraktion und Lose Kopplung in einer Java-Anwendung entwerfen und
implementieren. Diese Prinzipien sollen sicherstellen, dass die Anwendung leicht
wartbar, erweiterbar und testbar bleibt.

Anwendungsbeschreibung: 
	Entwerfen Sie eine einfache Anwendung zur Verwaltung
	einer Bibliothek, die aus verschiedenen Büchern besteht. Die Anwendung soll es
	ermöglichen, Bücher hinzuzufügen, zu löschen und nach bestimmten Kriterien (z. B.
	Titel, Autor, Jahr) zu suchen.
Architekturanforderungen:
- Kapselung: 
	Die Felder einer Buchklasse (z. B. title, author, year) sollen privat sein, und
	der Zugriff darauf soll über Getter- und Setter-Methoden erfolgen.
- Modularität: Teilen Sie die Anwendung in logische Module auf, z. B. ein Modul für die
	Datenverwaltung (Bücher) und ein Modul für die Benutzerinteraktion
	(Benutzeroberfläche oder Konsole).
- Abstraktion: Erstellen Sie Schnittstellen für die Kernfunktionen der Anwendung (z. B.
	ein LibraryInterface, das Methoden wie addBook(), removeBook() und searchBook()
	definiert)
- Lose Kopplung: Verwenden Sie Abstraktionen und Schnittstellen, um eine lose
	Kopplung zwischen den Komponenten zu gewährleisten. Beispielsweise soll die
	Bibliotheksverwaltung nicht direkt mit der Benutzeroberfläche verknüpft sein, sondern
	über Schnittstellen kommunizieren.
*/

public class Libraryadministration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConsoleView cView = new ConsoleView();
		
	}

}
