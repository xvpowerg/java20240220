/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240418.Ch17_4_list4;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch17_4 {

    static void printList(List<Integer> myList){
        for (int v : myList){
            System.out.print(v+" ");
        }
        System.out.println();
    }
    
    static void addAll(List<Integer> myList,List<Integer> tmpList){
        for (int v : tmpList){
            myList.add(v);
        }
    }
    static void addAll(int i ,List<Integer> myList,List<Integer> tmpList){
        for (int v : tmpList){
            myList.add(i++,v);
        }
    }
    static void removeAll(List<Integer> myList,List<Integer> delList){
        for (Integer v :delList){
            myList.remove(v);
        }
    }
    
    static int indexOf(int v,List<Integer> myList){
        
        for (int i = 0; i <myList.size();i++){
            if (myList.get(i) == v){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       ArrayList<Integer> myList = new ArrayList();
       myList.add(20);
       myList.add(15);
       myList.add(70);
      printList(myList);
       myList.add(1, 36);
       printList(myList);
       myList.add(3,19);
       printList(myList);
       myList.add(3,11);
       printList(myList);
       ArrayList<Integer> data2 = new ArrayList();
       data2.add(120);
       data2.add(720);
       data2.add(886);
      myList.addAll(data2);
       printList(myList);
     ArrayList<Integer> data3 = new ArrayList();
     data3.add(612);
     data3.add(514);
     addAll(myList,data3);
     printList(myList);
     
   ArrayList<Integer> data4 = new ArrayList();
   data4.add(321);
   data4.add(357);
     myList.addAll(2, data4);
     printList(myList);
   ArrayList<Integer> data5 = new ArrayList();
   data5.add(520);
   data5.add(521);  
   addAll(1,myList,data5);
     printList(myList);
     myList.set(1, 250);
     printList(myList);
     myList.remove(Integer.valueOf(521) );
    printList(myList);
    ArrayList<Integer> del = new ArrayList();
    del.add(36);
    del.add(11);
    del.add(19);
    myList.removeAll(del);
    printList(myList);
    ArrayList<Integer> del2 = new ArrayList();
    del2.add(120);
    del2.add(357);
    removeAll(myList,del2);
        printList(myList);
    //所有的奇數 x %2 != 0
    myList.removeIf(x->x % 2 !=0);
    printList(myList);
    //所有小於100的移除
    myList.removeIf(x->x < 100);
    printList(myList);
    
    myList.replaceAll(v->v + 10);
     printList(myList);
     
     int i = myList.indexOf(896);
     System.out.println(i);
     int i2 =  indexOf(896,myList);
     System.out.println(i2);
    }
    
}
