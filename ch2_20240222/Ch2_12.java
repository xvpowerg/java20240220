/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240222;

/**
 *
 * @author xvpow
 */
public class Ch2_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] scoreArray = new int[5];
       scoreArray[1] = 92;
       scoreArray[3] = 81;
       for (int i = 0; i < scoreArray.length;i++){
           System.out.print(i+":"+scoreArray[i]+" ");
       }
       
    }
    
}
