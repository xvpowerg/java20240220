/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240430.Ch20_7_grenerices3;

/**
 *
 * @author xvpow
 */
public class Ch20_7 {

    public static void main(String[] args) {
      int v1 =  Test1.getValue(10);
      String v2 =  Test1.getValue("Ken");
      System.out.println(v1);
      System.out.println(v2);
      Test1.testFunc1("Value", 
              (String v)->System.out.println(v));
      Test1.testFunc1(20, 
              (Integer v)->System.out.println(v));
       Test1.<String>testFunc1("Ken", 
              (String v)->System.out.println(v));
    }
    
}
