/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20240312.Ch7_2_oo2;

public class Window {
    private String name;
    private float x;
    private float y;
    private String bg;
    private String icon;
    
    Window(String name){
        this(name,100,100,"黑");
    }
    Window(String name,float x){
        this(name,x,100,"黑");
    }
    Window(String name,float x,float y){
        this(name,x,y,"黑");
    }
    Window(String name,float x,float y,String bg){
        this(name,x,y,bg,"default");
    }
    Window(String name,float x,float y,String bg,String icon){
        this.name = name;
        this.x = x;
        this.y = y;
        this.bg = bg;
        this.icon = icon;
    }
  public void printInfo(){
      System.out.println(name+":"+x+":"+y+":"+bg);
  }  
}
