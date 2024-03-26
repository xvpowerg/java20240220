/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240326.ch11_5_abstract1;

/**
 *
 * @author xvpow
 */
public class Dog extends Animal{
    Dog(String name,int age){
        super(name,age);
    }
    public String title(){
        return "Dog:";
    }
//    public String toString(){
//        return "Dog:"+super.toString();
//    }
}
