/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20240314.Ch8_6_oo6;

public class Test1Private {
    private Test1Private(){
        System.out.println("Test1Private");
    }
    
    public static Test1Private  newTest1Private(){
        Test1Private t1p = new Test1Private();
        return t1p;
    }
    
}
