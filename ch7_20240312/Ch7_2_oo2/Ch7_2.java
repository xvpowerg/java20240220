/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20240312.Ch7_2_oo2;

/**
 *
 * @author xvpow
 */
public class Ch7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Window w1 = new Window("w1");
        Window w2 = new Window("w2",120);
        Window w3 = new Window("w3",120,25); 
        Window w4 = new Window("w4",95,70,"紅"); 
        w1.printInfo();
        w2.printInfo();
        w3.printInfo();
        w4.printInfo();
    }
    
}
