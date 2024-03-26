/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20240326.ch11_6_report_abstract2;
import ch11_20240326.ch11_6_erp_abstract2.MyErp;
/**
 *
 * @author xvpow
 */
public class Ch11_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyErp myErp = new ErpReport();        
        myErp.exportReport();        
        MyErp myErp2 = new ErpReposrt2();
        myErp2.exportReport();
    }
    
}
