/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240521.Ch26_6_database3;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Random;
public class Ch26_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/mydb20240521";
        String user = "qwer";
        String password = "123456";
        Random ran = new Random();
        
        try(Connection conn =  DriverManager.getConnection(url, user, password);
             Statement stm  =   conn.createStatement()){
            
            conn.setAutoCommit(false);
            try{
                for (int i =1; i<= 5; i++){
                    int id = ran.nextInt(501);
                    if (i == 3){
                        throw new RuntimeException();
                    }
                       stm.executeUpdate("INSERT INTO myuser(id,user_name,level) VALUES("+id+",'test"+id+"',1.5)");
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
