/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240521.Ch26_1_thread1;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Ch26_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ExecutorService es = Executors.newCachedThreadPool();
     for (int i =1; i<= 100;i++){
           es.submit(()->{
             System.out.println(Thread.currentThread().getName());
              });
     }

             
    }
    
}
