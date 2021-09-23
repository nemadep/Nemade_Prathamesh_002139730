/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import assignment01.Person;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author prathameshnemade
 */
public class MainJFrame extends javax.swing.JFrame {

    Person person = new Person();
    Object[] allProfiles = {};
    public static int PROFILE_COUNT = 1000;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        injectInitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitSectionsPanel = new javax.swing.JSplitPane();
        actionPanel = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        totalProfilesJLabel = new javax.swing.JLabel();
        interactionPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));

        splitSectionsPanel.setEnabled(false);

        actionPanel.setBackground(new java.awt.Color(234, 237, 240));
        actionPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 20, 10));
        actionPanel.setPreferredSize(new java.awt.Dimension(300, 449));

        createBtn.setBackground(new java.awt.Color(38, 232, 139));
        createBtn.setText("Create a Profile");
        createBtn.setToolTipText("Press to create a profile.");
        createBtn.setBorderPainted(false);
        createBtn.setFocusable(false);
        createBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createBtn.setMargin(new java.awt.Insets(0, 5, 0, 5));
        createBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        viewBtn.setBackground(new java.awt.Color(38, 232, 139));
        viewBtn.setText("View All Profiles");
        viewBtn.setBorderPainted(false);
        viewBtn.setFocusable(false);
        viewBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewBtn.setMargin(new java.awt.Insets(0, 5, 0, 5));
        viewBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Total Profiles created - ");

        totalProfilesJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        totalProfilesJLabel.setText("12");

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalProfilesJLabel)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(totalProfilesJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        actionPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {createBtn, viewBtn});

        splitSectionsPanel.setLeftComponent(actionPanel);

        interactionPanel.setBackground(new java.awt.Color(234, 237, 240));
        interactionPanel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assignment 1");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout interactionPanelLayout = new javax.swing.GroupLayout(interactionPanel);
        interactionPanel.setLayout(interactionPanelLayout);
        interactionPanelLayout.setHorizontalGroup(
            interactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        interactionPanelLayout.setVerticalGroup(
            interactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interactionPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        splitSectionsPanel.setRightComponent(interactionPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitSectionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitSectionsPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void injectInitComponents() {
        totalProfilesJLabel.setText(String.valueOf(allProfiles.length));
    }
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        person.profileId = PROFILE_COUNT++;
        CreateProfileJPanel createProfilePanel = new CreateProfileJPanel(person, splitSectionsPanel);
        splitSectionsPanel.setRightComponent(createProfilePanel);
    }//GEN-LAST:event_createBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        if (person.name == null) {
            JOptionPane.showMessageDialog(this, "No Profiles created!!", "Error", ERROR_MESSAGE);
        } else {
            ViewAllProfilesJPanel viewAllProfilePanel;
            try {
                viewAllProfilePanel = new ViewAllProfilesJPanel(person);
                splitSectionsPanel.setRightComponent(viewAllProfilePanel);
            } catch (IOException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_viewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JButton createBtn;
    private javax.swing.JPanel interactionPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane splitSectionsPanel;
    private javax.swing.JLabel totalProfilesJLabel;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
