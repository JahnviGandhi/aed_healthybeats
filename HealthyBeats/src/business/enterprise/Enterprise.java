/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.household.HouseHoldDirectory;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import business.store.StoreDirectory;


/**
 *
 * @author JAHNVI
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    // private HouseHoldDirectory houseHoldDirectory;
    // private StoreDirectory storeDirectory;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
       // houseHoldDirectory = new HouseHoldDirectory();
       // storeDirectory = new StoreDirectory();
    }

    public enum EnterpriseType {
        Community("Community Enterprise");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    /*
    public HouseHoldDirectory getHouseHoldDirectory() {
        return houseHoldDirectory;
    }

    public void setHouseHoldDirectory(HouseHoldDirectory houseHoldDirectory) {
        this.houseHoldDirectory = houseHoldDirectory;
    }
    */
    /*
    public StoreDirectory getStoreDirectory() {
        return storeDirectory;
    }

    public void setStoreDirectory(StoreDirectory storeDirectory) {
        this.storeDirectory = storeDirectory;
    }
    */
    
    @Override
    public String toString() {
        return super.getOrganizationName();
    }
}
