package com.bridgelabz.tdd;

/**
 * Calculating Fare By given Distance and Time
 *
 * @author firoz
 *
 * Date:10-05-2022
 *
 *
 */

// Created a Class
public class CabInvoiceGenerator {

        // Private Variables
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    //Manually generated This Method From TestCase
    public double calculateFare(double kilometers, int time) {

        double fare = kilometers*MINIMUM_COST_PER_KILOMETER + time*COST_PER_TIME;

        //If Condition to Check the Fare is Minimum or it returns Fare
        if(fare<MINIMUM_FARE) {
            return MINIMUM_FARE;
        }
        return fare;

    }
    //This Method Checks
    public double multipleRides(Ride[] rides) {

        double totalFare = 0;
        for(Ride ride : rides) {
            totalFare = totalFare + this.calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }
}
