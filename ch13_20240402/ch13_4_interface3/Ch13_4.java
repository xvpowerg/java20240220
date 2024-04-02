/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20240402.ch13_4_interface3;
import java.util.function.Predicate;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch13_4 {

    static ArrayList<Integer> filter(int[] array,Predicate<Integer> p){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int v : array){
            if (p.test(v)){
                list.add(v);
            }
        }
        return list;
    }
    public static void main(String[] args) {
       int[] array = {2,3,5,6,7,8,9,10,11,12};
       EvenPredicate evp = new EvenPredicate();
       ArrayList<Integer> list = filter(array,evp);
       System.out.println(list);
    }
    
}
