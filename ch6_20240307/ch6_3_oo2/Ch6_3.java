/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240307.ch6_3_oo2;

/**
 *
 * @author xvpow
 */
public class Ch6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person p1 = new Person();
       p1.name = "Lucy";
       p1.age = 25;
       p1.height = 165;
       p1.weight = 72;
       p1.printInfo();
       Person p2 = new Person("Vivin",16);
       p2.height = 178;
       p2.weight = 65;
       p2.printInfo();
       
    }
    
}
