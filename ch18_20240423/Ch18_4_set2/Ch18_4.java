/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240423.Ch18_4_set2;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item item1 = new Item("Item1",10);
       Item item2 = new Item("Item2",20);
       Item item3 = new Item("Item3",30);
       Item item4 = new Item("Item1",10);
       HashSet<Item> hashSet = new HashSet();
       hashSet.add(item1);
       hashSet.add(item2);
       hashSet.add(item3);
       hashSet.add(item4);
       //price一樣 name也一樣 equals 回傳true
      //System.out.println(item1.equals(item4));
       
       System.out.println(hashSet);
    }
    
}
