/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240321.ch10_3_override1;

/**
 *
 * @author xvpow
 */
public class Item  {
    private String name;
    private int price;
    Item(){}
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    
    public String toString(){
        return this.name+":"+this.price;
    }
    public boolean equals(Object obj){
        if (obj == null || obj instanceof Item == false){
            return false;
        }
        
        Item tmpItem = (Item)obj;
        
        if (tmpItem.price == this.price &&
                tmpItem.name .equals(this.name)){
            return true;
        }
        return false;
    }
}
