/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240507.Ch22_2_stream2;

import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch22_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(20);
       list.add(30);
       list.add(25);
       list.add(40);
       
      Optional<Integer> op1 =  list.stream().reduce((v1,v2)->{
           System.out.println(v1+":"+v2);
           return v1 + v2;
       });
     System.out.println(op1.get());
   int int2 =   list.stream().reduce(11, (v1,v2)->{
        System.out.println(v1+":"+v2);
        return v1+v2;
     });
   System.out.println(int2);
  int ans =  list.stream().parallel().reduce(2, (v1,v2)->{
   System.out.println("acc:"+v1+":"+v2);
   return v1+v2;
   }, (v1,v2)->{
     System.out.println("com:"+v1+":"+v2);
     return v1+v2;
   });
     
  System.out.println("ans:"+ans);
  
    }
    
}
