/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20240314.Ch8_4_2_oo4;
import ch8_20240314.Ch8_4_oo4.Test1;
/**
 *
 * @author xvpow
 */
public class Ch8_4_2 {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.publicStr);
        
        Test2 t2 = new Test2();
        t2.testProtected();
    }
    
}
