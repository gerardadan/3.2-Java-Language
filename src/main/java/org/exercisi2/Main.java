package org.exercisi2;

import org.restaurant.Restaurant;
import org.restaurant.RestaurantList;
import org.utils.Print;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        try {
            HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
            RestaurantList.addRestaurant(restaurants, "Restaurant1", 6);
            RestaurantList.addRestaurant(restaurants, "Restaurant1", 8);
            RestaurantList.addRestaurant(restaurants, "Restaurant1", 8);
            RestaurantList.addRestaurant(restaurants, "Restaurant2", 5);

            RestaurantList.getRestaurants(restaurants);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}