/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240222;

/**
 *
 * @author xvpow
 */
public class Ch2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tag:
        for (int i =1; i <= 3; i++){
            System.out.println(i+"_Start");
            for (int k = 1; k <= 3; k++){
                System.out.println("for in "+i);
                if (i == 2){
                    continue tag;
                    //break tag;
                }
                System.out.println(i+"_"+k);
            }
            System.out.println(i+"_End");
        }
    }
    
}
