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
public class UserManufacturer extends javax.swing.JPanel {

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
     * Creates new form UserManufacturer
     */
    public UserManufacturer() {
        initComponents();
        modelNoValues();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                columns
        ));
        setDropdownBasedValues((String) manufacturerJComboBox.getSelectedItem());
    }

    public void modelNoValues() {
        for (int i = 0; i < MainJFrame.allCars.size(); i++) {
            Car temp = MainJFrame.allCars.get(i);
            if (!allMakes.contains(temp.manufacturer)) {
                allMakes.add(temp.manufacturer);
            }
        }
        String[] makesSDropdown = allMakes.toArray(new String[allMakes.size()]);
        DefaultComboBoxModel<String> brandSDropdownModel = new DefaultComboBoxModel<>(makesSDropdown);
        manufacturerJComboBox.setModel(brandSDropdownModel);
    }

    public void setDropdownBasedValues(String value) {
        ArrayList<Car> brandTable = new ArrayList<Car>();
        for (int i = 0; i < MainJFrame.allCars.size(); i++) {
            Car temp = MainJFrame.allCars.get(i);
            if (temp.manufacturer == value) {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        brandJLabel = new javax.swing.JLabel();
        manufacturerJComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        brandJLabel.setText("Car Manufacturer");

        manufacturerJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                manufacturerJComboBoxItemStateChanged(evt);
            }
        });
        manufacturerJComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                manufacturerJComboBoxFocusGained(evt);
            }
        });
        manufacturerJComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                manufacturerJComboBoxPropertyChange(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(brandJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manufacturerJComboBox, 0, 784, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manufacturerJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_manufacturerJComboBoxItemStateChanged
        setDropdownBasedValues((String) manufacturerJComboBox.getSelectedItem());
    }//GEN-LAST:event_manufacturerJComboBoxItemStateChanged

    private void manufacturerJComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manufacturerJComboBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturerJComboBoxFocusGained

    private void manufacturerJComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_manufacturerJComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturerJComboBoxPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brandJLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> manufacturerJComboBox;
    // End of variables declaration//GEN-END:variables
}