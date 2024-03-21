/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20240321.ch10_6_initblock2;

/**
 *
 * @author xvpow
 */
public class Ch10_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println(Item.getMsg(10));
        Item item = new Item();
        System.out.println(item.getMsg(10));
        System.out.println(item.getMsg(5));
    }
    
}
