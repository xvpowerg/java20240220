/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20240220;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {

    
    public static void main(String[] args) {
       boolean b1 = true;
       boolean b2 = false;
       System.out.println(b1 && b2);
       System.out.println(b1 || b2);
       System.out.println(!b1);
       //討論短路
       int v = 0;
       boolean b3 = b1 && ++v > 2;
       System.out.println(b3);
       System.out.println(v);
       v = 0;
       b3 = b2 && ++v > 2;
       System.out.println(b3);
       System.out.println(v);
       v = 0;
       boolean b4 = b2 || ++v > 2;
       System.out.println(b4);
       System.out.println(v);
       v= 0 ;
       b4 = b1 || ++v > 2;
       System.out.println(b4);
       System.out.println(v);
    }
    
}
