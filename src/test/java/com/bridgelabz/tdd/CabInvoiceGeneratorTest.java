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
        double fare = cabInvoiceGenerator.calculateFare(2,8);
        Assert.assertEquals(28,fare,0.0);
    }
}
