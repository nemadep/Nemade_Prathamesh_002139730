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
public class OrderAssignmentRequest extends WorkRequest {

    private UserAccount assignmentTo;
    private Date orderAssignmentAt;
    private String assignmentComments;
    private String assignmentStatus;
    private int noOfBags;
    private Boolean isfragilePackage;
    private long assignmentId;

    public OrderAssignmentRequest(String address,
            UserAccount customerName,
            HashMap<HashMap<String, Double>, Integer> orderGenerated,
            Restaurant selectedRestaurant,
            String mainOrderMessage,
            String overAllStatus,
            Date requestDate,
            UserAccount assignmentTo,
            Date orderAssignmentAt,
            String assignmentComments,
            String assignmentStatus,
            int noOfBags,
            Boolean isfragilePackage,
            long assignmentId) {
        super(address, customerName, orderGenerated, selectedRestaurant, mainOrderMessage, overAllStatus, requestDate);
        this.assignmentTo = assignmentTo;
        this.orderAssignmentAt = orderAssignmentAt;
        this.assignmentComments = assignmentComments;
        this.assignmentStatus = assignmentStatus;
        this.noOfBags = noOfBags;
        this.isfragilePackage = isfragilePackage;
        this.assignmentId = assignmentId;
    }

    /**
     * @return the assignmentTo
     */
    public UserAccount getAssignmentTo() {
        return assignmentTo;
    }

    /**
     * @param assignmentTo the assignmentTo to set
     */
    public void setAssignmentTo(UserAccount assignmentTo) {
        this.assignmentTo = assignmentTo;
    }

    /**
     * @return the orderAssignmentAt
     */
    public Date getOrderAssignmentAt() {
        return orderAssignmentAt;
    }

    /**
     * @param orderAssignmentAt the orderAssignmentAt to set
     */
    public void setOrderAssignmentAt(Date orderAssignmentAt) {
        this.orderAssignmentAt = orderAssignmentAt;
    }

    /**
     * @return the assignmentComments
     */
    public String getAssignmentComments() {
        return assignmentComments;
    }

    /**
     * @param assignmentComments the assignmentComments to set
     */
    public void setAssignmentComments(String assignmentComments) {
        this.assignmentComments = assignmentComments;
    }

    /**
     * @return the assignmentStatus
     */
    public String getAssignmentStatus() {
        return assignmentStatus;
    }

    /**
     * @param assignmentStatus the assignmentStatus to set
     */
    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    /**
     * @return the noOfBags
     */
    public int getNoOfBags() {
        return noOfBags;
    }

    /**
     * @param noOfBags the noOfBags to set
     */
    public void setNoOfBags(int noOfBags) {
        this.noOfBags = noOfBags;
    }

    /**
     * @return the isfragilePackage
     */
    public Boolean getIsfragilePackage() {
        return isfragilePackage;
    }

    /**
     * @param isfragilePackage the isfragilePackage to set
     */
    public void setIsfragilePackage(Boolean isfragilePackage) {
        this.isfragilePackage = isfragilePackage;
    }

    /**
     * @return the assignmentId
     */
    public long getAssignmentId() {
        return assignmentId;
    }

    /**
     * @param assignmentId the assignmentId to set
     */
    public void setAssignmentId(long assignmentId) {
        this.assignmentId = assignmentId;
    }

}
