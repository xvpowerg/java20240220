/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240409.ch14_3_lambda3;

/**
 *
 * @author xvpow
 */
public class Ch14_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test2 f2 = (int x)->{
          for (int i = 1; i <= x; i++){
              System.out.print(i+" ");
          }  
          System.out.println();
        };
        f2.func2(5);
        
       Test2 f2_2 =(y) -> {
           System.out.println(y);
       };  
       f2_2.func2(5);
       
       Test2 f2_3 =y -> System.out.println(y);
       f2_3.func2(10);
       
       
    }
    
}
