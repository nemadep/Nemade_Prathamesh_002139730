/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
public class CreateRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateRestaurantJPanel
     */
    EcoSystem ecosystem;
    UserAccount account;
    JSplitPane jSplitPane;
    private HashMap<String, Double> menu = new HashMap<String, Double>();

    public CreateRestaurantJPanel(EcoSystem ecosystem, UserAccount account, JSplitPane jSplitPane) {
        this.ecosystem = ecosystem;
        this.account = account;
        this.jSplitPane = jSplitPane;
        initComponents();
        generateManagerDropdown();
    }

    public void generateManagerDropdown() {
        ArrayList<String> managerNameDropdown = new ArrayList<>();

        this.ecosystem.getUserAccountDirectory().getUserAccountList().stream().filter(user -> ("Business.Role.AdminRole".equals(user.getRole().toString()))).forEachOrdered(user -> {
            Boolean found = false;
            for (int i = 0; i < this.ecosystem.getRestaurantDirectory().getRestaurantList().size(); i++) {
                Restaurant ongoing = this.ecosystem.getRestaurantDirectory().getRestaurantList().get(i);
                if (ongoing.getManagerUserName().toString().equals(user.getUsername().toString())) {
                    found = true;
                }
            }
            if (!found) {
                managerNameDropdown.add(user.getUsername());
            }
        });
        String[] managerSDropdown = managerNameDropdown.toArray(new String[managerNameDropdown.size()]);
        DefaultComboBoxModel<String> brandSDropdownModel = new DefaultComboBoxModel<>(managerSDropdown);
        this.managerJComboBox.setModel(brandSDropdownModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serialNoJLabel = new javax.swing.JLabel();
        restaurantNameJField = new javax.swing.JTextField();
        modelNoJLabel = new javax.swing.JLabel();
        managerJComboBox = new javax.swing.JComboBox<>();
        serialNoJLabel1 = new javax.swing.JLabel();
        menuNameJField = new javax.swing.JTextField();
        menuPriceJField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        serialNoJLabel2 = new javax.swing.JLabel();
        contactNoJField = new javax.swing.JTextField();
        serialNoJLabel3 = new javax.swing.JLabel();
        locationJField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        serialNoJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        serialNoJLabel.setForeground(new java.awt.Color(67, 100, 100));
        serialNoJLabel.setText("Restaurant Name (*):");

        restaurantNameJField.setBackground(new java.awt.Color(238, 238, 238));
        restaurantNameJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        restaurantNameJField.setText("Enter here");
        restaurantNameJField.setToolTipText("Click to enter your name.");
        restaurantNameJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        restaurantNameJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                restaurantNameJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                restaurantNameJFieldnameChangeHandler(evt);
            }
        });
        restaurantNameJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantNameJFieldActionPerformed(evt);
            }
        });

        modelNoJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        modelNoJLabel.setForeground(new java.awt.Color(67, 100, 100));
        modelNoJLabel.setText("Select Manager. (*):");

        serialNoJLabel1.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        serialNoJLabel1.setForeground(new java.awt.Color(67, 100, 100));
        serialNoJLabel1.setText("Add Menu(*):");

        menuNameJField.setBackground(new java.awt.Color(238, 238, 238));
        menuNameJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        menuNameJField.setText("Enter here");
        menuNameJField.setToolTipText("Click to enter your name.");
        menuNameJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        menuNameJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                menuNameJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                menuNameJFieldnameChangeHandler(evt);
            }
        });
        menuNameJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNameJFieldActionPerformed(evt);
            }
        });

        menuPriceJField.setBackground(new java.awt.Color(238, 238, 238));
        menuPriceJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        menuPriceJField.setText("Enter here");
        menuPriceJField.setToolTipText("Click to enter your name.");
        menuPriceJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        menuPriceJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                menuPriceJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                menuPriceJFieldnameChangeHandler(evt);
            }
        });
        menuPriceJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPriceJFieldActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(200, 203, 178));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(67, 100, 100));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(200, 203, 178));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(67, 100, 100));
        jButton2.setText("CREATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        serialNoJLabel2.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        serialNoJLabel2.setForeground(new java.awt.Color(67, 100, 100));
        serialNoJLabel2.setText("Contact No. (*):");

        contactNoJField.setBackground(new java.awt.Color(238, 238, 238));
        contactNoJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        contactNoJField.setText("Enter here");
        contactNoJField.setToolTipText("Click to enter your name.");
        contactNoJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        contactNoJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactNoJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactNoJFieldnameChangeHandler(evt);
            }
        });
        contactNoJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNoJFieldActionPerformed(evt);
            }
        });

        serialNoJLabel3.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        serialNoJLabel3.setForeground(new java.awt.Color(67, 100, 100));
        serialNoJLabel3.setText("Location (*):");

        locationJField.setBackground(new java.awt.Color(238, 238, 238));
        locationJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        locationJField.setText("Enter here");
        locationJField.setToolTipText("Click to enter your name.");
        locationJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        locationJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                locationJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                locationJFieldnameChangeHandler(evt);
            }
        });
        locationJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationJFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serialNoJLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serialNoJLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serialNoJLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modelNoJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serialNoJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuNameJField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menuPriceJField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(managerJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restaurantNameJField, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactNoJField)
                    .addComponent(locationJField))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restaurantNameJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialNoJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelNoJLabel)
                    .addComponent(managerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNoJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialNoJLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialNoJLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuNameJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialNoJLabel1)
                    .addComponent(menuPriceJField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void restaurantNameJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_restaurantNameJFieldFocusGained
        if (restaurantNameJField.getText().equals("Enter here")) {
            restaurantNameJField.setText("");
        }
    }//GEN-LAST:event_restaurantNameJFieldFocusGained

    private void restaurantNameJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_restaurantNameJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_restaurantNameJFieldnameChangeHandler

    private void restaurantNameJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantNameJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restaurantNameJFieldActionPerformed

    private void menuNameJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuNameJFieldFocusGained
        if (menuNameJField.getText().equals("Enter here")) {
            menuNameJField.setText("");
        }
    }//GEN-LAST:event_menuNameJFieldFocusGained

    private void menuNameJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuNameJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_menuNameJFieldnameChangeHandler

    private void menuNameJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNameJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuNameJFieldActionPerformed

    private void menuPriceJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuPriceJFieldFocusGained
        if (menuPriceJField.getText().equals("Enter here")) {
            menuPriceJField.setText("");
        }
    }//GEN-LAST:event_menuPriceJFieldFocusGained

    private void menuPriceJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menuPriceJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPriceJFieldnameChangeHandler

    private void menuPriceJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPriceJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPriceJFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Boolean valid = validateMenuEntry();
        if (valid) {
            this.menu.put(this.menuNameJField.getText(), Double.parseDouble(this.menuPriceJField.getText()));
            generateList();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean validateMenuEntry() {
        RestaurantDirectory dummy = this.ecosystem.getRestaurantDirectory();
        String errorMessage = "";
        String errorName = dummy.validateName(this.menuNameJField.getText());
        String errorPrice = dummy.validatePrice(this.menuPriceJField.getText());
        errorMessage += errorName;
        errorMessage += errorPrice;

        if (errorMessage.equals("")) {
            return true;
        }
        JOptionPane.showMessageDialog(this, errorMessage, "Create Restaurant", ERROR_MESSAGE);
        return false;
    }

    public void generateList() {
        DefaultListModel model = new DefaultListModel();
        jList1.setModel(model);
        for (Iterator<Map.Entry<String, Double>> it = this.menu.entrySet().iterator(); it.hasNext();) {
            HashMap.Entry<String, Double> set = it.next();
            model.addElement(set.getKey() + " - " + set.getValue());
        }
        jList1.setModel(model);
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Boolean isValid = validateRestaurantDetails();
        if (isValid) {
            Restaurant createRestaurant = this.ecosystem.getRestaurantDirectory().createrestaurant(this.restaurantNameJField.getText(),
                    this.managerJComboBox.getSelectedItem().toString(), this.menu, this.locationJField.getText(), this.contactNoJField.getText());

            JOptionPane.showMessageDialog(this, "Restaurant created successfully!!", "Create Restaurant", INFORMATION_MESSAGE);
            resetMe();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void resetMe() {
        this.restaurantNameJField.setText("Enter here");
        this.contactNoJField.setText("Enter here");
        this.locationJField.setText("Enter here");
        this.menuNameJField.setText("Enter here");
        this.menuPriceJField.setText("Enter here");
        this.menu = new HashMap<String, Double>();
        this.generateList();
        this.generateManagerDropdown();
    }

    private void contactNoJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactNoJFieldFocusGained
        if (contactNoJField.getText().equals("Enter here")) {
            contactNoJField.setText("");
        }
    }//GEN-LAST:event_contactNoJFieldFocusGained

    private void contactNoJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactNoJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNoJFieldnameChangeHandler

    private void contactNoJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNoJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNoJFieldActionPerformed

    private void locationJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_locationJFieldFocusGained
        if (locationJField.getText().equals("Enter here")) {
            locationJField.setText("");
        }
    }//GEN-LAST:event_locationJFieldFocusGained

    private void locationJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_locationJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_locationJFieldnameChangeHandler

    private void locationJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationJFieldActionPerformed

    public Boolean validateRestaurantDetails() {
        System.out.println("this.managerJComboBox.getSelectedItem()" + this.managerJComboBox.getSelectedItem());
        String errorMessage = "";
        Restaurant dummy = new Restaurant();
        String errorName = dummy.validateName(this.restaurantNameJField.getText());
        String errorManagerName = dummy.validateManagerName(this.managerJComboBox.getSelectedItem() == null ? "" : this.managerJComboBox.getSelectedItem().toString());
        String errorContact = dummy.validateContact(this.contactNoJField.getText());
        String errorLocation = dummy.validateLocationName(this.locationJField.getText());
        if (this.menu.size() == 0) {
            errorMessage += "Please add a menu! \n";
        }
        errorMessage += errorName;
        errorMessage += errorManagerName;
        errorMessage += errorContact;
        errorMessage += errorLocation;
        dummy.validateContact(errorMessage);
        if (errorMessage.equals("")) {
            return true;
        }
        JOptionPane.showMessageDialog(this, errorMessage, "Create Restaurant", ERROR_MESSAGE);
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contactNoJField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locationJField;
    private javax.swing.JComboBox<String> managerJComboBox;
    private javax.swing.JTextField menuNameJField;
    private javax.swing.JTextField menuPriceJField;
    private javax.swing.JLabel modelNoJLabel;
    private javax.swing.JTextField restaurantNameJField;
    private javax.swing.JLabel serialNoJLabel;
    private javax.swing.JLabel serialNoJLabel1;
    private javax.swing.JLabel serialNoJLabel2;
    private javax.swing.JLabel serialNoJLabel3;
    // End of variables declaration//GEN-END:variables
}