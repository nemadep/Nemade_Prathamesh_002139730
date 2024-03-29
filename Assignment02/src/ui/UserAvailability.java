/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import classes.Car;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author prathameshnemade
 */
public class UserAvailability extends javax.swing.JPanel {

    Car dummy = new Car();
    String[] columns = {
        "Id",
        "Available From - To",
        "Brand",
        "Manufacture Year",
        "Seats",
        "Available Seats",
        "Serial No.",
        "Model No.",
        "Manufacturer",
        "City",
        "Expiry Date"
    };

    /**
     * Creates new form UserAvailability
     */
    public UserAvailability() {
        initComponents();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                columns
        ));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        availableFromJLabel = new javax.swing.JLabel();
        availableFromHHJField = new javax.swing.JTextField();
        dummyJField4 = new javax.swing.JTextField();
        availableFromMMJField = new javax.swing.JTextField();
        availableFromAMJCheckBox = new javax.swing.JCheckBox();
        availableFromPMJCheckBox = new javax.swing.JCheckBox();
        availableTillJLabel = new javax.swing.JLabel();
        availableTillHHJField = new javax.swing.JTextField();
        dummyJField7 = new javax.swing.JTextField();
        availableTillMMJField = new javax.swing.JTextField();
        availableTillAMJCheckBox = new javax.swing.JCheckBox();
        availableTillPMJCheckBox = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        availableJCheckBox = new javax.swing.JCheckBox();
        notAvailableJCheckBox = new javax.swing.JCheckBox();
        firstJCheckBox = new javax.swing.JCheckBox();
        allJCheckBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        availableFromJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        availableFromJLabel.setForeground(new java.awt.Color(67, 100, 100));
        availableFromJLabel.setText("Available From:");

        availableFromHHJField.setBackground(new java.awt.Color(238, 238, 238));
        availableFromHHJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        availableFromHHJField.setText("HH");
        availableFromHHJField.setToolTipText("Enter date of birth here.");
        availableFromHHJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        availableFromHHJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                availableFromHHJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                availableFromHHJFielddateOfBirthFocusLost(evt);
            }
        });
        availableFromHHJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableFromHHJFieldActionPerformed(evt);
            }
        });

        dummyJField4.setEditable(false);
        dummyJField4.setBackground(new java.awt.Color(216, 220, 228));
        dummyJField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField4.setText(":");
        dummyJField4.setToolTipText("");
        dummyJField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField4ActionPerformed(evt);
            }
        });

        availableFromMMJField.setBackground(new java.awt.Color(238, 238, 238));
        availableFromMMJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        availableFromMMJField.setText("MM");
        availableFromMMJField.setToolTipText("Enter date of birth here.");
        availableFromMMJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        availableFromMMJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                availableFromMMJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                availableFromMMJFielddateOfBirthFocusLost(evt);
            }
        });
        availableFromMMJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableFromMMJFieldActionPerformed(evt);
            }
        });

        availableFromAMJCheckBox.setSelected(true);
        availableFromAMJCheckBox.setText("AM");
        availableFromAMJCheckBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                availableFromAMJCheckBoxFocusGained(evt);
            }
        });

        availableFromPMJCheckBox.setText("PM");
        availableFromPMJCheckBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                availableFromPMJCheckBoxFocusGained(evt);
            }
        });

        availableTillJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        availableTillJLabel.setForeground(new java.awt.Color(67, 100, 100));
        availableTillJLabel.setText("Available Till:");

        availableTillHHJField.setBackground(new java.awt.Color(238, 238, 238));
        availableTillHHJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        availableTillHHJField.setText("HH");
        availableTillHHJField.setToolTipText("Enter date of birth here.");
        availableTillHHJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        availableTillHHJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                availableTillHHJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                availableTillHHJFielddateOfBirthFocusLost(evt);
            }
        });
        availableTillHHJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableTillHHJFieldActionPerformed(evt);
            }
        });

        dummyJField7.setEditable(false);
        dummyJField7.setBackground(new java.awt.Color(216, 220, 228));
        dummyJField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField7.setText(":");
        dummyJField7.setToolTipText("");
        dummyJField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField7ActionPerformed(evt);
            }
        });

        availableTillMMJField.setBackground(new java.awt.Color(238, 238, 238));
        availableTillMMJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        availableTillMMJField.setText("MM");
        availableTillMMJField.setToolTipText("Enter date of birth here.");
        availableTillMMJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        availableTillMMJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                availableTillMMJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                availableTillMMJFielddateOfBirthFocusLost(evt);
            }
        });
        availableTillMMJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableTillMMJFieldActionPerformed(evt);
            }
        });

        availableTillAMJCheckBox.setSelected(true);
        availableTillAMJCheckBox.setText("AM");
        availableTillAMJCheckBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                availableTillAMJCheckBoxFocusGained(evt);
            }
        });

        availableTillPMJCheckBox.setText("PM");
        availableTillPMJCheckBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                availableTillPMJCheckBoxFocusGained(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(200, 203, 178));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(67, 100, 100));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        availableJCheckBox.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        availableJCheckBox.setForeground(new java.awt.Color(67, 100, 100));
        availableJCheckBox.setSelected(true);
        availableJCheckBox.setText("Available");
        availableJCheckBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                availableJCheckBoxFocusGained(evt);
            }
        });

        notAvailableJCheckBox.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        notAvailableJCheckBox.setForeground(new java.awt.Color(67, 100, 100));
        notAvailableJCheckBox.setText("Not Available");
        notAvailableJCheckBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                notAvailableJCheckBoxFocusGained(evt);
            }
        });

        firstJCheckBox.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        firstJCheckBox.setForeground(new java.awt.Color(67, 100, 100));
        firstJCheckBox.setSelected(true);
        firstJCheckBox.setText("First Car");
        firstJCheckBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstJCheckBoxFocusGained(evt);
            }
        });

        allJCheckBox.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        allJCheckBox.setForeground(new java.awt.Color(67, 100, 100));
        allJCheckBox.setText("All Cars");
        allJCheckBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                allJCheckBoxFocusGained(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        jTable1.setForeground(new java.awt.Color(1, 1, 1));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel1.setText("Filter Car Records based on Available From and Available Till time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(availableFromJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(availableTillJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(availableFromHHJField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dummyJField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(availableFromMMJField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(availableFromAMJCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(availableFromPMJCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(availableTillHHJField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dummyJField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(availableTillMMJField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(availableTillAMJCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(availableTillPMJCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstJCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(allJCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(availableJCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(notAvailableJCheckBox))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton1))
                    .addComponent(jLabel1))
                .addContainerGap(273, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(availableFromHHJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dummyJField4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(availableFromMMJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(availableFromJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availableFromAMJCheckBox)
                            .addComponent(availableFromPMJCheckBox))
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availableTillJLabel)
                    .addComponent(availableTillHHJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dummyJField7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableTillMMJField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableTillAMJCheckBox)
                    .addComponent(availableTillPMJCheckBox))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availableJCheckBox)
                    .addComponent(notAvailableJCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstJCheckBox)
                    .addComponent(allJCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void availableFromHHJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableFromHHJFieldFocusGained
        if (availableFromHHJField.getText().equals("HH")) {
            availableFromHHJField.setText("");
        }
    }//GEN-LAST:event_availableFromHHJFieldFocusGained

    private void availableFromHHJFielddateOfBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableFromHHJFielddateOfBirthFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_availableFromHHJFielddateOfBirthFocusLost

    private void availableFromHHJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableFromHHJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableFromHHJFieldActionPerformed

    private void dummyJField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField4ActionPerformed

    private void availableFromMMJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableFromMMJFieldFocusGained
        if (availableFromMMJField.getText().equals("MM")) {
            availableFromMMJField.setText("");
        }
    }//GEN-LAST:event_availableFromMMJFieldFocusGained

    private void availableFromMMJFielddateOfBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableFromMMJFielddateOfBirthFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_availableFromMMJFielddateOfBirthFocusLost

    private void availableFromMMJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableFromMMJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableFromMMJFieldActionPerformed

    private void availableFromAMJCheckBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableFromAMJCheckBoxFocusGained
        availableFromPMJCheckBox.setSelected(false);
    }//GEN-LAST:event_availableFromAMJCheckBoxFocusGained

    private void availableFromPMJCheckBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableFromPMJCheckBoxFocusGained
        availableFromAMJCheckBox.setSelected(false);
    }//GEN-LAST:event_availableFromPMJCheckBoxFocusGained

    private void availableTillHHJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableTillHHJFieldFocusGained
        if (availableTillHHJField.getText().equals("HH")) {
            availableTillHHJField.setText("");
        }
    }//GEN-LAST:event_availableTillHHJFieldFocusGained

    private void availableTillHHJFielddateOfBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableTillHHJFielddateOfBirthFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_availableTillHHJFielddateOfBirthFocusLost

    private void availableTillHHJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableTillHHJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableTillHHJFieldActionPerformed

    private void dummyJField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField7ActionPerformed

    private void availableTillMMJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableTillMMJFieldFocusGained
        if (availableTillMMJField.getText().equals("MM")) {
            availableTillMMJField.setText("");
        }
    }//GEN-LAST:event_availableTillMMJFieldFocusGained

    private void availableTillMMJFielddateOfBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableTillMMJFielddateOfBirthFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_availableTillMMJFielddateOfBirthFocusLost

    private void availableTillMMJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableTillMMJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableTillMMJFieldActionPerformed

    private void availableTillAMJCheckBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableTillAMJCheckBoxFocusGained
        availableTillPMJCheckBox.setSelected(false);
    }//GEN-LAST:event_availableTillAMJCheckBoxFocusGained

    private void availableTillPMJCheckBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableTillPMJCheckBoxFocusGained
        availableTillAMJCheckBox.setSelected(false);
    }//GEN-LAST:event_availableTillPMJCheckBoxFocusGained

    private void availableJCheckBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_availableJCheckBoxFocusGained
        notAvailableJCheckBox.setSelected(false);
    }//GEN-LAST:event_availableJCheckBoxFocusGained

    private void notAvailableJCheckBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_notAvailableJCheckBoxFocusGained
        availableJCheckBox.setSelected(false);
    }//GEN-LAST:event_notAvailableJCheckBoxFocusGained

    private void firstJCheckBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstJCheckBoxFocusGained
        allJCheckBox.setSelected(false);
    }//GEN-LAST:event_firstJCheckBoxFocusGained

    private void allJCheckBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_allJCheckBoxFocusGained
        firstJCheckBox.setSelected(false);
    }//GEN-LAST:event_allJCheckBoxFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String errorMessage = "";
        String fromTime = availableFromHHJField.getText() + ":" + availableFromMMJField.getText();
        String tillTime = availableTillHHJField.getText() + ":" + availableTillMMJField.getText();
        String fromTimeErrorMessage = dummy.validate12HourTime(fromTime, "Availability From");
        String tillTimeErrorMessage = dummy.validate12HourTime(tillTime, "Availability Till");

        if (!"".equals(fromTimeErrorMessage)) {
            errorMessage += fromTimeErrorMessage + "\n";
        } else if (!"".equals(tillTimeErrorMessage)) {
            errorMessage += tillTimeErrorMessage + "\n";
        }

        if (errorMessage.length() != 0) {
            JOptionPane.showMessageDialog(this, errorMessage, "Validations", ERROR_MESSAGE);
            return;
        }

        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a");

        if (availableFromPMJCheckBox.isSelected()) {
            try {
                Date date = parseFormat.parse(fromTime.split(":")[0] + ":" + fromTime.split(":")[1] + " PM");
                fromTime = String.valueOf(displayFormat.format(date));
            } catch (ParseException ex) {
                Logger.getLogger(AdminCreate.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                Date date = parseFormat.parse(fromTime.split(":")[0] + ":" + fromTime.split(":")[1] + " AM");
                fromTime = String.valueOf(displayFormat.format(date));
            } catch (ParseException ex) {
                Logger.getLogger(AdminCreate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (availableTillPMJCheckBox.isSelected()) {
            try {
                Date date = parseFormat.parse(tillTime.split(":")[0] + ":" + tillTime.split(":")[1] + " PM");
                tillTime = String.valueOf(displayFormat.format(date));
            } catch (ParseException ex) {
                Logger.getLogger(AdminCreate.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                Date date = parseFormat.parse(tillTime.split(":")[0] + ":" + tillTime.split(":")[1] + " AM");
                tillTime = String.valueOf(displayFormat.format(date));
            } catch (ParseException ex) {
                Logger.getLogger(AdminCreate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("fromTime" + fromTime);
        System.out.println("tillTime" + tillTime);
        if (errorMessage.length() == 0) {
            if (!"".equals(dummy.validateStartEndTime(fromTime, tillTime))) {
                errorMessage += "End time should be greater than the start time! \n";
            }
        }

        if (!availableJCheckBox.isSelected() && !notAvailableJCheckBox.isSelected()) {
            errorMessage += "Please select type, either Available/Not-Available. \n";
        }
        if (!firstJCheckBox.isSelected() && !allJCheckBox.isSelected()) {
            errorMessage += "Let us know if you want to serach FIRST car or ALL cars. \n";
        }
        if (errorMessage.length() != 0) {
            JOptionPane.showMessageDialog(this, errorMessage, "Validations", ERROR_MESSAGE);
        } else {
            ArrayList<Car> allAvailableFilteredCars = new ArrayList<Car>();
            ArrayList<Car> allNonAvailableFilteredCars = new ArrayList<Car>();

            for (int i = 0; i < MainJFrame.allCars.size(); i++) {
                Car tempCar = MainJFrame.allCars.get(i);
                if (compareTimes(fromTime, tempCar.availabilityFrom) >= 0 && compareTimes(tillTime, tempCar.availabilityTo) <= 0) {
                    allAvailableFilteredCars.add(tempCar);
                } else {
                    allNonAvailableFilteredCars.add(tempCar);
                }
            }

            String[][] tableColumn = new String[firstJCheckBox.isSelected() ? 1 : allAvailableFilteredCars.size()][11];
            if (allAvailableFilteredCars.size() != 0) {
                for (int j = 0; j < (firstJCheckBox.isSelected() ? 1 : allAvailableFilteredCars.size()); j++) {
                    Car temp = allAvailableFilteredCars.get(j);
                    tableColumn[j][0] = String.valueOf(temp.id);
                    tableColumn[j][1] = temp.availabilityFrom + " - " + temp.availabilityTo;
                    tableColumn[j][2] = temp.brand;
                    tableColumn[j][3] = String.valueOf(temp.manufactureYear);
                    tableColumn[j][4] = String.valueOf(temp.seats);
                    tableColumn[j][5] = String.valueOf(temp.getAvailableSeats());
                    tableColumn[j][6] = String.valueOf(temp.getSerialNo());
                    tableColumn[j][7] = String.valueOf(temp.modelNo);
                    tableColumn[j][8] = String.valueOf(temp.manufacturer);
                    tableColumn[j][9] = String.valueOf(temp.city);
                    tableColumn[j][10] = String.valueOf(temp.getMaintenanceCerticateExpiry());
                }
            }

            String[][] tableColumnNA = new String[firstJCheckBox.isSelected() ? 1 : allNonAvailableFilteredCars.size()][11];
            if (allNonAvailableFilteredCars.size() != 0) {
                for (int j = 0; j < (firstJCheckBox.isSelected() ? 1 : allNonAvailableFilteredCars.size()); j++) {
                    Car temp = allNonAvailableFilteredCars.get(j);
                    tableColumnNA[j][0] = String.valueOf(temp.id);
                    tableColumnNA[j][1] = temp.availabilityFrom + " - " + temp.availabilityTo;
                    tableColumnNA[j][2] = temp.brand;
                    tableColumnNA[j][3] = String.valueOf(temp.manufactureYear);
                    tableColumnNA[j][4] = String.valueOf(temp.seats);
                    tableColumnNA[j][5] = String.valueOf(temp.getAvailableSeats());
                    tableColumnNA[j][6] = String.valueOf(temp.getSerialNo());
                    tableColumnNA[j][7] = String.valueOf(temp.modelNo);
                    tableColumnNA[j][8] = String.valueOf(temp.manufacturer);
                    tableColumnNA[j][9] = String.valueOf(temp.city);
                    tableColumnNA[j][10] = String.valueOf(temp.getMaintenanceCerticateExpiry());
                }
            }

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    availableJCheckBox.isSelected()
                    ? tableColumn
                    : tableColumnNA,
                    columns
            ));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public long compareTimes(String endValue, String startValue) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date end = null;
        try {
            end = sdf.parse(endValue);
        } catch (ParseException ex) {
            Logger.getLogger(UserAvailability.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date start = null;
        try {
            start = sdf.parse(startValue);
        } catch (ParseException ex) {
            Logger.getLogger(UserAvailability.class.getName()).log(Level.SEVERE, null, ex);
        }
        return end.getTime() - start.getTime();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox allJCheckBox;
    private javax.swing.JCheckBox availableFromAMJCheckBox;
    private javax.swing.JTextField availableFromHHJField;
    private javax.swing.JLabel availableFromJLabel;
    private javax.swing.JTextField availableFromMMJField;
    private javax.swing.JCheckBox availableFromPMJCheckBox;
    private javax.swing.JCheckBox availableJCheckBox;
    private javax.swing.JCheckBox availableTillAMJCheckBox;
    private javax.swing.JTextField availableTillHHJField;
    private javax.swing.JLabel availableTillJLabel;
    private javax.swing.JTextField availableTillMMJField;
    private javax.swing.JCheckBox availableTillPMJCheckBox;
    private javax.swing.JTextField dummyJField4;
    private javax.swing.JTextField dummyJField7;
    private javax.swing.JCheckBox firstJCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox notAvailableJCheckBox;
    // End of variables declaration//GEN-END:variables
}
