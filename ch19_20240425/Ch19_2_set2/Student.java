/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20240425.Ch19_2_set2;

import ch19_20240425.Ch19_set1.*;

/**
 *
 * @author xvpow
 */
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
     
     
     public int compareTo(Student st){
         if (this.score1 > st.score1){
             return 1;
         }else if(this.score1 < st.score1){
             return -1;
         }else if(this.score2 > st.score2){
             return 1;
         }else if(this.score2 < st.score2){
             return -1;
         }
         return this.name.compareTo(st.name);
     }
}
