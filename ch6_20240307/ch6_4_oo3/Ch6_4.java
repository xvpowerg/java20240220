/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240307.ch6_4_oo3;

/**
 *
 * @author xvpow
 */
public class Ch6_4 {
    
    public static void main(String[] args) {
        //封裝 Encapsulation
       Item i1 = new Item();
       //開頭兩個必須PS 不可為null
       //錯誤的品名
       //i1.name = "PS7";
       //i1.price = 35000;
       i1.setPrice(35000);   
       i1.setName("PS7");
       i1.printInfo();
       
       Item i2 = new Item();
       //i2.name = "PS8";
       i2.setName(null);
       i2.setPrice(-35000);
      // i2.price = -35000;
       i2.printInfo();
       
       String test = "PS";
       System.out.println(
               test.startsWith("PS"));
               
       
    }
    
}
