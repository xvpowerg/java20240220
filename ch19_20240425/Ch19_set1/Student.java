/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20240425.Ch19_set1;

/**
 *
 * @author xvpow
 */
public class Student  implements Comparable<Student>{
     private String name;
     private int score1;
     private int score2;
     private boolean asc = true;
     Student(String name,int score1,int score2,boolean asc){
         this.name = name;
         this.score1 = score1;
         this.score2 = score2;
         this.asc = asc;
     }
     
     public String toString(){
         return name+":"+score1+":"+score2;
     }
     
     public int compareTo(Student st){
         if (this.score1 > st.score1){
             return asc?1:-1;
         }else if(this.score1 < st.score1){
             return asc?-1:1;
         }else if(this.score2 > st.score2){
             return asc?1:-1;
         }else if(this.score2 < st.score2){
             return asc?-1:1;
         }
         return asc?this.name.compareTo(st.name):this.name.compareTo(st.name)*-1;
     }
}
