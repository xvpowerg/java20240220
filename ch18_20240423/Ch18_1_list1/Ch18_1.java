/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240423.Ch18_1_list1;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch18_1 {

    static void testList(LinkedList<String> list){
        for (String v:list){
            System.out.print(v+" ");
        }
         System.out.println();
        System.out.println("=========================");
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Joy");
        
        list.addFirst("Frist");
        list.addLast("Last");
        testList(list);
        
       String first =  list.getFirst();
       String last =  list.getLast();
       System.out.println(first);
       System.out.println(last);
       
        String v1 =  list.peek();//list內容不會越來越少
        System.out.println("Peek:"+v1);
        testList(list);
        String v2 =  list.poll();//list內容會越來越少
        System.out.println("Poll:"+v2);
         testList(list);
         
      LinkedList<String> list2 = new LinkedList<>();    
      list2.add("Ken");
      String v3 = list2.poll();
      System.out.println(v3);
      String v4 = list2.poll();//List無內容poll是null
      System.out.println(v4);
      
      LinkedList<String> list3 = new LinkedList<>();    
      list3.add("Iris");
      list3.add("Joy");
      list3.add("Vivin");
      list3.add("Ben");
      System.out.println("=========================");
      //迴圈搭配poll取值
      String pollValue = null;
      while( (pollValue =list3.poll()) != null ){
          System.out.println(pollValue);
      }
    System.out.println("=========================");
//        while(true){
//           String pollValue2 = list3.poll();  
//           if (pollValue2 == null) break;
//           System.out.println(pollValue2);
//        }
    }
    
}
