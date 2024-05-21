/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240521.Ch26_3_thread3;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch26_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
     ExecutorService es = Executors.newFixedThreadPool(2);
     Random ran = new Random();
    Future<String> f1 =  es.submit(()->{
       String v = ran.nextInt()+""; 
       TimeUnit.SECONDS.sleep(3);
       return v;
    });
    System.out.println("開始產生數字!");
    String result = f1.get();
   System.out.println("產生的數字:"+result);
   es.shutdown();
    }
    
}
