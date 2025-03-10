package org.restaurant;

import java.util.Objects;
import java.util.Scanner;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int score = 0;
    private final Scanner scanner = new Scanner(System.in);

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Restaurant restaurant = (Restaurant) obj;

        return Objects.equals(name, restaurant.name) && Objects.equals(score, restaurant.score);
    }

    @Override
    public int compareTo(Restaurant other) {
        int result = 0;
        if(this.name.equals(other.name)){
            result = Integer.compare(other.score, this.score);
        } else{
            result = this.name.compareTo(other.name);
        }

        return result;
    }

}
