/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author prathameshnemade
 */
public class Car {

    private String availability;
    private String brand;
    private String manufactureYear;
    private String seats;
    private String modelNo;
    private String manufacturer;
    private Date updatedAt;
    private Date createdAd;
    private String City;
    private String maintenanceCerticateExpiry;
    private String serialNo;
    private String availableSeats;

    /**
     * @return the availability
     */
    public String getAvailability() {
        return availability;
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
    public String getManufactureYear() {
        return manufactureYear;
    }

    /**
     * @return the seats
     */
    public String getSeats() {
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
        return createdAd;
    }

    /**
     * @return the City
     */
    public String getCity() {
        return City;
    }

    /**
     * @return the maintenanceCerticateExpiry
     */
    public String getMaintenanceCerticateExpiry() {
        return maintenanceCerticateExpiry;
    }

    /**
     * @param maintenanceCerticateExpiry the maintenanceCerticateExpiry to set
     */
    public void setMaintenanceCerticateExpiry(String maintenanceCerticateExpiry) {
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
    public String getAvailableSeats() {
        return availableSeats;
    }

    /**
     * @param availableSeats the availableSeats to set
     */
    public void setAvailableSeats(String availableSeats) {
        this.availableSeats = availableSeats;
    }
}
