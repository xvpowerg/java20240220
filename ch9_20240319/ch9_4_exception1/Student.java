/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240319.ch9_4_exception1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    //大於10　小於200
    //如果不正確顯示 錯誤的年齡
    public void setAge(int age){
        if ( age >=10 && age < 200 ){
            this.age = age;       
            return;
        }
        throw new RuntimeException("錯誤的年齡");
    }
    public int getAge(){
        return this.age;
    }
    
    public void printInfo(){
        System.out.println(this.name+":"+this.age);
    }
    
}
