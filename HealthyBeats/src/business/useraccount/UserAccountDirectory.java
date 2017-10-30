/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import business.person.Person;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountDirectory;

    public UserAccountDirectory() {
        userAccountDirectory = new ArrayList<>();
    }
    
    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(ArrayList<UserAccount> userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    public UserAccount createUserAccount(String username, String password, Person person, Role role) {
        UserAccount ua = new UserAccount();
        ua.setUserName(username);
        ua.setPassword(password);
        ua.setPerson(person);
        ua.setRole(role);
        userAccountDirectory.add(ua);
        return ua;
    }
    
    public void removeUserAccount(UserAccount ua) {
        userAccountDirectory.remove(ua);
    }
    
    public boolean checkIfUserNameExists(String username) {
        boolean exists = false;
        
        for(UserAccount ua : userAccountDirectory) {
            if(ua.getUserName().equalsIgnoreCase(username)) {
                exists = true;
                break;
            }
        }
        
        return exists;
    }
    
    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountDirectory)
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public ArrayList<UserAccount> searchUserAccountByFname(String fname) {
        ArrayList<UserAccount> uaList = new ArrayList<>();
        
        for (UserAccount ua : userAccountDirectory) {
            if (ua.getPerson().getFirstName().toUpperCase().contains(fname.toUpperCase())) {
                uaList.add(ua);
            }
        }
        
        return uaList;
    }
}
    
