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
public class Person implements Serializable{
    private int height;
    private int weight;
    Person(int height,int weight){
        this.height = height;
        this.weight = weight;     
    }
    public String toString(){
        return height+":"+weight;
    }
}
