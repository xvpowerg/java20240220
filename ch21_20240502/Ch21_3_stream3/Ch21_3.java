/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240502.Ch21_3_stream3;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;

/**
 *
 * @author xvpow
 */
public class Ch21_3 {

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
     list.add("Iris");
     //過濾重複
      list.stream().distinct().forEach(v->System.out.println(v));
      System.out.println("================");
      list.stream().skip(2).forEach(v->System.out.println(v));
      
     long count = list.stream().count();
     System.out.println(count);
      System.out.println("================");
     list.stream().map(str->str.toUpperCase()).forEach(s->System.out.println(s));
    int sum =  list.stream().mapToInt(str->str.length()).sum();
    System.out.println(sum);
      IntSummaryStatistics  is = list.stream().mapToInt(str->str.length()).summaryStatistics();
      System.out.println(is.getAverage());
       System.out.println(is.getCount());
       
       
    }
    
}
