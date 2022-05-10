package com.bridgelabz.tdd;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest extends TestCase {

    @Test
    public void givenDistanceAndTimeShouldReturnTheTotalFareForTheJourney(){

        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double fare = cabInvoiceGenerator.calculateFare(2,8);
        Assert.assertEquals(28,fare,0.0);
    }
}
