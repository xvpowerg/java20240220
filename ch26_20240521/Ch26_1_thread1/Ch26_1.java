/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240521.Ch26_1_thread1;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class Ch26_1 {
    static void testRun()throws Exception{
        for (int i =1; i<= 3; i++){
            System.out.println(i+" Thread Name Start:"+Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(1);
            System.out.println(i+" Thread Name End:"+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args)throws Exception {
      ExecutorService es =  Executors.newCachedThreadPool();
     for (int i =1; i<= 100;i++){
                es.submit(()->{
                try{
                           testRun();   
                }catch(Exception ex){

                }

            });
     }
     
              
              
       
    }
    
}
