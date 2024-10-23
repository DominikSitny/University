package de.DominikSitny.LibraryAdministration.Controller;

import java.io.IOException;
import java.util.List;

import de.DominikSitny.LibraryAdministration.Model.Book;

public interface LibraryInterface {
	
	public void createBook(Book buch);
	
	public void deleteBook(Book buch);
	
	public List<Book> searchBooks(String searchCriteria);
	
	public void readTxt() throws IOException;
	
	public void writeTxt();
}
