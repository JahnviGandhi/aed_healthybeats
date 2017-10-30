/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.person;

import business.data.FoodConsumptionDetailHistory;
import business.data.VitalSignHistory;
import business.sensor.SensorDirectory;

/**
 *
 * @author JAHNVI
 */
public class FamilyMember extends Person {
    
    private int houseHoldId;
    private String dob;
    private int age;
    private SensorDirectory sensorDirectory;
    private VitalSignHistory vitalSignHistory;
    private FoodConsumptionDetailHistory foodConsumptionHistory;
    
    public FamilyMember() {
        sensorDirectory = new SensorDirectory();
        vitalSignHistory = new VitalSignHistory();
        foodConsumptionHistory = new FoodConsumptionDetailHistory();
    }

    public int getHouseHoldId() {
        return houseHoldId;
    }

    public void setHouseHoldId(int houseHoldId) {
        this.houseHoldId = houseHoldId;
    }
    
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SensorDirectory getSensorDirectory() {
        return sensorDirectory;
    }

    public void setSensorDirectory(SensorDirectory sensorDirectory) {
        this.sensorDirectory = sensorDirectory;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public FoodConsumptionDetailHistory getFoodConsumptionHistory() {
        return foodConsumptionHistory;
    }

    public void setFoodConsumptionHistory(FoodConsumptionDetailHistory foodConsumptionHistory) {
        this.foodConsumptionHistory = foodConsumptionHistory;
    }

    @Override
    public String toString() {
        return super.getFirstName();
    }
}
