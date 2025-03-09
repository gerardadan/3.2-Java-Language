package org.restaurant;

import org.utils.Print;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class RestaurantList {

    private HashSet<Restaurant> restaurants;

    public static HashSet<Restaurant> addRestaurant(HashSet<Restaurant> restaurants, String name, int score){
        restaurants.add(new Restaurant(name, score));
        return restaurants;
    }

    public static void getRestaurants(HashSet<Restaurant> restaurants) {
        for(Restaurant restaurant :restaurants){
            Print.printConsole(restaurant.getName() + " - " + restaurant.getScore());
        }
    }

    public static HashSet<Restaurant> sortRestaurant(HashSet<Restaurant> restaurants){


        return restaurants;
    }

}
