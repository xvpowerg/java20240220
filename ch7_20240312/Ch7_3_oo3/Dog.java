/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240312.Ch7_3_oo3;

/**
 *
 * @author xvpow
 */
//繼承
public class Dog extends Animal {
    Dog(){}
    Dog(String name,int age){
        setName(name);
        setAge(age);
    }
  //複寫override
    public void printInfo(){
        System.out.print("Dog:");
        //呼叫父類別的printInfo
        super.printInfo();
    }
}
