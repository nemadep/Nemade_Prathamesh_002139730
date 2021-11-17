/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderAssignmentRequest;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JSplitPane;

/**
 *
 * @author prathameshnemade
 */
public class RestaurantOrderStatusJPanel extends javax.swing.JPanel {

    EcoSystem system;
    UserAccount account;
    JSplitPane jSplitPane;
    Integer selectedIndex;
    OrderWorkRequest selectedWorkRequest;
    ArrayList<OrderWorkRequest> unAssignedRequests = new ArrayList<OrderWorkRequest>();

    RestaurantOrderStatusJPanel(EcoSystem system, UserAccount account, JSplitPane jSplitPane) {
        this.system = system;
        this.account = account;
        this.jSplitPane = jSplitPane;
        initComponents();
        _getUnAssignedOrders();
    }

    public void _getUnAssignedOrders() {
        this.customerNameJLabel.setText("Select a order!");
        this.createdAtJLabel.setText("Select a order!");
        this.createdByJLabel.setText("Select a order!");
        this.orderMessageJLabel.setText("NA");
        this.addressJLabel.setText("Select a order!");
        this.statusJLabel.setText("Select a order!");

        DefaultListModel model = new DefaultListModel();
        this.ordersJList.setModel(model);

        for (int i = 0; i < this.system.getWorkQueue().getWorkRequestList().size(); i++) {
            WorkRequest ongoing = this.system.getWorkQueue().getWorkRequestList().get(i);
            if (ongoing instanceof OrderWorkRequest) {
                OrderWorkRequest onGo = (OrderWorkRequest) ongoing;
                if (onGo.getSender().getManagerUserName().toString().equals(this.account.getUsername().toString()) && !onGo.getOrderRequestStatus().toString().equals("CANCELLED")) {
                    String resName = ongoing.getSender().getName();
                    Long resWorkId = ((OrderWorkRequest) ongoing).getOrderWorkRequestId();
                    model.addElement(String.valueOf(resWorkId) + " - " + resName);
                    unAssignedRequests.add((OrderWorkRequest) ongoing);
                }
            }
        }
        this.ordersJList.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ordersJList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        orderStatusJComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        customerNameJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        createdAtJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        createdByJLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        orderMessageJLabel = new javax.swing.JLabel();
        addressJLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        statusJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        ordersJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ordersJListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ordersJList);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Orders:");

        orderStatusJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INPROGRESS", "READYFORPICKUP", "CANCELLED" }));
        orderStatusJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                orderStatusJComboBoxItemStateChanged(evt);
            }
        });
        orderStatusJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderStatusJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Order Status:");

        addJButton.setBackground(new java.awt.Color(200, 203, 178));
        addJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addJButton.setForeground(new java.awt.Color(67, 100, 100));
        addJButton.setText("DONE");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Change Order Status");

        customerNameJLabel.setFont(new java.awt.Font("Noto Sans Kannada", 1, 14)); // NOI18N
        customerNameJLabel.setForeground(new java.awt.Color(67, 100, 100));
        customerNameJLabel.setText("Select a order!");

        jLabel6.setFont(new java.awt.Font("Noto Sans Oriya", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(67, 100, 100));
        jLabel6.setText("Created At:");

        createdAtJLabel.setFont(new java.awt.Font("Noto Sans Kannada", 1, 14)); // NOI18N
        createdAtJLabel.setForeground(new java.awt.Color(67, 100, 100));
        createdAtJLabel.setText("Select a order!");

        jLabel7.setFont(new java.awt.Font("Noto Sans Oriya", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(67, 100, 100));
        jLabel7.setText("Created By:");

        createdByJLabel.setFont(new java.awt.Font("Noto Sans Kannada", 1, 14)); // NOI18N
        createdByJLabel.setForeground(new java.awt.Color(67, 100, 100));
        createdByJLabel.setText("Select a order!");

        jLabel8.setFont(new java.awt.Font("Noto Sans Oriya", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(67, 100, 100));
        jLabel8.setText("Order Message:");

        orderMessageJLabel.setFont(new java.awt.Font("Noto Sans Kannada", 1, 14)); // NOI18N
        orderMessageJLabel.setForeground(new java.awt.Color(67, 100, 100));
        orderMessageJLabel.setText("NA");

        addressJLabel.setFont(new java.awt.Font("Noto Sans Kannada", 1, 14)); // NOI18N
        addressJLabel.setForeground(new java.awt.Color(67, 100, 100));
        addressJLabel.setText("Select a order!");

        jLabel9.setFont(new java.awt.Font("Noto Sans Oriya", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(67, 100, 100));
        jLabel9.setText("Address:");

        jLabel10.setFont(new java.awt.Font("Noto Sans Oriya", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(67, 100, 100));
        jLabel10.setText("Status:");

        jLabel5.setFont(new java.awt.Font("Noto Sans Oriya", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(67, 100, 100));
        jLabel5.setText("Customer Name:");

        statusJLabel.setFont(new java.awt.Font("Noto Sans Kannada", 1, 14)); // NOI18N
        statusJLabel.setForeground(new java.awt.Color(67, 100, 100));
        statusJLabel.setText("Select a order!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orderStatusJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusJLabel)
                            .addComponent(customerNameJLabel)
                            .addComponent(createdByJLabel)
                            .addComponent(createdAtJLabel)
                            .addComponent(orderMessageJLabel)
                            .addComponent(addressJLabel))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(customerNameJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(createdAtJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(createdByJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(orderMessageJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(addressJLabel))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(statusJLabel))
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderStatusJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ordersJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ordersJListValueChanged
        openSelectedOrder();
    }//GEN-LAST:event_ordersJListValueChanged

    public void openSelectedOrder() {
        selectedIndex = this.ordersJList.getSelectedIndex();
        if (selectedIndex != -1) {
            this.selectedWorkRequest = unAssignedRequests.get(selectedIndex);
            this.customerNameJLabel.setText(this.selectedWorkRequest.getReceiver().getUsername());
            this.createdAtJLabel.setText(this.selectedWorkRequest.getRequestDate().toString());
            this.createdByJLabel.setText(this.selectedWorkRequest.getOrderRequestCreatedBy().getUsername());
            this.orderMessageJLabel.setText(this.selectedWorkRequest.getOrderMessage());
            this.addressJLabel.setText(this.selectedWorkRequest.getAddress());
            this.statusJLabel.setText(this.selectedWorkRequest.getOrderRequestStatus());
        }
    }

    private void orderStatusJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_orderStatusJComboBoxItemStateChanged
//todo
    }//GEN-LAST:event_orderStatusJComboBoxItemStateChanged

    private void orderStatusJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderStatusJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderStatusJComboBoxActionPerformed

    public Boolean validAssignment() {
        String errorMessage = "";

        if (this.selectedWorkRequest == null) {
            errorMessage += "Select an order to allocate a delivery person! \n";
        }
        if (errorMessage.equals("")) {
            return true;
        }
        JOptionPane.showMessageDialog(this, errorMessage, "Order Assignment Details", ERROR_MESSAGE);
        return false;
    }

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        Boolean isValid = this.validAssignment();
        if (isValid) {
            String selectedOrderStatus = this.orderStatusJComboBox.getSelectedItem().toString();
            for (int i = 0; i < this.system.getWorkQueue().getWorkRequestList().size(); i++) {
                WorkRequest ongoing = this.system.getWorkQueue().getWorkRequestList().get(i);
                if (ongoing instanceof OrderWorkRequest) {
                    OrderWorkRequest onGo = (OrderWorkRequest) ongoing;
                    if (onGo == selectedWorkRequest) {
                        onGo.setOrderRequestStatus(selectedOrderStatus);
                        if (!"INPROGRESS".equals(selectedOrderStatus)) {
                            System.out.println("*******!\"INPROGRESS\"*******OrderAssignmentRequest");
                            System.out.println(onGo.getAddress());
                            System.out.println(onGo.getReceiver().getUsername());
                            System.out.println(onGo.getOrderedMenu());
                            System.out.println(onGo.getSender().getName());
                            System.out.println(onGo.getMessage());
                            System.out.println(onGo.getRequestDate());
                            System.out.println(onGo.getOrderWorkRequestId());
                            System.out.println("************");

                            OrderAssignmentRequest orderAssignment = null;

                            for (int j = 0; j < this.system.getWorkQueue().getWorkRequestList().size(); j++) {
                                WorkRequest ongoing1 = this.system.getWorkQueue().getWorkRequestList().get(j);
                                if (ongoing1 instanceof OrderAssignmentRequest) {
                                    if (((OrderAssignmentRequest) ongoing1).getAssignmentId() == onGo.getOrderWorkRequestId()) {
                                        ongoing1.setAddress(onGo.getAddress());
                                        ongoing1.setReceiver(onGo.getReceiver());
                                        ongoing1.setOrderedMenu(onGo.getOrderedMenu());
                                        ongoing1.setSender(onGo.getSender());
                                        ongoing1.setMessage(onGo.getMessage());
                                        ongoing1.setStatus(selectedOrderStatus);
                                        ongoing1.setRequestDate(onGo.getRequestDate());
                                        ((OrderAssignmentRequest) ongoing1).setAssignmentTo(null);
                                        ((OrderAssignmentRequest) ongoing1).setOrderAssignmentAt(new Date());
                                        ((OrderAssignmentRequest) ongoing1).setAssignmentComments("");
                                        ((OrderAssignmentRequest) ongoing1).setAssignmentStatus(selectedOrderStatus);
                                        ((OrderAssignmentRequest) ongoing1).setNoOfBags(1);
                                        ((OrderAssignmentRequest) ongoing1).setIsfragilePackage(true);
                                        ((OrderAssignmentRequest) ongoing1).setAssignmentId(onGo.getOrderWorkRequestId());
                                    }
                                }
                            }

                            if (orderAssignment == null) {
                                orderAssignment = new OrderAssignmentRequest(
                                        onGo.getAddress(),
                                        onGo.getReceiver(),
                                        onGo.getOrderedMenu(),
                                        onGo.getSender(),
                                        onGo.getMessage(),
                                        selectedOrderStatus,
                                        onGo.getRequestDate(),
                                        null, //delievery guy
                                        new Date(),
                                        "", //message to delivery guy
                                        selectedOrderStatus,
                                        1,//no of bags
                                        true, //is fragile
                                        onGo.getOrderWorkRequestId()
                                );
                                this.system.getWorkQueue().getWorkRequestList().add(orderAssignment);
                            }
                        }
                        _getUnAssignedOrders();

                        JOptionPane.showMessageDialog(this, "Status changed Successfully!", "Order Status Details", INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_addJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JLabel createdAtJLabel;
    private javax.swing.JLabel createdByJLabel;
    private javax.swing.JLabel customerNameJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orderMessageJLabel;
    private javax.swing.JComboBox<String> orderStatusJComboBox;
    private javax.swing.JList<String> ordersJList;
    private javax.swing.JLabel statusJLabel;
    // End of variables declaration//GEN-END:variables
}
