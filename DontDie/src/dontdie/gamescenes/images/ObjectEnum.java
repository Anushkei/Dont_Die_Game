/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package dontdie.gamescenes.images;

/**
 * ObjectEnum has enums for all graphics
 * Javadocs checked by Anushka Bhattacharjee
 * @author Harleigh Bass
 */
public enum ObjectEnum {
    // This Enum file is directly referenced from Liam Coddington's Enum code in "SoundtrackEnum.java"
    // ----------------------------
    //           CAVE
    // ----------------------------
    CaveFood("/dontdie/gamescenes/images/cave food.png"),
    CaveShelter("/dontdie/gamescenes/images/cave shelter.png"),
    
    // ----------------------------
    //          LAKE
    // ----------------------------
    LakeFood("/dontdie/gamescenes/images/lake shelter.png"),
    LakeShelter("/dontdie/gamescenes/images/lake shelter.png"),
    Boat("/dontdie/gamescenes/images/boat.png"),
    // ----------------------------
    //          FOREST
    // ----------------------------
    ForestFood("/dontdie/gamescenes/images/forest shelter.png"),
    ForestShelter("/dontdie/gamescenes/images/forest shelter.png"),
    NoImage("");
    
    private String directory;
    
    /**
     * Sets the private directory for each Object enum.
     * @param directory where a Object enum is loaded.
     */
    private ObjectEnum(String directory)
    {
        this.directory = directory;
    }
    
    /**
     * Returns the Object enum directory
     * @return directory for Object enum
     */
    public String dir()
    {
        return directory;
    }
}
