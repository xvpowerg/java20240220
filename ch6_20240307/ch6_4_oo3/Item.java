/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20240307.ch6_4_oo3;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    
    public void setName(String inName){
        if (inName == null || 
                !inName.toLowerCase().startsWith("ps") ){
            System.out.
                    println("錯誤的名稱:"+inName);
            return;
        }
        name = inName;
    }
    
    public String getName(){
        return name;
    }
    
    //存
    public void setPrice(int inPrice){
       if (inPrice < 17000){
           System.out.println("錯誤的金額:"+inPrice);
           return;
       }
        price = inPrice;
    }
    //領
    public int getPrice(){
        return price;
    }
    void printInfo(){
        System.out.println(name+":"+getPrice());
    }
}
