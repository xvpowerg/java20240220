/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240409.ch14_1_lambda1;

/**
 *
 * @author xvpow
 */
public class Ch14_1 {

    static void testMyFunction(MyFunction fnc){
        fnc.run();
    }
    public static void main(String[] args) {
        // TODO code application logic here
    testMyFunction(()->{
        for (int i = 5; i >=1; i--){
            System.out.print(i+" ");
        }
          System.out.println(); 
    });
        
        
        
        
        testMyFunction(new MyFunction(){
            public void run(){
                for (int i = 1; i<= 5; i++){
                    System.out.print(i+" ");
                }
               System.out.println(); 
            }
        
        });
    }
    
}
