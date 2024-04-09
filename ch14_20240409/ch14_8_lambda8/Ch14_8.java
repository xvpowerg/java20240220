/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240409.ch14_8_lambda8;

/**
 *
 * @author xvpow
 */
public class Ch14_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student("Ken");
       st1.addScore(100);
       st1.addScore(25);
       st1.addScore(75);
       System.out.println(st1.calcuScoreAdd());
    }
    
}
