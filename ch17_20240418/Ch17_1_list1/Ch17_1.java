/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240418.Ch17_1_list1;
import java.util.ArrayList;
public class Ch17_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList list = new ArrayList();
      list.add("Ken");
      list.add("Vivin");
      list.add("Joy");
      for(int i = 0; i < list.size();i++){
          System.out.print(list.get(i)+" ");
      }
       System.out.println();
       for (Object v : list){
           System.out.print(v+" ");
       }
        System.out.println();
        list.forEach(obj->{
            System.out.print(obj+" ");
        });
        
    }
    
}
