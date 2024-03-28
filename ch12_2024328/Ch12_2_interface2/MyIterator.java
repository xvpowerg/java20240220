/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_2024328.Ch12_2_interface2;

/**
 *
 * @author xvpow
 */
public interface MyIterator {
   String next(int i);
   int size();
   default void foreach(){
       for (int i = 0; i <size() ;i++){
          String msg =  next(i);
          System.out.println(msg);
       }
   }
}
