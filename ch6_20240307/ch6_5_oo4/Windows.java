/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20240307.ch6_5_oo4;


public class Windows {
    private String name;
    private float weight;
    private float height;
    private String color;
    
    Windows(String inName,float inWeight,
            float inHeight,String inColor){
        name = inName;
        weight = inWeight;
        height = inHeight;
        color = inColor;
    }
    
    Windows(String inName){
        name = inName;
        weight = 100;
        height = 100;
        color = "blue";
    }
    
    Windows(String inName,String inColor){
        name = inName;
        color = inColor;
        weight = 125;
        height = 125;
    }
    
    public void printInfo(){
        System.out.println(name+":"+
                weight+":"+height+":"+color);
    }
}
