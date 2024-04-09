/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20240409.ch14_6_lambda6;
import java.util.function.Function;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch14_6 {
    static int testFunc(ArrayList<String> list,
            Function<ArrayList<String>,Integer> func){
        return func.apply(list);
    }
    
    static Integer countList(ArrayList<String> list){
        int count = 0;
        for (String n : list){
            if (n.length() >3){
                count++;
            }
        }
        return count;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> msgList = new ArrayList();
        msgList.add("Ken");
        msgList.add("Iris");
        msgList.add("Lucy");
        msgList.add("Joy");
        msgList.add("Vivin");
        
        int result2 = testFunc(msgList,Ch14_6::countList);
        System.out.println(result2);
       int result =  testFunc(msgList,list->{
            int count = 0;
                for (String n : list){
                    if (n.length() > 3){
                        count++;
                    }
                }
            return count;
        });
        System.out.println(result);
    }
    
}
