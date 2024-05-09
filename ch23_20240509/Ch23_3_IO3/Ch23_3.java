/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240509.Ch23_3_IO3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Ch23_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          File f1 = new File("c:\\mydir\\netbeans-21-bin.zip");
          File out = new File("c:\\mydir\\netbeans-21-bin-copy.zip");
            FileInputStream fileIn  = null;
            FileOutputStream fileOut = null;
         try{
             
             fileIn = new FileInputStream(f1);
             fileOut = new FileOutputStream(out);
             
             int index = -1;
             byte[] buffer = new byte[2048];
             while( (index = fileIn.read(buffer))!= -1 ){
                 fileOut.write(buffer, 0, index);
             }
             
         }catch(FileNotFoundException ex){
             System.out.println(ex);
         }catch(IOException ex){
              System.out.println(ex);
         }finally{ 
                try{
                     fileOut.close();
                       fileIn.close();
                }catch(Exception ex){

                }
           
           }
                 
          
    }
    
}
