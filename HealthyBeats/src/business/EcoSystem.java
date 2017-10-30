/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.network.NetworkDirectory;
import business.organization.Organization;
import business.role.Role;
import business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class EcoSystem extends Organization {
 
    private static EcoSystem business;
    private NetworkDirectory networkList;
    
    public static EcoSystem getInstance() {
        if(business == null) {
            business = new EcoSystem();
        }
        
        return business;
    }
    
    public EcoSystem() {
        super(null);
        networkList = new NetworkDirectory();
        
    }

    public NetworkDirectory getNetworkList() {
        return networkList;
    }

    public void setNetworkList(NetworkDirectory networkList) {
        this.networkList = networkList;
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SystemAdminRole());
        return roles;
    }
}
