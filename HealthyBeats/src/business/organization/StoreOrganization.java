/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.Role;
import business.role.StoreAdminRole;

import business.role.StoreOrganizationAdminRole;
import business.store.StoreDirectory;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class StoreOrganization extends Organization {
    private StoreDirectory storeDirectory;
    
    public StoreOrganization() {
        super(OrganizationType.StoreOrganization.getValue());
        storeDirectory = new StoreDirectory();
    }

    public StoreDirectory getStoreDirectory() {
        return storeDirectory;
    }

    public void setStoreDirectory(StoreDirectory storeDirectory) {
        this.storeDirectory = storeDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> supportedRoles = new ArrayList<>();
        supportedRoles.add(new StoreOrganizationAdminRole());
        return supportedRoles;
    }
    
    @Override
    public String toString() {
        return super.getOrganizationName();
    }
}
