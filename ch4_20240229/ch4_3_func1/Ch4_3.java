/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240229.ch4_3_func1;

/**
 *
 * @author xvpow
 */
public class Ch4_3 {
    //回傳數值類型  函數名稱  傳入參數
    static void func1(){
        System.out.println("Hello!");
    }
    
    static void func2(String name,int age){
        System.out.println(name+":"+age);
    }
    
    static int func3(int v1,int v2){
        int resutl = v1 * v2;
        return resutl;
    }
    //傳一個參數 幫我判斷是否大於60 是回傳true 否回傳false
    static boolean test(int v){
        boolean result = v > 60;
        return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //static的只能呼叫static的 
        //非static的能呼叫static的
        func1();
        func2("Vivin",25);
        func2("Ken",36);
        int v1 = func3(5,6);
        System.out.println(v1);
        boolean v2 = test(52);
        boolean v3 = test(66);
        System.out.println(v2+":"+v3);
    }
    
}
