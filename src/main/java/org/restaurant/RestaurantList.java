package org.restaurant;

import org.utils.Print;

import java.util.*;

import static org.utils.CollectionsUtils.convertHashSetToTreeSet;

public class RestaurantList {

    private HashSet<Restaurant> restaurantSet;
    private TreeSet<Restaurant> sortedRestaurants;

    public static HashSet<Restaurant> addRestaurant(HashSet<Restaurant> restaurants, String name, int score){
        restaurants.add(new Restaurant(name, score));
        return restaurants;
    }

    public static void getRestaurants(Set<Restaurant> restaurants) {
        for(Restaurant restaurant :restaurants){
            Print.printConsole(restaurant.getName() + " - " + restaurant.getScore());
        }
    }

    public static TreeSet<Restaurant> sortRestaurant(HashSet<Restaurant> restaurants, boolean isAscending){
        return convertHashSetToTreeSet(restaurants, isAscending);
    }

}
