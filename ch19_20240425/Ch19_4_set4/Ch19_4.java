/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240425.Ch19_4_set4;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author xvpow
 */
public class Ch19_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student st1 = new Student("Ken",87,75);
     Student st2 = new Student("Vivin",51,83);
     Student st3 = new Student("Lucy",76,83);
     Student st4 = new Student("Joy",76,83);
     Student st5 = new Student("Ken",87,95);
     Student st6 = new Student("Iris",87,75);
     //輸入
     //1 小到大
     //2 大到小
     Scanner scan = new Scanner(System.in);
     int action = scan.nextInt();
     Comparator<Student> cp1 =   Comparator.comparing(st->st.getScore1());
     cp1 = cp1.thenComparing(st->st.getScore2()).
             thenComparing(st->st.getName());
     
     if (action == 2){
        cp1 = cp1.reversed();    
     }
     
     TreeSet<Student> set = new TreeSet<>(cp1);
     
     set.add(st1);
      set.add(st2);
       set.add(st3);
        set.add(st4);
         set.add(st5);
       set.add(st6);
       set.forEach(st->System.out.println(st));
     
    }
    
}
