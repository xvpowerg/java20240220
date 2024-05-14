/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240514.Ch24_5_io5;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author xvpow
 */
public class Ch24_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        File file = new File("c:\\mydir\\session.obj");
        try(FileInputStream fin = new FileInputStream(file);
             ObjectInputStream objIn = new ObjectInputStream(fin);   ){
          System.out.println(objIn.readObject());
        }
    }
    
}
