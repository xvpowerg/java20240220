/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240312.Ch7_4_oo4;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    //沒有任何建構式時 Java會預設寫一個建構式
    //所有建構式會預設呼叫super()
    Test2(){
        super();
        System.out.println("Test2()");
    }
    
}
