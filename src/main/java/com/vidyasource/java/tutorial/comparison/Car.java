package com.vidyasource.java.tutorial.comparison;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private int price;
    private String make;

    public Car(int price, String make) {
        this.price = price;
        this.make = make;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public int compareTo(Car car) {
        int result = 0;
        if (price < car.price) {
            result = -1;
        }
        else if (price > car.price) {
            result = 1;
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
         else {
            return compareTo((Car) o) == 0;
        }
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + make.hashCode();

        return result;
    }

    @Override
    public String toString() {
        return make;
    }
}
