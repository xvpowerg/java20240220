/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20240402.ch13_4_interface3;
import java.util.function.Predicate;

public class EvenPredicate implements Predicate<Integer> {
    public boolean test(Integer v){
        return v % 2 == 0;
    }
}
