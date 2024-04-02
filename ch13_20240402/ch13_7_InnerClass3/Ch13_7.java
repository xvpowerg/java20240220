/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20240402.ch13_7_InnerClass3;

/**
 *
 * @author xvpow
 */
public class Ch13_7 {

   static class Dog2 extends Dog {
       public void bark(){
           System.out.println("喵喵");
       }
   }
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
       Dog dog2 = new Dog2();
       dog2.bark();//喵喵
       
       Dog dog3 = new Dog(){
           public void bark(){
               System.out.println("支支");
           }
       };
       dog3.bark();//支支
       
       Dog dog4 = new Dog(){
           public void bark(){
               System.out.println("喳喳");
           }
       };
       dog4.bark();//支支
       
       
       Run run  = new Run(){
           public void runing(){
               System.out.println("跑跑跑!");
           }
       };
       run.runing();
    }
    
}
