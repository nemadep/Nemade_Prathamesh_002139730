/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import classes.Car;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author prathameshnemade
 */
public class UserManufactureYear extends javax.swing.JPanel {

    ArrayList<String> allMakes = new ArrayList<String>();
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
     * Creates new form UserManufactureYear
     */
    public UserManufactureYear() {
        initComponents();
        getYearValues();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                columns
        ));
    }

    public void getYearValues() {
        for (int i = 0; i < MainJFrame.allCars.size(); i++) {
            Car temp = MainJFrame.allCars.get(i);
            allMakes.add(temp.brand);
            if (!allMakes.contains(temp.brand)) {
                allMakes.add(temp.brand);
            }
        }
        String[] makesSDropdown = allMakes.toArray(new String[allMakes.size()]);
        DefaultComboBoxModel<String> brandSDropdownModel = new DefaultComboBoxModel<>(makesSDropdown);
        manufactureYearJComboBox.setModel(brandSDropdownModel);
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
        jTable1 = new javax.swing.JTable();
        brandJLabel = new javax.swing.JLabel();
        manufactureYearJComboBox = new javax.swing.JComboBox<>();

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

        brandJLabel.setText("Manufacture Year");

        manufactureYearJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                manufactureYearJComboBoxItemStateChanged(evt);
            }
        });
        manufactureYearJComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                manufactureYearJComboBoxFocusGained(evt);
            }
        });
        manufactureYearJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufactureYearJComboBoxActionPerformed(evt);
            }
        });
        manufactureYearJComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                manufactureYearJComboBoxPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(brandJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manufactureYearJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandJLabel)
                    .addComponent(manufactureYearJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manufactureYearJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_manufactureYearJComboBoxItemStateChanged
        setDropdownBasedValues((Long) manufactureYearJComboBox.getSelectedItem());
    }//GEN-LAST:event_manufactureYearJComboBoxItemStateChanged

    private void manufactureYearJComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manufactureYearJComboBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_manufactureYearJComboBoxFocusGained

    private void manufactureYearJComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_manufactureYearJComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_manufactureYearJComboBoxPropertyChange

    private void manufactureYearJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufactureYearJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufactureYearJComboBoxActionPerformed

    public void setDropdownBasedValues(Long value) {
        ArrayList<Car> brandTable = new ArrayList<Car>();
        for (int i = 0; i < MainJFrame.allCars.size(); i++) {
            Car temp = MainJFrame.allCars.get(i);
            if (temp.manufactureYear == value) {
                brandTable.add(temp);
            }
        }

        String[][] tableColumnNA = new String[brandTable.size()][11];
        for (int j = 0; j < brandTable.size(); j++) {
            Car temp = brandTable.get(j);
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                tableColumnNA,
                columns
        ));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brandJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> manufactureYearJComboBox;
    // End of variables declaration//GEN-END:variables
}
