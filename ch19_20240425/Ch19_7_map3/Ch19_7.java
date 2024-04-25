/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240425.Ch19_7_map3;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch19_7 {

    /**
     * @param args the command line arguments
     */
    static int getOrDefault(HashMap<String,Integer> map,String key,int defaultValue){
        if (!map.containsKey(key)){
            return defaultValue;
        }
         return   map.get(key);
        
    }
    public static void main(String[] args) {
       HashMap<String,Integer> map = new HashMap();
         map.put("Ken", 85);
        map.put("Lucy", 77);
        map.put("Iris", 94);
       map.forEach((k,v)->System.out.println(k+":"+v));
       String key = "Iris";
       //key不存在給預設值
       System.out.println(map.getOrDefault(key, -1));
        System.out.println(getOrDefault(map,key, -1));
    
    }
    
}
