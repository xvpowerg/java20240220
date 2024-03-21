/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240321.ch10_4_polymorphous;

/**
 *
 * @author xvpow
 */
public class Banana extends Fruit {
    Banana(String name,int price){
        super(name,price);
    }
    public String toString(){
        return "B:"+super.toString();
    }
}
