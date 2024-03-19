/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20240319.ch9_7_exception4;
public class Ch9_7 {
    
    public static void testFinally(int v){
    
        
        try{
                if (v < 10){
                    return;
                }
        }finally{
            System.out.println("一定要執行!");
        }
    }
    
    public static void main(String[] args) {
        testFinally(50);
       try{
          if(true){
              throw new Exception("Exception ex");
          }
       }catch(Exception ex){
           System.out.println(ex);
       }finally{
           System.out.println("清除資料!");
       }
        
        
    }
    
}
