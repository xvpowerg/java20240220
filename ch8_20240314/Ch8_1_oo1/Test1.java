/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240314.Ch8_1_oo1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){
       System.out.println("Test1()!");
    }
    
    Test1(String s1){
        this(s1,10);
        System.out.println(
        "Test1(String s1)");
    }
    
    Test1(String s1,int v1){
      this();
      System.out.println("Test1(String s1,int v1)");   
    }
}
