package com.pluralsight;
import java.math.BigDecimal;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        House test = new House("test house", "2026-11-26", new BigDecimal("700000"), "1 Test Ln", 2, 1800, 6000);
        System.out.printf("$%,.2f%n", test.getValue());

        Vehicle testVehicle = new Vehicle("test car", "2026-11-17", new BigDecimal("20000.00"), "Mecades Benz AMG", LocalDate.now().getYear() - 2, 120000);
        System.out.printf("$%,.2f%n", testVehicle.getValue());

        Vehicle honda = new Vehicle("test Honda", "2024-11-17", new BigDecimal("20000.00"), "Honda Civic", LocalDate.now().getYear() - 2, 120000);
        System.out.printf("$%,.2f%n", honda.getValue());
    }
}
