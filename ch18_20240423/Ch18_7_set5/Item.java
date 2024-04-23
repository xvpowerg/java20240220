/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20240423.Ch18_7_set5;


public class Item implements Comparable<Item> {
    private String name;
    private int price;
    public Item(String name,int price){
        this.name = name;
        this.price = price;        
    }
    //傳入it 小於目前數據回傳正數
    //傳入it 大於目前數據回傳負數
    //傳入it 等於目前數據回傳0
    public int compareTo(Item it){
        if (it.price < this.price){
            return 1;
        }else if (it.price > this.price){
            return -1;
        }
        return 0;
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
