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
