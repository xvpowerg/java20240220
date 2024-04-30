/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240430.Ch20_8_stream1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch20_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(50);
      list.add(25);
      list.add(70);
      list.add(82);
      int sum = 0;
      for (int v : list){
          sum += v;
      }
      System.out.println(sum);
      
      int sum2 =  list.stream().mapToInt(i->i).sum();
      System.out.println(sum2);
    }
    
}
