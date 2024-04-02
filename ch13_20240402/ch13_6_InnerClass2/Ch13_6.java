/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20240402.ch13_6_InnerClass2;

/**
 *
 * @author xvpow
 */
public class Ch13_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StaticInnerClass.MyMsg mymsg = 
               new StaticInnerClass.MyMsg("Conn...to db");
       System.out.println(mymsg);
    }
    
}
