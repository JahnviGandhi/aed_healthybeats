/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.EnterpriseDirectory;
import business.organization.Organization;
import business.role.NetworkAdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class Network extends Organization {
   
    private EnterpriseDirectory enterpriseDirectory;

    public Network(String name) {
        super(name);
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }   

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NetworkAdminRole());
        return roles;
    }

    @Override
    public String toString() {
        return super.getOrganizationName();
    }
}
