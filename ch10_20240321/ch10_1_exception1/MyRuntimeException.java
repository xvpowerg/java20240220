/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240321.ch10_1_exception1;

/**
 *
 * @author xvpow
 */
public class MyRuntimeException  extends RuntimeException{
    MyRuntimeException(){
        
    }
      MyRuntimeException(String msg){
        super(msg);
    }
}
