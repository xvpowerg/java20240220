/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240319.ch9_5_exception2;

/**
 *
 * @author xvpow
 */
public class TestException {
    public void testException(int v)throws Exception{
        
        if (v > 10){
            throw new Exception();
        }
    }
    
    public void testRuntimeException(int v)throws RuntimeException{
        if (v > 10){
            throw new RuntimeException();
        }
    }
}
