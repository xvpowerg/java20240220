/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20240430.Ch20_7_grenerices3;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Test1 {
    public static <T>  T getValue(T v){
        return v;
    }
    
    public static<T> void testFunc1(T v,Consumer<T> c){
        c.accept(v);
    }
    
}
