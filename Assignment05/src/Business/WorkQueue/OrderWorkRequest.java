/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author prathameshnemade
 */
public class OrderWorkRequest extends WorkRequest {

    private long orderWorkRequestId;
    private UserAccount orderRequestCreatedBy;
    private UserAccount orderRequestCreatedFor;
    private String orderMessage;
    private Date orderCreationTime;
    private String orderRequestStatus;

    /**
     * @return the orderWorkRequestId
     */
    public long getOrderWorkRequestId() {
        return orderWorkRequestId;
    }

    /**
     * @param orderWorkRequestId the orderWorkRequestId to set
     */
    public void setOrderWorkRequestId(long orderWorkRequestId) {
        this.orderWorkRequestId = orderWorkRequestId;
    }

    /**
     * @return the orderRequestCreatedBy
     */
    public UserAccount getOrderRequestCreatedBy() {
        return orderRequestCreatedBy;
    }

    /**
     * @param orderRequestCreatedBy the orderRequestCreatedBy to set
     */
    public void setOrderRequestCreatedBy(UserAccount orderRequestCreatedBy) {
        this.orderRequestCreatedBy = orderRequestCreatedBy;
    }

    /**
     * @return the orderRequestCreatedFor
     */
    public UserAccount getOrderRequestCreatedFor() {
        return orderRequestCreatedFor;
    }

    /**
     * @param orderRequestCreatedFor the orderRequestCreatedFor to set
     */
    public void setOrderRequestCreatedFor(UserAccount orderRequestCreatedFor) {
        this.orderRequestCreatedFor = orderRequestCreatedFor;
    }

    /**
     * @return the orderMessage
     */
    public String getOrderMessage() {
        return orderMessage;
    }

    /**
     * @param orderMessage the orderMessage to set
     */
    public void setOrderMessage(String orderMessage) {
        this.orderMessage = orderMessage;
    }

    /**
     * @return the orderCreationTime
     */
    public Date getOrderCreationTime() {
        return orderCreationTime;
    }

    /**
     * @param orderCreationTime the orderCreationTime to set
     */
    public void setOrderCreationTime(Date orderCreationTime) {
        this.orderCreationTime = orderCreationTime;
    }

    /**
     * @return the orderRequestStatus
     */
    public String getOrderRequestStatus() {
        return orderRequestStatus;
    }

    /**
     * @param orderRequestStatus the orderRequestStatus to set
     */
    public void setOrderRequestStatus(String orderRequestStatus) {
        this.orderRequestStatus = orderRequestStatus;
    }

}
