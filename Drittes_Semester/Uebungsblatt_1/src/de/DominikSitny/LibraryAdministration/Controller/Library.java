package de.DominikSitny.LibraryAdministration.Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import de.DominikSitny.LibraryAdministration.Model.Book;

public class Library implements LibraryInterface{

	private List<Book> buchList;
	private final String path = "/Users/dominiksitny/Development/University/Drittes_Semester/Uebungsblatt_1/src/de/DominikSitny/LibraryAdministration/Model/Books.txt";
	
	public Library(List<Book> list) {
		
		this.buchList = list;
		try {
			readTxt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void createBook(Book buch) {
		// TODO Auto-generated method stub
		this.buchList.add(buch);
		writeTxt();
	}
	@Override
	public void deleteBook(Book buch) {
		// TODO Auto-generated method stub
		this.buchList.remove(buch);
		writeTxt();
	}
	@Override
	public List<Book> searchBooks(String searchCriteria) {
		searchCriteria = searchCriteria.toLowerCase();
		// TODO Auto-generated method stub
		List<Book> searchedBooks = new ArrayList<Book>();
		for(Book book : this.buchList) {
			if(book.getTitle().toLowerCase().contains(searchCriteria) || book.getAuthor().toLowerCase().contains(searchCriteria) || Integer.toString(book.getYear()).contains(searchCriteria)) {
				searchedBooks.add(book);
			}
		}
		return searchedBooks;
	}
	
	public void writeTxt() {
		PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(new File(this.path)));
            Iterator<Book> iter = this.buchList.iterator();
            while(iter.hasNext() ) {
                Object o = iter.next();
                printWriter.println(o);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(printWriter != null) printWriter.close();
        }	
	}
	
	public void readTxt() throws IOException {
		String fileName = this.path;
		Path path = Paths.get(fileName);
		byte[] bytes = Files.readAllBytes(path);
		List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);		
		for(String line : allLines) {
			String[]bookData = line.split(";");
			this.buchList.add(new Book(bookData[0], Integer.parseInt(bookData[1]), bookData[2]));
		}
		
	}
}
