/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.sensor;

import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class SensorDirectory {
    private ArrayList<Sensor> sensorList;
    
    public SensorDirectory() {
        sensorList = new ArrayList<>();
    }

    public ArrayList<Sensor> getSensorList() {
        return sensorList;
    }

    public void setSensorList(ArrayList<Sensor> sensorList) {
        this.sensorList = sensorList;
    }
    
    public Sensor addSensor() {
        Sensor sensor = new Sensor();
        sensorList.add(sensor);
        return sensor;
    }
    
    public void removeSensor(Sensor sensor) {
        sensorList.remove(sensor);
    }
}
