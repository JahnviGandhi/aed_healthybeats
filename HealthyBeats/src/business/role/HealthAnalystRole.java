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
import userinterface.healthanalystrole.HealthAnalystWorkAreaJPanel;

/**
 *
 * @author JAHNVI
 */
public class HealthAnalystRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, EcoSystem ecoSystem, Network network, Enterprise enterprise, Organization organization, Store store, UserAccount userAccount) {
        return new HealthAnalystWorkAreaJPanel(userProcessContainer, enterprise, organization, userAccount);
    }
    
}
