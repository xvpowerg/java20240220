/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240321.ch10_2_exception2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public void testMyException(int v)throws MyException2{
        if (v > 10){
            throw new MyException2();
        }
        System.out.println("Test1 testMyException");
    }
    
    public void testMyRuntimeException(int v)throws MyRuntimeException2{
         if (v > 10){
            throw new MyRuntimeException2();
        }
         System.out.println("Test1 testMyRuntimeException");
    }
}
