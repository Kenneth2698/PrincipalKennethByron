/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.PostgreConnection;
import Domain.Provider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Kenneth
 */
public class ProductBusiness {
    
    private PostgreConnection postgreConnection;
    
    public ProductBusiness(){
    
        this.postgreConnection = new PostgreConnection();
    }
    
    public void select(){
        this.postgreConnection.select();
    }
    
    public ArrayList<Provider> getProviders(){
       return this.postgreConnection.getProviders();
    }
}
