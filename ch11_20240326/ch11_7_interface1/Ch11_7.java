/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20240326.ch11_7_interface1;


public class Ch11_7 {
    public static void main(String[] args) {
       Fly brid = new Bird();
       brid.flying();
       //AirPlane
       Fly airPlane = new AirPlane();
       airPlane.flying();
       
       Fly[] myFly = {brid,airPlane};
       for (Fly f : myFly){
           f.flying();
       }
    }
    
}
