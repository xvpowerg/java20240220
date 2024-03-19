/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20240319.ch9_5_exception2;

/**
 *
 * @author xvpow
 */
public class Ch9_5 {

    public static void main(String[] args) {
      TestException ex1 = 
              new TestException();
      try{
          ex1.testException(25);   
      }catch(Exception ex){
          System.out.println(ex);
      }
      try{
          ex1.testRuntimeException(20);
      }catch(RuntimeException ex){
          System.out.println(ex);
      }
       
        
    }
    
}
