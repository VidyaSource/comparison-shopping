package com.vidyasource.tutorial.comparison;

import java.util.Comparator;

public class MakeComparator implements Comparator<Car> {

    @Override
    public int compare(Car car, Car car2) {
        return car.getMake().compareTo(car2.getMake());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof MakeComparator;
    }
}