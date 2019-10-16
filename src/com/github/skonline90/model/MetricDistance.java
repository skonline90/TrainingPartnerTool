package com.github.skonline90.model;

/**
 * Objekte dieser Klasse repraesentieren eine Distanz
 * in der Masseinheit 'Meter'.
 *
 * @author skonline90
 * @version 12.10.2019
 */
public class MetricDistance
{
    private int distanceInMeters;
    
    public MetricDistance(int distanceInMeters)
    {
        this.distanceInMeters = distanceInMeters;
    }

    public double getDistanceInKilometers()
    {
        return ((double) distanceInMeters) / 1000;
    }
    
    public int getDistanceInMeters()
    {
        return distanceInMeters;
    }

    public void setDistanceInMeters(int distanceInMeters)
    {
        this.distanceInMeters = distanceInMeters;
    }
    
    public void setDistanceInKilometers(double distanceInKilometers)
    {
        this.distanceInMeters = (int) (distanceInKilometers * 1000);
    }
}
