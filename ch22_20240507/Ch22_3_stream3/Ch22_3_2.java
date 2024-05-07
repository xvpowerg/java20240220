/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240507.Ch22_3_stream3;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch22_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();
        Item i1 = new Item(10, "A");
        Item i2 = new Item(30, "B");
        Item i3 = new Item(20, "C");
        
        
        list.add(i1);
        list.add(i2);
        list.add(i3);
  
     Map<String,Integer> map =   
             list.stream().collect(Collectors.toMap(it->it.getName(), 
                it->it.getPrice()));
     System.out.println(map);
    }
    
}
