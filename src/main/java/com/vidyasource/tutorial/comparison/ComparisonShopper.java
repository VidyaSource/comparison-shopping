package com.vidyasource.tutorial.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparisonShopper {
    public static void main(String[] args) {
        printCarMakes();
        printCars();
    }

    private static void printCarMakes() {
        List<String> makes = new ArrayList<>();
        makes.add("Mercedes");
        makes.add("Audi");
        makes.add("BMW");

        Collections.sort(makes);
        System.out.print("Sorted strings: ");
        for (String make : makes) {
            System.out.print(make + " ");
        }
        System.out.println();
    }

    private static void printCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(75000, "Mercedes"));
        cars.add(new Car(90000, "Audi"));
        cars.add(new Car(65000, "BMW"));

        Collections.sort(cars);
        System.out.print("Natural sorting on price: ");
        for (Car car : cars) {
            System.out.print(car + " ");
        }
        System.out.println();
        Collections.sort(cars, new MakeComparator());
        System.out.print("Comparator sorting on make: ");
        for (Car car : cars) {
            System.out.print(car + " ");
        }
    }


}
