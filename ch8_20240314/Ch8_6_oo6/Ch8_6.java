/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20240314.Ch8_6_oo6;

/**
 *
 * @author xvpow
 */
public class Ch8_6 {
    public static void main(String[] args) {
       Test1 t1 = new Test1();
       Test1Protected tp1 = new Test1Protected();
       Test1Default t1d = new Test1Default();
      // Test1Private t1pr = new Test1Private();
      Test1Private t1pr2 = 
              Test1Private.newTest1Private();
    }
    
}
