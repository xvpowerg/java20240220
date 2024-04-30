/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240430.Ch20_1_map1;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch20_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<String,Integer> map = new HashMap<>(); 
       map.put("Ken",25);
       map.put("Lucy",77);
       map.put("Vivin",88);
       map.put("Iris",66);
       //key存在有反應
       map.compute("Ken",(key,value)->{
           System.out.println(key+":"+value);
       return value + 5;
       } );
        //key存在無反應
       map.computeIfAbsent("Vivin", (x)->{
           System.out.println("computeIfAbsent:"+x);
           return 10;});
       //key存在有反應
       map.computeIfPresent("Iris",(key,value)->{
           System.out.println(key+":"+value);
           return 100;
       });
       System.out.println(map);
       
       //key不存在有反應
       map.compute("Joy", (kye,value)->{
           System.out.println(kye+":"+value);
           return 10;
       });
           System.out.println(map);
           
           //compute key不存在回傳0 key存在回傳原本數+10 
         map.compute("Joy", (kye,value)->{
           if (value == null){
               return 0;
           }
           System.out.println(kye+":"+value);
           return value+10;
       });
         //key不存在有反應
         map.computeIfAbsent("Ben", (k)->{
                System.out.println(k);
                  return 99;
         });
       System.out.println(map);   
      //key不存在無反應
       map.computeIfPresent("Gigi",(key,value)->{
           System.out.println(key+":"+value);
           return 100;
       });
    }
    
}
