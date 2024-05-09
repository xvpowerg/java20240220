/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20240509.Ch23_11_time;
import java.time.LocalDate;
/**
 *
 * @author xvpow
 */
public class Ch23_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate date1 = LocalDate.now();
       LocalDate date2 = LocalDate.of(2024, 9, 12);
       System.out.println(date1);
        System.out.println(date2);
        LocalDate date3 = date1.plusMonths(10);
         System.out.println(date3);
    }
    
}
