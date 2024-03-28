/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_2024328.Ch12_10_interface10;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Ch12_10 {

    static void test(int v,Supplier<Exception> suppex)throws Exception{
        if (v < 0){
            throw suppex.get();
        }
        System.out.println("V:"+v);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Supplier exSp = new ExceptionSupplier();
        try{
            test(-20,exSp); 
        }catch(Exception ex){
           System.out.println(ex);
        }
       
    }
    
}
