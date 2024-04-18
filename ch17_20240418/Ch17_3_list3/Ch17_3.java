/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20240418.Ch17_3_list3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch17_3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList();
       list.add(10);
       list.add(52);
       list.add(63);
       int sum = 0;
       for (int v : list){
           sum += v;
       }
       System.out.println(sum);
    }
    
}
