/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.person.Person;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;

/**
 *
 * @author JAHNVI
 */
public class BusinessConfiguration {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Person person = new Person();        
        person.setFirstName("Jahnvi");
        person.setLastName("Gandhi");
        person.setGender("Female");
        person.setContactNo("0123456789");
        
        system.getPersonDirectory().addPerson(person);
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
        
        return system;
    }
}
