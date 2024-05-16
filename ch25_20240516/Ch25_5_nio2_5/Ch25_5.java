/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240516.Ch25_5_nio2_5;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.stream.Stream;
public class Ch25_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path p1 = Paths.get("c:", "mydir","msg.txt");
        try{
          Stream<String> st =  Files.lines(p1, Charset.forName("big5"));
          st.forEach(s->System.out.println(s));
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
