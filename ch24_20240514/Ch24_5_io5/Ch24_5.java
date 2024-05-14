/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240514.Ch24_5_io5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author xvpow
 */
public class Ch24_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        Session s1 = new Session("Hello");
        System.out.println(s1);
        File fin = new File("c:\\mydir\\session.obj");
        try(FileOutputStream fout = new FileOutputStream(fin);
           ObjectOutputStream objout = new ObjectOutputStream(fout)){
            objout.writeObject(s1);
        }
    }
    
}
