package com.bridgelabz.tdd;

public class CabInvoiceGenerator {

    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    public double calculateFare(double kilometers, int time) {

        double totalFare = kilometers*MINIMUM_COST_PER_KILOMETER + time*COST_PER_TIME;
        if(totalFare<MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;

    }
}
