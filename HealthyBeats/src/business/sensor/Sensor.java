/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.sensor;

import java.util.Random;

/**
 *
 * @author JAHNVI
 */
public class Sensor {
    private int sensorId;
    private String sensorName;
    private SensorType type;
    private static int count = 0;
    
    public Sensor() {
        count++;
        sensorId = count;
    }
    
    public enum SensorType {
        FoodConsumption ("Food Consumption Tracker"),
        VitalSign ("Vital Sign Detector");
        
        private String value;
        
        private SensorType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }  

        @Override
        public String toString() {
            return value;
        }
    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public SensorType getType() {
        return type;
    }

    public void setType(SensorType type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return sensorName;
    }
}
