/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20240220;

/**
 *
 * @author xvpow
 */
public class Ch1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "Ken";//因為字串不是基本型態 所以變數存放記憶體位置
        String s2 = "Ken";
        String s3 = new String("Ken");
        System.out.println(s1+":"+s2);
        System.out.println(s1+":"+s3);
        System.out.println(s1 == s2);//記憶體位置是否相同
        System.out.println(s1 == s3); 
        System.out.println(s1.equals(s3));//只能用於非基本型態equals 比較s1與s3是否相同
        System.out.println(s1.equals(s2));
    }
    
}
