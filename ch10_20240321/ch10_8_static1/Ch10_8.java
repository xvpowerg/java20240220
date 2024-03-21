/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20240321.ch10_8_static1;

/**
 *
 * @author xvpow
 */
public class Ch10_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TestStatic ts1 = new TestStatic();
        TestStatic ts2 = new TestStatic();
        ts1.msg = "A1";
        ts2.msg = "A2";
        //static 共享
        ts1.staticMsg = "S1";
        ts2.staticMsg = "S2";
        System.out.println(ts1);
        System.out.println(ts2);
    }
    
}
