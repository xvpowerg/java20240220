/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20240402.ch13_6_InnerClass2;

/**
 *
 * @author xvpow
 */
public class StaticInnerClass {
    private  String msg;
    static class MyMsg{
        private String info;
        public MyMsg(String info){
            this.info = info;
        }
        public String toString(){
            return "info:"+info;
        }
    }
}
