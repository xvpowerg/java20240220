/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20240222;

public class Ch2_1 {
    public static void main(String[] args) {
        //可傳參數的類型 byte short int char String emun
     
        final int PLAY = 1,STOP = 2,EXIT = 3;
        int action = EXIT;
            switch(action){
                case PLAY://必須是常數
                    System.out.println("Play");
                    break;
                case STOP:
                     System.out.println("Stop");
                    break;
                case EXIT:
                      System.out.println("Exit");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
       
    }
    
}
