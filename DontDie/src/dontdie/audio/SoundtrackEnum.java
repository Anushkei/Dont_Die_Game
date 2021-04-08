/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package dontdie.audio;

/**
 * SoundTrackEnum has enums for all music tracks for
 * each environment scene.
 * Javadocs checked by Anushka Bhattacharjee
 * @author Liam Coddington
 */
public enum SoundtrackEnum {
    // All strings should look like this: "/dontdie/audio/example.wav"
    // All audio files need to be WAV 16-bit PCM with a project rate of 44100 Hz
    MenuSoundtrack("/dontdie/audio/MainMenuSoundtrack.wav"),
    GameOverSoundtrack("/dontdie/audio/GameOverSoundtrack.wav"),
    CaveSoundtrack("/dontdie/audio/CaveSoundtrack.wav"),
    ForestSoundtrack("/dontdie/audio/ForestSoundtrack.wav"),
    LakeSoundtrack("/dontdie/audio/LakeSoundtrack.wav"),
    ClearingSoundtrack("/dontdie/audio/ClearingSoundtrack.wav"),
    NoSoundtrack("");
    
    private String directory;
    
    /**
     * Sets the private directory for each soundtrack enum.
     * @param directory where a soundtrack enum is loaded.
     */
    private SoundtrackEnum(String directory)
    {
        this.directory = directory;
    }
    
    /**
     * Returns the soundtrack enum directory.
     * @return directory for soundtrack enum
     */
    public String dir()
    {
        return directory;
    }
}
