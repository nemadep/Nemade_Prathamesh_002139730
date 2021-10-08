/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author prathameshnemade
 */
public class Car {

    public int id;
    public String availabilityFrom;
    public String availabilityTo;
    public String brand;
    public long manufactureYear;
    public long seats;
    public String modelNo;
    public String manufacturer;
    public Date updatedAt;
    public Date createdAt;
    public String city;
    private Date maintenanceCerticateExpiry;
    private String serialNo;
    private long availableSeats;

    public String validate24HourTime(String fromValue, String type) {
        String isValid = "";
        if (fromValue.equals("")) {
            isValid = type + " time required!";
        } else if (!fromValue.matches("^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$")) {
            isValid = "Invalid " + type + " time!";
        }
        return isValid;
    }

    public String validate12HourTime(String fromValue, String type) {
        String isValid = "";
        if (fromValue.equals("")) {
            isValid = type + " time required!";
        } else if (!fromValue.matches("^((1[0-2])|0[0-9]|[0-9]):([0-5]?[0-9])$")) {
            isValid = "Invalid " + type + " time entered! Must be in 12 Hours format.";
        }
        return isValid;
    }

    public String validateStartEndTime(String startValue, String endValue) {
        String isValid = "";
        if (!isMoreThanStart(startValue, endValue)) {
            isValid = "End Date should be more than Start Data!";
        }
        return isValid;
    }

    public boolean isMoreThanStart(String startValue, String endValue) {
        int time1HH = Integer.parseInt(startValue.split(":")[0]);
        int time1MM = Integer.parseInt(startValue.split(":")[1]);
        int time2HH = Integer.parseInt(endValue.split(":")[0]);
        int time2MM = Integer.parseInt(endValue.split(":")[1]);
        int t1m = (time1HH * 60) + time1MM;
        int t2m = (time2HH * 60) + (time2MM % 100);
        int sub = t2m - t1m;
        return sub > 0;
    }

    public String validateMED(String date) {
        String isValid = "";
        DateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateFormatter.setLenient(false);
            dateFormatter.parse(date);
        } catch (ParseException e) {
            isValid = "Invalid Medical Expiry Date! Should be in DD/MM/YYYY format.";
        }
        return isValid;
    }

    public String validateSeats(String seats) {
        String isValid = "";
        try {
            int seat = Integer.valueOf(seats);
            if (seat == 0) {
                isValid = " No. of seats cannot be 0!";
            }
            if (seat < 1 || seat > 20) {
                isValid = "No. of seats cannot be less than 1 or more than 20";
            }
        } catch (Exception e) {
            isValid = "No. of seats should be a number";
        }
        return isValid;
    }

    public String validateAvailableSeats(String seats) {
        String isValid = "";
        try {
            int seat = Integer.valueOf(seats);
            if (seat == 0) {
                isValid = "Available seats cannot be 0!";
            }
            if (seat < 1 || seat > 20) {
                isValid = "Available seats cannot be less than 1 or more than 20";
            }
        } catch (Exception e) {
            isValid = "Available seats should be a number";
        }

        return isValid;
    }

    public String validateCity(String city) {
        String isValid = "";
        if (city.equals("")) {
            isValid = "City cannot be empty!";
        } else if (city.length() < 2 || city.length() > 20) {
            isValid = "City should be of minimum 2 characters and maximum 20 character!";
        } else if (!city.matches("[a-zA-Z ]{2,20}")) {
            isValid = "Invalid City!";
        }
        return isValid;
    }

    public String validateSerialNo(String serialNo) {
        String isValid = "";
        if (serialNo.equals("")) {
            isValid = "Serial No. cannot be empty!";
        } else if (serialNo.length() < 4 || serialNo.length() > 10) {
            isValid = "Serial No. should be minimum 4 characters and maximum 10 characters!";
        } else if (!serialNo.matches("[a-zA-Z0-9]{4,10}")) {
            isValid = "Invalid Serial No!";
        }
        return isValid;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @return the manufactureYear
     */
    public long getManufactureYear() {
        return manufactureYear;
    }

    /**
     * @return the seats
     */
    public long getSeats() {
        return seats;
    }

    /**
     * @return the modelNo
     */
    public String getModelNo() {
        return modelNo;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @return the updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @return the createdAd
     */
    public Date getCreatedAd() {
        return createdAt;
    }

    /**
     * @return the City
     */
    public String getCity() {
        return city;
    }

    /**
     * @return the maintenanceCerticateExpiry
     */
    public Date getMaintenanceCerticateExpiry() {
        return maintenanceCerticateExpiry;
    }

    /**
     * @param maintenanceCerticateExpiry the maintenanceCerticateExpiry to set
     */
    public void setMaintenanceCerticateExpiry(Date maintenanceCerticateExpiry) {
        this.maintenanceCerticateExpiry = maintenanceCerticateExpiry;
    }

    /**
     * @return the serialNo
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * @param serialNo the serialNo to set
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * @return the availableSeats
     */
    public long getAvailableSeats() {
        return availableSeats;
    }

    /**
     * @param availableSeats the availableSeats to set
     */
    public void setAvailableSeats(long availableSeats) {
        this.availableSeats = availableSeats;
    }

    /**
     * @return the availabilityFrom
     */
    public String getAvailabilityFrom() {
        return availabilityFrom;
    }

    /**
     * @return the availabilityTo
     */
    public String getAvailabilityTo() {
        return availabilityTo;
    }
}
