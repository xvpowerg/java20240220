/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240514.Ch24_6_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class C24_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path p1 = Paths.get("c:", "mydir","st.obj");
        System.out.println(p1);
         System.out.println(p1.getFileName());
         //不包含root
        System.out.println(p1.subpath(0, 2));
         System.out.println(p1.getRoot());
       Path p2 = Paths.get("a", "b","c","x","y");
       //bc
       System.out.println(p2.subpath(1, 3));
       
       
    }
    
}
