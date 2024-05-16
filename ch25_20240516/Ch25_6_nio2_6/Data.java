/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch25_20240516.Ch25_6_nio2_6;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xvpow
 */
public class Data {
    private String data;
    private String name;
    private List<Integer> numberList = new ArrayList();
   
    Data(String data){
        this.data = data;
        paser();
    }
     private void  paser(){
         String[] tmp = this.data.split(":");
          name = tmp[0];
         String[] numberStr =  tmp[1].split(",");
          for (int i = 0; i < numberStr.length;i++){
           numberList.add(Integer.parseInt(numberStr[i]));   
          }
     }
     public String getName(){
         return this.name;
     }
    public int sum(){
        return numberList.stream().mapToInt(v->v).sum();
    }
     
  public String toString(){
      return name+":"+numberList+":"+sum();
  }   
}
