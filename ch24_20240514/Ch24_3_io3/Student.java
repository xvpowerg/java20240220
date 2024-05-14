/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20240514.Ch24_3_io3;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Student implements Serializable {
    private String name;
    private int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+":"+age;
    }
}
