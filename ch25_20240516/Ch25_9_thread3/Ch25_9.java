/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240516.Ch25_9_thread3;

/**
 *
 * @author xvpow
 */
public class Ch25_9 {

   static class Test1{
       int x = 0;
         void   run(){
             synchronized(this){
                    for (int i =1; i<= 10; i++){
                        x++;
                        System.out.println(x+" ");
                    }
             }
         
        }      
   }
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Thread th1 = new Thread(()->{ t1.run();});
       Thread th2 = new Thread(()->{ t1.run();});
  th1.start();
  th2.start();
    }
    
}
