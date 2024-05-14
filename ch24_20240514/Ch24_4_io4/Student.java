/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20240514.Ch24_4_io4;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Student extends Person implements Serializable {
    private String name;
    private int age;
    Student(String name,int age,int height,int weight){
        super(height,weight);
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+":"+age+":"+super.toString();
    }
}
