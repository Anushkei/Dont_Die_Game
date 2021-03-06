/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package GUI;

import dontdie.audio.AudioController;
import java.awt.Color;
import java.awt.Font;

/**
 * OptionsMenu.java 
 * 
 * GUI for setting volume to music
 * Javadocs checked by Anushka Bhattacharjee
 * @author Hunter Bales
 */
public class OptionsMenu extends javax.swing.JFrame {

   /**
    * Creates new form OptionsMenu
    */
    public OptionsMenu() {
        initComponents();
        setSize(530, 400);
        setLocationRelativeTo(null);
        
        // Button Colors and Fonts
        ReturnButton.setForeground(Color.WHITE);
        OptionsMenuLabel.setForeground(Color.WHITE);
        
        ReturnButton.setFont(new Font("Arial Black", Font.PLAIN, 16));
        OptionsMenuLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OptionsMenuPanel = new javax.swing.JPanel();
        ReturnButton = new javax.swing.JButton();
        MusicMuteCheckBox = new javax.swing.JCheckBox();
        MusicLabel = new javax.swing.JLabel();
        MusicSlider = new javax.swing.JSlider();
        MusicSliderValue = new javax.swing.JLabel();
        OptionsMenuLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 300));

        OptionsMenuPanel.setBackground(new java.awt.Color(150, 188, 190));

        ReturnButton.setBackground(new java.awt.Color(0, 153, 153));
        ReturnButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReturnButton.setText("Return");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });

        MusicMuteCheckBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MusicMuteCheckBox.setText("Mute Music");
        MusicMuteCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicMuteCheckBoxActionPerformed(evt);
            }
        });

        MusicLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        MusicLabel.setText("Music:");

        MusicSlider.setMajorTickSpacing(50);
        MusicSlider.setMinorTickSpacing(10);
        MusicSlider.setPaintLabels(true);
        MusicSlider.setPaintTicks(true);
        MusicSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MusicSliderStateChanged(evt);
            }
        });

        MusicSliderValue.setToolTipText("");

        OptionsMenuLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        OptionsMenuLabel.setText("Options");

        javax.swing.GroupLayout OptionsMenuPanelLayout = new javax.swing.GroupLayout(OptionsMenuPanel);
        OptionsMenuPanel.setLayout(OptionsMenuPanelLayout);
        OptionsMenuPanelLayout.setHorizontalGroup(
            OptionsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(OptionsMenuPanelLayout.createSequentialGroup()
                .addGroup(OptionsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OptionsMenuPanelLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(MusicSliderValue, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OptionsMenuPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(OptionsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OptionsMenuLabel)
                            .addGroup(OptionsMenuPanelLayout.createSequentialGroup()
                                .addComponent(MusicLabel)
                                .addGap(18, 18, 18)
                                .addComponent(MusicSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(MusicMuteCheckBox)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        OptionsMenuPanelLayout.setVerticalGroup(
            OptionsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OptionsMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(OptionsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OptionsMenuPanelLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(OptionsMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MusicSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionsMenuPanelLayout.createSequentialGroup()
                                .addComponent(MusicMuteCheckBox)
                                .addGap(11, 11, 11))))
                    .addGroup(OptionsMenuPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(MusicLabel)))
                .addGap(36, 36, 36)
                .addComponent(MusicSliderValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(ReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OptionsMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OptionsMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
      * sets volume for music audio
      * @param evt 
      */
    private void MusicSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MusicSliderStateChanged
        MusicSliderValue.setText("" + MusicSlider.getValue() + "%");
        AudioController audio = new AudioController();
        audio.setAudioLevel(MusicSlider.getValue());
    }//GEN-LAST:event_MusicSliderStateChanged

    /**
     * mutes (sets 0) audio volume
     * @param evt 
     */
    private void MusicMuteCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicMuteCheckBoxActionPerformed
        AudioController audio = new AudioController();
        if (MusicMuteCheckBox.isSelected()) {
            MusicValueBeforeMute = MusicSlider.getValue();
            MusicSlider.setValue(0);
            audio.setAudioMute(true);
        } else {
            MusicSlider.setValue(MusicValueBeforeMute);
            audio.setAudioMute(false);
        }
    }//GEN-LAST:event_MusicMuteCheckBoxActionPerformed
   
    /**
     * sets optionsMenu visible to false
     * @param evt 
     */
    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_ReturnButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MusicLabel;
    private javax.swing.JCheckBox MusicMuteCheckBox;
    private javax.swing.JSlider MusicSlider;
    private javax.swing.JLabel MusicSliderValue;
    private javax.swing.JLabel OptionsMenuLabel;
    private javax.swing.JPanel OptionsMenuPanel;
    private javax.swing.JButton ReturnButton;
    // End of variables declaration//GEN-END:variables
    //added variables
    private int SFXValueBeforeMute;
    private int MusicValueBeforeMute;

}
