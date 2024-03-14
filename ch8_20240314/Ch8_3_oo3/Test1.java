/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240314.Ch8_3_oo3;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){
        System.out.println("Test1()");
    }
    Test1(String msg){
        this(msg,10);
        System.out.println("Test1(String)");
    }
   Test1(String msg,int v2){
       this();
        System.out.println("Test1(String msg,int v2)");
    }
}
