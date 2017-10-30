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
public class StoreDirectory {
    private ArrayList<Store> storeList;
    
    public StoreDirectory() {
        storeList = new ArrayList<>();
    }

    public ArrayList<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(ArrayList<Store> storeList) {
        this.storeList = storeList;
    }
    
    public Store createStore() {
        Store store = new Store();
        storeList.add(store);
        return store;
    }
    
    public void removeStore(Store store) {
        storeList.remove(store);
    }
    
    public ArrayList<Store> searchStore(String name) {
        ArrayList<Store> stores = new ArrayList<>();
        
        for(Store store : storeList) {
            if(store.getStoreName().toUpperCase().contains(name.toUpperCase())) {
                stores.add(store);
            }
        }    
        
        return stores;
    }
}
