/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240430.Ch20_4_map4;
import java.util.TreeMap;
/**
 *
 * @author xvpow
 */
public class Ch20_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //排序的是key
        TreeMap<Integer,String> map = new 
        TreeMap<>((Integer v1,Integer v2)->{
        return (v1 - v2)*-1;
        });
        map.put(51, "Ken");
        map.put(32, "Lucy");
        map.put(27, "Iris");
        map.put(25, "Vivin");
        System.out.println(map);
    }
    
}
