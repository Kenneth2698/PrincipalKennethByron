/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Product;
import Domain.Provider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Kenneth
 */
public class PostgreConnection {
 
    public PostgreConnection(){
        
    }
    public ArrayList<Provider> getProviders(){
        ArrayList<Provider> list = new ArrayList<>();
        
        String url = "jdbc:postgresql://localhost:5432/Principal";
        String user = "postgres";
        String password = "1234";
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            java.sql.Statement st = connection.createStatement();
            String sql = "SELECT  id,name,address from getProviders()";
            ResultSet result = st.executeQuery(sql);
            
            while(result.next()){
                Provider p = new Provider();
                p.setId(Integer.parseInt(result.getString("id")));
                p.setName(result.getString("name"));
                p.setAddress(result.getString("address"));
                
                list.add(p);
            }
            result.close();
            st.close();
            connection.close();
            
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return list;
    }

    
    public ArrayList<Product> getProducts(Provider pro){
        ArrayList<Product> list = new ArrayList<>();
        
        String url = "jdbc:postgresql://localhost:5432/Principal";
        String user = "postgres";
        String password = "1234";
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            java.sql.Statement st = connection.createStatement();
            String sql = "SELECT  id,name,price,description,image,status,provider from getProducts("+pro.getId()+")";
            ResultSet result = st.executeQuery(sql);
            
            while(result.next()){
                Product p = new Product();
                p.setId(Integer.parseInt(result.getString("id")));
                p.setName(result.getString("name"));
                p.setPrice(Integer.parseInt(result.getString("price")));
                p.setDescription(result.getString("description"));
                p.setImage(result.getString("image"));
                p.setStatus(Integer.parseInt(result.getString("status")));
                p.setProvider(Integer.parseInt(result.getString("provider")));
                
                list.add(p);
            }
            result.close();
            st.close();
            connection.close();
            
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return list;
    }
    
    public void updateProductStatus(int providerI  ,int productId ,int status){
        String url = "jdbc:postgresql://localhost:5432/Principal";
        String user = "postgres";
        String password = "1234";
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            java.sql.Statement st = connection.createStatement();
            String sql = "SELECT * from updateProductStatus("+providerI+" ,"+productId+","+ status+ ")";
            ResultSet result = st.executeQuery(sql);
            result.close();
            st.close();
            connection.close();
            
        }catch(Exception e){
            System.err.println(e.getMessage());  
        }
    }
    
    public int verifyCode(String code){
        int output = 0;
        
         String url = "jdbc:postgresql://localhost:5432/Principal";
        String user = "postgres";
        String password = "1234";
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            java.sql.Statement st = connection.createStatement();
            String sql = "SELECT verifyCode ('"+code+"') as resultado";
            ResultSet result = st.executeQuery(sql);
            System.out.println(result.toString()+" ");
            while(result.next()){
                output = result.getInt("resultado");
            }
            result.close();
            st.close();
            connection.close();
            
        }catch(Exception e){
            
            System.err.println(e.getMessage());
        }
        
        return output;
    }
    
    public int getProviderId(String code){
        int output = 0 ;
        String url = "jdbc:postgresql://localhost:5432/Principal";
        String user = "postgres";
        String password = "1234";
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url,user,password);
            java.sql.Statement st = connection.createStatement();
            String sql = "SELECT getProviderId as resultado from getProviderId('"+code+"')";
            ResultSet result = st.executeQuery(sql);
            System.out.println(result.toString()+" ");
            while(result.next()){
                output = result.getInt("resultado");
            }
            result.close();
            st.close();
            connection.close();
            
        }catch(Exception e){
            
            System.err.println(e.getMessage());
        }
        return output;
    }
    
}
