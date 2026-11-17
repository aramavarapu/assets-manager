package com.pluralsight;
import java.math.BigDecimal;
import java.time.LocalDate;
public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public BigDecimal getValue() {
        int age = LocalDate.now().getYear() - year;

        if (age < 0) {
            throw new IllegalStateException("Vehicle year is in the future: " + year);
        }
        if (age > 10) {
            return new BigDecimal("1000.00");
        }
        BigDecimal ratePerYear;
        if (age <= 3) {
            ratePerYear = new BigDecimal("0.03");
        } else if (age <= 6) {
            ratePerYear = new BigDecimal("0.06");
        } else {
            ratePerYear = new BigDecimal("0.08");
        }

        BigDecimal reduction = getOriginalCost().multiply(ratePerYear).multiply(BigDecimal.valueOf(age));
        return getOriginalCost().subtract(reduction);
    }
}
