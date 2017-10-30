/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.household.HouseHoldDirectory;
import business.role.HouseHoldOrganizationAdminRole;
import business.role.Role;
import business.role.UserRole;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class HouseHoldOrganization extends Organization {
    private HouseHoldDirectory houseHoldDirectory;
    
    public HouseHoldOrganization() {
        super(OrganizationType.HouseHoldOrganization.getValue());
        houseHoldDirectory = new HouseHoldDirectory();
    }

    public HouseHoldDirectory getHouseHoldDirectory() {
        return houseHoldDirectory;
    }

    public void setHouseHoldDirectory(HouseHoldDirectory houseHoldDirectory) {
        this.houseHoldDirectory = houseHoldDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> supportedRoles = new ArrayList<>();
        supportedRoles.add(new HouseHoldOrganizationAdminRole());
        supportedRoles.add(new UserRole());
        return supportedRoles;
    }
    
    @Override
    public String toString() {
        return super.getOrganizationName();
    }
}
