/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.EnterpriseAdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class AdminOrganization extends Organization {
    
    public AdminOrganization() {
        super(OrganizationType.AdminOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EnterpriseAdminRole());
        return roles;
    }
}
