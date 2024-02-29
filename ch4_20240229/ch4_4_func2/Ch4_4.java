/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20240229.ch4_4_func2;

/**
 *
 * @author xvpow
 */
public class Ch4_4 {

    static int max(int[] values){
        int result = -1;
        for (int v : values){
            if (v > result  ){
                result = v;
            }
        }
        return result;
    }
    //有一個函數 假設values是 [5,4,3,1] 幫我加總 回傳13
    static int test2(int[] values){
        int sum = 0;
        for (int v : values){
            sum += v;
        }
        return sum;
    }
    //data {9,7,2,55,88,12}
    //value = 55 回傳找到的index
    //都找不到回傳-1
    static int search(int[] data,int value){
        int result = -1;
        for (int i = 0; i < data.length; i++){
            if (data[i] == value){
              result = i;
              break;
            }
        }
       return  result;
    }
    static int search2(int[] data,int value){
        for (int i =0; i < data.length;i++){
            if (data[i] == value){
                return i;
            }
        }
        return -1;
    }
    
    static void testReturn(int i){
        if (i > 3){
            System.out.println("大於3");
            return;
        }
        System.out.println("小於3");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {9,7,2,55,88,12};
        int v1 = max(array);
        System.out.println(v1);
        int[] array2 = {5,4,3,1};
       int v2 =  test2(array2);
       System.out.println(v2);
       int index = search(array,55);
       System.out.println(index);
       int index2 = search2(array,55);
       System.out.println(index2);
       testReturn(10);
    }
    
}
