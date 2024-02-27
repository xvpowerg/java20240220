/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;

/**
 *
 * @author xvpow
 */
public class Ch3_3 {

    public static void main(String[] args) {
        int[][] array3x2 = new int[3][2];
        array3x2[1][0] = 79;
        array3x2[1][1] = 87;
        array3x2[2][0] = 72;
        System.out.println(array3x2.length);
        System.out.println(array3x2[0].length);
        
        for (int r = 0;r < array3x2.length;r++){
            for (int c = 0; c < array3x2[r].length; c++){
               System.out.print(array3x2[r][c]+" ");  
            }
             System.out.println();
        }
        System.out.println("========================");
        for (int[] a1 : array3x2){
           for (int v : a1){
               System.out.print(v+" ");
           } 
           System.out.println();
        }
    }
}
