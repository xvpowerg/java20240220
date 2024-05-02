/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240502.Ch21_6_option1;

/**
 *
 * @author xvpow
 */
public class Ch21_6 {

    
    static void printName(Person p){
        //標準化Null判斷
        if (p.getName().isPresent()){
           if (p.getName().get().length() > 2){
              System.out.println(p.getName().get());
            }
        } 
     
     
    }
    public static void main(String[] args) {
        Person p1 = new Person("Ken");
     printName(p1);
      Person p2 = new Person();
       printName(p2);
    }
    
}
