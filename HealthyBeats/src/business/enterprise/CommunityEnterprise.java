/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class CommunityEnterprise extends Enterprise {
    
    public CommunityEnterprise(String name) {
        super(name, EnterpriseType.Community);
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        return null;
    }
}
