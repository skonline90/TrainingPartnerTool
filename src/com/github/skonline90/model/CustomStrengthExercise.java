package com.github.skonline90.model;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;

/**
 * Objekte dieser Klasse repraesentieren Kraftuebungen.
 * Eine Kraftuebung enthaelt die Attribute Gewicht,
 * welches gestaemmt wird, sowie Anzahl der
 * Wiederholungen.
 * 
 * Beispiel: Bankdruecken
 *
 * @author skonline90
 * @version 13.10.2019
 */
public class CustomStrengthExercise extends CustomExercise
{
    private int repetitions;
    private MetricWeight weight;
    public CustomStrengthExercise(String exerciseName, int repetitions,
            MetricWeight weight)
    {
        super(exerciseName);
        this.repetitions = repetitions;
        this.weight = weight;
    }
    
    public int getRepetitions()
    {
        return repetitions;
    }
    
    public void setRepetitions(int repetitions)
    {
        this.repetitions = repetitions;
    }
    
    public MetricWeight getWeight()
    {
        return weight;
    }
    
    public void setWeight(MetricWeight weight)
    {
        this.weight = weight;
    }
}
