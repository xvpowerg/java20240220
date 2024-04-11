/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15.test;
import ch15.beans.Student;
import ch15.beans.Teacher;
import ch15.beans2.Car;
/**
 *
 * @author xvpow
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student("Ken");
       Teacher te1 = new Teacher("Vivin");
       Car car1 = new Car("BMW");
       
       System.out.println(st1);
       System.out.println(te1);
       System.out.println(car1);
       //Car
       //顯示
       //Student:Ken
       //Teacher:Vivin
       //Car:BMW
    }
    
}
