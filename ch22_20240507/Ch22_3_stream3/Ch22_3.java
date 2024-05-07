/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240507.Ch22_3_stream3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch22_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();
        Item i1 = new Item(10, "A");
        Item i2 = new Item(20, "A");
        Item i3 = new Item(30, "B");
        Item i4 = new Item(10, "B");
        Item i5 = new Item(20, "C");
        Item i6 = new Item(30, "C");
        Item i7 = new Item(10, "A");
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        list.add(i6);
        list.add(i7);
        list.stream().filter(it->it.getPrice() > 10).
                forEach(System.out::println);
        System.out.println(list);
       List<Item> itemList =  list.stream().filter(it->it.getPrice() > 10).
                collect(Collectors.toList());
       System.out.println(itemList);
    }

}
