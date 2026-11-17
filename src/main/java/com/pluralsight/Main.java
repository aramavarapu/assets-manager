package com.pluralsight;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("my house", "2022-10-26", new BigDecimal("600000.00"), "777 Lucky Street", 2, 8000, 11000));
        assets.add(new House("Tom's house", "2019-10-26", new BigDecimal("300000.00"), "776 Lucky Street", 3, 7000, 9000));
        assets.add(new Vehicle("my car", "2024-06-07", new BigDecimal("120000"), "Mercades Benz AMG", 2024, 20000));
        assets.add(new Vehicle("Tom's car", "2026-06-07", new BigDecimal("55000"), "Honda Civic", 2026, 10000));

        for (Asset asset : assets) {
            System.out.println("----------------------------");

            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date bought: " + asset.getDateAcquired());
            System.out.println("Original cost: " + asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f%n", asset.getValue());

            if (asset instanceof House) {

                House house = (House) asset;

                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {

                Vehicle vehicle = (Vehicle) asset;

                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }
            System.out.println();
        }
    }
}
