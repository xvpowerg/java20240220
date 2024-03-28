/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_2024328.Ch12_6_interface6;

/**
 *
 * @author xvpow
 */
public interface TestIF3 extends TestIF1,TestIF2  {
     public default void myFunc(){
         System.out.println("TestIF3");
     }
}
