/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240321.ch10_7_initblock3;

/**
 *
 * @author xvpow
 */
public class TestInitBlock {
    {
    System.out.println("Init Block 1");
    }
    TestInitBlock(){
      System.out.println("TestInitBlock()");  
    }
    {
     System.out.println("Init Block 2");
    }
    static{
         System.out.println("Static Init Block 1");
    }
   static{
         System.out.println("Static Init Block 2");
    }
}
