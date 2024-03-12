/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240312.Ch7_3_oo3;

public class Cat extends Animal{
    Cat(){}
    Cat(String name,int age){
        //super();呼叫父類建構式
        //只能在建構式呼叫
        //只能是第一行命令
        super(name,age);
    }
    public void printInfo(){
        System.out.print("Cat:");
        super.printInfo();
    }
}
