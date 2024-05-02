/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20240502.Ch21_1_stream1;
import java.util.stream.Stream;
import java.util.Random;
import java.util.stream.IntStream;
/**
 *
 * @author xvpow
 */
public class Ch21_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
       Stream<String> st1 =  Stream.of("Ken","Vivin","Lucy");
       st1.filter(s->s.length() > 3).forEach(v->System.out.println(v));
       
       Stream<String> rStream =  Stream.generate(()->r.nextInt()+"");
       rStream.limit(5).forEach(rs ->System.out.println(rs));
       
       Stream<Integer> rStream2 = Stream.iterate(5, v->{
           return v+1;});
       rStream2.limit(10).forEach(v->System.out.println(v));
       rStream2.limit(20).forEach(v->System.out.println(v));
       
       System.out.println("========================");
       IntStream.range(5, 10).forEach(v->System.out.print(v+" "));
        System.out.println("========================");
       IntStream.rangeClosed(5, 10).forEach(v->System.out.print(v+" "));
        System.out.println("========================");
    }
    
}
