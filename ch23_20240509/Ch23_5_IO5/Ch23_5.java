/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240509.Ch23_5_IO5;

/**
 *
 * @author xvpow
 */
public class Ch23_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     try(MyClose myClose1 = new MyClose("MyClose1");
        MyClose myClose2 = new MyClose("MyClose2");){
         
         
     }catch(Exception ex){
         System.out.println(ex);
     }
     
      
      
    }
    
}
