/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20240409.ch14_8_lambda8;
import java.util.ArrayList;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    Student(String name){
        this.name = name;
    }
    private ArrayList<Integer> scores = 
                            new ArrayList<>();
    public void addScore(int score){
        scores.add(score);
    }
    private Integer calcuAdd(ArrayList<Integer> score){
        int sum = 0;
        for (int s :score){
            sum+=s;
        }
        return sum;
    }
    
    public int calcuScoreAdd(){
        return calcuScore(this::calcuAdd);
    }
    
    public int calcuScore(Function<ArrayList<Integer>,Integer> clacuFun){
        return clacuFun.apply(scores);
    }
    
}
