/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_2024328.Ch12_8_interface8;

/**
 *
 * @author xvpow
 */
public class Ch12_8 {

    //Consumer<T>
    //Supplier<T>
    //Function<T,​R>
    //UnaryOperator<T>
    //Predicate<T> //謂詞
    static void upload(boolean test,PassFunc pass,FailFunc fail){
        if (test){
            pass.passFunc();
        }else{
          fail.failFunc();
        }
    }
    public static void main(String[] args) {
        upload(true,new MyPassFunc(),
                new MyFailFunc());
    }
    
}
