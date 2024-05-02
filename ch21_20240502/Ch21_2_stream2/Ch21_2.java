/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240502.Ch21_2_stream2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList();
      list.add("Ken");
      list.add("Vivin");
      list.add("Lucy");
      list.add("Iris");
      list.add("Joy");
      boolean b1 = list.stream().allMatch(n->n.length() >2);
      boolean b2 =  list.stream().anyMatch(n->n.length() >4);
      boolean b3 =   list.stream().noneMatch(n->n.length() < 2);
      System.out.println(b1+":"+b2+":"+b3);
      //短路
      boolean b4 = list.stream().peek(v->System.out.println(v)).allMatch(n->n.length() >2);
         
      System.out.println("======================================");
      boolean b5 = list.stream().
              peek(v->System.out.println(v)).allMatch(n->n.length() >3);
      System.out.println(b5);
         System.out.println("======================================");
      b5 = list.stream(). peek(v->System.out.println(v)).anyMatch(n->n.length() > 3);
       System.out.println(b5);
           System.out.println("======================================");
       b5 = list.stream(). peek(v->System.out.println(v)).noneMatch(n->n.length() >3);
       System.out.println(b5);
       
    }
    
}
