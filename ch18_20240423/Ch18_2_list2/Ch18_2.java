/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240423.Ch18_2_list2;

import java.util.LinkedList;

/**
 *
 * @author xvpow
 */
public class Ch18_2 {

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
        testList(list);
        String p1 =  list.pop();
        System.out.println(p1);
         testList(list);
        String p2 =  list.pop();
        System.out.println(p2);
        String p3 =  list.pop();
         System.out.println(p3);
         //list.pop();
        System.out.println("==========================");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Ken");
        list2.add("Vivin");
        list2.add("Joy");
        
        
        //迴圈 加上 pop取出List數值
        
        while(true){
            try{
                  String v = list2.pop();
                   System.out.println(v);
            }catch(Exception ex){
                break;
            }
          
        }
        
//        while(!list2.isEmpty()){
//            System.out.println(list2.pop());
//        }
        
    }
    
}
