/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240321.ch10_2_exception2;
public class Test2 extends Test1 {
    //例外拋出跟父類別一樣的
    //例外拋出子類
    //例外拋不拋出
      public void testMyException(int v)throws MyException2Sub{
          if (v > 10){      
              throw new MyException2Sub();
          }
        System.out.println("Test2 testMyException");
      }
       public void testMyRuntimeException(int v)throws MyRuntimeException2Sub{
         if (v > 10){
            throw new MyRuntimeException2Sub();
        }
         System.out.println("Test2 testMyRuntimeException");
    }
}
