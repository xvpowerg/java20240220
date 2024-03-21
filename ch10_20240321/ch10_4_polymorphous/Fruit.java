/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240321.ch10_4_polymorphous;

/**
 *
 * @author xvpow
 */
public class Fruit {
    private String name;
    private int price;
    Fruit(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    public String toString(){
        return name+":"+price;
    }
}
