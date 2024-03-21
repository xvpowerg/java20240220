/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20240321.ch10_6_initblock2;

/**
 *
 * @author xvpow
 */
public class Item {
    static String[] msg  = new String[100];
    static{
        for (int i = 0; i < msg.length ;i++){
            msg[i] = "Empty";
        }
    }
    
    static String getMsg(int index){
        return msg[index];
    }
}
