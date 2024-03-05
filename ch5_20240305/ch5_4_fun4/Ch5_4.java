/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240305.ch5_4_fun4;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {

    public static void main(String[] args) {
        String id = "10";
       int v1 = Integer.parseInt(id);
       System.out.println(v1 + 2);
       System.out.println(id + 2);
       
       String binary = Integer.toBinaryString(2567);
       String oct = Integer.toOctalString(2567);
       String hex = Integer.toHexString(2567);
       System.out.println(binary);
       System.out.println(oct);
       System.out.println(hex);
       
       System.out.println(Integer.MAX_VALUE);
       System.out.println(Integer.MIN_VALUE);
        
    }
    
}
