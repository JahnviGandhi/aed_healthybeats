/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.household;

import business.person.PersonDirectoy;
import java.util.Random;

/**
 *
 * @author JAHNVI
 */
public class HouseHold {
    
    private int houseHoldId;
    private int headOfTheFamily;
    private String houseHoldName;
    private String address;
    private PersonDirectoy familyMembers;
    
    public HouseHold() {
        houseHoldId = generateHouseHoldId();
        familyMembers = new PersonDirectoy();
    }

    public int getHouseHoldId() {
        return houseHoldId;
    }

    public int getHeadOfTheFamily() {
        return headOfTheFamily;
    }

    public void setHeadOfTheFamily(int headOfTheFamily) {
        this.headOfTheFamily = headOfTheFamily;
    }

    public String getHouseHoldName() {
        return houseHoldName;
    }

    public void setHouseHoldName(String houseHoldName) {
        this.houseHoldName = houseHoldName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PersonDirectoy getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(PersonDirectoy familyMembers) {
        this.familyMembers = familyMembers;
    }
    
    public int generateHouseHoldId() {
        int houseHoldId = 0;
        
        Random randomGenerator = new Random();
        houseHoldId = randomGenerator.nextInt(100);
        
        return houseHoldId;
    }

    @Override
    public String toString() {
        return houseHoldName;
    }    
}
