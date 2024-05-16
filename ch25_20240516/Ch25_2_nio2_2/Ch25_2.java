/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240516.Ch25_2_nio2_2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class Ch25_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path p1 = Paths.get("c:","a","b.jpg");
        Path p2 = Paths.get("c:","a",".","b.jpg");
        //只有p1 與 p2路徑不一樣時 才會真的找檔案比較
       try{
        boolean b1 =    Files.isSameFile(p1, p2);
        System.out.println(b1);
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}
