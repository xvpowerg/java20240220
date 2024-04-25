/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20240425.Ch19_4_set4;

public class Student  {
     private String name;
     private int score1;
     private int score2;
     private boolean asc = true;
     Student(String name,int score1,int score2){
         this.name = name;
         this.score1 = score1;
         this.score2 = score2;

     }
     
     public String toString(){
         return name+":"+score1+":"+score2;
     }
     
     public int getScore1(){
         return score1;
     }
     
     public int getScore2(){
         return score2;
     }
     
     public String getName(){
         return name;
     }
     
     
    
}
