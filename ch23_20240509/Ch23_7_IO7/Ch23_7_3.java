/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240509.Ch23_7_IO7;

/**
 *
 * @author xvpow
 */
public class Ch23_7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(MyClose c1 = new MyClose("Close1",true);
          MyClose c2 = new MyClose("Close2",true);){
            System.out.println("Body.....");
           throw new Exception("MyBodyException");
        }catch(Exception ex){
            System.out.println(ex);
         Throwable[] ths =  ex.getSuppressed();
         for (Throwable t1 : ths){
             System.out.println(t1);
         }
        }
    }
    
}
