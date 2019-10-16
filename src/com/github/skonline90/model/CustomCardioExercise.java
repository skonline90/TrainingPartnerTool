package com.github.skonline90.model;

import java.time.Duration;

/**
 * Objekte dieser Klasse repraesentieren Ausdaueruebungen.
 * Eine Ausdaueruebung besteht immer aus einer Distanz und
 * einer Zeit.
 * 
 * Beispiel: Laufen, Schwimmen, Radfahren
 *
 * @author skonline90
 * @version 13.10.2019
 */
public class CustomCardioExercise extends CustomExercise
{
    private Duration duration;
    private MetricDistance distance;
    
    public CustomCardioExercise(String name, Duration duration, MetricDistance distance)
    {
        super(name);
        this.duration = duration;
        this.distance = distance;
    }

    public Duration getDuration()
    {
        return duration;
    }

    public void setDuration(Duration duration)
    {
        this.duration = duration;
    }

    public MetricDistance getDistance()
    {
        return distance;
    }

    public void setDistance(MetricDistance distance)
    {
        this.distance = distance;
    }
}
