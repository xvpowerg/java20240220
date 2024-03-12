/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20240312.Ch7_3_oo3;


public class Ch7_3 {
    //私有不能繼承
    //建構式無法繼承
    public static void main(String[] args) {
        Animal a1= new Animal("Bobo",2);
        a1.printInfo();
        a1.setName("Iris");
        a1.printInfo();
        
        Dog dog1 = new Dog();
        dog1.setName("JoJo");
        dog1.setAge(3);
        dog1.printInfo();
        
        Dog dog2 = new Dog("Coco",7);
        dog2.printInfo();
        
        Cat cat1 = new Cat();
        cat1.setName("momo");
        cat1.setAge(2);
        cat1.printInfo();
        Cat cat2 = new Cat("KiKi",6);
        cat2.printInfo();
         
    }
    
}
