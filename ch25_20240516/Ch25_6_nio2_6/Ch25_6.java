/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20240516.Ch25_6_nio2_6;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map;
public class Ch25_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path p1 = Paths.get("c:", "mydir","newMyData.txt");
      try{
         Stream<String> dataSt =   Files.lines(p1);
      Map<String,Integer> map = 
              dataSt.map(Data::new).
            collect(Collectors.toMap(d->d.getName(), d->d.sum()));
         System.out.println(map);
      }catch(IOException ex){
          System.out.println(ex);
      }
     
    }
    
}
