/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createEnterprise(String name, EnterpriseType type) {
        Enterprise enterprise = null;
        
        if (type == EnterpriseType.Community) {
            enterprise = new CommunityEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
    public void deleteEnterprise(Enterprise enterprise) {
        enterpriseList.remove(enterprise);
    }
    
    public ArrayList<Enterprise> searchEnterprise(String name) {
        ArrayList<Enterprise> enterprises = new ArrayList<>();
        
        for (Enterprise enterprise : enterpriseList) {
            if (enterprise.getOrganizationName().toUpperCase().contains(name.toUpperCase())) {
                enterprises.add(enterprise);
            } 
        }
        
        return enterprises;
    }
}
