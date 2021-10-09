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
public class UserMakes extends javax.swing.JPanel {

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
     * Creates new form UserMakes
     */
    public UserMakes() {
        initComponents();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                columns
        ));
        getMakesValues();

    }

    public void getMakesValues() {
        for (int i = 0; i < MainJFrame.allCars.size(); i++) {
            Car temp = MainJFrame.allCars.get(i);
            if (!allMakes.contains(temp.brand)) {
                allMakes.add(temp.brand);
            }
        }
        String[] makesSDropdown = allMakes.toArray(new String[allMakes.size()]);
        DefaultComboBoxModel<String> brandSDropdownModel = new DefaultComboBoxModel<>(makesSDropdown);
        makesJComboBox.setModel(brandSDropdownModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brandJLabel = new javax.swing.JLabel();
        makesJComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        brandJLabel.setText("Brand:");

        makesJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                makesJComboBoxItemStateChanged(evt);
            }
        });
        makesJComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                makesJComboBoxFocusGained(evt);
            }
        });
        makesJComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                makesJComboBoxPropertyChange(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(brandJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(makesJComboBox, 0, 838, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void makesJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_makesJComboBoxItemStateChanged
        setDropdownBasedValues((String) makesJComboBox.getSelectedItem());
    }//GEN-LAST:event_makesJComboBoxItemStateChanged

    private void makesJComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_makesJComboBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_makesJComboBoxFocusGained

    private void makesJComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_makesJComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_makesJComboBoxPropertyChange

    public void setDropdownBasedValues(String value) {
        ArrayList<Car> brandTable = new ArrayList<Car>();
        for (int i = 0; i < MainJFrame.allCars.size(); i++) {
            Car temp = MainJFrame.allCars.get(i);
            if (temp.brand == value) {
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
    private javax.swing.JComboBox<String> makesJComboBox;
    // End of variables declaration//GEN-END:variables
}
