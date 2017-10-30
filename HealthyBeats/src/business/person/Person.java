/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.person;

import java.util.Random;

/**
 *
 * @author JAHNVI
 */
public class Person {
    private int personId;
    private String firstName;
    private String lastName;
    private String gender;
    private String contactNo;

    public Person() {
        personId = generatePersonId();
    }

    public int getPersonId() {
        return personId;
    }
   
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    
    public int generatePersonId() {
        int personId = 0;
        
        Random randomGenerator = new Random();
        personId = randomGenerator.nextInt(500);
        
        return personId;
    }
}
