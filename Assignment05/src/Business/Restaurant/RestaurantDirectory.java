/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {

    private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public Restaurant createrestaurant(String name, String managerUserName, HashMap<String, Integer> menu, String location, String contact) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName(name);
        restaurant.setManagerUserName(managerUserName);
        restaurant.setMenu(menu);
        restaurant.setLocation(location);
        restaurant.setContact(contact);
        restaurantList.add(restaurant);
        return restaurant;
    }
}
