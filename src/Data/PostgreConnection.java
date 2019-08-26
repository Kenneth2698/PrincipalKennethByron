/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Kenneth
 */
public class PostgreConnection {
 
    public PostgreConnection(){
        
    }
    public void select(){
        String url = "jdbc:postgresql://localhost:5432/Principal";
        String user = "postgres";
        String password = "1234";
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            java.sql.Statement st = connection.createStatement();
            String sql = "SELECT * from obtenerPersonas()";
            ResultSet result = st.executeQuery(sql);
            
            while(result.next()){
                System.out.print(result.getString("nombre")+"  ");
                System.out.println(result.getString("edad"));
            }
            result.close();
            st.close();
            connection.close();
            
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void insertar(){
        String url = "jdbc:postgresql://localhost:5432/Principal";
        String user = "postgres";
        String password = "1234";
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            java.sql.Statement st = connection.createStatement();
            String id = "6158";
            String sql = "insert into prueba values("+id+")";
            st.executeQuery(sql);
            
            st.close();
            connection.close();
            
        }catch(Exception e){
          //  System.err.println(e.getMessage());
        }
    }
}
