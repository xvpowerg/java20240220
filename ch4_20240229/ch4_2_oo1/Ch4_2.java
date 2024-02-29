/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240229.ch4_2_oo1;

/**
 *
 * @author xvpow
 */
public class Ch4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person();
        p1.name = "Ken";
        p1.age = 20;
        
        Person p2 = new Person();
        p2.name = "vivin";
        p2.age = 25;
        
        System.out.println(p1.name+":"+p1.age);
        System.out.println(p2.name+":"+p2.age);
        //vivin:25
    }
    
}
