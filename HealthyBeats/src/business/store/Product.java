/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.store;

import java.util.Random;

/**
 *
 * @author JAHNVI
 */
public class Product {
    private int barcodeNumber;
    private String productName;
    private float energy;
    private float protien;
    private float fat;
    private float carbohydrates;
    private float iodine;
    private float sugar;
    private float salt;
    private float vitaminA;
    private float vitaminB12;
    private float vitaminC;
    private float vitaminD;
    private float vitaminE;
    private float vitaminK;
    private float fibers;
    private int quantity;
    private float weight;
    private float price;

    public Product() {
        barcodeNumber = generateBarcodeNumber();
    }
    
    public int getBarcodeNumber() {
        return barcodeNumber;
    }

    public void setBarcodeNumber(int barcodeNumber) {
        this.barcodeNumber = barcodeNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getEnergy() {
        return energy;
    }

    public void setEnergy(float energy) {
        this.energy = energy;
    }

    public float getProtien() {
        return protien;
    }

    public void setProtien(float protien) {
        this.protien = protien;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public float getIodine() {
        return iodine;
    }

    public void setIodine(float iodine) {
        this.iodine = iodine;
    }

    public float getSugar() {
        return sugar;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    public float getSalt() {
        return salt;
    }

    public void setSalt(float salt) {
        this.salt = salt;
    }

    public float getVitaminA() {
        return vitaminA;
    }

    public void setVitaminA(float vitaminA) {
        this.vitaminA = vitaminA;
    }

    public float getVitaminB12() {
        return vitaminB12;
    }

    public void setVitaminB12(float vitaminB12) {
        this.vitaminB12 = vitaminB12;
    }

    public float getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(float vitaminC) {
        this.vitaminC = vitaminC;
    }

    public float getVitaminD() {
        return vitaminD;
    }

    public void setVitaminD(float vitaminD) {
        this.vitaminD = vitaminD;
    }

    public float getVitaminE() {
        return vitaminE;
    }

    public void setVitaminE(float vitaminE) {
        this.vitaminE = vitaminE;
    }

    public float getVitaminK() {
        return vitaminK;
    }

    public void setVitaminK(float vitaminK) {
        this.vitaminK = vitaminK;
    }

    public float getFibers() {
        return fibers;
    }

    public void setFibers(float fibers) {
        this.fibers = fibers;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public int generateBarcodeNumber() {
        int barcode = 0;
        
        Random randomGenerator = new Random();
        barcode = randomGenerator.nextInt(10000);
        
        return barcode;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return productName;
    }
}
