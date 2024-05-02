/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20240502.Ch21_5_stream5;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch21_5 {
    public static void main(String[] args){
        Student st1 = new Student();
        st1.addBook("java");
        st1.addBook("Python");
        Student st2 = new Student();
        st2.addBook("Python");
        st2.addBook("Java");
        st2.addBook("Goaln");
       Student st3 = new Student();
        st3.addBook("C#");
        st3.addBook("Java");
        st3.addBook("Goaln");
       Student st4 = new Student();
        st4.addBook("C#");
        st4.addBook("Python");
        st4.addBook("C++");
        
        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
       // st1.getBooks().add("Vivnd");
        st1.getBooks().forEach(v->System.out.println(v));
        System.out.println("=========================");
        //list.stream().map(st->st.getBooks()).forEach(stre->System.out.println(stre));
        list.stream().flatMap(st->st.getBooks()).distinct().
                forEach(book->System.out.println(book));
        System.out.println("=========================");
        //所有書名長度的平均值
       double avg =  list.stream().
                 flatMapToInt(st->st.getBooks().mapToInt(book->book.length())).
               summaryStatistics().getAverage();
       System.out.println(avg);
    }
}
