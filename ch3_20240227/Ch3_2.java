/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;

/**
 *
 * @author xvpow
 */
public class Ch3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[]array1 = new int[5];
       int array2[] = new int[5];
       
       int[] array3 = {5,10,52};//只能用在宣告
       for (int i =0; i < array3.length;i++){
           System.out.print(array3[i]+" ");
       }
       System.out.println();
       int[] array4 = new int[]{90,77,88,66};
       array3 = new int[]{19,27};
        //foreach
        for(int v : array3){
            System.out.print(v+" ");
        }
        System.out.println();
    }
    
}
