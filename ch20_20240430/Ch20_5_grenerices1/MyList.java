/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20240430.Ch20_5_grenerices1;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyList<T> {
    private ArrayList<T> data = new ArrayList<>();
    public void add(T v){
        data.add(v);
    }
    public T get(int i){
        return data.get(i);
    }
    public void foreach(Consumer<T> sytle){
        data.forEach(sytle);
    }
}
