/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_2024328.Ch12_2_interface2;
import java.util.ArrayList;
public class Order implements MyIterator {
    private String title;
    Order(String title){
        this.title = title;
        addDetail(title);
    }
    private ArrayList<String>detail = new ArrayList();
    public void addDetail(String name){
        detail.add(name);
    }
    public String next(int index){
        return detail.get(index);
    }
    public int size(){
        return detail.size();
    }
 
}
