/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240312.Ch7_6_oo6;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private float height;
    
    Person(String name,float height){
        this.name = name;
        this.height = height;
    }
    
    public void printInfo(){
        System.out.println(name+":"+height);
    }
}
