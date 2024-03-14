/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240314.Ch8_7_oo7;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
  public void testPublic(){//只能public 複寫
        System.out.println("Test2 testPublic");
    }
  
  protected void testProtected(){//可用public protected複寫
          System.out.println("Test testProtected");
    }
  
   void testDefault(){//可用 public protected default複寫
        System.out.println("Test2 testDefault");
    }
   //不能複寫 因為看不到
      void testPrivate(){
         System.out.println("Test2 testPrivate");
    }
}
