/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20240411.Ch15_3_lambda3;
import java.util.function.Supplier;
import java.util.function.Predicate;

public class Ch15_3 {

    static void test(int score,Predicate<Integer> p,
            Supplier<Exception>sp)throws Exception{
        //score >= 0 <= 100顯示 成績60
        //拋出例外 使用sp定義例外
        if (p.test(score)){
            System.out.println("成績:"+score);
        }else{
            throw sp.get();
        }
        
    }
    
    static class ScoreException extends IllegalArgumentException{
        ScoreException(){
            super("錯誤的成績");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
             try{
                test(-25,s->s>=0 && s <= 100,
                ()->new IllegalArgumentException("錯誤的成績"));
            }catch(Exception ex){
                System.out.println(ex);
            }
             
             try{
                test(-25,s->s>=0 && s <= 100,
                        ScoreException::new);
            }catch(Exception ex){
                System.out.println(ex);
            }
             Predicate<Integer> p = s ->s >= 0 && s <= 100;
              Supplier<Exception>sp = ScoreException::new;
              try{
                  //test(-25,p,sp);
                  test(60,p,sp);
                   test(-60,p,sp);
              }catch(Exception ex){
                  System.out.println(ex);
              }
             

    }
    
}
