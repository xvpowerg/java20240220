/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240409.ch14_5_lambda5;

/**
 *
 * @author xvpow
 */
public class Ch14_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test4 fun4 = (float h,float w) ->{
            h = h / 100;
           float bmi = w / (h*h); 
           return "BMI:"+bmi;
        };
        String bmi = fun4.func4(180, 60);
        System.out.println(bmi);
        
         Test4 fun4_2= (h,w) ->"bmi:" +(w / Math.pow(h/100,2));
         System.out.println(fun4_2.func4(190f,85f));
    }
    
}
