/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20240509.Ch23_5_IO5;

/**
 *
 * @author xvpow
 */
public class MyClose implements AutoCloseable {
   private String name;
   MyClose(String name){
       this.name = name;
   }
   public String toString(){
       return name;
   }
   
   public void close()throws Exception{
       System.out.println(name+":close");
   }
}
