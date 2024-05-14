/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20240514.Ch24_2_io2;
import java.util.HashMap;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;
/**
 *
 * @author xvpow
 */
public class Ch24_2 {

 
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap();
        for (int k = 1; k <= 65535;k++){
            String v = ((char)k)+"";
          map.put(k, v);
        }
    File file = new File("c:\\mydir\\code.obj");
        try(FileOutputStream fout = new FileOutputStream(file);
             ObjectOutputStream objOut = new ObjectOutputStream(fout);   ){
            objOut.writeObject(map);
        }catch(IOException ex){
             System.out.println(ex);
        }
   }
    
}
