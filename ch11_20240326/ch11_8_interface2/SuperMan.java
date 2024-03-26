/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240326.ch11_8_interface2;

/**
 *
 * @author xvpow
 */
public class SuperMan implements Fly,Run,EyeLaserLight {
    public void flying(){
        System.out.println("SuperMan Fly");
    }
    public void runing(){
          System.out.println("SuperMan Runing");
    }
    public int attack(){
        System.out.println("SuperMan attack");
        return 100;
    }
}
