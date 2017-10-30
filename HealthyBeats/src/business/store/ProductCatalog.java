/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.store;

import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class ProductCatalog {
    private ArrayList<Product> productCatalog;
    
    public ProductCatalog() {
        productCatalog = new ArrayList<>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ArrayList<Product> productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    public Product addProduct() {
        Product prod = new Product();
        productCatalog.add(prod);
        return prod;
    }
    
    public void removeProduct(Product prod) {
        productCatalog.remove(prod);
    }
}
