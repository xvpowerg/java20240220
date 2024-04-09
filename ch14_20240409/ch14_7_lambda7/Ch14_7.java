/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240409.ch14_7_lambda7;

/**
 *
 * @author xvpow
 */
public class Ch14_7 {

    
    public static void main(String[] args) {
       Product p1 = new Product();
       Product.Detail d1 = new  Product.Detail(10,5);
       Product.Detail d2 = new  Product.Detail(12,6);
        Product.Detail d3 = new  Product.Detail(17,2);
        p1.addDetail(d1);
        p1.addDetail(d2);
        p1.addDetail(d3);
        
//        p1.foreachDetail(d->{
//            System.out.println(d);
//        });
        
        p1.foreachDetail(System.out::println);
        p1.foreachDetail(MySystem.out::println);
        MyPrint myPrint = new MyPrint();
        p1.foreachDetail(myPrint::printObject);
    }
    
}
