/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240502.Ch21_7_option2;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author xvpow
 */
public class Ch21_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Optional.of(null);//不支持null
        //Optional.empty();
       Optional<String> op1Str =  Optional.ofNullable("Vivin");
       Optional op1Empty =  Optional.empty();
       
       System.out.println(op1Str.get());
       if (op1Empty.isPresent()){
                System.out.println(op1Empty.get());//如果內容是null會拋出java.util.NoSuchElementException
       }
       //如果在Optional內有數值才觸發
       op1Str.ifPresent((st)->System.out.println("ifPresent:"+st));
       op1Empty.ifPresent(v->System.out.println(v));
       
       op1Empty.ifPresentOrElse(v1->System.out.println("ifPresentOrElse:"+v1),
               ()->System.out.println("Empty"));
       
       //帶預設值
      System.out.println( op1Str.orElse("Default"));
     System.out.println( op1Empty.orElse("Default"));
    //帶預設值
     System.out.println( op1Str.orElseGet(()->"Default"));
     System.out.println( op1Empty.orElseGet(()->"Default"));
     
     System.out.println( op1Str.orElseThrow());//預設拋出 java.util.NoSuchElementException:
    //System.out.println( op1Empty.orElseThrow());
            try{
                op1Empty.orElseThrow(()->new RuntimeException());//可自訂拋出例外
            }catch(Throwable ex){
                System.out.println(ex);
            }   
      
    }
    
}
