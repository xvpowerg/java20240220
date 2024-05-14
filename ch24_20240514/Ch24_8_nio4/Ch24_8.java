/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240514.Ch24_8_nio4;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //.直接移除
        //..移左邊 也移除自己
      Path p1 =  Paths.get("c:", "x",".","..","y");
      System.out.println(p1);
      System.out.println(p1.normalize());
        Path p2 =  Paths.get("c:", "h","..","k");
        System.out.println(p2.normalize()); 
    }
    
}
