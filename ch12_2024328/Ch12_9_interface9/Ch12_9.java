/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_2024328.Ch12_9_interface9;

/**
 *
 * @author xvpow
 */
public class Ch12_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person p1 = new Person("Ken");
       p1.addFriend("Vivin");
       p1.addFriend("Lucy");
       p1.addFriend("Iris");
       p1.foreach(new MyConsumer());
    }
    
}
