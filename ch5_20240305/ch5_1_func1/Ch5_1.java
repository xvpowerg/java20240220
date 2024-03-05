/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240305.ch5_1_func1;

/**
 *
 * @author xvpow
 */
public class Ch5_1 {
    
    //必須是最後一個參數
    static void test1(int range,String ... names){
        for (String n : names){
            System.out.println(n);
        }
        System.out.println(range);
    }
    
    public static void main(String[] args) {
       
       test1(10,"Len","Vivin","Joy");
    }
    
}
