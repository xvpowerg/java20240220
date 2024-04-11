/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20240411.Ch15_2_lambda2;
import java.util.ArrayList;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch15_2 {
    //接收String 轉換成 Item
    static ArrayList<Item> toItemList(ArrayList<String> list,
            Function<String,Item> func){
        ArrayList<Item> items= new ArrayList();
        for (String data : list){
           items.add(func.apply(data)) ;
        }
        return items;
    }
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        
        ArrayList<Item> itemList  =  toItemList(list,s->{return new Item(s);});
        System.out.println(itemList);
      ArrayList<Item> itemList2  =  toItemList(list,Item::new);
      System.out.println(itemList2);
    }
    
    
}
