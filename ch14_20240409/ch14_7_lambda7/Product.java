/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20240409.ch14_7_lambda7;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Product {
    private String name;
    private ArrayList<Detail> detailList = new ArrayList();
    static class Detail{
        private int price;
        private int count;
        Detail(int price,int count){
            this.price = price;
            this.count = count;
        }
        
        public String toString(){
            return "Price:"+this.price+" Count:"+count;
        }
    }
    public void addDetail(Detail d){
        detailList.add(d);
    }
    
    public void foreachDetail(Consumer<Detail> con){
        for (Detail d : detailList){
            con.accept(d);
        }
    }
}
