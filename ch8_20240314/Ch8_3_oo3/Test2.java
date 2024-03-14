/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240314.Ch8_3_oo3;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    Test2(){
        this("Msg",10);
        System.out.println("Test2()");
    }
    Test2(String msg){
        this();
        System.out.println("Test2(String msg)");
    }
     Test2(String msg,int v2){
        super(msg);
        System.out.println("Test2(String msg,int v2)");
    }
}
