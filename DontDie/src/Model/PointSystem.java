/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package Model;
import organism.Player;

/**
 * PointSystem determine number of points Player gets at the end of the game.
 * Javadocs checked by Anushka Bhattacharjee
 * @author Hunter Bales
 */
public class PointSystem {
    private Player player;
    private GameLoop loop;
    private int score;
    private int wins;
    
    private static PointSystem single_instance = null;
   
    /**
     * Gets instance of singleton
     * @param Player Player class instance
     * @param Loop GameLoop class instance
     * @return  instance of PointSystem
     */
    public static PointSystem getInstance(Player Player, GameLoop Loop){
         if (single_instance == null) 
            single_instance = new PointSystem(Player, Loop); 
  
        return single_instance;
    }
    
    /**
     * constructor for PointSystem
     * @param Player
     * @param Loop 
     */
    private PointSystem(Player Player, GameLoop Loop) {
        player = Player;
        loop = Loop;
        score = 0;
        wins = 0;
    }
    
    /**
     * sets variables for new game
     * @param Loop instance of GameLoop
     */
    public void newGame(GameLoop Loop) {
        player.setEnergy(100);
        player.setHealth(100);
        player.setHunger(100);
        player.setThirst(100);
        loop = Loop;
        score = 0;
        wins = 0;
    }
    
    /**
     * Increments wins
     */
    public void addWin(){
        wins++;
    }
    
    /**
     * sets score
     */
    public void setScore(){
        int timeOfDayScore = 0;
        switch (loop.getTimeOfDay())
        {
            case MORNING:
                timeOfDayScore = 0;
                break;
            case NOON:
                timeOfDayScore = 25;
                break;
            case EVENING:
                timeOfDayScore = 50;
                break;
            case NIGHT:
                timeOfDayScore = 75;
                break;
        }
        
        score = (player.getHunger() * 20) + (player.getThirst() * 20) + 
                (player.getEnergy() * 20) + (player.getHealth() * 10) + 
                (loop.getDay() * 100) + timeOfDayScore + (wins * 100);
    }
    
    /**
     * returns score
     * @return integer variable score
     */
    public int getScore(){
        return score;
    }
    
}
