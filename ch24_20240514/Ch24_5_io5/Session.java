/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20240514.Ch24_5_io5;
import java.io.Serializable;
import java.time.LocalTime;
import java.io.IOException;
public class Session implements Serializable {
    private String msg;
    private LocalTime serTime;
    public Session(String msg){
        this.msg = msg;
    }
    public String toString(){
        return msg+":"+serTime;
    }
    
    private void writeObject(java.io.ObjectOutputStream out)throws IOException{
        out.writeObject(msg);
       System.out.println("writeObject!");
    }
    
    private void readObject(java.io.ObjectInputStream in)throws IOException,ClassNotFoundException{
       msg = in.readObject().toString();
       serTime = LocalTime.now();
        System.out.println("readObject!");
    }
}
