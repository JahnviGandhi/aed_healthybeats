/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.data;

import business.HelperMethods;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class FoodConsumptionDetailHistory {
    private ArrayList<FoodConsumptionDetail> fcdHistory;
    
    public FoodConsumptionDetailHistory() {
        fcdHistory = new ArrayList<>();
    }

    public ArrayList<FoodConsumptionDetail> getFoodConsumptionDetailHistory() {
        return fcdHistory;
    }

    public void setFoodConsumptionDetailHistory(ArrayList<FoodConsumptionDetail> foodConsumptionDetailHistory) {
        this.fcdHistory = foodConsumptionDetailHistory;
    }
    
    public FoodConsumptionDetail addFcd() {
        FoodConsumptionDetail fcd = new FoodConsumptionDetail();
        fcdHistory.add(fcd);
        return fcd;
    }
    
    public ArrayList<FoodConsumptionDetail> getFoodConsumptionForDate(String date) {
        ArrayList<FoodConsumptionDetail> fcdList = new ArrayList<>();
        
        for (FoodConsumptionDetail fcd : fcdHistory) {
            if (HelperMethods.getDateFromStamp(fcd.getTimestamp()).equals(date)) {
                fcdList.add(fcd);
            }
        }
        
        return fcdList;
    }
}
