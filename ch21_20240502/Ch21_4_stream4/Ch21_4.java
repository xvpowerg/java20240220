/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240502.Ch21_4_stream4;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch21_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList();
      list.add("Ken");
      list.add("Vivin");
      list.add("Lucy");
      list.add("Iris");
      list.add("Joy");
     list.add("Iris");
     double avg = 
             list.stream().filter(n->n.length() > 3).
                     mapToInt(st->st.length()).summaryStatistics().getAverage();
     System.out.println(avg);
     //大於長度大於3的字串長度平均值
    }
    
}
