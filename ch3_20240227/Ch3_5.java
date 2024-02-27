/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20240227;

/**
 *
 * @author xvpow
 */
public class Ch3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr1 = new int[2];//byte short int long 預設為0
        float[] arr2 = new float[2];//float double 0.0
        char[] arr3 = new char[2];//空白字元
        boolean[] arr4 = new boolean[2];//false
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);
        System.out.println(arr4[0]);
        
        String[] arr5 = new String[2]; //array內容是參考型態預設為null
        System.out.println(arr5[0]);
        System.out.println(arr5[0].equals(""));
    }
    
}
