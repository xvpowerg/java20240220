/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240321.ch10_5_initblock1;

/**
 *
 * @author xvpow
 */
public class Student {
    private int[] scores = new int[10];
    public int getScore(int index){
        return scores[index];
    }
    
    {
        for (int i = 0; i < scores.length;i++){
                scores[i] = -1;
            }
    }
    
    
    Student(){
        
    }
    
    Student(String name){
        
    }
}
