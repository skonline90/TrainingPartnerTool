package com.github.skonline90.model;

/**
 * Die Hauptklasse fuer Uebungen.
 * Jede Uebung besteht zumindest aus dem Namen.
 *
 * @author skonline90
 * @version 13.10.2019
 */
public class CustomExercise
{
    private String exerciseName;
    
    public CustomExercise(String exerciseName)
    {
        this.exerciseName = exerciseName;
    }

    public String getExerciseName()
    {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName)
    {
        this.exerciseName = exerciseName;
    }
}
