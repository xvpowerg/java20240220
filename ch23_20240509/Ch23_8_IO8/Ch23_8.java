/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240509.Ch23_8_IO8;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Ch23_8 {
    public static void main(String[] args) {
        File file = new File("C:\\mydir\\mymsg.txt");
        try(FileWriter w = new FileWriter(file)){
            w.write("休眠10年的「比特幣大鯨魚」突醒來！"
                    + "一次性拋售687枚比特幣 約14億台幣入袋");
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
