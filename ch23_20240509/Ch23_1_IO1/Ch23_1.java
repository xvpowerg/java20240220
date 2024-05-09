/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240509.Ch23_1_IO1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

public class Ch23_1 {
    public static void main(String[] args) {
        try{
            File f1 = new File("c:\\mydir\\mydata.txt");
            File out = new File("c:\\mydir\\newMyData.txt");
            FileInputStream fIn = new FileInputStream(f1);
            FileOutputStream fOut = new FileOutputStream(out);
            int data = -1;
            while((data = fIn.read()) != -1 ){
                //System.out.println(data);
                fOut.write(data);
            }
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}
