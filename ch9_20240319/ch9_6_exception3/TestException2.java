/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240319.ch9_6_exception3;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class TestException2 {
    public void testRuntimeException(int v){
        switch(v){
            case 1:
                throw new NullPointerException();
            case 2:
                throw new IllegalArgumentException();//參數傳入時用的錯誤
            case 3:
                throw new IndexOutOfBoundsException();
            case 4:
                throw new ArithmeticException();//數學計算錯誤
        }
    }
    
    
    public void testException(int v)
            throws IOException,FileNotFoundException,SQLException{
        switch(v){
            case 1:
                throw new IOException();
            case 2:
                throw new FileNotFoundException();
            case 3:
                throw new SQLException();
        }
    }
}
