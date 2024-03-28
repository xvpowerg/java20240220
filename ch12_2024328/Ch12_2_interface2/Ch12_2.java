/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_2024328.Ch12_2_interface2;

/**
 *
 * @author xvpow
 */
public class Ch12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person p1 = new Person("Ken");
       p1.addFriend("Vivin");
       p1.addFriend("Lucy");
       p1.addFriend("Iris");
       p1.foreach();
       
       Order order = new Order("order1");
       order.addDetail("Detail_1");
       order.addDetail("Detail_2");
       order.addDetail("Detail_3");
       order.foreach();
    }
    
}
