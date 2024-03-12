/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20240312.Ch7_6_oo6;

/**
 *
 * @author xvpow
 */
public class Ch7_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //多型Polymorphism 
        //低耦合
        //Person st1 = new Student("Ken",178);
        Person st1 = new Employee("Ken",178);
        st1.printInfo();
    }
    
}
