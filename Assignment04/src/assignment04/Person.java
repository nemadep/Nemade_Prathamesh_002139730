/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author prathameshnemade
 */
public class Person {

    public static int PERSON_ID = 0;

    public String name;
    public City city;
    public Community community;
    public House address;
    public int personId;
    public String email;
    public int type;
    public Date dob;
    public String mobileNo;

    public Person() {
        city = new City();
        community = new Community();
        address = new House();
    }

    public String validateName(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = "Name cannot be empty! \n";
        } else if (name.length() < 2 || name.length() > 20) {
            isValid = "Name must be atleast 2 characters and maximum 20 characters long! \n";
        } else if (!name.matches("[a-zA-Z ]{2,20}")) {
            isValid = "Invalid Name \n";
        } else if (name.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }

    public String validateDOB(String date) {
        String isValid = "";
        DateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateFormatter.setLenient(false);
            Date dob = dateFormatter.parse(date);
            if (dob.compareTo((new Date())) > 0) {
                isValid = "DOB cannot be more than today! \n";
            }
        } catch (ParseException e) {
            isValid = "Invalid DOB \n";
        }
        return isValid;
    }

    public String validateEmail(String email) {
        String isValid = "";
        if (email.equals("")) {
            isValid = "Email cannot be empty! \n";
        } else if (!email.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$")) {
            isValid = "Invalid Email ID! \n";
        }else if (email.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }

    public String validateMobileNo(String value) {
        String isValid = "";
        String[] tempValue = value.split("-");
        String areaCode = tempValue[0];
        String rand1 = tempValue[1];
        String rand2 = tempValue[2];
        try {
            Integer.parseInt(areaCode);
            Integer.parseInt(rand1);
            Integer.parseInt(rand2);
            if (areaCode.length() != 3 || rand1.length() != 3 || rand2.length() != 4 || areaCode.equals("000") || rand1.equals("000")) {
                isValid = "Invalid Mobile No. ! \n";
            }
        } catch (NumberFormatException e) {
            isValid = "Invalid Mobile No. ! \n";
        }
        return isValid;
    }

}
