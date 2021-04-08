/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package organism;

import java.util.EventObject;

/**
 * Class that keeps the stats in StatBarPanel updated.
 * Javadocs checked by Anushka Bhattacharjee
 * @author Liam Coddington
 */
public class StatsEvent extends EventObject {
    private int _health;
    private int _hunger;
    private int _thirst;
    private int _energy;
    
    /**
     * Constructor for StatsEvent
     * @param source Object that other parameters came from
     * @param health Integer value for _health
     * @param hunger Integer value for _hunger
     * @param thirst Integer value for _thirst
     * @param energy Integer value for _energy
     */
    public StatsEvent(Object source, int health, int hunger, int thirst, int energy)
    {
        super(source);
        _health = health;
        _hunger = hunger;
        _thirst = thirst;
        _energy = energy;
    }
    
    /**
     * returns Health variable
     * @return _health
     */
    public int getHealth()
    {
        return _health;
    }
    
    /**
     * returns Hunger Variable
     * @return _hunger
     */
    public int getHunger()
    {
        return _hunger;
    }
    
    /**
     * returns Thirst Variable
     * @return _thirst
     */
    public int getThirst()
    {
        return _thirst;
    }
    
    /**
     * returns Energy Variable
     * @return _energy
     */
    public int getEnergy()
    {
        return _energy;
    }
}
