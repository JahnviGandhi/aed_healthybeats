/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.data.VitalSign;
import business.data.VitalSignHistory;
import business.enterprise.Enterprise;
import business.enterprise.EnterpriseDirectory;
import business.household.HouseHold;
import business.household.HouseHoldDirectory;
import business.network.Network;
import business.network.NetworkDirectory;
import business.organization.Organization;
import business.person.Person;
import business.store.Store;
import business.store.StoreDirectory;
import business.useraccount.UserAccount;
import business.useraccount.UserAccountDirectory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author JAHNVI
 */
public class HelperMethods {
    
    public static boolean isNetworkExisting(String name, NetworkDirectory networkList) {
        boolean isExisting = false;
        
        for (Network network : networkList.getNetworkList()) {
            if (network.getOrganizationName().equalsIgnoreCase(name)) {
                isExisting = true;
                break;
            } 
        }
        
        return isExisting;
    }
    
    public static boolean isEnterpriseExisting(String name, EnterpriseDirectory enterpriseList) {
        boolean isExisting = false;
        
        for (Enterprise enterprise : enterpriseList.getEnterpriseList()) {
            if (enterprise.getOrganizationName().equalsIgnoreCase(name)) {
                isExisting = true;
                break;
            }
        }
        
        return isExisting;
    }
    
    public static boolean isStoreExisting(String name, StoreDirectory storeDirectory) {
        boolean isExisting = false;
        
        for (Store store : storeDirectory.getStoreList()) {
            if (store.getStoreName().equalsIgnoreCase(name)) {
                isExisting = true;
                break;
            }
        }
        
        return isExisting;
    }
    
    public static boolean isHouseNameExisting(String name, HouseHoldDirectory houseList) {
        boolean isExisting = false;
        
        for(HouseHold house : houseList.getHouseHoldDirectory()) {
            if (house.getHouseHoldName().equalsIgnoreCase(name)) {
                isExisting = true;
                break;
            }
        }
        
        return isExisting;
    }
    
    public static boolean checkIfUserNameExists(String uname, EcoSystem system) {
        boolean exists = false;
        
        for (Network network : system.getNetworkList().getNetworkList()) {
            if (network.getUserAccountDirectory().checkIfUserNameExists(uname)) {
                exists = true;
                break;
            }
            else {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getUserAccountDirectory().checkIfUserNameExists(uname)) {
                        exists = true;
                        break;
                    }
                    else {
                        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (org.getUserAccountDirectory().checkIfUserNameExists(uname)) {
                                exists = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        
        return exists;
    }
    
    public static String getNameForHeadOfTheFamily(int id, HouseHold hh) {
        String name = "";
        
        for (Person person : hh.getFamilyMembers().getPersonList()) {
            if (person.getPersonId() == id) {
                name = person.getFirstName() + " " + person.getLastName();
                break;
            }
        }
        
        return name;
    }
    
    public static UserAccount getUserAccountForPerson(Person person, UserAccountDirectory uaDirectory) {
        for (UserAccount ua : uaDirectory.getUserAccountDirectory()) {
            if (ua.getPerson() == person) {
                return ua;
            }
        }
        
        return null;
    }
    
    public static String getTimeStamp() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public static String getFormattedDate(Date date) {
        DateFormat format = new SimpleDateFormat("MMM dd yyyy, HH:mm:ss");
        return format.format(date);
    }
    
    public static String getDateFromStamp(String timestamp) {
        String date;
        
        date = timestamp.substring(0, 10);
        
        return date;
    }
    
    public static String getTimeFromStamp(String timestamp) {
        String date;
        
        date = timestamp.substring(11);
        
        return date;
    }
    
    public static ArrayList<String> getListOfTimeStamp(VitalSignHistory vsh) {
        ArrayList<String> timeStampList = new ArrayList<>();
        
        for (VitalSign vs : vsh.getVitalSignHistory()) {
            if (!timeStampList.contains(vs.getTimestamp())) {
                timeStampList.add(vs.getTimestamp());
            }
        }
        
        return timeStampList;
    }
    
    public static HouseHold getHouseHoldById(int id, HouseHoldDirectory hhd) {
        for (HouseHold house : hhd.getHouseHoldDirectory()) {
            if (house.getHouseHoldId() == id) {
                return house;
            }
        }
        
        return null;
    }
    
    public static int calculateAge(String dob) {
        Date birthDate = getDateForString(dob, false);
        
        long ageInMiliSeconds = new Date().getTime() - birthDate.getTime();
        double ageInSeconds = ageInMiliSeconds * 0.001;
        
        int ageTemp;
        ageTemp = (int) Math.floor(ageInSeconds/31556940);
        
        return ageTemp;
    }
    
    public static boolean validateDate(String dob) {
        Date dateOfBirth = getDateForString(dob, false);
        
        if (dateOfBirth != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static Date getDateForString(String date, boolean withStamp) {
        DateFormat format;
        Date convertedDate;
        
        if (!withStamp) {
            format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        }
        else {
            format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        }
        
        try {
            convertedDate = format.parse(date);
            
        }
        catch (Exception e) {
            convertedDate = null;
        }
        
        return convertedDate;
    }
    
    public static boolean checkIfTempNormal(float temp) {
        if (temp >= 36.5 && temp <= 37.5) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean checkIfBpNormal(int age, int sysBp, int diaBp) {
        if (age < 1 && (sysBp >= 75 && sysBp <= 100) && (diaBp >= 50 && diaBp <= 70)) {
            return true;
        }
        else if ((age >= 1 && age < 3) && (sysBp >= 80 && sysBp <= 110) && (diaBp >= 50 && diaBp <= 80)) {
            return true;
        }
        else if ((age >= 3 && age < 6) && (sysBp >= 80 && sysBp <= 110) && (diaBp >= 50 && diaBp <= 80)) {
            return true;
        }
        else if ((age >= 6 && age < 13) && (sysBp >= 85 && sysBp <= 120) && (diaBp >= 55 && diaBp <= 80)) {
            return true;
        }
        else if ((age >= 13) && (sysBp <= 140 && sysBp >= 95) && (diaBp <= 90 && diaBp >= 60)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean checkIfRespiRateNormal(int age, int respRate) {
        if (age < 1 && (respRate >= 25 && respRate <= 40)) {
            return true;
        }
        else if ((age >= 1 && age <= 5) && (respRate >= 20 && respRate <= 30)) {
            return true;
        }
        else if ((age >= 6 && age <= 10) && (respRate >= 15 && respRate <= 30))  {
            return true;
        }
        else if ((age >= 11 && age <= 14) && (respRate >= 12 && respRate <= 20)) {
            return true;
        }
        else if ((age >= 15 && age <= 20) && (respRate >= 12 && respRate <= 30)) {
            return true;
        }
        else if (age > 20 && (respRate >= 16 && respRate <= 20)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean checkIfPulseNormal(int age, int pulse) {
        if (age < 1 && (pulse >= 80 && pulse <= 140)) {
            return true;
        }
        else if ((age >= 1 && age < 3) && (pulse >= 80 && pulse <= 130)) {
            return true;
        }
        else if ((age >= 3 && age <= 5) && (pulse >= 80 && pulse <= 120)) {
            return true;
        }
        else if ((age >= 6 && age <= 10) && (pulse >= 70 && pulse <= 110))  {
            return true;
        }
        else if ((age >= 11 && age <= 14) && (pulse >= 60 && pulse <= 105)) {
            return true;
        }
        else if ((age >= 15 && age <= 20) && (pulse >= 60 && pulse <= 100)) {
            return true;
        }
        else if (age > 20 && (pulse >= 50 && pulse <= 80)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean checkIfSugarNormal(float sugar) {
        if ((sugar >= 79.2 && sugar <= 125)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean checkIfCholesterolNormal(float cholesterol) {
        if (cholesterol >= 60) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean checkIfBmiNormal(float bmi) {
        if (bmi >= 18.5 && bmi <= 24.9) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static String getTempStatus(float temp) {
        if (temp < 35) {
            return "Hypothermia";
        }
        else if (temp >= 36.5 && temp <= 37.5) {
            return "Normal";
        }
        else if (temp > 37.5 || temp <= 38.3) {
            return "Fever";
        }
        else if (temp > 38.3 && temp <= 40.0) {
            return "Hyperthermia";
        }
        else if (temp > 41.5) {
            return "Hyperpyrexia";
        }
        else {
            return "N/A";
        }
    }
    
    public static String getBmiStatus(float bmi) {
        if (bmi < 18.5) {
            return "Under Weight";
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal or Healthy Weight";
        }
        else if (bmi >= 25.0 && bmi <= 29.9) {
            return "Over Weight";
        }
        else {
            return "Obese";
        }
    }
    
    public static String getCholesterolStatus(String gender, float cholesterol) {
        if (cholesterol >= 60) {
            return "Best";
        }
        else if (cholesterol >= 50 && cholesterol <= 59.9) {
            return "Better";
        }
        else {
            if (gender.equals("Male") && cholesterol < 40) {
                return "Poor";
            }
            else if (gender.equals("Female") && cholesterol < 50){
                return "Poor";
            }
        }
        return "";
    }
    
    public static String getBloodPressureStatus(int sysBp, int diaBp) {
        if (sysBp < 90 || diaBp < 60) {
            return "Low Blood Pressure";
        }
        else if ((sysBp > 90 && sysBp < 120) && (diaBp > 60 && diaBp < 80)) {
            return "Normal";
        }
        else if ((sysBp > 120 && sysBp <= 139) || (diaBp >= 80 && diaBp <= 89)) {
            return "Prehypertension";
        }
        else if ((sysBp >= 140 && sysBp <= 159) || (diaBp >= 90 && diaBp <= 99)) {
            return "Hypertension Stage 1";
        }
        else if ((sysBp >= 160) || (diaBp >= 100)) {
            return "Hypertension Stage 2";
        }
        else if ((sysBp > 180) || (diaBp >= 100)) {
            return "Hypertensive Crisis";
        }
        else {
            return "N/A";
        }
    }
    
    public static String getEnergyIntakeStatus(float energy) {
        if (energy > 8800) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (energy > 8600 && energy <= 8800) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
    
    public static String getProtienIntakeStatus(float protien) {
        if (protien > 55) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (protien > 45 && protien <= 55) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
    
    public static String getFibersIntakeStatus(float fibers) {
        if (fibers > 35) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (fibers > 25 && fibers <= 35) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
    
    public static String getFatIntakeStatus(float fat) {
        if (fat > 75) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (fat > 65 && fat <= 75) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
    
    public static String getCarbohydratesIntakeStatus(float carbo) {
        if (carbo > 315) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (carbo > 305 && carbo <= 315) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
    
    public static String getSugarIntakeStatus(float sugar) {
        if (sugar > 100) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (sugar > 85 && sugar <= 100) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
    
    public static String getSaltIntakeStatus(float salt) {
        if (salt > 2.5) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (salt > 1.8 && salt <= 2.5) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
    
    public static String getIodineIntakeStatus(float iodine) {
        if (iodine > 150) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (iodine > 90 && iodine <= 150) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
    
    public static String getVitAIntakeStatus(float vit) {
        if (vit > 650) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (vit > 550 && vit <= 650) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
    
     public static String getVitB12IntakeStatus(float vit) {
        if (vit > 6.5) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (vit > 5.5 && vit <= 6.5) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
    
    public static String getVitCIntakeStatus(float vit) {
        if (vit > 80) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (vit > 70 && vit <= 80) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
    
    public static String getVitDIntakeStatus(float vit) {
        if (vit > 6) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (vit > 4 && vit <= 6) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
    
      public static String getVitEIntakeStatus(float vit) {
        if (vit > 12) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (vit > 8 && vit <= 12) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
      
    public static String getVitKIntakeStatus(float vit) {
        if (vit > 85) {
            return Constants.ABOVE_REQUIRED;
        }
        else if (vit > 78 && vit <= 85) {
            return Constants.PROPER_REQUIRED;
        }
        else {
            return Constants.BELOW_REQUIRED;
        }
    }
}
