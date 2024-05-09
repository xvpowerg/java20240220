/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240509.Ch23_10_IO10;

import java.io.File;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         File file = new File("C:\\mydir\\mymsg.txt");
         try(MyFileReader fr = new MyFileReader(file,"big5")){
             int data = -1;
             while ((data = fr.read()) != -1){
                 System.out.print((char)data);
             }
         }catch(IOException ex){
             System.out.println(ex);
         }
    }
    
}
