/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_2024328.Ch12_2_interface2;
import java.util.ArrayList;
public class Person implements MyIterator {
    private String name;
    private ArrayList<String> friends = new ArrayList();
    Person(String name){
        this.name = name;
    }
    public void addFriend(String fName){
        friends.add(fName);
    }
    public String next(int i ){
        return friends.get(i);
    }
    public int size(){
        return friends.size();
    }
    
}
