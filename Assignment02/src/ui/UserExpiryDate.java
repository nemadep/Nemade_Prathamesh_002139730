/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import classes.Car;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author prathameshnemade
 */
public class UserExpiryDate extends javax.swing.JPanel {

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
     * Creates new form UserExpiryDate
     */
    public UserExpiryDate() {
        initComponents();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                columns
        ));
    }

    public void setDropdownBasedValues() {
        ArrayList<Car> brandTable = new ArrayList<Car>();
        for (int i = 0; i < MainJFrame.allCars.size(); i++) {
            Car temp = MainJFrame.allCars.get(i);
            if (emcJRadioButton.isSelected()) {
                if ((new Date()).after(temp.getMaintenanceCerticateExpiry())) {
                    brandTable.add(temp);
                }
            }

            if (nemcJRadioButton.isSelected()) {
                if ((new Date()).before(temp.getMaintenanceCerticateExpiry())) {
                    brandTable.add(temp);
                }
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

        emcJRadioButton = new javax.swing.JRadioButton();
        nemcJRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        emcJRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        emcJRadioButton.setForeground(new java.awt.Color(67, 100, 100));
        emcJRadioButton.setText("Expired Medical Certificate");
        emcJRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                emcJRadioButtonStateChanged(evt);
            }
        });
        emcJRadioButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emcJRadioButtonFocusGained(evt);
            }
        });

        nemcJRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nemcJRadioButton.setForeground(new java.awt.Color(67, 100, 100));
        nemcJRadioButton.setText("In Use Medical Certificate");
        nemcJRadioButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nemcJRadioButtonStateChanged(evt);
            }
        });
        nemcJRadioButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nemcJRadioButtonFocusGained(evt);
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

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel3.setText("Filter Car Records based on the maintenance expiry date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emcJRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(nemcJRadioButton))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emcJRadioButton)
                    .addComponent(nemcJRadioButton))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emcJRadioButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emcJRadioButtonFocusGained
        nemcJRadioButton.setSelected(false);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                columns
        ));
        setDropdownBasedValues();
    }//GEN-LAST:event_emcJRadioButtonFocusGained

    private void nemcJRadioButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nemcJRadioButtonFocusGained
        emcJRadioButton.setSelected(false);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                columns
        ));
        setDropdownBasedValues();
    }//GEN-LAST:event_nemcJRadioButtonFocusGained

    private void emcJRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_emcJRadioButtonStateChanged
        setDropdownBasedValues();
    }//GEN-LAST:event_emcJRadioButtonStateChanged

    private void nemcJRadioButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nemcJRadioButtonStateChanged
        setDropdownBasedValues();
    }//GEN-LAST:event_nemcJRadioButtonStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton emcJRadioButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton nemcJRadioButton;
    // End of variables declaration//GEN-END:variables
}
