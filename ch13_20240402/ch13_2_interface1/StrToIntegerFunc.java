/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20240402.ch13_2_interface1;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class StrToIntegerFunc implements Function<String,Integer> {
    public Integer apply(String st){
        return Integer.parseInt(st);
    }
}
