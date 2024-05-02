/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20240502.Ch21_6_option1;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    Person(){
        
    }
    Person(String name){
        this.name = name;
    }
    public Optional<String> getName(){
        return Optional.ofNullable(name);
    }
}
