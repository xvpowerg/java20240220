/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20240430.Ch20_5_grenerices1;

/**
 *
 * @author xvpow
 */
public class Ch20_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList strList = new MyList();
        strList.add("Ken");
        strList.add("Vivin");
        strList.add("Iris");
        strList.foreach(v->System.out.println(v));
        
         MyList<Integer> intList = new MyList();
         intList.add(10);
         intList.add(30);
         intList.add(40);
        
         intList.foreach(v->System.out.println(v));
    }
    
}
