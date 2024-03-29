/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderAssignmentRequest;
import Business.WorkQueue.OrderDelieveryRequest;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prathameshnemade
 */
public class CustomerDashboardJPanel extends javax.swing.JPanel {

    EcoSystem system;
    UserAccount account;
    JSplitPane jSplitPane;

    public CustomerDashboardJPanel(EcoSystem system, UserAccount account, JSplitPane jSplitPane) {
        initComponents();
        this.system = system;
        this.account = account;
        this.jSplitPane = jSplitPane;
        _getOrdersTable();
    }

    public void _getOrdersTable() {
        Integer count = 0;
        for (int i = 0; i < this.system.getWorkQueue().getWorkRequestList().size(); i++) {
            WorkRequest ongoing = this.system.getWorkQueue().getWorkRequestList().get(i);

            if (ongoing.getReceiver().getUsername().toString().equals(this.account.getUsername().toString())) {
                if (ongoing instanceof OrderWorkRequest) {
                    count += 1;
                }

            }
        }
        this.totalOrdersJLabel.setText(String.valueOf(count));
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
        jLabel3 = new javax.swing.JLabel();
        totalOrdersJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(67, 100, 100));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));
        jPanel1.setPreferredSize(new java.awt.Dimension(385, 190));

        jLabel3.setFont(new java.awt.Font("Noto Sans Myanmar", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Orders:");

        totalOrdersJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 60)); // NOI18N
        totalOrdersJLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalOrdersJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalOrdersJLabel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalOrdersJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalOrdersJLabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel totalOrdersJLabel;
    // End of variables declaration//GEN-END:variables
}
