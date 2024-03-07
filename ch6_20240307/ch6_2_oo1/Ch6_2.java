/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240307.ch6_2_oo1;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new Student();建立物件 
        Student st1 = new Student();
        st1.name = "Ken";
        st1.age = 16;
        
        Student st2 = new Student();
        st2.name = "Vivin";
        st2.age = 20;
        st1.printInfo();
        st2.printInfo();
        //System.out.println(st1.name+":"+st1.age);
       // System.out.println(st2.name+":"+st2.age);
    
    }
    
}
