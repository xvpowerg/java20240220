/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20240326.ch11_6_erp_abstract2;
import java.util.ArrayList;
public abstract class MyErp {
    private ArrayList getData(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lindy");
        return list;
    }
    protected abstract void reportStyle(ArrayList<String> data);
    public void exportReport(){
        reportStyle(getData());
    }
}
