/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderAssignmentRequest;
import Business.WorkQueue.OrderDelieveryRequest;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JSplitPane;

/**
 *
 * @author prathameshnemade
 */
public class RestaurantAssignOrdersJPanel extends javax.swing.JPanel {

    EcoSystem system;
    UserAccount account;
    JSplitPane jSplitPane;
    OrderWorkRequest selectedWorkRequest;
    Integer selectedIndex;
    UserAccount selectedDel;
    ArrayList<OrderWorkRequest> unAssignedRequests = new ArrayList<OrderWorkRequest>();
    ArrayList<UserAccount> deliverMenList = new ArrayList<UserAccount>();

    RestaurantAssignOrdersJPanel(EcoSystem system, UserAccount account, JSplitPane jSplitPane) {
        this.system = system;
        this.account = account;
        this.jSplitPane = jSplitPane;
        initComponents();
        _getDeliveryManList();
        _getUnAssignedOrders();
        _getSelectedDelivery();
    }

    public void _getUnAssignedOrders() {
        DefaultListModel model = new DefaultListModel();
        this.ordersJList.setModel(model);

        for (int i = 0; i < this.system.getWorkQueue().getWorkRequestList().size(); i++) {
            WorkRequest ongoing = this.system.getWorkQueue().getWorkRequestList().get(i);
            if (ongoing instanceof OrderWorkRequest) {
                OrderWorkRequest onGo = (OrderWorkRequest) ongoing;
                if (onGo.getSender().getManagerUserName().toString().equals(this.account.getUsername().toString()) && onGo.getOrderRequestStatus().toString().equals("READYFORPICKUP")) {
                    String resName = ongoing.getSender().getName();
                    Long resWorkId = ((OrderWorkRequest) ongoing).getOrderWorkRequestId();
                    model.addElement(String.valueOf(resWorkId) + " - " + resName);
                    unAssignedRequests.add((OrderWorkRequest) ongoing);
                }
            }
        }
        this.ordersJList.setModel(model);
    }

    public void openSelectedOrder() {
        selectedIndex = this.deleiveryManJComboBox.getSelectedIndex();
        if (selectedIndex != -1) {
            this.selectedWorkRequest = unAssignedRequests.get(selectedIndex);
        }
    }

    public void _getSelectedDelivery() {
        Integer selectedDelIndex = this.deleiveryManJComboBox.getSelectedIndex();
        if (selectedDelIndex != -1) {
            this.selectedDel = this.deliverMenList.get(selectedDelIndex);
        }
    }

    public void _getDeliveryManList() {
        ArrayList<String> menuNameDropdown = new ArrayList<>();

        for (int i = 0; i < this.system.getUserAccountDirectory().getUserAccountList().size(); i++) {
            UserAccount ongoing = this.system.getUserAccountDirectory().getUserAccountList().get(i);
            if ("Business.Role.DeliverManRole".equals(ongoing.getRole().toString())) {
                deliverMenList.add(ongoing);
                menuNameDropdown.add(ongoing.getUsername());
            }
        }

        String[] menuSDropdown = menuNameDropdown.toArray(new String[menuNameDropdown.size()]);
        DefaultComboBoxModel<String> brandSDropdownModel = new DefaultComboBoxModel<>(menuSDropdown);
        this.deleiveryManJComboBox.setModel(brandSDropdownModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleiveryManJComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordersJList = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        orderMEssageJTextArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bagsJField = new javax.swing.JTextField();
        yesJCheckBox = new javax.swing.JCheckBox();
        noJCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bikeNoJField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        deleiveryManJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deleiveryManJComboBoxItemStateChanged(evt);
            }
        });
        deleiveryManJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleiveryManJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Orders UNASSIGNED:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Delivery Men:");

        addJButton.setBackground(new java.awt.Color(200, 203, 178));
        addJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addJButton.setForeground(new java.awt.Color(67, 100, 100));
        addJButton.setText("ASSIGN");
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

        orderMEssageJTextArea.setColumns(20);
        orderMEssageJTextArea.setRows(5);
        jScrollPane4.setViewportView(orderMEssageJTextArea);

        jLabel9.setText("Order Message");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Bags:");

        bagsJField.setBackground(new java.awt.Color(238, 238, 238));
        bagsJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bagsJField.setText("Enter here");
        bagsJField.setToolTipText("Click to enter your name.");
        bagsJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        bagsJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bagsJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bagsJFieldnameChangeHandler(evt);
            }
        });
        bagsJField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                bagsJFieldInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        bagsJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagsJFieldActionPerformed(evt);
            }
        });

        yesJCheckBox.setSelected(true);
        yesJCheckBox.setText("Yes");
        yesJCheckBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yesJCheckBoxFocusGained(evt);
            }
        });

        noJCheckBox.setText("No");
        noJCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                noJCheckBoxItemStateChanged(evt);
            }
        });
        noJCheckBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                noJCheckBoxFocusGained(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Is Fragile?");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bike No.?");

        bikeNoJField.setBackground(new java.awt.Color(238, 238, 238));
        bikeNoJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bikeNoJField.setText("Enter here");
        bikeNoJField.setToolTipText("Click to enter your name.");
        bikeNoJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        bikeNoJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bikeNoJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bikeNoJFieldnameChangeHandler(evt);
            }
        });
        bikeNoJField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                bikeNoJFieldInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        bikeNoJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bikeNoJFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleiveryManJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bagsJField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yesJCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(noJCheckBox))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bikeNoJField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleiveryManJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bagsJField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yesJCheckBox)
                            .addComponent(noJCheckBox))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(bikeNoJField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleiveryManJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deleiveryManJComboBoxItemStateChanged
        _getSelectedDelivery();
    }//GEN-LAST:event_deleiveryManJComboBoxItemStateChanged

    private void deleiveryManJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleiveryManJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleiveryManJComboBoxActionPerformed

    public Boolean validAssignment() {
        String errorMessage = "";

        if (this.selectedWorkRequest == null) {
            errorMessage += "Select an order to allocate a delivery person! \n";
        }
        if (this.selectedDel == null) {
            errorMessage += "Select a delivery person! \n";
        }
        if (!this.bagsJField.getText().matches("[0-9]+")) {
            errorMessage += "Enter no. of Bags! \n";
        }
        if (!this.bikeNoJField.getText().matches("[A-Z]{1,3}-[A-Z]{1,2}-[0-9]{1,4}")) {
            errorMessage += "Inavlid Number plate! \n";
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
            for (int i = 0; i < this.system.getWorkQueue().getWorkRequestList().size(); i++) {
                WorkRequest ongoing = this.system.getWorkQueue().getWorkRequestList().get(i);
                if (ongoing instanceof OrderWorkRequest) {
                    OrderWorkRequest onGo = (OrderWorkRequest) ongoing;
                    if (onGo == selectedWorkRequest) {
                        onGo.setOrderRequestStatus("ASSIGNED");
                        OrderAssignmentRequest orderAssignment = null;
                        for (int j = 0; j < this.system.getWorkQueue().getWorkRequestList().size(); j++) {
                            WorkRequest on = this.system.getWorkQueue().getWorkRequestList().get(j);
                            if (on instanceof OrderAssignmentRequest) {
                                String orderAssignmentId = String.valueOf(((OrderAssignmentRequest) on).getAssignmentId());
                                String orderWorkId = String.valueOf(onGo.getOrderWorkRequestId());
                                if (orderAssignmentId.equals(orderWorkId)) {
                                    orderAssignment = (OrderAssignmentRequest) on;
                                }
                            }
                        }

                        System.out.println("********orderAssignment*******");
                        System.out.println(onGo.getAddress());
                        System.out.println(onGo.getReceiver());
                        System.out.println(onGo.getOrderedMenu());
                        System.out.println(onGo.getSender());
                        System.out.println(onGo.getMessage());
                        System.out.println(onGo.getRequestDate());
                        System.out.println(this.selectedDel);
                        System.out.println(onGo.getOrderWorkRequestId());
                        System.out.println("***********");

                        orderAssignment.setAddress(onGo.getAddress());
                        orderAssignment.setReceiver(onGo.getReceiver());
                        orderAssignment.setOrderedMenu(onGo.getOrderedMenu());
                        orderAssignment.setSender(onGo.getSender());
                        orderAssignment.setMessage(onGo.getMessage());
                        orderAssignment.setStatus("ASSIGNED");//change to on the way to delivery
                        orderAssignment.setRequestDate(onGo.getRequestDate());
                        orderAssignment.setAssignmentTo(this.selectedDel);
                        orderAssignment.setOrderAssignmentAt(new Date());
                        orderAssignment.setAssignmentComments(this.orderMEssageJTextArea.getText());
                        orderAssignment.setAssignmentStatus("READYFORPICKUP");
                        orderAssignment.setNoOfBags(Integer.valueOf(this.bagsJField.getText()));
                        orderAssignment.setIsfragilePackage(this.yesJCheckBox.isSelected());
                        orderAssignment.setAssignmentId(onGo.getOrderWorkRequestId());

                        OrderDelieveryRequest newDelievery = null;
                        for (int j = 0; j < this.system.getWorkQueue().getWorkRequestList().size(); j++) {
                            WorkRequest on = this.system.getWorkQueue().getWorkRequestList().get(j);
                            if (on instanceof OrderDelieveryRequest) {
                                String orderAssignmentId = String.valueOf(((OrderDelieveryRequest) on).getDeliveryRequestId());
                                String orderWorkId = String.valueOf(onGo.getOrderWorkRequestId());
                                if (orderAssignmentId.toString().equals(orderWorkId.toString())) {
                                    newDelievery = (OrderDelieveryRequest) on;
                                    on.setAddress(onGo.getAddress());
                                    on.setReceiver(onGo.getReceiver());
                                    on.setOrderedMenu(onGo.getOrderedMenu());
                                    on.setSender(onGo.getSender());
                                    on.setMessage(onGo.getMessage());
                                    on.setStatus("ASSIGNED");
                                    on.setRequestDate(onGo.getRequestDate());
                                    ((OrderDelieveryRequest) on).setDeliveryStatus("NOTPICKED");
                                    ((OrderDelieveryRequest) on).setBikeNo(this.bikeNoJField.getText());
                                    ((OrderDelieveryRequest) on).setPickupTime(new Date());
                                    ((OrderDelieveryRequest) on).setDeliveryTime(null);
                                    ((OrderDelieveryRequest) on).setDeliveredBy(this.selectedDel);
                                    ((OrderDelieveryRequest) on).setDeliveryStatus(String.valueOf(onGo.getOrderWorkRequestId()));
                                }
                            } else if (on instanceof OrderWorkRequest) {
                                String wordOrderId = String.valueOf(((OrderWorkRequest) on).getOrderWorkRequestId());
                                String orderWorkId = String.valueOf(onGo.getOrderWorkRequestId());
                                if (wordOrderId.toString().equals(orderWorkId.toString())) {
                                    on.setStatus("ASSIGNED");
                                }
                            }
                        }

                        if (newDelievery == null) {
                            newDelievery = new OrderDelieveryRequest(
                                    onGo.getAddress(),
                                    onGo.getReceiver(),
                                    onGo.getOrderedMenu(),
                                    onGo.getSender(),
                                    onGo.getMessage(),
                                    "ASSIGNED",
                                    onGo.getRequestDate(),
                                    "NOTPICKED",//delivery status
                                    this.bikeNoJField.getText(),
                                    new Date(),
                                    null,
                                    this.selectedDel,
                                    onGo.getOrderWorkRequestId()
                            );

                            this.system.getWorkQueue().getWorkRequestList().add(newDelievery);
                        }

                        JOptionPane.showMessageDialog(this, "Order Assigned Successfully!", "Order Assignment Details", INFORMATION_MESSAGE);
                    }
                }
            }
            _getUnAssignedOrders();
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void ordersJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ordersJListValueChanged
        openSelectedOrder();
        this.jLabel2.setVisible(true);
        this.deleiveryManJComboBox.setVisible(true);
        this.jLabel3.setVisible(true);
        this.bagsJField.setVisible(true);
        this.jLabel4.setVisible(true);
        this.yesJCheckBox.setVisible(true);
        this.noJCheckBox.setVisible(true);
        this.jLabel9.setVisible(true);
        this.orderMEssageJTextArea.setVisible(true);
        this.addJButton.setVisible(true);
    }//GEN-LAST:event_ordersJListValueChanged

    private void bagsJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bagsJFieldFocusGained
        if (bagsJField.getText().equals("Enter here")) {
            bagsJField.setText("");
        }
    }//GEN-LAST:event_bagsJFieldFocusGained

    private void bagsJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bagsJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_bagsJFieldnameChangeHandler

    private void bagsJFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_bagsJFieldInputMethodTextChanged

    }//GEN-LAST:event_bagsJFieldInputMethodTextChanged

    private void bagsJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagsJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bagsJFieldActionPerformed

    private void yesJCheckBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yesJCheckBoxFocusGained
        this.noJCheckBox.setSelected(false);

    }//GEN-LAST:event_yesJCheckBoxFocusGained

    private void noJCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_noJCheckBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_noJCheckBoxItemStateChanged

    private void noJCheckBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noJCheckBoxFocusGained
        this.yesJCheckBox.setSelected(false);
    }//GEN-LAST:event_noJCheckBoxFocusGained

    private void bikeNoJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bikeNoJFieldFocusGained
        if (bikeNoJField.getText().equals("Enter here")) {
            bikeNoJField.setText("");
        }
    }//GEN-LAST:event_bikeNoJFieldFocusGained

    private void bikeNoJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bikeNoJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_bikeNoJFieldnameChangeHandler

    private void bikeNoJFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_bikeNoJFieldInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_bikeNoJFieldInputMethodTextChanged

    private void bikeNoJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bikeNoJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bikeNoJFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JTextField bagsJField;
    private javax.swing.JTextField bikeNoJField;
    private javax.swing.JComboBox<String> deleiveryManJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JCheckBox noJCheckBox;
    private javax.swing.JTextArea orderMEssageJTextArea;
    private javax.swing.JList<String> ordersJList;
    private javax.swing.JCheckBox yesJCheckBox;
    // End of variables declaration//GEN-END:variables
}
