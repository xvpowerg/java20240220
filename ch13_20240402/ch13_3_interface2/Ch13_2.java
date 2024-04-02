/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20240402.ch13_3_interface2;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch13_2 {

    static void arrayCalculate(int[] arrays,UnaryOperator<Integer> op){
        for (int i = 0; i < arrays.length; i++){
            arrays[i] = op.apply(arrays[i]);
        }
    }
    public static void main(String[] args) {
        int[] array = {2,3,4,5};
        MultiOperator mo1 = new MultiOperator(100);
        arrayCalculate(array,mo1);
        for (int v : array){
            System.out.print(v+" ");
        }
        System.out.println();
    }
    
}
