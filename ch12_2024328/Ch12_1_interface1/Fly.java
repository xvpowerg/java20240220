/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_2024328.Ch12_1_interface1;

/**
 *
 * @author xvpow
 */
public interface Fly {
    void flying();
    
    public default void testFly(){
        flying();
    }
}
