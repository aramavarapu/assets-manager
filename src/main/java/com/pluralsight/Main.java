package com.pluralsight;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {

        House test = new House("test house", "2026-11-26", new BigDecimal("700000"), "1 Test Ln", 2, 1800, 6000);
        System.out.printf("$%,.2f%n", test.getValue());
    }
}
