/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;
import java.util.stream.IntStream;
/**
 *
 * @author xvpow
 */
public class Ch3_1 {
    
    public static void main(String[] args) {
            int[] array1 = new int[5];
            array1[2] = 72;
            array1[3] = 83;
            array1[1] = 62;
           
            for (int i = 0; i < array1.length; i++){
                System.out.println(i+":"+array1[i]);
            }
            
            System.out.println("========================");     
            for (int v : array1){
                System.out.println(v);
            }
            System.out.println("========================");     
        IntStream.of(array1).forEach(System.out::println);
        
    }
    
}
