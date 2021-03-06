/*
 * Don't Die Game
 * CS 321 - 01
 * Team 4: Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington
 * FALL SEMESTER - 2 December 2019
 */
package GUI;

/**
 * AboutMenu shows Creators, the class this was made for, 
 * and how to play the game.
 * Javadocs checked by Anushka Bhattacharjee
 * @author Harleigh Bass and Anushka Bhattacharjee
 */
public class AboutMenu extends javax.swing.JFrame {

    /**
     * Creates new form AboutMenu
     */
    public AboutMenu() {
        setSize(740, 560);
        setLocationRelativeTo(null);
        setUndecorated(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aboutLabel = new javax.swing.JLabel();
        teamLabel = new javax.swing.JLabel();
        aboutGameLabel = new javax.swing.JLabel();
        MainMenuButton = new javax.swing.JButton();
        namesLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        semesterLabel = new javax.swing.JLabel();
        aboutLabel1 = new javax.swing.JLabel();
        aboutLabel2 = new javax.swing.JLabel();
        aboutLabel3 = new javax.swing.JLabel();
        aboutLabel4 = new javax.swing.JLabel();
        aboutLabel5 = new javax.swing.JLabel();
        aboutLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        aboutLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        aboutLabel.setText("About");

        teamLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        teamLabel.setText("Developers");

        aboutGameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        aboutGameLabel.setText("How to Play the Game");

        MainMenuButton.setBackground(new java.awt.Color(0, 153, 153));
        MainMenuButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MainMenuButton.setText("Main Menu");
        MainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuButtonActionPerformed(evt);
            }
        });

        namesLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        namesLabel.setForeground(new java.awt.Color(255, 255, 255));
        namesLabel.setText("Team 4 : Hunter Bales, Harleigh Bass, Anushka Bhattacharjee, Liam Coddington");

        classLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        classLabel.setForeground(new java.awt.Color(255, 255, 255));
        classLabel.setText("CS 321 - 01");

        semesterLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        semesterLabel.setForeground(new java.awt.Color(255, 255, 255));
        semesterLabel.setText("Fall 2019");

        aboutLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        aboutLabel1.setForeground(new java.awt.Color(255, 255, 255));
        aboutLabel1.setText("Each day, you lose health, hunger, thirst, and energy points.");

        aboutLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        aboutLabel2.setForeground(new java.awt.Color(255, 255, 255));
        aboutLabel2.setText("Explore the different areas to find food, water, and shelter for the night to keep");

        aboutLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        aboutLabel3.setForeground(new java.awt.Color(255, 255, 255));
        aboutLabel3.setText("yourself alive each day.");

        aboutLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        aboutLabel4.setForeground(new java.awt.Color(255, 255, 255));
        aboutLabel4.setText("Sometimes you may encounter enemies in a Quicktime Event and must fight them.");

        aboutLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        aboutLabel5.setForeground(new java.awt.Color(255, 255, 255));
        aboutLabel5.setText("When that happens, do your best to click the button as many times as you can to win!");

        aboutLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        aboutLabel6.setForeground(new java.awt.Color(255, 255, 255));
        aboutLabel6.setText("You must stay alive for three days in order to win the game.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aboutGameLabel)
                            .addComponent(teamLabel)
                            .addComponent(namesLabel)
                            .addComponent(classLabel)
                            .addComponent(semesterLabel)
                            .addComponent(aboutLabel1)
                            .addComponent(aboutLabel2)
                            .addComponent(aboutLabel3)
                            .addComponent(aboutLabel4)
                            .addComponent(aboutLabel5)
                            .addComponent(aboutLabel6))
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(MainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(classLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(semesterLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namesLabel)
                .addGap(45, 45, 45)
                .addComponent(aboutGameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(aboutLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aboutLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aboutLabel3)
                .addGap(24, 24, 24)
                .addComponent(aboutLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aboutLabel5)
                .addGap(18, 18, 18)
                .addComponent(aboutLabel6)
                .addGap(38, 38, 38)
                .addComponent(MainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * If Main Menu button is pressed, this runs the StartMenu class JFrame.
     * @param evt for being clicked on
     */
    private void MainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuButtonActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_MainMenuButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AboutMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainMenuButton;
    private javax.swing.JLabel aboutGameLabel;
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JLabel aboutLabel1;
    private javax.swing.JLabel aboutLabel2;
    private javax.swing.JLabel aboutLabel3;
    private javax.swing.JLabel aboutLabel4;
    private javax.swing.JLabel aboutLabel5;
    private javax.swing.JLabel aboutLabel6;
    private javax.swing.JLabel classLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namesLabel;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JLabel teamLabel;
    // End of variables declaration//GEN-END:variables
}
