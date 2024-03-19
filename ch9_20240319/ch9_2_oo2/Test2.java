/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240319.ch9_2_oo2;
public class Test2 extends Test1 {
    public int testInt(){
        System.out.println("Test2 testInt");
        return 20;
    }
    
   public Test2 testObj(){
         System.out.println("Test2 testObj()");
         return new Test2();
    }
}
