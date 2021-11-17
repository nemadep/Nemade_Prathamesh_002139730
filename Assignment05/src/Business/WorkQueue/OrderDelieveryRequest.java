/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author prathameshnemade
 */
public class OrderDelieveryRequest extends WorkRequest {

    private String deliveryStatus;
    private String bikeNo;
    private Date pickupTime;
    private Date deliveryTime;
    private UserAccount deliveredBy;
    private long deliveryRequestId;

    public OrderDelieveryRequest(String address, UserAccount customerName, HashMap<HashMap<String, Double>, Integer> orderGenerated, Restaurant selectedRestaurant, String mainOrderMessage, String overAllStatus, Date requestDate, String deliveryStatus, String bikeNo, Date pickupTime, Date deliveryTime, UserAccount deliveredBy, long deliveryRequestId) {
        super(address, customerName, orderGenerated, selectedRestaurant, mainOrderMessage, overAllStatus, requestDate);
        this.deliveryStatus = deliveryStatus;
        this.bikeNo = bikeNo;
        this.pickupTime = pickupTime;
        this.deliveryTime = deliveryTime;
        this.deliveredBy = deliveredBy;
        this.deliveryRequestId = deliveryRequestId;
    }

    /**
     * @return the deliveryStatus
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * @param deliveryStatus the deliveryStatus to set
     */
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    /**
     * @return the bikeNo
     */
    public String getBikeNo() {
        return bikeNo;
    }

    /**
     * @param bikeNo the bikeNo to set
     */
    public void setBikeNo(String bikeNo) {
        this.bikeNo = bikeNo;
    }

    /**
     * @return the pickupTime
     */
    public Date getPickupTime() {
        return pickupTime;
    }

    /**
     * @param pickupTime the pickupTime to set
     */
    public void setPickupTime(Date pickupTime) {
        this.pickupTime = pickupTime;
    }

    /**
     * @return the deliveryTime
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * @param deliveryTime the deliveryTime to set
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * @return the deliveredBy
     */
    public UserAccount getDeliveredBy() {
        return deliveredBy;
    }

    /**
     * @param deliveredBy the deliveredBy to set
     */
    public void setDeliveredBy(UserAccount deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    /**
     * @return the deliveryRequestId
     */
    public long getDeliveryRequestId() {
        return deliveryRequestId;
    }

    /**
     * @param deliveryRequestId the deliveryRequestId to set
     */
    public void setDeliveryRequestId(long deliveryRequestId) {
        this.deliveryRequestId = deliveryRequestId;
    }
}
