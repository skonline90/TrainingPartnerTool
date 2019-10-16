package com.github.skonline90.model;

/**
 * Objekte dieser Klasse repraesentieren Wiederholungsuebungen.
 * Wiederholungsuebungen sind Uebungen, welche ausschliesslich
 * mit dem eigenem Körpergewicht durchgefuehrt werden.
 * Deshalb werden hier lediglich die Wiederholungen gespeichert.
 * 
 * Beispiel: Liegestuetze, Bauchaufzuege
 *
 * @author skonline90
 * @version 13.10.2019
 */
public class CustomRepetitionExercise extends CustomExercise
{
    private int repetitions;

    public CustomRepetitionExercise(String exerciseName, int repetitions)
    {
        super(exerciseName);
        this.repetitions = repetitions;
    }

    public int getRepetitions()
    {
        return repetitions;
    }

    public void setRepetitions(int repetitions)
    {
        this.repetitions = repetitions;
    }
}
