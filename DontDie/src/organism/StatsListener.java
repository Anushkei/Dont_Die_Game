/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package organism;

/**
 * StatsListener Interface for StatsEvent Class
 * Javadocs checked by Anushka Bhattacharjee
 * @author Liam Coddington
 */
public interface StatsListener {
    /**
     * Used to update Stats In the GUI
     * @param event a StatsEvent instance
     */
    public void updatedStats(StatsEvent event);
}
