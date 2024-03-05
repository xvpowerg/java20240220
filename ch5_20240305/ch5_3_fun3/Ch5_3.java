/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240305.ch5_3_fun3;

/**
 *
 * @author xvpow
 */
public class Ch5_3 {

   
    public static void main(String[] args) {
        //封箱類型 boxing
        //基本型態變物件類型就是封箱
        //byte Byte
        //short Short
        //int Integer
        //long Long
        
       //float Float
       //double Double
       
       //char Character
       
       //boolean Boolean
       
       //基本型態變物件
       int v1  = 10;
       Integer intObj = Integer.valueOf(v1);
       //解封箱
       int v2 =   intObj.intValue();
       System.out.println(v2);
       
       //自動封箱
       Integer intObj2 = 20;
       //自動解封箱
       int v3 = intObj2;
       System.out.println(v3);
    }
    
}
