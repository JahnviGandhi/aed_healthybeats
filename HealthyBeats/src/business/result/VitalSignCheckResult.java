/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.result;

/**
 *
 * @author JAHNVI
 */
public class VitalSignCheckResult {
    private int id;
    private String vsName;
    private float avgValue;
    private boolean isVsNormal;
    private String effect;
    private static int count = 0;
    
    public VitalSignCheckResult() {
        count++;
        id = count;
    }

    public String getVsName() {
        return vsName;
    }

    public void setVsName(String vsName) {
        this.vsName = vsName;
    }

    public float getAvgValue() {
        return avgValue;
    }

    public void setAvgValue(float avgValue) {
        this.avgValue = avgValue;
    }

    public boolean isIsVsNormal() {
        return isVsNormal;
    }

    public void setIsVsNormal(boolean isVsNormal) {
        this.isVsNormal = isVsNormal;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
