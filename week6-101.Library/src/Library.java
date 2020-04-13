/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alesa
 */
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    
    public Library(){
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
        this.books.add(newBook);
    }
    
    public void printBooks(){
        for (Book book: books){
            System.out.println(book);
        }
    }
    public ArrayList<Book> searchByTitle(String title){
        //returns a list of all books matching this title
        ArrayList<Book> foundTitle = new ArrayList<Book>();
        
        for (Book book: this.books){
            if(StringUtils.included(book.title(), title)){
                foundTitle.add(book);
            }
        }
        return foundTitle;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> foundPublisher = new ArrayList<Book>();
        
        for (Book book: this.books){
            if (StringUtils.included(book.publisher(), publisher)){
                foundPublisher.add(book);
            }
        }
        return foundPublisher;
        
    }
    
    public ArrayList<Book> searchByYear(int year){
    
        ArrayList<Book> foundYear = new ArrayList<Book>();
        
        for (Book book: this.books){
            if (book.year() == year){
                foundYear.add(book);
            }
        }
        return foundYear;
    }
}
