/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.HashMap;

/**
 *
 * @author harold
 */
public class Restaurant {

    private String name;
    private String managerUserName;
    private HashMap<String, Integer> menu;
    private String location;
    private String contact;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the managerUserName
     */
    public String getManagerUserName() {
        return managerUserName;
    }

    /**
     * @param managerUserName the managerUserName to set
     */
    public void setManagerUserName(String managerUserName) {
        this.managerUserName = managerUserName;
    }

    /**
     * @return the menu
     */
    public HashMap<String, Integer> getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(HashMap<String, Integer> menu) {
        this.menu = menu;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
}
