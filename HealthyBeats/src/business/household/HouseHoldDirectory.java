/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.household;

import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class HouseHoldDirectory {
    private ArrayList<HouseHold> houseHoldDirectory;
    
    public HouseHoldDirectory() {
        houseHoldDirectory = new ArrayList<>();
    }

    public ArrayList<HouseHold> getHouseHoldDirectory() {
        return houseHoldDirectory;
    }

    public void setHouseHoldDirectory(ArrayList<HouseHold> houseHoldDirectory) {
        this.houseHoldDirectory = houseHoldDirectory;
    }
    
    public HouseHold createHouseHold() {
        HouseHold houseHold = new HouseHold();
        houseHoldDirectory.add(houseHold);
        return houseHold;
    }
    
    public void removeHouseHold(HouseHold houseHold) {
        houseHoldDirectory.remove(houseHold);
    }
    
    public ArrayList<HouseHold> searchHouseHold(String name) {
        ArrayList<HouseHold> hhs = new ArrayList<>();
        
        for (HouseHold hh : houseHoldDirectory) {
            if (hh.getHouseHoldName().toUpperCase().contains(name.toUpperCase())) {
                hhs.add(hh);
            }
        }
        
        return hhs;
    }
}
