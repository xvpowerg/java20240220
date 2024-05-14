/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240514.Ch24_2_io2;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch24_2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("c:\\mydir\\code.obj");
         try(FileInputStream fin = new FileInputStream(file);
             ObjectInputStream objIn = new ObjectInputStream(fin)   ){
            HashMap<Integer,String> map = (HashMap)  objIn.readObject();
            System.out.println(map.get(65));
         } catch(IOException | ClassNotFoundException  ex){
             System.out.println(ex);
         }  
    }
    
}
