package com.pluralsight;
import java.math.BigDecimal;
public class Cash extends Asset {
    public Cash(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
        if (originalCost.signum() < 0) {
            throw new IllegalArgumentException("Cash amount can't be negative");
        }
    }

    @Override
    public BigDecimal getValue() {
        return getOriginalCost();
    }
}
