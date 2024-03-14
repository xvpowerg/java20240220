/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240314.Ch8_4_oo4;

/**
 *
 * @author xvpow
 */
//類別只有public 跟default可用
public class Test1 {
    //權限
    /*
        public 不同package都可讀寫
        protected 相同package或子類可讀寫
        default(空白) 相同package都可讀寫
        private 相同類別可讀寫
    */
    
    public String publicStr = "publicStr";
    protected String protectedStr = "protectedStr";
    String defaultStr = "defaultStr";
    private String privateStr = "privateStr";
}
