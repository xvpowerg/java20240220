/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15.beans2;

/**
 *
 * @author xvpow
 */
public class Car {
     private String name;
    public Car(String name){
        this.name = name;
    }
    public String toString(){
        return "Car:"+this.name;
    }
}
