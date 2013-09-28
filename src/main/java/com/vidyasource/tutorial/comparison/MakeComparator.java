package com.vidyasource.tutorial.comparison;

import java.util.Comparator;

public class MakeComparator implements Comparator<Car> {

    @Override
    public int compare(Car car, Car car2) {
        if (car == null || car2 == null) {
            throw new NullPointerException("Failed attempt to compare " + car + " to " + car2);
        }
        else if (!car.getClass().equals(car2.getClass())) {
            throw new ClassCastException("Possible ClassLoader issue. Failed attempt to compare " + car + " to " + car2);
        }
        return car.getMake().compareTo(car2.getMake());
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof MakeComparator;
    }
}