/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240326.ch11_5_abstract1;

/**
 *
 * @author xvpow
 */
//如果有抽象方法類別必須是抽象
public abstract class Animal {
    private String name;
    private int age;
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public abstract String title();
    public String toString(){
        return title()+this.name+":"+this.age;
    }
}
