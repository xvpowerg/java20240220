/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20240411.Ch15_4_String;

/**
 *
 * @author xvpow
 */
public class Ch15_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg = "ABCDEFGH";
      int index = msg.indexOf("F");
      System.out.println(index);

      String newMsg = msg.substring(2);
      System.out.println(newMsg);
      
     int cod =  msg.codePointAt(0);
     System.out.println(cod);
     char c = msg.charAt(0);
       System.out.println(c);
    
    }
    
}
