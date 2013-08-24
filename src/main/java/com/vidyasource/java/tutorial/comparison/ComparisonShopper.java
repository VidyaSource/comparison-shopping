package com.vidyasource.java.tutorial.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparisonShopper {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(75000, "Mercedes"));
        cars.add(new Car(90000, "Audi"));
        cars.add(new Car(65000, "BMW"));

        Collections.sort(cars);
        System.out.print("Natural sorting on price: ");
        for (Car car : cars) {
            System.out.print(car + " ");
        }
        System.out.println("");
        Collections.sort(cars, new MakeComparator());
        System.out.print("Comparator sorting on make: ");
        for (Car car : cars) {
            System.out.print(car + " ");
        }
    }
}
