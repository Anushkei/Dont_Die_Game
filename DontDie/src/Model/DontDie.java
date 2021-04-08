/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package Model;
import GUI.*;
import dontdie.audio.*;

/**
 * DontDie has the Main Function for the entire program.
 * Javadocs checked by Anushka Bhattacharjee
 * @author Harleigh Bass
 */
public class DontDie {

    /**
     * Main Function for the entire program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AudioController audio = new AudioController();
        StartMenu openGame = new StartMenu();
        openGame.setVisible(true);
    }
    
}
