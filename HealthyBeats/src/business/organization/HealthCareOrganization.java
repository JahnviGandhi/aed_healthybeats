/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.HealthAnalystRole;
import business.role.HealthCareOrganizationAdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class HealthCareOrganization extends Organization {
    
    public HealthCareOrganization() {
        super(OrganizationType.HealthCareOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> supportedRoles = new ArrayList<>();
        supportedRoles.add(new HealthCareOrganizationAdminRole());
        supportedRoles.add(new HealthAnalystRole());
        return supportedRoles;
    }
}
