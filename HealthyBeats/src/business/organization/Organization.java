/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.person.PersonDirectoy;
import business.role.Role;
import business.useraccount.UserAccountDirectory;
import business.workqueue.WorkQueue;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author JAHNVI
 */
public abstract class Organization {
    
    private String organizationName;
    private int organizationId;
    private PersonDirectoy personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    
    public enum OrganizationType {
        AdminOrganization ("Admin Organization"),
        HealthCareOrganization ("Health Organization"),
        HouseHoldOrganization ("House Hold organization"),
        StoreOrganization ("Store Organization");
        
        private String value;
        
        private OrganizationType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public Organization(String name) {
        organizationName = name;
        organizationId = generateOrganizationId();
        workQueue = new WorkQueue();
        personDirectory = new PersonDirectoy();
        userAccountDirectory = new UserAccountDirectory();
    }

    public int getOrganizationId() {
        return organizationId;
    }
    
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public PersonDirectoy getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectoy personDirectory) {
        this.personDirectory = personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
     public int generateOrganizationId() {
        int orgId = 0;
        
        Random randomGenerator = new Random();
        orgId = randomGenerator.nextInt(1000);
        
        return orgId;
    }
     
    public abstract ArrayList<Role> getSupportedRoles();
    
    @Override
    public String toString() {
        return organizationName;
    }
}
