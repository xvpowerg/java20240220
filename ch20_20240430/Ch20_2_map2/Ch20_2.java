/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240430.Ch20_2_map2;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<String,Integer> map = new HashMap<>(); 
       map.put("Ken",25);
       map.put("Lucy",77);
       map.put("Vivin",88);
       map.put("Iris",66);
       
       map.merge("Vivin", 75, (v1,v2)->{
         System.out.println(v1+":"+v2);
       return v1;
       });
       //key存在做merge
      map.merge("Iris", 25, (v1,v2)->v1+v2);
      System.out.println(map);
       //key不存在直接寫入
      map.merge("Ben", 36, (v1,v2)->v1+v2);
      System.out.println(map);
    }
    
}
