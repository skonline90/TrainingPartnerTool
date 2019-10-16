package com.github.skonline90.model;

import java.time.Duration;

/**
 * Objekte dieser Klasse repraesentieren Schmerzaushalteuebungen.
 * Schmerzaushalteuebungen sind Uebungen, welche ausschliesslich
 * mit dem eigenem Körpergewicht durchgefuehrt werden.
 * Hier wird die Zeit gezaehlt, die ausgehalten wurde.
 * 
 * Beispiel: Planking, Reiterstellung
 *
 * @author skonline90
 * @version 13.10.2019
 */
public class CustomPainExercise extends CustomExercise
{
    private Duration duration;

    public CustomPainExercise(String exerciseName, Duration duration)
    {
        super(exerciseName);
        this.duration = duration;
    }

    public Duration getDuration()
    {
        return duration;
    }

    public void setDuration(Duration duration)
    {
        this.duration = duration;
    }
}
