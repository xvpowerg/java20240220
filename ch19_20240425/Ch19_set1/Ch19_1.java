/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240425.Ch19_set1;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch19_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Student st1 = new Student("Ken",87,75,true);
     Student st2 = new Student("Vivin",51,83,true);
     Student st3 = new Student("Lucy",76,83,true);
     Student st4 = new Student("Joy",76,83,true);
     Student st5 = new Student("Ken",87,95,true);
     Student st6 = new Student("Iris",87,75,true);
     
     TreeSet<Student> set = new TreeSet();
     set.add(st1);
      set.add(st2);
       set.add(st3);
        set.add(st4);
         set.add(st5);
       set.add(st6);
       
       set.forEach(st->System.out.println(st));
    }
    
    
}
