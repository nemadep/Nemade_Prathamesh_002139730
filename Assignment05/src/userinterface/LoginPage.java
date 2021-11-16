/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerJPanel;
import userinterface.DeliveryManRole.DeliveryManAdminJPanel;
import userinterface.RestaurantAdminRole.RestaurantAdminJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author prathameshnemade
 */
public class LoginPage extends javax.swing.JPanel {

    private JFrame rootFrame;
    private JPanel rootJPanel;
    private JButton logoutJButton;
    private EcoSystem system;

    /**
     * Creates new form LoginPage
     *
     * @param rootFrame
     * @param rootJPanel
     * @param logoutJButton
     * @param system
     */
    public LoginPage(JFrame rootFrame, JPanel rootJPanel, JButton logoutJButton, EcoSystem system) {
        initComponents();
        this.rootFrame = rootFrame;
        this.rootJPanel = rootJPanel;
        this.logoutJButton = logoutJButton;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginJButton = new javax.swing.JButton();
        passwordJField = new javax.swing.JTextField();
        emailIDJField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        createAccountButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        loginJButton.setBackground(new java.awt.Color(200, 203, 178));
        loginJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(67, 100, 100));
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        passwordJField.setBackground(new java.awt.Color(238, 238, 238));
        passwordJField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordJField.setText("Enter password");
        passwordJField.setToolTipText("Click to enter your Password.");
        passwordJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        passwordJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordJFieldFocusLost(evt);
            }
        });
        passwordJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordJFieldActionPerformed(evt);
            }
        });

        emailIDJField.setBackground(new java.awt.Color(238, 238, 238));
        emailIDJField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailIDJField.setText("Enter email id");
        emailIDJField.setToolTipText("Click to enter your Email ID.");
        emailIDJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        emailIDJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailIDJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailIDJFieldFocusLost(evt);
            }
        });
        emailIDJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIDJFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        createAccountButton.setBackground(new java.awt.Color(255, 255, 255));
        createAccountButton.setText("Don't have an account? Click to Register");
        createAccountButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        createAccountButton.setBorderPainted(false);
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(createAccountButton)
                    .addComponent(loginJButton)
                    .addComponent(passwordJField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailIDJField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(174, 174, 174)
                .addComponent(emailIDJField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordJField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createAccountButton)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        if (passwordJField != null && emailIDJField != null) {
            UserAccount account = system.getUserAccountDirectory().authenticateUser(emailIDJField.getText(), passwordJField.getText());
            if (account != null) {
                redirectToPanel(account);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password!", "Login", ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Username or Password requried.", "Login", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginJButtonActionPerformed

    public void redirectToPanel(UserAccount account) {
        this.logoutJButton.setVisible(true);
        if (account.getRole().toString() == "Business.Role.SystemAdminRole") {
            SystemAdminWorkAreaJPanel registerPage = new SystemAdminWorkAreaJPanel(this.rootJPanel, account, system);
            this.rootJPanel.add(registerPage);
            CardLayout layout = (CardLayout) this.rootJPanel.getLayout();
            layout.next(this.rootJPanel);
        } else if (account.getRole().toString() == "Business.Role.AdminRole") {
            RestaurantAdminJPanel resPage = new RestaurantAdminJPanel(this.rootJPanel, account, system);
            this.rootJPanel.add(resPage);
            CardLayout layout = (CardLayout) this.rootJPanel.getLayout();
            layout.next(this.rootJPanel);
        } else if (account.getRole().toString() == "Business.Role.DeliverManRole") {
            DeliveryManAdminJPanel delPage = new DeliveryManAdminJPanel(this.rootJPanel, account, system);
            this.rootJPanel.add(delPage);
            CardLayout layout = (CardLayout) this.rootJPanel.getLayout();
            layout.next(this.rootJPanel);
        } else {
            CustomerJPanel cusPage = new CustomerJPanel(this.rootJPanel, account, system);
            this.rootJPanel.add(cusPage);
            CardLayout layout = (CardLayout) this.rootJPanel.getLayout();
            layout.next(this.rootJPanel);
        }
    }

    private void passwordJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordJFieldFocusGained
        if (passwordJField.getText().equals("Enter password")) {
            passwordJField.setText("");
        }
    }//GEN-LAST:event_passwordJFieldFocusGained

    private void passwordJFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordJFieldFocusLost

    }//GEN-LAST:event_passwordJFieldFocusLost

    private void passwordJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordJFieldActionPerformed

    private void emailIDJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailIDJFieldFocusGained
        if (emailIDJField.getText().equals("Enter email id")) {
            emailIDJField.setText("");
        }
    }//GEN-LAST:event_emailIDJFieldFocusGained

    private void emailIDJFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailIDJFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIDJFieldFocusLost

    private void emailIDJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIDJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIDJFieldActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        RegisterPage registerPage = new RegisterPage(this.rootFrame, this.rootJPanel, this.logoutJButton, system);
        this.rootJPanel.add(registerPage);
        CardLayout layout = (CardLayout) this.rootJPanel.getLayout();
        layout.next(this.rootJPanel);
    }//GEN-LAST:event_createAccountButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccountButton;
    private javax.swing.JTextField emailIDJField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JTextField passwordJField;
    // End of variables declaration//GEN-END:variables
}