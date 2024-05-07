/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240507.Ch22_1_stream1;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch22_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Joy");
       list.add("Howard");
     Optional<String> op1 =   list.stream().parallel().findAny();
     Optional<String> op2 =  list.stream().findFirst();
     op1.ifPresent(v->System.out.println(v));
     op2.ifPresent(v->System.out.println(v));
     
     Optional<String> op3 =  list.stream().filter(n->n.equals("Joy")).findFirst();
     op3.ifPresent(v->System.out.println(v));
    }
    
}
