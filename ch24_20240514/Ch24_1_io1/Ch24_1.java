/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240514.Ch24_1_io1;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.File;
/**
 *
 * @author xvpow
 */
public class Ch24_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //序列化
        String name = "Ken";
        File f1 = new File("C:\\mydir\\name.obj");
        try(FileOutputStream fout = new FileOutputStream(f1);
         ObjectOutputStream objOutStream = new ObjectOutputStream(fout)){
            objOutStream.writeObject(name);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}
