/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240319.ch9_1_2_oo1;
import ch9_20240319.ch9_1_oo1.Test1;
/**
 *
 * @author xvpow
 */
public class Test3 extends Test1 {
    public void testPublic(){
        System.out.println("Test3 testPublic");
    }
    @Override
    protected void testProtected(){
        System.out.println("Test3 testProtected");
    }
    //@Override
    void testDefault(){
        System.out.println("Test3 testDefault");
    }
    //@Override
    private void testPrivate(){
        System.out.println("Test3 testPrivate");
    }
}
