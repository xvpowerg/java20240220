/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240409.ch14_2_lambda2;

/**
 *
 * @author xvpow
 */
public class Ch14_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = ()->{
            System.out.println("Test1");
            System.out.println("Test1_2");
        };
        t1.func1();
       Test1 t2 = ()->System.out.println("Test1_3");
       t2.func1();
    }
    
}
