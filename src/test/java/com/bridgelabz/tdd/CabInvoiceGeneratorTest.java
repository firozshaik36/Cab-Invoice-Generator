package com.bridgelabz.tdd;

import org.junit.Assert;
import org.junit.Test;

//Class For Test Cases

public class CabInvoiceGeneratorTest {

    //Test Case
    @Test
    public void givenDistanceAndTimeShouldReturnTheTotalFareForTheJourney(){

        // Created Object
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double fare = cabInvoiceGenerator.calculateFare(2.0,8);
        Assert.assertEquals(28,fare,0.0);
    }

    //Test case To Check it Should Returning Total Fare.
    @Test
    public void givenMultipleRidesShouldReturnTotalFare(){

        Ride[] rides = {new Ride(2.0, 5), new Ride(0.1, 1)};

        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

        double totalFare = cabInvoiceGenerator.multipleRides(rides);
        Assert.assertEquals(30,totalFare,0.0);

    }
}
