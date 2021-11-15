/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderWorkRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
public class OrderCreationJPanel extends javax.swing.JPanel {

    EcoSystem ecosystem;
    UserAccount account;
    JSplitPane jSplitPane;
    Restaurant selectedRestaurant;
    Integer selectedRestaurantIndex;
    UserAccount customer;
    HashMap<String, Double> seletedMenu = new HashMap<String, Double>();
    HashMap<String, Double> selectedMenuList = new HashMap<String, Double>();
    HashMap<HashMap<String, Double>, Integer> orderGenerated = new HashMap<HashMap<String, Double>, Integer>();

    OrderCreationJPanel(EcoSystem ecosystem, UserAccount account, JSplitPane jSplitPane) {
        this.ecosystem = ecosystem;
        this.account = account;
        this.jSplitPane = jSplitPane;
        initComponents();
        restaurnatDetailsJPanel.setVisible(false);
        _getRestaurantList();
        _getCustomerList();
    }

    public void _getCustomerList() {
        ArrayList<String> menuNameDropdown = new ArrayList<>();

        for (int i = 0; i < this.ecosystem.getUserAccountDirectory().getUserAccountList().size(); i++) {
            UserAccount ongoing = this.ecosystem.getUserAccountDirectory().getUserAccountList().get(i);
            if ("Business.Role.CustomerRole".equals(ongoing.getRole().toString())) {
                menuNameDropdown.add(ongoing.getUsername());
            }
        }

        String[] menuSDropdown = menuNameDropdown.toArray(new String[menuNameDropdown.size()]);
        DefaultComboBoxModel<String> brandSDropdownModel = new DefaultComboBoxModel<>(menuSDropdown);
        this.customerJComboBox.setModel(brandSDropdownModel);
    }

    public void _getRestaurantList() {
        DefaultListModel model = new DefaultListModel();
        ArrayList<Restaurant> accountList = this.ecosystem.getRestaurantDirectory().getRestaurantList();
        accountList.forEach(restaurant -> {
            model.addElement(restaurant.getName() + " - " + restaurant.getLocation());
        });
        if (model.isEmpty()) {
            restaurantNameJList.setModel(model);
            JOptionPane.showMessageDialog(this, "No Restaurants Created Yet!!", "View Restaurant Details", ERROR_MESSAGE);
            return;
        }

        restaurantNameJList.setModel(model);
        restaurantNameJList.setSelectedIndex(0);
        openSelectedRestuarant();
        updateMenu();
    }

    private void openSelectedRestuarant() {
        seletedMenu = new HashMap<String, Double>();
        selectedMenuList = new HashMap<String, Double>();
        orderGenerated = new HashMap<HashMap<String, Double>, Integer>();

        DefaultListModel model = new DefaultListModel();
        receiptJList.setModel(model);

        selectedRestaurantIndex = restaurantNameJList.getSelectedIndex();
        totalPriceJLabel.setText("0");
        quantityJField.setText("Enter here");
        ArrayList<Restaurant> restaurantList = this.ecosystem.getRestaurantDirectory().getRestaurantList();
        if (selectedRestaurantIndex != -1) {
            selectedRestaurant = restaurantList.get(selectedRestaurantIndex);
            restaurnatDetailsJPanel.setVisible(true);
            nameJLabel.setText(selectedRestaurant.getName());
            contactJLabel.setText(selectedRestaurant.getContact());
            managerNameJLabel.setText(selectedRestaurant.getManagerUserName());
            selectedMenuList = selectedRestaurant.getMenu();
            _getRestaurantMenuList(selectedRestaurant.getMenu());
        }
    }

    public void _getRestaurantMenuList(HashMap<String, Double> menuList) {
        ArrayList<String> menuNameDropdown = new ArrayList<>();

        for (HashMap.Entry<String, Double> menu : menuList.entrySet()) {
            String key = menu.getKey();
            Object value = menu.getValue();
            menuNameDropdown.add(key + " - " + value + " each");
        }

        String[] menuSDropdown = menuNameDropdown.toArray(new String[menuNameDropdown.size()]);
        DefaultComboBoxModel<String> brandSDropdownModel = new DefaultComboBoxModel<>(menuSDropdown);
        this.menuJComboBox.setModel(brandSDropdownModel);
    }

    public void generateBill() {
        Double net = 0.0;
        DefaultListModel model = new DefaultListModel();
        receiptJList.setModel(model);
        for (HashMap.Entry<HashMap<String, Double>, Integer> order : orderGenerated.entrySet()) {
            HashMap<String, Double> key = order.getKey();
            Integer value = order.getValue();
            String key1 = "";
            Double value1 = 1.0;
            for (HashMap.Entry<String, Double> order2 : key.entrySet()) {
                key1 = order2.getKey();
                value1 = order2.getValue();
            }
            net += value * value1;
            model.addElement(key1 + " - " + value + "quantity * " + value1);
        }
        receiptJList.setModel(model);
        this.totalPriceJLabel.setText(String.valueOf(net));
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
        restaurantNameJList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        restaurnatDetailsJPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contactJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        managerNameJLabel = new javax.swing.JLabel();
        menuJComboBox = new javax.swing.JComboBox<>();
        quantityJField = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        totalPriceJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        receiptJList = new javax.swing.JList<>();
        createJButton = new javax.swing.JButton();
        customerJComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        addressJTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        orderMEssageJTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        restaurantNameJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                restaurantNameJListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(restaurantNameJList);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu List:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Restaurant Lists:");

        restaurnatDetailsJPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Noto Sans Oriya", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(67, 100, 100));
        jLabel5.setText("Name:");

        nameJLabel.setFont(new java.awt.Font("Noto Sans Kannada", 1, 14)); // NOI18N
        nameJLabel.setForeground(new java.awt.Color(67, 100, 100));
        nameJLabel.setText("Select a restaurant!");

        jLabel6.setFont(new java.awt.Font("Noto Sans Oriya", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(67, 100, 100));
        jLabel6.setText("Contact No.:");

        contactJLabel.setFont(new java.awt.Font("Noto Sans Kannada", 1, 14)); // NOI18N
        contactJLabel.setForeground(new java.awt.Color(67, 100, 100));
        contactJLabel.setText("Select a restaurant!");

        jLabel7.setFont(new java.awt.Font("Noto Sans Oriya", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(67, 100, 100));
        jLabel7.setText("Manager Name:");

        managerNameJLabel.setFont(new java.awt.Font("Noto Sans Kannada", 1, 14)); // NOI18N
        managerNameJLabel.setForeground(new java.awt.Color(67, 100, 100));
        managerNameJLabel.setText("Select a restaurant!");

        javax.swing.GroupLayout restaurnatDetailsJPanelLayout = new javax.swing.GroupLayout(restaurnatDetailsJPanel);
        restaurnatDetailsJPanel.setLayout(restaurnatDetailsJPanelLayout);
        restaurnatDetailsJPanelLayout.setHorizontalGroup(
            restaurnatDetailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurnatDetailsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(restaurnatDetailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(restaurnatDetailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameJLabel)
                    .addComponent(contactJLabel)
                    .addComponent(managerNameJLabel))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        restaurnatDetailsJPanelLayout.setVerticalGroup(
            restaurnatDetailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurnatDetailsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(restaurnatDetailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(restaurnatDetailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(contactJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(restaurnatDetailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(managerNameJLabel))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        menuJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                menuJComboBoxItemStateChanged(evt);
            }
        });

        quantityJField.setBackground(new java.awt.Color(238, 238, 238));
        quantityJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        quantityJField.setText("Enter here");
        quantityJField.setToolTipText("Click to enter your name.");
        quantityJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        quantityJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantityJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityJFieldnameChangeHandler(evt);
            }
        });
        quantityJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityJFieldActionPerformed(evt);
            }
        });

        addJButton.setBackground(new java.awt.Color(200, 203, 178));
        addJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addJButton.setForeground(new java.awt.Color(67, 100, 100));
        addJButton.setText("ADD");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        totalPriceJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        totalPriceJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPriceJLabel.setText("0");

        jLabel3.setText("Total:");

        jScrollPane2.setViewportView(receiptJList);

        createJButton.setBackground(new java.awt.Color(200, 203, 178));
        createJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        createJButton.setForeground(new java.awt.Color(67, 100, 100));
        createJButton.setText("CREATE");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

        customerJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customerJComboBoxItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Select a customer:");

        addressJTextArea.setColumns(20);
        addressJTextArea.setRows(5);
        jScrollPane3.setViewportView(addressJTextArea);

        jLabel8.setText("Address:");

        jLabel9.setText("Order Message");

        orderMEssageJTextArea.setColumns(20);
        orderMEssageJTextArea.setRows(5);
        jScrollPane4.setViewportView(orderMEssageJTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(menuJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1)
                                .addComponent(customerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(quantityJField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(addJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(restaurnatDetailsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(totalPriceJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(createJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menuJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityJField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(restaurnatDetailsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(totalPriceJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void restaurantNameJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_restaurantNameJListValueChanged
        openSelectedRestuarant();
    }//GEN-LAST:event_restaurantNameJListValueChanged

    private void quantityJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityJFieldFocusGained
        if (quantityJField.getText().equals("Enter here")) {
            quantityJField.setText("");
        }
    }//GEN-LAST:event_quantityJFieldFocusGained

    private void quantityJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityJFieldnameChangeHandler

    private void quantityJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityJFieldActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        this.orderGenerated.put(seletedMenu, Integer.valueOf(this.quantityJField.getText()));
        generateBill();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void menuJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_menuJComboBoxItemStateChanged
        updateMenu();
    }//GEN-LAST:event_menuJComboBoxItemStateChanged

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        Long uniqueId = Long.parseLong(generateId());
        OrderWorkRequest createNewOrder = new OrderWorkRequest(
                this.addressJTextArea.getText(),
                customer,
                this.orderGenerated,
                this.selectedRestaurant,
                "Should be written by Customer",
                "INPROGRESS",
                new Date(),
                uniqueId,
                this.account,
                this.selectedRestaurant,
                this.orderMEssageJTextArea.getText(),
                new Date(),
                "UNASSIGNED"
        );
        this.ecosystem.getWorkQueue().getWorkRequestList().add(createNewOrder);
        JOptionPane.showMessageDialog(this, "Order Created Successfully!!", "Create Order By Admin", INFORMATION_MESSAGE);
        this.orderMEssageJTextArea.setText("");
        this.addressJTextArea.setText("");
        this.quantityJField.setText("Enter here");
        DefaultListModel model = new DefaultListModel();
        receiptJList.setModel(model);
    }//GEN-LAST:event_createJButtonActionPerformed

    public String generateId() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
        String datetime = ft.format(dNow);
        return datetime;
    }

    private void customerJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customerJComboBoxItemStateChanged
        customer = this.ecosystem.getUserAccountDirectory().getAccountBasedOnUsername("Business.Role.CustomerRole", this.customerJComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_customerJComboBoxItemStateChanged

    public void updateMenu() {
        String selectedObject = this.menuJComboBox.getSelectedItem().toString();
        seletedMenu = new HashMap<String, Double>();
        for (HashMap.Entry<String, Double> menu : selectedMenuList.entrySet()) {
            String key = menu.getKey();
            Double value = menu.getValue();
            if ((key + " - " + value + " each").equals(selectedObject)) {
                seletedMenu.put(key, value);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JTextArea addressJTextArea;
    private javax.swing.JLabel contactJLabel;
    private javax.swing.JButton createJButton;
    private javax.swing.JComboBox<String> customerJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel managerNameJLabel;
    private javax.swing.JComboBox<String> menuJComboBox;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextArea orderMEssageJTextArea;
    private javax.swing.JTextField quantityJField;
    private javax.swing.JList<String> receiptJList;
    private javax.swing.JList<String> restaurantNameJList;
    private javax.swing.JPanel restaurnatDetailsJPanel;
    private javax.swing.JLabel totalPriceJLabel;
    // End of variables declaration//GEN-END:variables
}
