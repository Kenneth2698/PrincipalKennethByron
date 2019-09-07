/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.APIClient;
import Data.PostgreConnection;
import Domain.Product;
import Domain.Provider;
import java.util.ArrayList;

/**
 *
 * @author Kenneth
 */
public class ProductBusiness {
    
    private PostgreConnection postgreConnection;
    private APIClient api;
    public ProductBusiness(){
        this.postgreConnection = new PostgreConnection();
        this.api = new APIClient();
    }
    
    public ArrayList<Provider> getProviders(){
       return this.postgreConnection.getProviders();
    }
    
     public ArrayList<Product> getProducts(Provider pro){
         return this.postgreConnection.getProducts(pro);
     }
     public void updateProductStatus(int providerId  ,int productId ,int status){
         this.postgreConnection.updateProductStatus(providerId, productId, status);
     }
     public int verifyCode(String code){
         return this.postgreConnection.verifyCode(code);
     }
     public int getProviderId(String code){
         return this.postgreConnection.getProviderId(code);
     }
     public void transferproducts(int idProvider){
         this.api.transferProducts(idProvider);
     }
     
}
