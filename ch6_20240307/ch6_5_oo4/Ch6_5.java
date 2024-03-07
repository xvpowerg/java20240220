/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240307.ch6_5_oo4;

/**
 *
 * @author xvpow
 */
public class Ch6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Windows win1 = new Windows("win1",25.5f,
                60.3f,"red");
        win1.printInfo();
        Windows win2 = new Windows("win2");
        win2.printInfo();
        //name color w:125 h:125
        Windows win3 = new Windows("Win3","black");
        win3.printInfo();
                       
        
    }
    
}
