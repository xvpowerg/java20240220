/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20240312.Ch7_1_oo1;

/**
 *
 * @author xvpow
 */
public class Ch7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person();
        p1.setName("Lucy");
        p1.setAge(15);
        p1.printInfo();
         Person p2= new Person("Iris",25);
         p2.printInfo();
         
        Person p3 = new Person();
        p3.printInfo();
    }
    
}
