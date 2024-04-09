/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240409.ch14_4_lambda4;

/**
 *
 * @author xvpow
 */
public class Ch14_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test3 t3 = (float x)->{
            String result = "x:"+x*x;
            return result;
        };
        String ans1 = t3.func3(5);
        System.out.println(ans1);
        
        Test3 t3_2 = x ->  "x:"+(x*x*x);
        String ans2 =  t3_2.func3(3);
         System.out.println(ans2);
    }
    
}
