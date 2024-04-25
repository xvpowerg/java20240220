/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20240425.Ch19_5_map1;
import java.util.HashMap;
import java.util.Set;
/**
 *
 * @author xvpow
 */
public class Ch19_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
        map.put("Ken", 85);
        map.put("Lucy", 77);
        map.put("Iris", 94);
        
        System.out.println(map.get("Lucy"));
        System.out.println(map.get("Vivin"));
        String key = "Ben";
        if (map.containsKey(key)){
            System.out.println(key+"存在");
        }else{
            System.out.println(key+"不存在");
        }
        Set<String> keySet =  map.keySet();
        for (String k : keySet){
            System.out.println(k+":"+map.get(k));
        }
    }
    
}
