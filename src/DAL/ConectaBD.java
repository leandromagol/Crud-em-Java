/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author leuzz
 */
public class ConectaBD {
    public static Connection conectabd() throws ClassNotFoundException{
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/CRUD","tarefas","tarefasdba12345!A");
            
            return con;
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, error);
            return null;
        }
       
    }
    
    
}
