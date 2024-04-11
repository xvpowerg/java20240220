/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20240411.Ch15_1_lambda1;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch15_1 {
    static String test1(String v1,Function<String,String> func){
        return func.apply(v1);
    }
    
    static String test2(String msg){
        StringBuilder sb = new  StringBuilder();
           for(int i = 1 ; i <= msg.length();i++){
               char c = msg.charAt(i - 1) ;
               if (i % 2 == 0){
                   sb.append(String.valueOf(c).toLowerCase());
               }else{
                   sb.append((c+"").toUpperCase());
               }
           }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String msg = "ABCDEF";
        String lowerMsg =  test1(msg,s->s.toLowerCase());
        System.out.println(lowerMsg);
        String msg2 = test1(msg,Ch15_1::test2);
        System.out.println(msg2);
        
        String msg3 = "ghjk";
        String newMsg2 =  test1(msg,String::toUpperCase);
        System.out.println(newMsg2);
        //msg.toLowerCase()
        
    }
    
}
