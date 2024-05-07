/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240507.Ch22_5_IO1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("C:\\mydir\\mydata.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        try{
            FileInputStream fin = new FileInputStream(file);
            int data = -1;
            while ((data =fin.read()) != -1  ){
                System.out.println(data);
            }
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
              System.out.println(ex);
        }
       
        
    }
    
}
