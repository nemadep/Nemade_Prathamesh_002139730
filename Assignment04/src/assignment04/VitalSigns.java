/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

/**
 *
 * @author prathameshnemade
 */
public class VitalSigns {

    public int respiratoryRate;
    public int heartRate;
    public int bloodPressure;
    public int age;

    public String validateRespiratoryRate(String value) {
        String isValid = "";
        try {
            int val = Integer.valueOf(value);
            if (val == 0) {
                isValid = "Respiratory rate cannot be 0! \n";
            }
            if (val < 1 || val > 60) {
                isValid = "Respiratory rate cannot be less than 1 or more than 60 \n";
            }
        } catch (NumberFormatException e) {
            isValid = "Respiratory rate should be a number \n";
        }
        return isValid;
    }

    public String validateHeartRate(String value) {
        String isValid = "";
        try {
            int val = Integer.valueOf(value);
            if (val == 0) {
                isValid = "Heart rate cannot be 0! \n";
            }
            if (val < 1 || val > 200) {
                isValid = "Heart rate cannot be less than 1 or more than 200 \n";
            }
        } catch (NumberFormatException e) {
            isValid = "Heart rate should be a number \n";
        }
        return isValid;
    }

    public String validateBloodPressure(String value) {
        String isValid = "";
        try {
            int val = Integer.valueOf(value);
            if (val == 0) {
                isValid = "Blood Pressure cannot be 0! \n";
            }
            if (val < 1 || val > 180) {
                isValid = "Blood Pressure cannot be less than 1 or more than 180 \n";
            }
        } catch (NumberFormatException e) {
            isValid = "Blood Pressure should be a number \n";
        }
        return isValid;
    }

    public String validateAge(String value) {
        String isValid = "";
        try {
            int val = Integer.valueOf(value);
            if (val == 0) {
                isValid = "Age cannot be 0! \n";
            }
            if (val < 1 || val > 180) {
                isValid = "Age cannot be less than 1 or more than 180 \n";
            }
        } catch (NumberFormatException e) {
            isValid = "Age should be a number \n";
        }
        return isValid;
    }
}
