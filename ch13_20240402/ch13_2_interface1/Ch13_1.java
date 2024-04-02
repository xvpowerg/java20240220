/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20240402.ch13_2_interface1;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch13_1 {

    static int strToInt(String str,Function<String,Integer> func){
        return func.apply(str);
    }
    public static void main(String[] args) {
        Function<String,Integer> fun1 = new StrToIntegerFunc();
        int number =   strToInt("256",fun1);
        System.out.println("number:"+number);
        Function<String,Integer> func2 = new StrToLen();
        int len =   strToInt("256",func2);
         System.out.println("len:"+len);
         
        // TODO code application logic here
    }
    
}
