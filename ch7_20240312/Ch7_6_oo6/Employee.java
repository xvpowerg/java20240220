/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240312.Ch7_6_oo6;

/**
 *
 * @author xvpow
 */
public class Employee extends Person{
    public Employee(String name,float height){
        super(name,height);
    }
    public void printInfo(){
        System.out.print("Employee:");
        super.printInfo();
    }
}
