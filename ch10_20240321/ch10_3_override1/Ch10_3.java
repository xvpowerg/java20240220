/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20240321.ch10_3_override1;

/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    public static void main(String[] args) {
        Item itm1 = new Item("Apple",10);
        Item itm2 = new Item("Apple",10);
        System.out.println(itm1);
        String msg = itm1+"";
        System.out.println(msg);
        
        System.out.println(itm1 == itm2);
        String info = null;
        System.out.println(itm1.equals(itm2));
        
    }
    
}
