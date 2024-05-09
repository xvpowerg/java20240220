/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240509.Ch23_9_IO9;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\mydir\\mymsg.txt");
        try(FileReader fr = new FileReader(file)){
            int data = -1;
            while((data = fr.read())!=-1 ){
                System.out.print((char)data);
            }
            
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}
