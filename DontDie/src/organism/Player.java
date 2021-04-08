/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package organism;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Player.java [description]
 * Javadocs checked by Anushka Bhattacharjee
 * @author Harleigh Bass
 */
public class Player {

    private static int healthPercent;
    private static int hungerPercent;
    private static int thirstPercent;
    private static int energyPercent;
    private static boolean hasBeenInitialized = false;

    private static List _listeners = new ArrayList();

    /**
     * Player class constructor.
     */
    public Player() {
        if (!hasBeenInitialized) {
            System.out.println("Player has been summoned.");
            healthPercent = 100;
            hungerPercent = 100;
            thirstPercent = 100;
            energyPercent = 100;
            hasBeenInitialized = true;
        }
    }

    /**
     * Sets a new Health total
     * @param health integer value for health
     */
    public void setHealth(int health) {
        healthPercent = health;
        _fireStatsEvent();
    }

    /**
     * Sets a new Hunger total
     * @param hunger integer value for hunger
     */
    public void setHunger(int hunger) {
        hungerPercent = hunger;
        _fireStatsEvent();
    }

    /**
     * Sets a new Thirst total
     * @param thirst integer value for thirst
     */
    public void setThirst(int thirst) {
        thirstPercent = thirst;
        _fireStatsEvent();
    }

    /**
     * Sets a new Energy total
     * @param energy integer value for energy
     */
    public void setEnergy(int energy) {
        energyPercent = energy;
        _fireStatsEvent();
    }

    /**
     * returns Health variable
     * @return healthPercent
     */
    public int getHealth() {
        return healthPercent;
    }

    /**
     * returns Hunger variable
     * @return hungerPercent
     */
    public int getHunger() {
        return hungerPercent;
    }

    /**
     * returns Thirst Variable
     * @return thirstPercent
     */
    public int getThirst() {
        return thirstPercent;
    }

    /**
     * returns Energy Variable
     * @return energyPercent
     */
    public int getEnergy() {
        return energyPercent;
    }
    /**
     * 
     * @return true if health, hunger, thirst, and energy are greater than 0. Else false
     */
    public boolean isPlayerAlive() {
        if ((healthPercent > 0) && (hungerPercent > 0) && (thirstPercent > 0) && (energyPercent > 0)) {
            // Player is only alive if health, hunger, thirst, and energy are all above 0%
            return true;
        } else {
            return false;
        }
    }

    /**
     * adds a StatsListener to _listeners list
     * @param l StatsListener
     */
    public synchronized void addStatsListener(StatsListener l) {
        _listeners.add(l);
    }

    /**
     * removes a StatsListener to _listeners list
     * @param l StatsListener 
     */
    public synchronized void removeStatsListener(StatsListener l) {
        _listeners.remove(l);
    }

    /**
     * Used to Update Stats in GUI StatBarPanel
     */
    public synchronized void _fireStatsEvent() {
        StatsEvent stats = new StatsEvent(this, healthPercent, hungerPercent, thirstPercent, energyPercent);
        Iterator listeners = _listeners.iterator();
        while (listeners.hasNext()) {
            ((StatsListener) listeners.next()).updatedStats(stats);
        }
    }

}
