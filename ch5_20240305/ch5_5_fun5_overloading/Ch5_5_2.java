/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20240305.ch5_5_fun5_overloading;

/**
 *
 * @author xvpow
 */
public class Ch5_5_2 {
    static void test1(int v1){
        System.out.println("int test1:"+v1);
    }
    static void test1(long v2){
        System.out.println("long v2:"+v2);
    }
    static void test2(short s1){
        System.out.println("short s1:"+s1);
    }
    static void test2(long v2){
        System.out.println("long v2:"+v2);
    }
    
    //相同類型可相容
    static void test3(long v1){
        System.out.println("test3 long :"+v1);
    }
    //相同類型可相容
    static void test3(float v2){
        System.out.println("test3 float :"+v2);
    }
    //不相同類型可相容  
    static void test4(short s1){
        System.out.println("test4 short:"+s1);
    }
    //不相同類型可相容  
    static void test4(float f2){
        System.out.println("test4 float:"+f2);
    }
    //  轉封箱類型
    static void test5(byte b1){
        System.out.println("test5 byte:"+b1);
    }
    //  轉封箱類型
    static void test5(Integer v2){
     System.out.println("test5 Integer:"+v2);
    }
    
    static void test6(short s1){
        System.out.println("test6 short:"+s1);
    }
    static void test6(Float f1){
        System.out.println("test6 Float:"+f1);
    }
    
    static void test7(float pi){
        System.out.println(pi*2);
    }
    
    public static void main(String[] args) {
       /*
        方法名稱要一樣 參數數量要一樣 
        相同類型
        相同類型可相容
        不相同類型可相容  
        轉封箱類型
        */
       test7(2.5f);
       //Float不相容Integer       
       //test6(16);
       
       //test5(25);
       //test4(5);
        //test3(123);
        //test1(15);   
        //所有數字預設都是int
        //test2(225);
  
    }
    
}
