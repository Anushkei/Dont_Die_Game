/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package dontdie.audio;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * AudioController makes soundtracks for different scenes play, 
 * mute, increase or decrease in volume, and loop.
 * Javadocs checked by Anushka Bhattacharjee
 * @author Liam Coddington
 */
public class AudioController {

    private static int audioLevel = 50;
    private static boolean audioMute;
    private static SoundtrackEnum currentSoundtrack = SoundtrackEnum.NoSoundtrack;
    private static SoundtrackEnum nextSoundtrack = SoundtrackEnum.NoSoundtrack;
    private static Thread audioThread = null;

    /**
     * Constructor for AudioController.java that starts the 
     * soundtrack thread so music will always play in the background.
     */
    public AudioController() {
        if (audioThread == null) {
            audioMute = false;
            setAudioVolume(null, audioLevel);
            currentSoundtrack = SoundtrackEnum.NoSoundtrack;
            nextSoundtrack = SoundtrackEnum.NoSoundtrack;

            audioThread = new Thread(new Runnable() {
                public void run() {
                    System.out.println("Audio Thread Created");
                    soundtrackPlayer();
                }
            });
            audioThread.start();
        }
    }
    
    /**
     * Sets the Audio Volume
     * @param clip
     * @param newAudioLevel 
     */
    private static void setAudioVolume(Clip clip, int newAudioLevel) {
        // newAudioLevel needs to be between 1 and 100 (will be forced)
        int tempLevel;
        if (newAudioLevel > 100) {
            tempLevel = 100;
        } else if (newAudioLevel < 1) {
            tempLevel = 1;
        } else {
            tempLevel = newAudioLevel;
        }
        if (clip != null) {
            if (!audioMute) {
                // Unmute if muted
                BooleanControl mute = (BooleanControl) clip.getControl(BooleanControl.Type.MUTE);
                mute.setValue(false);

                // Create volume
                FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

                double medianVolume = 0.5d; // number can be between 0 and 1
                double gain = medianVolume * tempLevel / 100;

                // magic that gets the correct value to set the volume
                float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
                if (dB > 6.0206f) {
                    dB = 6.0206f;
                }
                volume.setValue(dB);
            } else {
                BooleanControl mute = (BooleanControl) clip.getControl(BooleanControl.Type.MUTE);
                mute.setValue(true);
            }
        }
    }

    /**
     * Sets audioMute to true or false
     * @param mute Boolean value for mute
     */
    public void setAudioMute(boolean mute) {
        audioMute = mute;
    }
    
    /**
     * sets audioLevel to int value
     * @param level integer value for level
     */
    public void setAudioLevel(int level)
    {
        audioLevel = level;
    }

    /**
     * Plays the assigned SoundTrack
     */
    public synchronized static void soundtrackPlayer() {
        try {
            while (true) {
                if (nextSoundtrack != SoundtrackEnum.NoSoundtrack || currentSoundtrack != SoundtrackEnum.NoSoundtrack) {
                    if (currentSoundtrack == SoundtrackEnum.NoSoundtrack) {
                        currentSoundtrack = nextSoundtrack;
                        nextSoundtrack = SoundtrackEnum.NoSoundtrack;
                    }
                    System.out.println("Current Soundtrack playing: " + currentSoundtrack);

                    URL url = AudioController.class.getResource(currentSoundtrack.dir());

                    AudioInputStream audioStream;
                    audioStream = AudioSystem.getAudioInputStream(url);
                    Clip clip = AudioSystem.getClip();

                    clip.open(audioStream);
                    clip.start();

                    do {
                        if (nextSoundtrack == SoundtrackEnum.NoSoundtrack) {
                            // Song should be playing normally
                            setAudioVolume(clip, audioLevel);
                            Thread.sleep(10);
                        } else {
                            // Song should be fading and changing the currentSoundtrack to the nextSoundtrack
                            System.out.println("Changing Soundtrack...");
                            for (int i = 1; i < 100; i++) { // Fade out over 0.5 seconds (doesn't work when audioLevel is already at the minimum)
                                int mod = audioLevel - (int) ((float) i * ((float) audioLevel / 100.0f));
                                setAudioVolume(clip, mod);
                                Thread.sleep(5);
                            }
                            clip.stop();
                            currentSoundtrack = nextSoundtrack;
                            nextSoundtrack = SoundtrackEnum.NoSoundtrack;

                        }
                    } while (clip.isActive());
                }

                // Thread sleep to keep the function from exhaustively calling itself
                Thread.sleep(50);
            }
            // Handle exceptions
        } catch (LineUnavailableException ex) {
            Logger.getLogger(AudioController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AudioController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(AudioController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(AudioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * sets the nextSoundTrack to menuSoundtrack
     */
    public void playMenuSoundtrack() {
        if (currentSoundtrack != SoundtrackEnum.MenuSoundtrack) {
            nextSoundtrack = SoundtrackEnum.MenuSoundtrack;
        }
    }

    /**
     * sets the nextSoundTrack to GameOverSoundtrack
     */
    public void playGameOverSoundtrack() {
        if (currentSoundtrack != SoundtrackEnum.GameOverSoundtrack) {
            nextSoundtrack = SoundtrackEnum.GameOverSoundtrack;
        }
    }

    /**
     * sets the nextSoundTrack to CaveSoundtrack
     */
    public void playCaveSoundtrack() {
        if (currentSoundtrack != SoundtrackEnum.CaveSoundtrack) {
            nextSoundtrack = SoundtrackEnum.CaveSoundtrack;
        }
    }

    /**
     * sets the nextSoundTrack to ForestSoundtrack
     */
    public void playForestSoundtrack() {
        if (currentSoundtrack != SoundtrackEnum.ForestSoundtrack) {
            nextSoundtrack = SoundtrackEnum.ForestSoundtrack;
        }
    }

    /**
     * sets the nextSoundTrack to LakeSoundtrack
     */
    public void playLakeSoundtrack() {
        if (currentSoundtrack != SoundtrackEnum.LakeSoundtrack) {
            nextSoundtrack = SoundtrackEnum.LakeSoundtrack;
        }
    }

    /**
     * sets the nextSoundTrack to ClearingSoundtrack
     */
    public void playClearingSoundtrack() {
        if (currentSoundtrack != SoundtrackEnum.ClearingSoundtrack) {
            nextSoundtrack = SoundtrackEnum.ClearingSoundtrack;
        }
    }

    /**
     * Used to test audio function and files
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        AudioController testAudio = new AudioController();
        try {
            Thread.sleep(10000);
            testAudio.playGameOverSoundtrack();
            Thread.sleep(10000);
            testAudio.playMenuSoundtrack();
            Thread.sleep(20000);
            testAudio.playGameOverSoundtrack();
            Thread.sleep(20000);
            AudioController stressTest = new AudioController();
            stressTest.playMenuSoundtrack();
            Thread.sleep(20000);
            System.out.println("Attempting to mute");
            stressTest.setAudioMute(true);
            Thread.sleep(10000);
            stressTest.playGameOverSoundtrack();
            Thread.sleep(10000);
            System.out.println("Attempting to unmute");
            testAudio.setAudioMute(false);
            Thread.sleep(10000);
            stressTest.playCaveSoundtrack();
            Thread.sleep(800000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AudioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
