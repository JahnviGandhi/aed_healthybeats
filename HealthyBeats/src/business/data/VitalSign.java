/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.data;

import business.HelperMethods;

/**
 *
 * @author JAHNVI
 */
public class VitalSign {
    private float temperature;
    private int systolicBp;
    private int diastolicBp;
    private int respiratoryRate;
    private int pulse;
    private float bloodSugar;
    private float bmi; //body-mass index
    private float cholesterol;
    private boolean isVitalSignNormal;
    private boolean isTempNormal;
    private boolean isBpNormal;
    private boolean isRespiRateNormal;
    private boolean isPulseNormal;
    private boolean isBloodSugarNormal;
    private boolean isBmiNormal;
    private boolean isCholesterolNormal;
    private String timestamp;
    private String sensorName;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public int getSystolicBp() {
        return systolicBp;
    }

    public void setSystolicBp(int systolicBp) {
        this.systolicBp = systolicBp;
    }

    public int getDiastolicBp() {
        return diastolicBp;
    }

    public void setDiastolicBp(int diastolicBp) {
        this.diastolicBp = diastolicBp;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public float getBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(float bloodSugar) {
        this.bloodSugar = bloodSugar;
    }

    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }

    public float getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(float cholesterol) {
        this.cholesterol = cholesterol;
    }

    public boolean isIsVitalSignNormal() {
        return isVitalSignNormal;
    }

    public void setIsVitalSignNormal(boolean isVitalSignNormal) {
        this.isVitalSignNormal = isVitalSignNormal;
    }

    public boolean isIsTempNormal() {
        return isTempNormal;
    }

    public void setIsTempNormal(boolean isTempNormal) {
        this.isTempNormal = isTempNormal;
    }

    public boolean isIsBpNormal() {
        return isBpNormal;
    }

    public void setIsBpNormal(boolean isBpNormal) {
        this.isBpNormal = isBpNormal;
    }

    public boolean isIsRespiRateNormal() {
        return isRespiRateNormal;
    }

    public void setIsRespiRateNormal(boolean isRespiRateNormal) {
        this.isRespiRateNormal = isRespiRateNormal;
    }

    public boolean isIsPulseNormal() {
        return isPulseNormal;
    }

    public void setIsPulseNormal(boolean isPulseNormal) {
        this.isPulseNormal = isPulseNormal;
    }

    public boolean isIsBloodSugarNormal() {
        return isBloodSugarNormal;
    }

    public void setIsBloodSugarNormal(boolean isBloodSugarNormal) {
        this.isBloodSugarNormal = isBloodSugarNormal;
    }

    public boolean isIsBmiNormal() {
        return isBmiNormal;
    }

    public void setIsBmiNormal(boolean isBmiNormal) {
        this.isBmiNormal = isBmiNormal;
    }

    public boolean isIsCholesterolNormal() {
        return isCholesterolNormal;
    }

    public void setIsCholesterolNormal(boolean isCholesterolNormal) {
        this.isCholesterolNormal = isCholesterolNormal;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    @Override
    public String toString() {
        return HelperMethods.getTimeFromStamp(timestamp);
    }
}
