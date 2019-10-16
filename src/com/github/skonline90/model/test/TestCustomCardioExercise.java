package com.github.skonline90.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import com.github.skonline90.model.CustomCardioExercise;
import com.github.skonline90.model.MetricDistance;

class TestCustomCardioExercise
{
    private CustomCardioExercise cce = new CustomCardioExercise("Jogging",
            Duration.ofMillis(60000), new MetricDistance(500));

    /**
     * Testet die Felder einer CustomCardioExercise.
     */
    @Test
    void testExerciseAttributes()
    {
        assertEquals("Jogging", cce.getExerciseName());
        assertEquals(Duration.ofMillis(60000), cce.getDuration());
        assertEquals(500, cce.getDistance().getDistanceInMeters());
        assertEquals(0.5d, cce.getDistance().getDistanceInKilometers());
    }
    
    @Test
    void testSetExerciseName()
    {
        assertEquals("Jogging", cce.getExerciseName());
        cce.setExerciseName("Swimming");
        assertEquals("Swimming", cce.getExerciseName());
    }
}
