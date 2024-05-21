/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240521.Ch26_7_database4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Random;

/**
 *
 * @author xvpow
 */
public class Ch26_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String url = "jdbc:derby://localhost:1527/mydb20240521";
        String user = "qwer";
        String password = "123456";
        String sql = "INSERT INTO myuser(id,user_name,level) VALUES(?,?,?)";
        Random ran = new Random();
        
        try(Connection conn =  DriverManager.getConnection(url, user, password);
             PreparedStatement stm  =   conn.prepareStatement(sql)){
            
            conn.setAutoCommit(false);
            try{
                for (int i =1; i<= 5; i++){
                    int id = ran.nextInt(501);
                    stm.setInt(1, id);
                    stm.setString(2, "test"+id);
                    stm.setDouble(3, 1.5);
                    
                       stm.executeUpdate();
               }
            }catch(Exception ex){
                System.out.println(ex);
                conn.rollback();
            }
              conn.setAutoCommit(true);
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
}
