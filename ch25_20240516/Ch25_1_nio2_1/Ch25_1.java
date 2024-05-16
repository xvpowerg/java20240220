/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240516.Ch25_1_nio2_1;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch25_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path p1 = Paths.get("c:","mydir","netbeans-21-bin.zip");
        Path copy = Paths.get("c:","mydir","netbeans-21-bin-copy.zip");
        //預設重複資料會錯誤
        try{
             Files.copy(p1, copy,StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException ex){
            System.out.println(ex);
        }
       
    }
    
}
