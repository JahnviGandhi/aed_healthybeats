/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.data.FoodConsumptionDetail;
import business.data.VitalSign;
import business.result.HealthCheckRequestResult;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class HealthCheckRequest extends WorkRequest {
    private ArrayList<VitalSign> vitalSignsList;
    private ArrayList<FoodConsumptionDetail> fcdList;
    private HealthCheckRequestResult resultData;
    private String result;

    public HealthCheckRequest() {
        vitalSignsList = new ArrayList<>();
        fcdList = new ArrayList<>();
        resultData = new HealthCheckRequestResult();
    }
    
    public ArrayList<VitalSign> getVitalSignsList() {
        return vitalSignsList;
    }

    public void setVitalSignsList(ArrayList<VitalSign> vitalSignsList) {
        this.vitalSignsList = vitalSignsList;
    }

    public ArrayList<FoodConsumptionDetail> getFcdList() {
        return fcdList;
    }

    public void setFcdList(ArrayList<FoodConsumptionDetail> fcdList) {
        this.fcdList = fcdList;
    }
    
    public HealthCheckRequestResult getResultData() {
        return resultData;
    }

    public void setResultData(HealthCheckRequestResult resultData) {
        this.resultData = resultData;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
