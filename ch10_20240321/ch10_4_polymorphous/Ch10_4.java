/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20240321.ch10_4_polymorphous;

/**
 *
 * @author xvpow
 */
public class Ch10_4 {
    static void fruitBasket(Fruit ... fruits){
        for (Fruit f : fruits){
            System.out.println(f);
        }
    }
    
    public static void main(String[] args) {
       Fruit appple = new Apple("水果1",25);
       Fruit banana = new Banana("水果2",12);
       Fruit kewi = new Kewi("水果3",15);
       
      System.out.println(appple);//Apple1:25
      System.out.println(banana);//Banana:12
      System.out.println(kewi);//Kewi:15
      
      fruitBasket(appple,banana,kewi);
    }
    
}
