/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20240502.Ch21_5_stream5;
import java.util.ArrayList;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Student {
   private ArrayList< String> books = new ArrayList();
   public void addBook(String s){
       books.add(s);
   }
   public  Stream< String>  getBooks(){
       return books.stream();
   }
}
