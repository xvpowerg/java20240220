/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_2024328.Ch12_9_interface9;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyConsumer  implements Consumer<String>{
    public void accept(String s){
        System.out.println("Title:"+s);
    }
}
