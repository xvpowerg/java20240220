/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240305.ch5_5_fun5_overloading;

/**
 *
 * @author xvpow
 */
public class Ch5_5 {

     static void printNumber(float n){
        System.out.println("Number float:"+n);        
    }
    static void printNumber(int n){
        System.out.println("Number int:"+n);
    }
    public static void main(String[] args) {
        //多載
        //相同函式(方法)名稱 不同參數的數量 或類型
        //java會依 不同參數的數量 或類型 呼叫對應的函式
        printNumber(2.5f);
        printNumber(120);
        printNumber(2.5f);
    }
    
}
