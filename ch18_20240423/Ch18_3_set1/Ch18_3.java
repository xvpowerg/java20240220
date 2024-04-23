/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240423.Ch18_3_set1;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch18_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //無順序
       HashSet<String> nameSet = new HashSet<>();
       nameSet.add("Ken");
       nameSet.add("Iris");
       nameSet.add("Vivin");
       nameSet.add("Ken");
       
       for (String v :nameSet){
           System.out.println(v);
       }
       
       System.out.println(nameSet.contains("Ken"));
       System.out.println(nameSet.contains("Vivin"));
       System.out.println(nameSet.contains("Joy"));
    }
    
}
