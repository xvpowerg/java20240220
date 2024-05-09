/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20240509.Ch23_7_IO7;

/**
 *
 * @author xvpow
 */
public class MyClose implements AutoCloseable {
   private String name;
   private boolean throwEx;
   MyClose(String name,boolean throwEx){
       this.name = name;
       this.throwEx = throwEx;
   }
   public String toString(){
       return name;
   }
   
   public void close()throws Exception{
       System.out.println(name+":close");
       if(this.throwEx){
           throw new Exception(name+":close");
       }
   }
}
