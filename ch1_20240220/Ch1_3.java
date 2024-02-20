/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20240220;

/**
 *
 * @author xvpow
 */
public class Ch1_3 {
    public static void main(String[] args) {
        int v1 = 1;
        System.out.println(v1++);//1
        System.out.println(++v1);//3
        
        int c = 1;
        int ans = 8 + ++c -2 + c++- --c + c--;
                //8 + 2 - 2 +  2 -    2 +  2
        System.out.println(ans);
        System.out.println(c);
        
        int c2 = 5;
        c2 += 9;//c2 = c2 + 9;
        System.out.println(c2);
        c2 -= 7;
        System.out.println(c2);
        c2 *= 3;
        System.out.println(c2);
        c2 += 2.5;//java 將2.5轉成int
        System.out.println(c2);
    }
    
}
