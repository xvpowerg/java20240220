/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240326.ch11_5_abstract1;

/**
 *
 * @author xvpow
 */
public class Cat  extends Animal{
    Cat(String name,int age){
        super(name,age);
    }
    public String title(){
        return "Cat:";
    }
//    public String toString(){
//        return "Cat:"+super.toString();
//    }
}
