/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.store;


import business.organization.Organization;
import business.role.Role;
import business.role.StoreAdminRole;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author JAHNVI
 */
public class Store extends Organization {
    private int storeId;
    private String storeName;
    private ProductCatalog productCatalog;

    public Store() {
        super(null);
        storeId = generateStoreId();
        productCatalog = new ProductCatalog();
    }
    
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    public int generateStoreId() {
        int storeId = 0;
        
        Random randomGenerator = new Random();
        storeId = randomGenerator.nextInt(10);
        
        return storeId;
    }

    @Override
    public String toString() {
        return storeName;
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> supportedRoles = new ArrayList<>();
        supportedRoles.add(new StoreAdminRole());
        return supportedRoles;
    }
    
}
