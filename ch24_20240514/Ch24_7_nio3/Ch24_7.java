/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240514.Ch24_7_nio3;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path p1 =   Paths.get("C:", "A","B","C");
      Path p2 =   Paths.get("my.jpg");
      Path p4 =   Paths.get("e:","my.jpg");
      Path p3 = p1.resolve(p2);
      System.out.println(p3);
      Path p5 = p1.resolve(p4);//p4有帶root會取代
       System.out.println(p5);
       
    }
    
}
