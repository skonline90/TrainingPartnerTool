package com.github.skonline90.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.skonline90.model.MetricDistance;

class TestDistance
{
    private int meters = 5000;
    private MetricDistance distance = new MetricDistance(meters);
    
    /**
     * Testet die korrekte Angabe in Metern.
     */
    @Test
    void testMetersOfDistance()
    {
        assertEquals(5000 ,distance.getDistanceInMeters());
    }
    
    /**
     * Testet die Umwandlung von Metern in Kilometer.
     */
    @Test
    void testKilometersOfDistance()
    {
        MetricDistance d1 = new MetricDistance(5000);
        MetricDistance d2 = new MetricDistance(500);
        MetricDistance d3 = new MetricDistance(10000);
        MetricDistance d4 = new MetricDistance(333);
        MetricDistance d5 = new MetricDistance(7);
        
        assertEquals(5, d1.getDistanceInKilometers());
        assertEquals(0.5, d2.getDistanceInKilometers());
        assertEquals(10, d3.getDistanceInKilometers());
        assertEquals(0.333, d4.getDistanceInKilometers());
        assertEquals(0.007, d5.getDistanceInKilometers());
    }

}
