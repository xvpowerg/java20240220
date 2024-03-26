/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240326.ch11_8_interface2;


public class Ch11_8 {
    
    static void testFly(Fly fly){
        fly.flying();
    }
    static void testRun(Run run){
        run.runing();
    }
    static int testEyeLaserLight(EyeLaserLight el,int enemyHp){
        int hp = enemyHp - el.attack();
        return hp < 0 ?0:hp;
    }
     public static void main(String[] args) {
           SuperMan superMan =   new  SuperMan();
           Fly f1 = superMan;
           f1.flying();
           testFly(superMan);
           testRun(superMan);
           int hp = testEyeLaserLight(superMan,250);
           System.out.println("Enemy:"+hp);
     }
}
