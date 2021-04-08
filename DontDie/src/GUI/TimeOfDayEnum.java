/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package GUI;

/**
 * Enums for quickly getting what time of day it is.
 * Javadocs checked by Anushka Bhattacharjee
 * @author Liam Coddington
 */
public enum TimeOfDayEnum {
    MORNING("Morning"),
    NOON("Noon"),
    EVENING("Evening"),
    NIGHT("Night");
    
    private String name;
    
    /**
     * For setting a new TimeOfDay through an update.
     * @param name of new time of day
     */
    private TimeOfDayEnum(String name)
    {
        this.name = name;
    }
    
    /**
     * Returns the private variable for what time of day it is.
     * @return the private variable of a time of day
     */
    public String getName()
    {
        return name;
    }
}
