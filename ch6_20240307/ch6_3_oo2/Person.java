/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20240307.ch6_3_oo2;

/**
 *
 * @author xvpow
 */
public class Person {
    String name;
    int age;
    float height;
    float weight;
    //建構式
    Person(){}
    Person(String inName,int inAge){
        name = inName;
        age = inAge;
    }
    void printInfo(){
        System.out.println(name+":"+age+":"+height+":"+weight);
    }
}
