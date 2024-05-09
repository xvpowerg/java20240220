/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240509.Ch23_6_IO6;

/**
 *
 * @author xvpow
 */
public class Ch23_6 {

    public static void main(String[] args) {
        try(MyClose c1 = new MyClose("Close1");
          MyClose c2 = new MyClose("Close2");){
            System.out.println("Body.....");
            throw new Exception("MyBodyException");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
