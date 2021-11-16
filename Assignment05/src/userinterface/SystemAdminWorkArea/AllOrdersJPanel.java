/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

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
public class AllOrdersJPanel extends javax.swing.JPanel {

    EcoSystem ecosystem;
    UserAccount account;
    JSplitPane jSplitPane;

    public AllOrdersJPanel(EcoSystem ecosystem, UserAccount account, JSplitPane jSplitPane) {
        initComponents();
        this.ecosystem = ecosystem;
        this.account = account;
        this.jSplitPane = jSplitPane;
        _getOrdersTable();
    }

    public void _getOrdersTable() {
        DefaultTableModel model = (DefaultTableModel) ordersJTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < this.ecosystem.getWorkQueue().getWorkRequestList().size(); i++) {
            WorkRequest ongoing = this.ecosystem.getWorkQueue().getWorkRequestList().get(i);
            OrderAssignmentRequest ongoing1 = null;
            OrderDelieveryRequest ongoing2 = null;
            OrderWorkRequest ongoing3 = null;
            if (ongoing instanceof OrderAssignmentRequest) {
                ongoing1 = (OrderAssignmentRequest) this.ecosystem.getWorkQueue().getWorkRequestList().get(i);
            } else if (ongoing instanceof OrderDelieveryRequest) {
                ongoing2 = (OrderDelieveryRequest) this.ecosystem.getWorkQueue().getWorkRequestList().get(i);
            } else if (ongoing instanceof OrderWorkRequest) {
                ongoing3 = (OrderWorkRequest) this.ecosystem.getWorkQueue().getWorkRequestList().get(i);
            }
            Object[] row = {
                ongoing3 == null ? "NA" : ongoing3.getOrderWorkRequestId(),
                ongoing3 == null ? "NA" : ongoing3.getReceiver().getUsername(),
                ongoing.getAddress(),
                ongoing2 == null ? "NA" : ongoing2.getDeliveredBy().getEmployee(),
                ongoing1 == null ? "NA" : ongoing1.getAssignmentStatus(),
                ongoing2 == null ? "NA" : ongoing2.getDeliveryStatus(),
                ongoing.getStatus()
            };
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordersJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("All Orders");

        ordersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order No.", "Customer Name", "Restaurant Name", "Delivery Men", "Delivery Men Status", "Restaurant Status", "Over All Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ordersJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ordersJTable;
    // End of variables declaration//GEN-END:variables
}
