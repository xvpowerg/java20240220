/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240521.Ch26_4_database1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author xvpow
 */
public class Ch26_4 {
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/mydb20240521";
        String user = "qwer";
        String password = "123456";
        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement stem = con.createStatement()){
          int count = 
                  stem.executeUpdate("INSERT INTO myuser(id,user_name,level) VALUES(100,'Lucy',12.5)");
          
          System.out.println(count);
        }catch(SQLException ex){
            System.out.println(ex);
        }
       
    }
    
}
