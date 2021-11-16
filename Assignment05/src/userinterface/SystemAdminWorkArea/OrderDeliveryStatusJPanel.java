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
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JSplitPane;

/**
 *
 * @author prathameshnemade
 */
public class OrderDeliveryStatusJPanel extends javax.swing.JPanel {

    EcoSystem ecosystem;
    UserAccount account;
    JSplitPane jSplitPane;
    UserAccount selectedDeliveryMen;
    ArrayList<UserAccount> onlyDeliveryMens = new ArrayList<UserAccount>();
    ArrayList<OrderAssignmentRequest> allReadyToPickUpOrders = new ArrayList<OrderAssignmentRequest>();
    OrderAssignmentRequest selectedOrder;

    OrderDeliveryStatusJPanel(EcoSystem ecosystem, UserAccount account, JSplitPane jSplitPane) {
        this.ecosystem = ecosystem;
        this.account = account;
        this.jSplitPane = jSplitPane;
        initComponents();
        this.ordersJList.setVisible(false);
        this.jLabel5.setVisible(false);
        this.statusJComboBox.setVisible(false);
        this.addJButton1.setVisible(false);
        _getDeliveryMenList();
        setDeliveryMen();
    }

    public void _getDeliveryMenList() {
        ArrayList<String> menuNameDropdown = new ArrayList<>();

        for (int i = 0; i < this.ecosystem.getUserAccountDirectory().getUserAccountList().size(); i++) {
            UserAccount ongoing = this.ecosystem.getUserAccountDirectory().getUserAccountList().get(i);
            if ("Business.Role.DeliverManRole".equals(ongoing.getRole().toString())) {
                this.onlyDeliveryMens.add(ongoing);
                menuNameDropdown.add(ongoing.getUsername());
            }
        }

        String[] menuSDropdown = menuNameDropdown.toArray(new String[menuNameDropdown.size()]);
        DefaultComboBoxModel<String> brandSDropdownModel = new DefaultComboBoxModel<>(menuSDropdown);
        this.deliveryMenJComboBox.setModel(brandSDropdownModel);
    }

    public void _getUnAssignedOrders() {
        DefaultListModel model = new DefaultListModel();
        this.ordersJList.setModel(model);
        allReadyToPickUpOrders = new ArrayList<OrderAssignmentRequest>();

        for (int i = 0; i < this.ecosystem.getWorkQueue().getWorkRequestList().size(); i++) {
            WorkRequest ongoing = this.ecosystem.getWorkQueue().getWorkRequestList().get(i);
            if (ongoing instanceof OrderAssignmentRequest) {
                OrderAssignmentRequest onGo = (OrderAssignmentRequest) ongoing;
                if (onGo.getAssignmentStatus() == "READYTOPICKUP" && onGo.getAssignmentTo().getUsername() == this.selectedDeliveryMen.getUsername()) {
                    String address = ongoing.getAddress().toString();
                    Long resWorkId = ((OrderAssignmentRequest) ongoing).getAssignmentId();
                    model.addElement(String.valueOf(resWorkId) + " - " + address);
                    allReadyToPickUpOrders.add((OrderAssignmentRequest) ongoing);
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

        jLabel4 = new javax.swing.JLabel();
        deliveryMenJComboBox = new javax.swing.JComboBox<>();
        addJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordersJList = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        statusJComboBox = new javax.swing.JComboBox<>();
        addJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Select a deliverymen:");

        deliveryMenJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deliveryMenJComboBoxItemStateChanged(evt);
            }
        });

        addJButton.setBackground(new java.awt.Color(200, 203, 178));
        addJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addJButton.setForeground(new java.awt.Color(67, 100, 100));
        addJButton.setText("SEARCH");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        ordersJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ordersJListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ordersJList);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Set Status:");

        statusJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PICKED", "DELIVERED" }));
        statusJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                statusJComboBoxItemStateChanged(evt);
            }
        });

        addJButton1.setBackground(new java.awt.Color(200, 203, 178));
        addJButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addJButton1.setForeground(new java.awt.Color(67, 100, 100));
        addJButton1.setText("DONE");
        addJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deliveryMenJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statusJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(addJButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deliveryMenJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(addJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deliveryMenJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deliveryMenJComboBoxItemStateChanged
        setDeliveryMen();
    }//GEN-LAST:event_deliveryMenJComboBoxItemStateChanged

    public void setDeliveryMen() {
        Integer selectedIndex = this.deliveryMenJComboBox.getSelectedIndex();
        if (selectedIndex != -1) {
            this.selectedDeliveryMen = this.onlyDeliveryMens.get(selectedIndex);
        }
    }

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        _getUnAssignedOrders();
        this.ordersJList.setVisible(true);
    }//GEN-LAST:event_addJButtonActionPerformed

    private void ordersJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ordersJListValueChanged
        openSelectedOrder();
        this.jLabel5.setVisible(true);
        this.statusJComboBox.setVisible(true);
        this.addJButton1.setVisible(true);
    }//GEN-LAST:event_ordersJListValueChanged

    private void statusJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_statusJComboBoxItemStateChanged
        //todo
    }//GEN-LAST:event_statusJComboBoxItemStateChanged

    public void openSelectedOrder() {
        Integer selectedOrderIndex = this.ordersJList.getSelectedIndex();
        if (selectedOrderIndex != -1) {
            selectedOrder = this.allReadyToPickUpOrders.get(selectedOrderIndex);
        }
    }

    private void addJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButton1ActionPerformed
        for (int i = 0; i < this.ecosystem.getWorkQueue().getWorkRequestList().size(); i++) {
            WorkRequest ongoing = this.ecosystem.getWorkQueue().getWorkRequestList().get(i);
            if (ongoing instanceof OrderAssignmentRequest) {
                OrderAssignmentRequest onGo = (OrderAssignmentRequest) ongoing;
                System.out.println("!!!!!--->" + onGo.getAssignmentStatus());
                System.out.println("this.statusJComboBox.getSelectedItem().toString()" + this.statusJComboBox.getSelectedItem().toString());
                System.out.println("onGo.getAssignmentId()" + onGo.getAssignmentId());
                System.out.println("this.selectedOrder.getAssignmentId()" + this.selectedOrder.getAssignmentId());
                if (onGo.getAssignmentId() == this.selectedOrder.getAssignmentId()) {
                    onGo.setAssignmentStatus(this.statusJComboBox.getSelectedItem().toString());
                    System.out.println("!!!!!!!" + this.statusJComboBox.getSelectedItem().toString());
                    if (this.statusJComboBox.getSelectedItem().toString() == "DELIVERED") {
                        onGo.setStatus("DELIVERED");
                        for (int j = 0; j < this.ecosystem.getWorkQueue().getWorkRequestList().size(); j++) {
                            WorkRequest ongoing1 = this.ecosystem.getWorkQueue().getWorkRequestList().get(j);
                            if (ongoing1 instanceof OrderDelieveryRequest) {
                                OrderDelieveryRequest toChnage = (OrderDelieveryRequest) ongoing1;
                                if (toChnage.getDeliveryRequestId() == onGo.getAssignmentId()) {
                                    toChnage.setDeliveryStatus("DELIVERED");
                                    toChnage.setStatus("DELIVERED");
                                }
                            } else if (ongoing1 instanceof OrderWorkRequest) {
                                OrderWorkRequest toChnage = (OrderWorkRequest) ongoing1;
                                if (Long.parseLong(toChnage.getOrderRequestStatus()) == onGo.getAssignmentId()) {
                                    toChnage.setOrderRequestStatus("DELIVERED");
                                    toChnage.setStatus("DELIVERED");
                                }
                            }
                        }
                    }
                }
            }
        }
        this.ordersJList.setVisible(false);
        this.jLabel5.setVisible(false);
        this.statusJComboBox.setVisible(false);
        this.addJButton1.setVisible(false);
        setDeliveryMen();
        setDeliveryMen();
    }//GEN-LAST:event_addJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton addJButton1;
    private javax.swing.JComboBox<String> deliveryMenJComboBox;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> ordersJList;
    private javax.swing.JComboBox<String> statusJComboBox;
    // End of variables declaration//GEN-END:variables
}
