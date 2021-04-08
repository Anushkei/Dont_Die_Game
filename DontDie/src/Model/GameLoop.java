/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package Model;

import GUI.TimeOfDayEnum;

/**
 * GameLoop contains the looping process of the game (the process of going through the
 * day and to the next day).
 * Javadocs checked by Anushka Bhattacharjee
 * @author Harleigh Bass and Hunter Bales
 */
public class GameLoop {
    private int dayNum;
    private TimeOfDayEnum currentTimeOfDay;
    private static GameLoop single_instance = null;
   
    /**
     * gets instance of simpleton
     * @return instance of GameLoop
     */
    public static GameLoop getInstance(){
         if (single_instance == null) 
            single_instance = new GameLoop(); 
  
        return single_instance;
    }
    
    /**
     * constructor for GameLoop
     */
    private GameLoop()
    {
        // New Game Loop created
        dayNum = 1;
        currentTimeOfDay = TimeOfDayEnum.MORNING;
    }
    
    /**
     * set variables for newGame
     */
    public void newGame(){
        dayNum = 1;
        currentTimeOfDay = TimeOfDayEnum.MORNING;
    }
    
    /**
     * increments currentTimeOfDay
     */
    public void incrementTimeOfDay(){
        switch (currentTimeOfDay) {
            case MORNING:
                currentTimeOfDay = TimeOfDayEnum.NOON;
                break;
            case NOON:
                currentTimeOfDay = TimeOfDayEnum.EVENING;
                break;
            case EVENING:
                currentTimeOfDay = TimeOfDayEnum.NIGHT;
                break;
            case NIGHT:
                // Increment the day also
                dayNum++;
                currentTimeOfDay = TimeOfDayEnum.MORNING;
                break;
        }
    }
    
    /**
     * returns currentTimeOfDay
     * @return variable currentTimeOfDay
     */
    public TimeOfDayEnum getTimeOfDay(){
        return currentTimeOfDay;
    }
    
    /**
     * returns dayNum
     * @return variable dayNum
     */
    public int getDay(){
        return dayNum;
    }
}
