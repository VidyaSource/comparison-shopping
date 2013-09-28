package com.vidyasource.tutorial.comparison;

public class Car implements Comparable<Car> {
    private int price;
    private String make;

    public Car(int price, String make) {
        this.price = price;
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }

    @Override
    public int compareTo(Car otherCar) {
        if (otherCar == null) {
            throw new NullPointerException("Attempted to compare " + this + " to null");
        } else if (this.price < otherCar.price) {
            return -1;
        } else if (this.price > otherCar.price) {
            return 1;
        }

        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        } else {
            return compareTo((Car) o) == 0;
        }
    }

    @Override
    public int hashCode() {
        int result = this.price;
        result = 31 * result + this.make.hashCode();

        return result;
    }

    @Override
    public String toString() {
        return make;
    }
}
