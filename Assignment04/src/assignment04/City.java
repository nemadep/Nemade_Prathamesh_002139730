/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.util.ArrayList;

/**
 *
 * @author prathameshnemade
 */
public class City {
    public static String[] cityValues = {"Boston", "Salem", "Cambridge", "Worcester", "Plymouth", "Lowell"};
    public static ArrayList<Community> allCities = new ArrayList<>();
    public String city;
    public String state;

    public String validateCity(String city) {
        String isValid = "";
        if (city.equals("")) {
            isValid = "City cannot be empty! \n";
        } else if (city.length() < 2 || city.length() > 30) {
            isValid = "City must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!city.matches("[a-zA-Z ]{2,30}")) {
            isValid = "Invalid City Field! \n";
        } else if (city.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }

    public String validateState(String state) {
        String isValid = "";
        if (state.equals("")) {
            isValid = "State cannot be empty! \n";
        } else if (state.length() < 2 || state.length() > 30) {
            isValid = "State must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!state.matches("[a-zA-Z ]{2,30}")) {
            isValid = "Invalid State Field! \n";
        } else if (state.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
}
