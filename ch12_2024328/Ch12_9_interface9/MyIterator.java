/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_2024328.Ch12_9_interface9;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public interface MyIterator {
    String next(int i);
   int size();
   default void foreach(Consumer<String> consumer){
       for (int i = 0; i <size() ;i++){
          String msg =  next(i);
          consumer.accept(msg);
       }
   }
}
