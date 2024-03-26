/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20240326.ch11_5_abstract1;

/**
 *
 * @author xvpow
 */
public class Ch11_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Animal an1 = new Dog("Bobo",2);
       //Cat
       Animal an2 = new Cat("Nini",1);
       System.out.println(an1);//Dog Bobo 2
       System.out.println(an2); //Cat Nini 1      
        
       
    }
    
}

