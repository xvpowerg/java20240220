/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240430.Ch20_3_map3;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch20_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();
           HashMap<String,Integer> map = new HashMap<>(); 
        Student st1 = new Student("Ken",75);
        Student st2 = new Student("Iris",85);
        Student st3 = new Student("Ken",55);
        Student st4 = new Student("Iris",67);
        Student st5 = new Student("Ken",75);
        Student st6 = new Student("Iris",94);
        list.add(st1);
        list.add(st2);
       list.add(st3);
       list.add(st4);
       list.add(st5);
       list.add(st6);
       for (Student st : list){
            String n = st.getName();
            map.merge(n, st.getScore(), (v1,v2)->v1+v2);
       }
       System.out.println(map);
    }
    
}
