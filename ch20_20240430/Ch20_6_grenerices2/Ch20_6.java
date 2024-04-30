/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240430.Ch20_6_grenerices2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch20_6 {

     static void testList(ArrayList<Test1> list){
         list.forEach(t->System.out.println(t));
     }
     //Test2子類型的泛型都可
     //不可新增
     static void testList2(ArrayList<? extends Test2> list){
        for (Test2 t2 : list){
            System.out.println(t2);
        }
     }
     static void testList3(ArrayList<? super Test3> list){
         for (Object t : list){
             System.out.println(t);
         }
         //只能加Test3類型
         list.add(new Test3());
      
     }
    public static void main(String[] args) {
         ArrayList<Test3> t4List = new ArrayList<>();
         ArrayList<Test2> t5List = new ArrayList<>();
          ArrayList<Test1> t6List = new ArrayList<>();
          t4List.add(new Test3());
          t5List.add(new Test2());
          t6List.add(new Test1());
          testList3(t4List);
          testList3(t5List);
          testList3(t6List);
         ArrayList<Test4> t7List = new ArrayList<>();
          //testList3(t7List);
          System.out.println("===============================");
        //Test2子類型的泛型都可
       ArrayList<Test3> t3List = new ArrayList<>();
       t3List.add(new Test3());
       t3List.add(new Test3());
       t3List.add(new Test3());
       testList2(t3List);
          System.out.println("===============================");
        
        ArrayList<Test1> t1List = new ArrayList<>();
        t1List.add(new Test1());
        t1List.add(new Test1());
        t1List.add(new Test1());
        t1List.add(new Test2());
        testList(t1List);
        //泛型不支持多型
       ArrayList<Test2> t2List = new ArrayList<>();
       t2List.add(new Test2());
       t2List.add(new Test2());
       t2List.add(new Test2());
       //testList(t2List);
       

    }
    
}
