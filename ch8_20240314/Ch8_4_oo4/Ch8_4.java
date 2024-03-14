/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20240314.Ch8_4_oo4;

/**
 *
 * @author xvpow
 */
public class Ch8_4 {

   /*複寫規則
    一定有繼承才能說有複寫
    能看到方法才能有複寫
    
    權限只能開放不能封閉
    回傳值如果是基本型態一定要依樣
    回傳值如果是參考型態可以是一樣或子類
    方法名稱與傳入參數類型必須一樣
    例外拋出可以拋出一樣或子類或不拋
    */
   
   
    public static void main(String[] args) {
      
        Test1 test1 = new Test1();
        System.out.println(test1.publicStr);
        System.out.println(test1.protectedStr);
        System.out.println(test1.defaultStr);
        
    }
    
}
