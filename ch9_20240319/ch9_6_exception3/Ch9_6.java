/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20240319.ch9_6_exception3;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
public class Ch9_6 {
    public static void main(String[] args) {
       TestException2 te2 = new TestException2();
       try{
           te2.testException(0);
           System.out.println("Test Exception!");
           //FileNotFoundException 是 IOException的子類
           //所以IOException不能在FileNotFoundException之上
       }catch(FileNotFoundException ex ){
           System.out.println(ex);
       }catch(SQLException ex){
           System.out.println(ex);
       }catch(IOException ex){
            System.out.println(ex);
       }
       
        try{
           te2.testException(0);
           System.out.println("Test Exception!");
           //FileNotFoundException 是 IOException的子類
           //所以IOException不能在FileNotFoundException之上
       }catch(FileNotFoundException ex ){
           System.out.println(ex);
       }catch(SQLException | IOException ex){
           System.out.println(ex);
       }
        try{
            te2.testRuntimeException(4);
        }catch(NullPointerException ex){
            System.out.println(ex);
        }catch(IllegalArgumentException ex){
            System.out.println(ex);
        }catch(ArithmeticException  ex){
            System.out.println(ex);
        }catch(IndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        
        
    }
}
