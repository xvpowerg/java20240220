/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20240423.Ch18_6_set4;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch18_6 {

    static void test(TreeSet<Integer> set,int v){
        //如果找到比數字v大的就顯示此數值
        //如果找不到比數字v大的就顯示此 找不到
//        Integer h =  set.higher(v);
//        if (h == null){
//            System.out.println("找不到");
//        }else{
//             System.out.println(h);
//        }
        try{
            int h =  set.higher(v);
            System.out.println(h);
        }catch(Exception ex){
            System.out.println("找不到");
        }
      
        
        
    }
    public static void main(String[] args) {
     TreeSet<Integer> set = new TreeSet();
        set.add(10);
       set.add(25);
       set.add(73);
       set.add(15);
       set.add(19);
      test(set,15);
    }
    
}
