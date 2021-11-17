/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        userNameJLabel.setText(account.getUsername());

        SystemAdminDashboard updateProfileAdmin = new SystemAdminDashboard(ecosystem, account, jSplitPane);
        this.jSplitPane.setRightComponent(updateProfileAdmin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        userNameJLabel = new javax.swing.JLabel();
        AccountCreationJButton = new javax.swing.JButton();
        AccountCreationJButton1 = new javax.swing.JButton();
        AccountCreationJButton2 = new javax.swing.JButton();
        OrderCreationJButton = new javax.swing.JButton();
        OrderCreationJButton1 = new javax.swing.JButton();
        OrderCreationJButton2 = new javax.swing.JButton();
        AllOrdersJButton = new javax.swing.JButton();
        OrderCreationJButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setBackground(new java.awt.Color(200, 203, 178));
        jButton5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(67, 100, 100));
        jButton5.setText("Home");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans Oriya", 0, 36)); // NOI18N
        jLabel2.setText("Hello,");

        userNameJLabel.setFont(new java.awt.Font("Noto Sans Oriya", 1, 36)); // NOI18N
        userNameJLabel.setText("System Admin!");

        AccountCreationJButton.setBackground(new java.awt.Color(200, 203, 178));
        AccountCreationJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        AccountCreationJButton.setForeground(new java.awt.Color(67, 100, 100));
        AccountCreationJButton.setText("Account Creation");
        AccountCreationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountCreationJButtonActionPerformed(evt);
            }
        });

        AccountCreationJButton1.setBackground(new java.awt.Color(200, 203, 178));
        AccountCreationJButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        AccountCreationJButton1.setForeground(new java.awt.Color(67, 100, 100));
        AccountCreationJButton1.setText("Account Update");
        AccountCreationJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountCreationJButton1ActionPerformed(evt);
            }
        });

        AccountCreationJButton2.setBackground(new java.awt.Color(200, 203, 178));
        AccountCreationJButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        AccountCreationJButton2.setForeground(new java.awt.Color(67, 100, 100));
        AccountCreationJButton2.setText("Create Restaurant");
        AccountCreationJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountCreationJButton2ActionPerformed(evt);
            }
        });

        OrderCreationJButton.setBackground(new java.awt.Color(200, 203, 178));
        OrderCreationJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        OrderCreationJButton.setForeground(new java.awt.Color(67, 100, 100));
        OrderCreationJButton.setText("Order Creation");
        OrderCreationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderCreationJButtonActionPerformed(evt);
            }
        });

        OrderCreationJButton1.setBackground(new java.awt.Color(200, 203, 178));
        OrderCreationJButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        OrderCreationJButton1.setForeground(new java.awt.Color(67, 100, 100));
        OrderCreationJButton1.setText("Order Assignment");
        OrderCreationJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderCreationJButton1ActionPerformed(evt);
            }
        });

        OrderCreationJButton2.setBackground(new java.awt.Color(200, 203, 178));
        OrderCreationJButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        OrderCreationJButton2.setForeground(new java.awt.Color(67, 100, 100));
        OrderCreationJButton2.setText("Change Order Delivery Status");
        OrderCreationJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderCreationJButton2ActionPerformed(evt);
            }
        });

        AllOrdersJButton.setBackground(new java.awt.Color(200, 203, 178));
        AllOrdersJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        AllOrdersJButton.setForeground(new java.awt.Color(67, 100, 100));
        AllOrdersJButton.setText("All Orders");
        AllOrdersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllOrdersJButtonActionPerformed(evt);
            }
        });

        OrderCreationJButton3.setBackground(new java.awt.Color(200, 203, 178));
        OrderCreationJButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        OrderCreationJButton3.setForeground(new java.awt.Color(67, 100, 100));
        OrderCreationJButton3.setText("Change Status");
        OrderCreationJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderCreationJButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameJLabel))
                    .addComponent(AccountCreationJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AccountCreationJButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AccountCreationJButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrderCreationJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrderCreationJButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrderCreationJButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllOrdersJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrderCreationJButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userNameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccountCreationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccountCreationJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccountCreationJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderCreationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderCreationJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderCreationJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderCreationJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllOrdersJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        jLabel3.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel3)
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addContainerGap(530, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel3);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SystemAdminDashboard createAdmin = new SystemAdminDashboard(ecosystem, account, jSplitPane);
        this.jSplitPane.setRightComponent(createAdmin);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void AccountCreationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountCreationJButtonActionPerformed
        AccountCreateJPanel createAdmin = new AccountCreateJPanel(ecosystem, account);
        this.jSplitPane.setRightComponent(createAdmin);
    }//GEN-LAST:event_AccountCreationJButtonActionPerformed

    private void AccountCreationJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountCreationJButton1ActionPerformed
        AccountUpdateJPanel updateProfileAdmin = new AccountUpdateJPanel(ecosystem, account, jSplitPane);
        this.jSplitPane.setRightComponent(updateProfileAdmin);
    }//GEN-LAST:event_AccountCreationJButton1ActionPerformed

    private void AccountCreationJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountCreationJButton2ActionPerformed
        CreateRestaurantJPanel createRestaurantPanel = new CreateRestaurantJPanel(ecosystem, account, jSplitPane);
        this.jSplitPane.setRightComponent(createRestaurantPanel);
    }//GEN-LAST:event_AccountCreationJButton2ActionPerformed

    private void OrderCreationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderCreationJButtonActionPerformed
        OrderCreationJPanel orderCreationPanel = new OrderCreationJPanel(ecosystem, account, jSplitPane);
        this.jSplitPane.setRightComponent(orderCreationPanel);
    }//GEN-LAST:event_OrderCreationJButtonActionPerformed

    private void OrderCreationJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderCreationJButton1ActionPerformed
        OrderAssignmentJPanel orderAssignmentPanel = new OrderAssignmentJPanel(ecosystem, account, jSplitPane);
        this.jSplitPane.setRightComponent(orderAssignmentPanel);
    }//GEN-LAST:event_OrderCreationJButton1ActionPerformed

    private void OrderCreationJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderCreationJButton2ActionPerformed
        OrderDeliveryStatusJPanel orderStatusPanel = new OrderDeliveryStatusJPanel(ecosystem, account, jSplitPane);
        this.jSplitPane.setRightComponent(orderStatusPanel);
    }//GEN-LAST:event_OrderCreationJButton2ActionPerformed

    private void AllOrdersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllOrdersJButtonActionPerformed
        AllOrdersJPanel allOrdersPanel = new AllOrdersJPanel(ecosystem, account, jSplitPane);
        this.jSplitPane.setRightComponent(allOrdersPanel);
    }//GEN-LAST:event_AllOrdersJButtonActionPerformed

    private void OrderCreationJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderCreationJButton3ActionPerformed
       AdminOrderStatusJPanel allOrdersPanel = new AdminOrderStatusJPanel(ecosystem, account, jSplitPane);
        this.jSplitPane.setRightComponent(allOrdersPanel);
    }//GEN-LAST:event_OrderCreationJButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccountCreationJButton;
    private javax.swing.JButton AccountCreationJButton1;
    private javax.swing.JButton AccountCreationJButton2;
    private javax.swing.JButton AllOrdersJButton;
    private javax.swing.JButton OrderCreationJButton;
    private javax.swing.JButton OrderCreationJButton1;
    private javax.swing.JButton OrderCreationJButton2;
    private javax.swing.JButton OrderCreationJButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel userNameJLabel;
    // End of variables declaration//GEN-END:variables
}
