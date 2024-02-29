/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240229.ch4_5_func3;

/**
 *
 * @author xvpow
 */
public class Ch4_5 {

    static int sum(int v1,int v2,int v3){
        return v1+v2+v3;
    }
    //長參數
    //語法糖
    static int sum2(int ... v){
        int result = 0;
        for (int s : v){
            result += s;
        }
        return result;
    }
    public static void main(String[] args) {
       System.out.println(sum(2,5,3));
       System.out.println(sum2(2,5,3,6,7,8,8));
    }
    
}
