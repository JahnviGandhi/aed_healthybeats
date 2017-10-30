/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.result;

import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class HealthCheckRequestResult {
    private ArrayList<VitalSignCheckResult> vitalSignResultList;
    private ArrayList<NutrientsCheckResult> nutrientResultList;
    
    public HealthCheckRequestResult() {
        vitalSignResultList = new ArrayList();
        nutrientResultList = new ArrayList();
    }

    public ArrayList<VitalSignCheckResult> getVitalSignResultList() {
        return vitalSignResultList;
    }

    public void setVitalSignResultList(ArrayList<VitalSignCheckResult> vitalSignResultList) {
        this.vitalSignResultList = vitalSignResultList;
    }

    public ArrayList<NutrientsCheckResult> getNutrientResultList() {
        return nutrientResultList;
    }

    public void setNutrientResultList(ArrayList<NutrientsCheckResult> nutrientResultList) {
        this.nutrientResultList = nutrientResultList;
    }
}
