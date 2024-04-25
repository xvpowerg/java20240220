/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240425.Ch19_3_set3;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch19_3 {

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
     //預設 小大
     //設定true大到小
     boolean desc = false;
            TreeSet<Student> set = new TreeSet<Student>((s1,s2)->{
            int[] cmps = {s1.getScore1() - s2.getScore1(),
             s1.getScore2() - s2.getScore2(),
            s1.getName().compareTo(s2.getName())};
            int[] sortOrder = {1,2,0};
            for (int i = 0; i < sortOrder.length;i++){
                int index = sortOrder[i];
                if (cmps[index] != 0){
                     return cmps[index] ;
                }
            }
         return 0;});
      
              
//       TreeSet<Student> set = new TreeSet<Student>((s1,s2)->{
//            int[] cmps = {s1.getScore1() - s2.getScore1(),
//             s1.getScore2() - s2.getScore2(),
//            s1.getName().compareTo(s2.getName())};
//            for (int i = 0; i < cmps.length;i++){
//                if (cmps[i] != 0){
//                     return cmps[i] ;
//                }
//            }
//         return 0;});
              
//     TreeSet<Student> set = new TreeSet<Student>((s1,s2)->{
//         int resutl =  s1.getScore1() - s2.getScore1();
//          if (resutl == 0){
//              resutl = s1.getScore2() - s2.getScore2();
//          }
//          if(resutl == 0){
//              resutl = s1.getName().compareTo(s2.getName());
//          }
//         return desc ? resutl * -1 :resutl;});
     set.add(st1);
      set.add(st2);
       set.add(st3);
        set.add(st4);
         set.add(st5);
       set.add(st6);
       set.forEach(st->System.out.println(st));
    }
    
}
