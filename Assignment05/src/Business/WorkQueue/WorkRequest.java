/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message; //use this for comments
    private UserAccount sender; //from order
    private UserAccount receiver; //to order
    private String status; //overall status of order - inprogress/completed
    private Date requestDate; //ordered date
    private Date resolveDate; //order completed date
    private HashMap<String, Double> orderedMenu;

    public WorkRequest() {
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    /**
     * @return the orderedMenu
     */
    public HashMap<String, Double> getOrderedMenu() {
        return orderedMenu;
    }

    /**
     * @param orderedMenu the orderedMenu to set
     */
    public void setOrderedMenu(HashMap<String, Double> orderedMenu) {
        this.orderedMenu = orderedMenu;
    }
}
