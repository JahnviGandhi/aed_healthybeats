/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(OrganizationType type) {
        Organization organization = null;
        
        if(type.getValue().equals(OrganizationType.AdminOrganization.getValue())) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        }       
        else if (type.getValue().equals(OrganizationType.HouseHoldOrganization.getValue())) {
            organization = new HouseHoldOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.HealthCareOrganization.getValue())) {
            organization = new HealthCareOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.StoreOrganization.getValue())) {
            organization = new StoreOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void deleteOrganization(Organization org) {
        organizationList.remove(org);
    }
    
    public ArrayList<Organization> searchOrganization(String name) {
        ArrayList<Organization> orgs = new ArrayList<>();
        
        for (Organization org : organizationList) {
            if (org.getOrganizationName().toUpperCase().contains(name.toUpperCase())) {
                orgs.add(org);
            }
        }
        
        return orgs;
    }
}
