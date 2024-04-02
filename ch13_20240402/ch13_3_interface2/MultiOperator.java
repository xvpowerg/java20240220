/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20240402.ch13_3_interface2;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class MultiOperator implements UnaryOperator<Integer>  {
    private int n;
    public MultiOperator(int n){
        this.n = n;
    }
        public Integer apply(Integer v){
            return v * this.n;
        }
}
