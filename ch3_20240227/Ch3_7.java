/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;

/**
 *
 * @author xvpow
 */
public class Ch3_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] array = new int[3][];
       array[0] = new int[]{8,3};
       array[2] = new int[]{4,5,6};
       
       System.out.println(array[0][1]);
       System.out.println(array[2][2]);
       //System.out.println(array[0][2]);//java.lang.ArrayIndexOutOfBoundsException
       System.out.println(array[1][0]);//java.lang.NullPointerException
    }
    
}
