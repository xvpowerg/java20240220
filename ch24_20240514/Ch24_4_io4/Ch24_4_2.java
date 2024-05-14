/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240514.Ch24_4_io4;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author xvpow
 */
public class Ch24_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
              File f1 = new File("C:\\mydir\\st.obj");
              try(FileInputStream fin =  new FileInputStream(f1);
                 ObjectInputStream obj = new ObjectInputStream(fin)){
                  Student st1 = (Student)obj.readObject();
                  System.out.println(st1);
              }
    }
    
}
