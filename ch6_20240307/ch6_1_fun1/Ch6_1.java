/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20240307.ch6_1_fun1;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {
    static void test1(int v1,int v2){
        System.out.println("test1(int v1,int v2)");
    }
    static void test1(float v1,float x){
        System.out.println("test1(float v1,float x)");
    }
    static void test2(float f1,int v2){
        System.out.println("test2(float f1,int v2)");
    }
    static void test2(Integer v1,int v2){
         System.out.println("test2(Integer v1,int v2)");
    }
  
    static void test3(int v1,Integer v2){
        System.out.println("test3(int v1,Integer v2)");
    }
    static void test3(Integer v1,float f2){
         System.out.println("test3(Integer v1,float f2)");
    }
    public static void main(String[] args) {
        test3(5,6f);
        
        //test2(5,6);
        //test2(Integer.valueOf("12"),6);
        
        //test1(5,6);
        //test1(5,6.2f);
    }
    
}
