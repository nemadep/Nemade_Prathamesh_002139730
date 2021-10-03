/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import classes.User;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author prathameshnemade
 */
public class LoginPage extends javax.swing.JPanel {

    public JSplitPane jSplitPane;
    public JPanel leftJPanel;
    public JPanel rightJPanel;
    final String[] ROLE = {"Admin", "User"};

    /**
     * Creates new form LoginPage
     */
    public LoginPage(JSplitPane jSplitPane, JPanel leftJPanel, JPanel rightJPanel) {
        initComponents();
        this.jSplitPane = jSplitPane;
        this.leftJPanel = leftJPanel;
        this.rightJPanel = rightJPanel;
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(ROLE));
        roleJComboBox.setSelectedIndex(0);
        jSplitPane.setDividerLocation((int) (0 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width)));
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
        roleJComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        passwordJField.setBackground(new java.awt.Color(238, 238, 238));
        passwordJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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
        emailIDJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.setFocusable(false);
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailIDJField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordJField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginJButton))
                .addGap(238, 238, 238))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(loginJButton)
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed

        if (passwordJField != null && emailIDJField != null) {
            String roleSelected = (String) roleJComboBox.getSelectedItem();

            if ("Admin".equals(roleSelected)) {
                for (User admin : MainJFrame.adminLists) {
                    if (admin.getPassword().equals(passwordJField.getText()) && admin.email.equals(emailIDJField.getText())) {
                        System.out.println("admin logged in!!!");
                        jSplitPane.setDividerLocation((int) (0.3 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width - 300)));
                        AdminDashboard adminDashboard = new AdminDashboard(jSplitPane);
                        AdminLeftSection adminOptions = new AdminLeftSection(jSplitPane, leftJPanel, rightJPanel);
                        jSplitPane.setRightComponent(adminDashboard);
                        jSplitPane.setLeftComponent(adminOptions);

                    }
                }
            } else {
                for (User user : MainJFrame.usersLists) {
                    if (user.getPassword().equals(passwordJField.getText()) && user.email.equals(emailIDJField.getText())) {
                        System.out.println("user logged in!!!");
                        jSplitPane.setDividerLocation((int) (0.3 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width) - 300));

                    }
                }
            }
        }
    }//GEN-LAST:event_loginJButtonActionPerformed

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

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailIDJField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JTextField passwordJField;
    private javax.swing.JComboBox<String> roleJComboBox;
    // End of variables declaration//GEN-END:variables
}
