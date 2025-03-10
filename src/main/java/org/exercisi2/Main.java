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
            RestaurantList.addRestaurant(restaurants, "ZRestaurant10", 6);
            RestaurantList.addRestaurant(restaurants, "Restaurant7", 8);
            RestaurantList.addRestaurant(restaurants, "Gestaurant8", 4);
            RestaurantList.addRestaurant(restaurants, "Gestaurant8", 8);
            RestaurantList.addRestaurant(restaurants, "ARestaurant2", 5);

            RestaurantList.sortRestaurant(restaurants);
            RestaurantList.getRestaurants(restaurants);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}