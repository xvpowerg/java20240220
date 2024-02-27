/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;
import java.util.Arrays;
public class Ch3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array1 = {8,7,5,16,3};
       Arrays.sort(array1);
       for (int v : array1){
           System.out.print(v+" ");
       }
        System.out.println();
        //小寫> 大寫 >數字
        String[] array2 = {"ab","Zv","az","Ac","1234567"};
        Arrays.sort(array2);
        for(String v : array2){
            System.out.print(v+" ");        
        }
         System.out.println();
         
       int[] array3 = Arrays.copyOf(array1, array1.length);
         for (int v : array3){
             System.out.print(v+" ");
         }
         System.out.println();
    }
    
}
