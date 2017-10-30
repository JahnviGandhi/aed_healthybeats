/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.store.Store;
import business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author JAHNVI
 */
public abstract class Role {
    
    public enum RoleType {
        SystemAdmin ("System Admin"),
        EnterpriseAdmin ("Enterprise Admin"),
        NetworkAdmin ("Network Admin"),
        OrganizationAdmin ("Organization Admin"),
        HealthCareOrganization ("Health Care Organization Admin"),
        HouseHoldOrganizationAmin ("House Hold Organization Admin"),
        StoreOrganizationAdmin ("Store Organization Admin"),
        User ("User"),
        HealthAnalyst ("Health Analyst"),
        StoreAdmin ("Store Admin");
        
        private String value;
        
        private RoleType(String value) {
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
    
    public abstract JPanel createWorkArea(
            JPanel userProcessContainer,
            EcoSystem ecoSystem,
            Network network,
            Enterprise enterprise,
            Organization organization,
            Store store,
            UserAccount userAccount
    );

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
