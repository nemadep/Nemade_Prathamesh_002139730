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
public class House extends Community {

    public String zipcode;
    public String address;

    public String validateAddress(String address) {
        String isValid = "";
        if (address.equals("")) {
            isValid = "Address cannot be empty! \n";
        } else if (address.length() < 10 || address.length() > 100) {
            isValid = "Address must be atleast 10 characters and maximum 100 characters long! \n";
        } else if (!address.matches("[a-zA-Z0-9'\\.\\-\\s\\,]{10,100}")) {
            isValid = "Invalid Address Field! \n";
        } else if (address.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }

    public String validateZipCode(String zipCode) {
        String isValid = "";
        if (zipCode.equals("")) {
            isValid = "ZipCode cannot be empty! \n";
        } else if (!zipCode.matches("^\\d{5}(?:[-\\s]\\d{4})?$")) {
            isValid = "Invalid Zip Code Field! \n";
        } else if (zipCode.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
}
