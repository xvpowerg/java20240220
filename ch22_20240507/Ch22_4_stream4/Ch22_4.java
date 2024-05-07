/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240507.Ch22_4_stream4;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch22_4 {

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
        
    Map<String,List<Item>> itemGroup =  
            list.stream().collect(Collectors.groupingBy(it->it.getName()));
    System.out.println(itemGroup);
    
   Map<String,Long> countMap =   list.stream().
            collect(Collectors.groupingBy(it->it.getName(),Collectors.counting()));
       System.out.println(countMap);
       
  Map<Boolean,List<Item>> pMap =  
          list.stream().collect(Collectors.partitioningBy(it->it.getPrice() > 10));
          
    System.out.println(pMap);
    List<String> dataList = new ArrayList();
    dataList.add("Ken");
    dataList.add("Vivin");
    dataList.add("Lucy");
    String msg =  dataList.stream().collect(Collectors.joining(",","Title:", "."));
    System.out.println(msg);
    
   String msg2 =  list.stream().map(it->it.getName()).distinct().
            collect(Collectors.joining(",", "Title:", "."));
   System.out.println(msg2);
    }
    
}
