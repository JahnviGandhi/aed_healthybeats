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
public class NutrientsCheckResult {
    private int id;
    private String nutrientName;
    private float totalIntake;
    private boolean isAboveLevel;
    private boolean isBelowLevel;
    private String effect;
    private static int count = 0;

    public NutrientsCheckResult() {
        count++;
        id = count;
    }
    
    public String getNutrientName() {
        return nutrientName;
    }

    public void setNutrientName(String nutrientName) {
        this.nutrientName = nutrientName;
    }

    public float getTotalIntake() {
        return totalIntake;
    }

    public void setTotalIntake(float totalIntake) {
        this.totalIntake = totalIntake;
    }

    public boolean isIsAboveLevel() {
        return isAboveLevel;
    }

    public void setIsAboveLevel(boolean isAboveLevel) {
        this.isAboveLevel = isAboveLevel;
    }

    public boolean isIsBelowLevel() {
        return isBelowLevel;
    }

    public void setIsBelowLevel(boolean isBelowLevel) {
        this.isBelowLevel = isBelowLevel;
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
