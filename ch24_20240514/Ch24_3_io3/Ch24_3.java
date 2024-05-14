/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240514.Ch24_3_io3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author xvpow
 */
public class Ch24_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        Student st1 = new Student("Ken",25);
        System.out.println(st1);
        File f1 = new File("c:\\mydir\\st.obj");
        try(FileOutputStream fout = new FileOutputStream(f1);
            ObjectOutputStream obj = new ObjectOutputStream(fout);    ){
            obj.writeObject(st1);
        }
    }
    
}
