/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package organism;

import GUI.GameScene;
import Model.GameLoop;
import Model.PointSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.util.Random;

import javax.swing.JButton;



/**
 * QuickTimeEvents.java
 * Controls the QuickTime Events for the GUI
 * Javadocs checked by Anushka Bhattacharjee
 * @author Harleigh Bass and Liam Coddington
 */
public class QuickTimeEvents extends JFrame implements ActionListener {
    
    Bat bat = new Bat();
    Goose goose = new Goose();
    Squirrel squirrel = new Squirrel();
    
    GameLoop gameLoop = GameLoop.getInstance();
    Player player = new Player();
    PointSystem pointSystem = PointSystem.getInstance(player, gameLoop);
    
    boolean successStatus = false;
    int qte = 0;
    
    /**
     * Constructor for QuickTimeEvents.
     */
    public QuickTimeEvents(){
            
    }
    
    
    /**
     * Uses the Random class to determine if a QuickTimeEvent will occur.
     * @return activateQTE as true or false.
     */
    public boolean QTActivate(){
        boolean activateQTE;
        Random r = new Random();
        int rand = r.nextInt(10);
        
        if (rand > 4){
            return activateQTE = true; // QTE will happen
        }
        else{
            return activateQTE = false; // QTE will not happen
            
        }
    }
    
    /**
     * Uses the Random class to determine which Scene Section the QuickTimeEvent will occur.
     * @param activateQTE a boolean from the QTActivate method.
     * @return an integer that determines the Scene Section.
     */
    public int QTSection(boolean activateQTE){
        if (activateQTE == true){
            Random r = new Random();
        
        // Which section will QTE happen?
        int rand = r.nextInt(2);
        
            if (rand == 0){
                // QTE will happen in the first section.
                // AKA GameScene's locationCount == 0;
                return 0;
            }
            if (rand == 1) {
                // QTE will happen in the middle section.
                // AKA GameScene's locationCount == 1;
                return 1;
            }
            if (rand == 2) {
                // QTE will happen in the last section.
                // AKA GameScene's locationCount == 2;
                return 2;
            }
        }        
            return 4;
    }
    
    /**
     * The Player must press the battleButton quick enough to win the QTE.
     * @param enemyType int that represents bat, squirrel, or goose from GameScene.
     * @param battleButton button for clicking on from GameScene
     */
    public void QTBattle(int enemyType, JButton battleButton) { 
        // For getting enemy images
        if (enemyType == 0){
            // This index is from GameSceen and references the Bat
            GameScene.batLabel.setVisible(true);
        }
        if (enemyType == 1){
            // This index is from GameSceen and references the Squirrel
            GameScene.squirrelLabel.setVisible(true);
        }
        if (enemyType == 2){
            // This index is from GameSceen and references the Goose
            GameScene.gooseLabel.setVisible(true);
        }
        
        Thread threadQTE;
        
        // code here by Liam
        long timeToComplete = 2500;  // This should be the amount of milliseconds you allow the player to complete the QTE; 4 seconds
        long startTime = System.currentTimeMillis(); // Starting Time
        long finishTime = startTime + timeToComplete; // Final Time when QTE ends
                
        QuickTimeEvents thisClass = this;
        // EXAMPLE 12/2/2019 by Liam
        // Edited by Harleigh
	threadQTE = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    battleButton.setVisible(true);
                    // While Player has not succeeded and current, updated time is still less than Final Time...
                    battleButton.addActionListener(thisClass);
                    while(successStatus != true && System.currentTimeMillis() < finishTime) {
                        Thread.sleep(25);
                    } // end while()
                    battleButton.removeActionListener(thisClass);
                    
                    if (successStatus) {
                        // user successfully hit the QTE in time
                        System.out.println("You won!");
                        battleButton.setVisible(false);
                        GameScene.batLabel.setVisible(false);
                        GameScene.squirrelLabel.setVisible(false);
                        GameScene.gooseLabel.setVisible(false);
                        pointSystem.addWin();
                        
                        player.setHealth((player.getHealth() - 10));
                        player.setHunger((player.getHunger() - 10));
                        player.setThirst((player.getThirst() - 10));
                        player.setEnergy((player.getEnergy() - 10));
                    } else {
                        // user did not successfully hit the QTE in time
                        System.out.println("You lost!");
                        battleButton.setVisible(false);
                        GameScene.batLabel.setVisible(false);
                        GameScene.squirrelLabel.setVisible(false);
                        GameScene.gooseLabel.setVisible(false);
                        
                        player.setHealth((player.getHealth() - 20));
                        player.setHunger((player.getHunger() - 20));
                        player.setThirst((player.getThirst() - 20));
                        player.setEnergy((player.getEnergy() - 20));
                    } 
                }
                catch (Exception e) {}
            }
        });
        
        threadQTE.start();
        if (qte == 1) {
            successStatus = false;
            qte = 0;
        }
        
    } // end QTBattle method

    @Override
    public void actionPerformed(ActionEvent e) {
        successStatus = true;
        qte++;
    }
    
}