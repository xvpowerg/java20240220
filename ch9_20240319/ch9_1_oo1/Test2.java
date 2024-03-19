/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20240319.ch9_1_oo1;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
        public void testPublic(){
            System.out.println("Test2 testPublic");
        }
        protected void testProtected(){
            System.out.println("Test2 testProtected");
        }
        @Override
        void testDefault(){
            System.out.println("Test2 testDefault");
        }
        //@Override //驗證是否為正確複寫
        private void testPrivate(){
             System.out.println("Test2 testPrivate");
        }
}
