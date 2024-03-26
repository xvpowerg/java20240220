/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240326.ch11_6_report_abstract2;
import ch11_20240326.ch11_6_erp_abstract2.MyErp;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class ErpReposrt2 extends  MyErp{
    public void reportStyle(ArrayList<String> data){
        for(String v : data){
            System.out.print(v+" ");
        }
    }
}
