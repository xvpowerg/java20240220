/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240418.Ch17_5_list5;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch17_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item item1 = new Item("A",100);
        Item item2 = new Item("B",50);
        Item item3 = new Item("C",77);
        Item item4 = new Item("B",50);
        //System.out.println(item1);//A:100
        ArrayList<Item> list = new ArrayList<>();
        list.add(item1);
        list.add(item2);
        list.add(item3);
        System.out.println(list);
        System.out.println(item4.equals(item2));
        System.out.println(list.indexOf(item4));
    }
    
}
