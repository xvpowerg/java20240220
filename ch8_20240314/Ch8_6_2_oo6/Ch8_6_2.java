/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20240314.Ch8_6_2_oo6;
import ch8_20240314.Ch8_6_oo6.Test1;
import ch8_20240314.Ch8_6_oo6.Test1Protected;
import ch8_20240314.Ch8_6_oo6.Test1Default;
public class Ch8_6_2 {
    public static void main(String[] args) {
       Test1 t1 = new Test1();
       Test2 t2 = new Test2();
      // Test1Protected tp1 = new Test1Protected();//因為建構式是Protected
       Test2Protected tp2 = new Test2Protected();
       //Test1Default td = new Test1Default();
    }
    
}
