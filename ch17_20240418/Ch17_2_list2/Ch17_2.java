/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240418.Ch17_2_list2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(25);
        list.add(50);
        list.add("25");
        list.add(75);
        int sum = 0;
        for (int i = 0; i < list.size();i++){
//            try{
//                sum += (Integer)list.get(i);
//                System.out.println(list.get(i)); 
//            }catch(Exception ex){
//                System.out.println("有問題的資訊:"+list.get(i));   
//            }
              if (list.get(i) instanceof Integer)
                        sum += (Integer)list.get(i);
               System.out.println(list.get(i)); 
          
        }
        System.out.println(sum);
    }
    
}
