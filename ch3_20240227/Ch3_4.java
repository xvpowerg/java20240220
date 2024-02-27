/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;

/**
 *
 * @author xvpow
 */
public class Ch3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] array1 = new int[2][3];
       int[] array2[] = new int[2][3];
       int array3[][] = new int[2][3];
       
       int[][] array4 = {{12,33,45},
                          {6,7,8}};
       int[][] array5 = new int[][]{{1,2},
                                    {3,4},
                                    {5,6}};
       
       //for輸出
       for (int i = 0; i < array4.length;i++){
           for (int k = 0;k<array4[i].length;k++){
               System.out.print(array4[i][k]+" ");
           }
           System.out.println();
       }
       System.out.println("======================");
       //foreach輸出
       for (int[] array : array5){
           for(int v : array){
               System.out.print(v+" ");
           }
           System.out.println();
       }
    }
    
}
