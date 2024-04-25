/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240425.Ch19_6_map2;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch19_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         HashMap<String,Integer> map = new HashMap();
        map.put("Ken", 85);
        map.put("Lucy", 77);
        map.put("Iris", 94);
        
        map.put("Lucy", 88);
        System.out.println(map.get("Lucy"));
          int input = 99;
          String key = "Iris";
        
          if (!map.containsKey(key)){
                map.put(key, input);
          }
          System.out.println(key+":"+map.get(key));
          
          int input2 = 55;
          String key2 = "Ken";
          map.putIfAbsent(key2, input2);
         System.out.println(key2+":"+map.get(key2));
    }
    
}
