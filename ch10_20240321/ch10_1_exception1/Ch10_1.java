/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20240321.ch10_1_exception1;

/**
 *
 * @author xvpow
 */
public class Ch10_1 {

    static void testMyException(int v,String msg)throws MyException{
            if (v > 10){
                throw new MyException(msg);
            }
    }

    static void testMyRuntimeException(String name,String msg){
            if (name == null || name.length() < 3){
                throw new MyRuntimeException(msg);
            }
    }

    public static void main(String[] args) {
        try{
            testMyException(12,"不可大於10");
        }catch(MyException ex){
            System.out.println(ex);
        }
        
        try{
            testMyRuntimeException("A","錯誤的姓名");
        }catch(MyRuntimeException ex){
            System.out.println(ex);
        }
        
    }

}
