/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20240402.ch13_5_InnerClass1;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch13_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student st1 = new Student("Ken");
      st1.addBook("Java","A0001");
      st1.addBook("Python","A0002");
      st1.addBook("C#","A0003");
      st1.printBooks(new Consumer<Student.Book>(){
         public void accept(Student.Book book){
             System.out.println(book+" ");
         }
      });
      
      Student.Book book1 = new Student("Iris").new Book("Go","B0001");
      System.out.println(book1);
      
    }
    
}
