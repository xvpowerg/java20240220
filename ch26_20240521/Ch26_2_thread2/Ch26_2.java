/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240521.Ch26_2_thread2;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author xvpow
 */
public class Ch26_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 1; i<=10;i++){
            es.submit(()->{
                System.out.println( Thread.currentThread().getName());
                try{
                    TimeUnit.SECONDS.sleep(1); 
                }catch(Exception ex){
                    
                }
                 
             });
        }
    es.shutdown();//所有工作完成才關閉ExecutorService
    //es.shutdownNow();//立刻關閉ExecutorService
    }
    
}
