/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240312.Ch7_1_oo1;

public class Person {
    private String name;
    private int age;
    
    Person(){
        //this()呼叫其他建構式
        //this()他只能在建構式呼叫
        //this()必須是建構式的第一條命令        
        this("無名氏",-1);
//        this.setName("無名氏");
//        this.setAge(-1);
    }
    Person(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    
    // this. 表示當前物件
    //this. 用於快速選取
    public void setName(String name){
        
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void printInfo(){
        System.out.println(name+":"+age);
    }
}
