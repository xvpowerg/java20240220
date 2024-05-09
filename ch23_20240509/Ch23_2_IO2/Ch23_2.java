/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240509.Ch23_2_IO2;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ch23_2 {
    public static void main(String[] args) {
            try{
            File f1 = new File("c:\\mydir\\netbeans-21-bin.zip");
            File out = new File("c:\\mydir\\netbeans-21-bin-copy.zip");
            FileInputStream fIn = new FileInputStream(f1);
            FileOutputStream fOut = new FileOutputStream(out);
            BufferedInputStream bfin = new BufferedInputStream(fIn);
            BufferedOutputStream bfOut = new BufferedOutputStream(fOut);
            int data = -1;
            while((data = bfin.read()) != -1 ){
                //System.out.println(data);
                bfOut.write(data);
            }
           bfOut.close();
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}
