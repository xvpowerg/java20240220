/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20240220;

/**
 *
 * @author xvpow
 */
public class Ch1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //整數
        //byte  8bit -128~127
        //short  16bit-32768 ~ 32567
        //int 32bit -2147483648~2147483647
        //long 64bit 
        //浮點數
        //float 32bit
        //double 64bit
        //字元
        //char 16bit 0~65535
        //布林
        //boolean 1bit 
        
        byte b1 = 126;
        short s1 = 178;
        int shalary = 68000;
        long length = 2147483648L;//預設情況所有的整數數字都是int類型
        System.out.println("b1:"+b1);
        System.out.println("s1:"+s1);
        System.out.println("shalary:"+shalary);
        System.out.println("length:"+length);
   
        float pi = 3.1415f;//預設情況所有的有小數的數字都是double類型
        double e = 2.71828;
        System.out.println("pi:"+pi);
         System.out.println("e:"+e);
         
         char c1 = '中';
         System.out.println(c1);
         char c2 = 'A';//數字 < 大寫 < 小寫
         System.out.println(c2);
         
         char c3 = '9';
         System.out.println((int)c3);
         char c4 = 'Z';
         System.out.println((int)c4);
         char c5 = 'z';
         System.out.println((int)c5);
         
         char c6 = 90;
         System.out.println(c6);
         char c7 = 77;
         System.out.println(c7);
         
         boolean boo = true;
         boolean boo2 = false;
         System.out.println(boo);
         System.out.println(boo2);
         //字串不是基本型態
         String msg = "你好啊!";
         System.out.println(msg);
    }
    
}
