/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20240423.Ch18_4_set2;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    public Item(String name,int price){
        this.name = name;
        this.price = price;        
    }
    public String toString(){
        return name+":"+price;
    }
    
    public boolean equals(Object obj){
        System.out.println("equals");
        if (obj == null || obj instanceof Item == false){
            return false;
        }
        Item temp = (Item)obj;
        return this.price == temp.price && this.name.equals(temp.name);
    }
    //hashCode 一樣 物件相等機率高
    //hashCode 不一樣物件一定不相等
    public int hashCode(){
        return this.price + this.name.hashCode() ;
    }
 
}
