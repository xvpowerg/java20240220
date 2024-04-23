/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240423.Ch18_5_set3;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch18_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TreeSet<Integer> set = new TreeSet();
       set.add(10);
       set.add(25);
       set.add(73);
       set.add(15);
       set.add(19);
       set.forEach(v->System.out.print(v+" "));
       System.out.println();
       
       System.out.println(set.first());
        System.out.println(set.last());
        
        int v1 = set.floor(16);
        int v2 = set.lower(16);
         System.out.println(v1+":"+v2);
         int v3 = set.floor(15);//<=15
         int v4 =  set.lower(15);//<15
         System.out.println(v3+":"+v4);
         try{
            int v5 = set.floor(2); 
            System.out.println(v5);
         }catch(Exception ex){
             
         }
         
//         Integer v5 = set.floor(2);
//         if (v5 != null)
//               System.out.println(v5);
         
      int v6 =   set.ceiling(18);//>=18
      int v7 =   set.higher(18);//>18
      System.out.println(v6+":"+v7);
      int v8 =   set.ceiling(25);//>=25
      int v9 =   set.higher(25);//>25
      System.out.println(v8+":"+v9);
                
    }
    
}
