/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240305.ch5_4_fun4;

/**
 *
 * @author xvpow
 */
public class Ch5_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);
        boolean b2 = Boolean.parseBoolean("false");
        System.out.println(b2);
        boolean b3 =  Boolean.parseBoolean("tRuE");
        System.out.println(b3);
        //只要不是true就是false
        boolean b4 =  Boolean.parseBoolean(null);
        System.out.println(b4);
        boolean b5 = Boolean.parseBoolean("阿里不搭");
        System.out.println(b5);
    }
    
}
