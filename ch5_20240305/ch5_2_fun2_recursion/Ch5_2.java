/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240305.ch5_2_fun2_recursion;

/**
 *
 * @author xvpow
 */
public class Ch5_2 {

    
    static void test1(int n){
        System.out.println("Test1 Start:"+n);
       if (n <= 3){
           System.out.println("Test1:"+n);
           test1(n + 1);
       }
       System.out.println("Test1 End:"+n);
    }
    
    public static void main(String[] args) {
        System.out.println("Main1....");
        test1(1);
        System.out.println("Main2....");
    }
    
}
