/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20240326.ch11_1_Shadow1;

/**
 *
 * @author xvpow
 */
public class Ch11_1 {

    //甚麼是遮蔽
    //1 靜態的是遮蔽
    //2 所有屬性都是遮蔽
    //遮蔽 看類別
    //複寫 看物件
    public static void main(String[] args) {
       Test1 t1 = new Test2();
       t1.value = "Test2";
       t1.func1();
    }
    
}
