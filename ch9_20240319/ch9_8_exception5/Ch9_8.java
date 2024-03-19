/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20240319.ch9_8_exception5;

/**
 *
 * @author xvpow
 */
public class Ch9_8 {
    
    static void testMyException()throws MyException{
        throw new MyException("我的例外");
    }
    
    public static void main(String[] args) {
       try{
          testMyException();  
       }catch(MyException ex){
           System.out.println(ex);
       }
       
        
    }
    
}
