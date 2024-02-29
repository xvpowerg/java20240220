/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240229;
import java.util.Arrays;
public class Ch4_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {11,8,5,23,45,31,65,56};
        Arrays.sort(array);
        for (int v : array){
           System.out.print(v+" ");
        }
        System.out.println();
        
        int index = Arrays.binarySearch(array, 23);
        System.out.println(index);
        index = Arrays.binarySearch(array, 8);
         System.out.println(index);
         //小於所有 一律-1
         index = Arrays.binarySearch(array, 2);
         System.out.println(index);
         //大於所有 -1*(陣列長度 +1)
         index = Arrays.binarySearch(array, 78);
           System.out.println(index);
         //在中間
          index = Arrays.binarySearch(array, 25);
           System.out.println(index);
          index = Arrays.binarySearch(array, 52); 
           System.out.println(index);
           
    }
    
}
