/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240425.Ch19_2_set2;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch19_2 {

   private static class MyComparator implements Comparator<Student>{
       boolean asc = true;
       MyComparator(){}
       MyComparator(boolean desc){
           asc = !desc;
       }
       
       public int compare(Student st1,Student st2){
            //st1 大於 st2 回傳正數
            //st1 小於 st2 回傳負數
            //st1 等於 st2 回傳0
            int result = 0;
            if (st1.getScore1()>st2.getScore1() ){
                result = 1;
            }else if(st1.getScore1() < st2.getScore1()){
               result = -1;
            }else if(st1.getScore2() > st2.getScore2()){
               result = 1;
            }else if (st1.getScore2() < st2.getScore2()){
               result = -1;
            }else{
                result = st1.getName().compareTo(st2.getName());
            }
            return asc?result:result*-1;
       }
   }
    public static void main(String[] args) {
     Student st1 = new Student("Ken",87,75);
     Student st2 = new Student("Vivin",51,83);
     Student st3 = new Student("Lucy",76,83);
     Student st4 = new Student("Joy",76,83);
     Student st5 = new Student("Ken",87,95);
     Student st6 = new Student("Iris",87,75);
     //預設 小大
     //設定true大到小
     MyComparator cmp = new MyComparator(false);
     TreeSet<Student> set = new TreeSet(cmp);
     set.add(st1);
      set.add(st2);
       set.add(st3);
        set.add(st4);
         set.add(st5);
       set.add(st6);
       set.forEach(st->System.out.println(st));
    }
    
}
