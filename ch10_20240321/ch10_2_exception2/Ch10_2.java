/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20240321.ch10_2_exception2;
public class Ch10_2 {

    public static void main(String[] args) {
        Test1 t2 = new Test2();
        try{
            t2.testMyException(25);
        }catch(MyException2 ex){
            System.out.print(ex);
        }
        t2.testMyRuntimeException(20);
        
        
    }
    
}
