/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240521.Ch26_5_database2;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author xvpow
 */
public class Ch26_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String url = "jdbc:derby://localhost:1527/mydb20240521";
        String user = "qwer";
        String password = "123456";
        try(Connection conn = DriverManager.getConnection(url, user, password);
             Statement stem =    conn.createStatement();){
            ResultSet result = stem.executeQuery("SELECT * FROM myuser");
            while(result.next()){
                int id = result.getInt(1);
                String name = result.getString("user_name");
                double level = result.getDouble(3);
                System.out.println(id+":"+name+":"+level);
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
}
