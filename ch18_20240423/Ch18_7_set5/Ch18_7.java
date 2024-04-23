/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240423.Ch18_7_set5;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch18_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item it1 = new Item("Java",80);
        Item it2 = new Item("Python",10);
        Item it3 = new Item("C#",25);
        TreeSet<Item> set = new TreeSet();
        set.add(it1);
        set.add(it2);
        set.add(it3);
        set.forEach(v->System.out.println(v));
    }
    
}
