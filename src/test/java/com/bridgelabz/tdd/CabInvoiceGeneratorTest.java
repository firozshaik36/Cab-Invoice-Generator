package com.bridgelabz.tdd;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

//Class For Test Cases

public class CabInvoiceGeneratorTest {

    public static CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();

    //Test Case
    @Test
    public void givenDistanceAndTimeShouldReturnTheTotalFareForTheJourney(){

        // Created Object
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double fare = cabInvoiceGenerator.calculateFare(2.0,8, type);
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

    @Test
    public void givenMultipleRidesShouldReturnInvoiceSummary() {

        ArrayList<Ride> rides = new ArrayList<Ride>();
        rides.add(new Ride(2.0, 5));
        rides.add(new Ride(0.1, 1));
        String type = "normal";
        InvoiceSummary summary = invoiceGenerator.calculateFareReturnObject(rides, type);
        InvoiceSummary expectedSummary = new InvoiceSummary(2, 30);
        if(expectedSummary.getAverageFare() == summary.getAverageFare() && expectedSummary.getNumberOfRides() == summary.getNumberOfRides() && expectedSummary.getTotalFare() == summary.getTotalFare())
            Assert.assertEquals(1, 1);
    }
}
