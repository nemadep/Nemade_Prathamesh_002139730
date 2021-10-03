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

    public int id;
    public Date availabilityFrom;
    public Date availabilityTo;
    public String brand;
    public int manufactureYear;
    public int seats;
    public String modelNo;
    public String manufacturer;
    public Date updatedAt;
    public Date createdAd;
    public String city;
    private String maintenanceCerticateExpiry;
    private String serialNo;
    private int availableSeats;

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
    public int getManufactureYear() {
        return manufactureYear;
    }

    /**
     * @return the seats
     */
    public int getSeats() {
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
        return city;
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
    public int getAvailableSeats() {
        return availableSeats;
    }

    /**
     * @param availableSeats the availableSeats to set
     */
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    /**
     * @return the availabilityFrom
     */
    public Date getAvailabilityFrom() {
        return availabilityFrom;
    }

    /**
     * @return the availabilityTo
     */
    public Date getAvailabilityTo() {
        return availabilityTo;
    }
}
