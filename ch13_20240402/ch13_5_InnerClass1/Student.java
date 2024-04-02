/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20240402.ch13_5_InnerClass1;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private String className;
    private ArrayList<Book> books = new ArrayList();
    Student(String name){
        this.name = name;
        className = "A班";
    }
    
    public void addBook(String name,String isbn){
        Book book = new Book(name,isbn);
        books.add(book);
    }
    //???
    public void printBooks(Consumer<Book> con){
        for (Book book : books){
            con.accept(book);
        }
    }
    class Book{
        private String name;
        private String isbn;
        Book(String name,String isbn){
            this.name = name;
            this.isbn = isbn;
        }
        public String getName(){
            return name;
        }
        public String getIsbn(){
            return isbn;
        }
        
        public String toString(){
            return Student.this.name+":"+className+":" +this.getName()+":"+this.getIsbn();
        }
    }
    
    
}
