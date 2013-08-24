package com.vidyasource.java.tutorial.comparison;

import java.util.Comparator;

public class MakeComparator implements Comparator<Car> {

    @Override
    public int compare(Car car, Car car2) {
        return car.getMake().compareTo(car2.getMake());
    }
}