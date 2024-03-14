/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240314.Ch8_3_oo3;

/**
 *
 * @author xvpow
 */
public class Test3 extends Test2 {
     Test3(){
         super("",10);
        System.out.println("Test3()");
    }
    Test3(String msg){
        this();
        System.out.println("Test3(String msg)");
    }
     Test3(String msg,int v2){
         this(msg);
        System.out.println("Test3(String msg,int v2)");
    }
}
