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
        setDropdownBasedValues(String.valueOf(manufactureYearJComboBox.getSelectedItem()));
    }

    public void getYearValues() {
        for (int i = 0; i < MainJFrame.allCars.size(); i++) {
            Car temp = MainJFrame.allCars.get(i);
            String tempValue = String.valueOf(temp.manufactureYear);
            if (allMakes.indexOf(tempValue) == -1) {
                allMakes.add(tempValue);
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
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

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

        brandJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        brandJLabel.setForeground(new java.awt.Color(67, 100, 100));
        brandJLabel.setText("Manufacture Year:");

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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel1.setText("Filter Car Records based on the Car's Manufacture Year:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(brandJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manufactureYearJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandJLabel)
                    .addComponent(manufactureYearJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manufactureYearJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_manufactureYearJComboBoxItemStateChanged
        setDropdownBasedValues(String.valueOf(manufactureYearJComboBox.getSelectedItem()));
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

    public void setDropdownBasedValues(String value) {
        value = String.valueOf(value);
        ArrayList<Car> brandTable = new ArrayList<Car>();
        for (int i = 0; i < MainJFrame.allCars.size(); i++) {
            Car temp = MainJFrame.allCars.get(i);
            String tempValue = String.valueOf(temp.manufactureYear);

            if (tempValue.equals(value)) {
                brandTable.add(temp);
            }
        }
        System.out.println("brandTablebrandTable" + brandTable);

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> manufactureYearJComboBox;
    // End of variables declaration//GEN-END:variables
}
