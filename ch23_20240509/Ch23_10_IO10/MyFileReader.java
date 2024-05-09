/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20240509.Ch23_10_IO10;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class MyFileReader extends InputStreamReader {
    //可以接收charSet 可以幫我轉換我想要的編碼
    //無填入charSet預設是utf-8
    
    public MyFileReader(File f,String charset)throws IOException{
        super(new FileInputStream(f),charset);
    }
    
    public MyFileReader(File f)throws IOException{
        this(f,"utf-8");
    }
}
