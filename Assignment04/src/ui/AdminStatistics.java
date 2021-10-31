/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import assignment04.City;
import assignment04.Encounter;
import assignment04.Patient;
import assignment04.PatientDirectory;
import assignment04.VitalSigns;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prathameshnemade
 */
public class AdminStatistics extends javax.swing.JPanel {

    int selectedIndex;
    HashMap<String, ArrayList<Patient>> abnormalBPData;

    /**
     * Creates new form AdminStatistics
     */
    public AdminStatistics() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) abnormalJTable.getModel();
        model.setRowCount(0);
        generateDropdownCity();
        generateDropdownCommunity();
        openSelectedProfile();
    }

    public void generateDropdownCity() {
        ArrayList<String> cityDropdown = new ArrayList<>();
        for (String cityValue : City.cityValues) {
            cityDropdown.add(String.valueOf(cityValue));
        }
        String[] citySDropdown = cityDropdown.toArray(new String[cityDropdown.size()]);
        DefaultComboBoxModel<String> yearsSDropdownModel = new DefaultComboBoxModel<>(citySDropdown);
        cityJComboBox.setModel(yearsSDropdownModel);
    }

    public void generateDropdownCommunity() {
        ArrayList<String> communityDropdown = new ArrayList<>();
        City.allCities.stream().filter(communityValue -> (communityValue.city == null ? cityJComboBox.getSelectedItem().toString() == null : communityValue.city.equals(cityJComboBox.getSelectedItem().toString()))).forEachOrdered(communityValue -> {
            communityDropdown.add(String.valueOf(communityValue.communityName));
        });
        String[] citySDropdown = communityDropdown.toArray(new String[communityDropdown.size()]);
        DefaultComboBoxModel<String> yearsSDropdownModel = new DefaultComboBoxModel<>(citySDropdown);
        this.communityJComboBox.setModel(yearsSDropdownModel);
    }

//    public void getAllCommunity() {
//        ArrayList<String> communityDropdown = new ArrayList<>();
//        for (Patient comValue : PatientDirectory.patientDirectory) {
//            communityDropdown.add(comValue.community.city + " - " + (comValue.community.communityName));
//        }
//        String[] comSDropdown = communityDropdown.toArray(new String[communityDropdown.size()]);
//        DefaultComboBoxModel<String> comSDropdownModel = new DefaultComboBoxModel<>(comSDropdown);
//        cityJComboBox.setModel(comSDropdownModel);
//    }
    public void openSelectedProfile() {
        Object communityName = communityJComboBox.getSelectedItem();
        Object cityName = cityJComboBox.getSelectedItem();

        System.out.println("!!");
        if (communityName != null) {

            communityName = communityJComboBox.getSelectedItem().toString();
            cityName = cityJComboBox.getSelectedItem().toString();
            System.out.println("!!!");

            abnormalBPData = new HashMap<String, ArrayList<Patient>>();
            abnormalBPData.put("(0.1) - Neonate", new ArrayList<Patient>());
            abnormalBPData.put("(<1) - Infant", new ArrayList<Patient>());
            abnormalBPData.put("(>1 & <=3) - Toddler", new ArrayList<Patient>());
            abnormalBPData.put("(>3 & <=5) - Preschooler", new ArrayList<Patient>());
            abnormalBPData.put("(>5 & <=12) - School Age", new ArrayList<Patient>());
            abnormalBPData.put("(>12) - Adolescent", new ArrayList<Patient>());

            for (int i = 0; i < PatientDirectory.patientDirectory.size(); i++) {
                Patient onGoingPatient = PatientDirectory.patientDirectory.get(i);
                System.out.println("0" + onGoingPatient.personDetails.community.communityName + communityName);

                if (onGoingPatient.personDetails.community.communityName == communityName
                        && onGoingPatient.personDetails.city.city == cityName) {
                    for (int j = 0; j < onGoingPatient.allVisitsHistory.encounterHistory.size(); j++) {
                        Encounter onGoingEncounter = onGoingPatient.allVisitsHistory.encounterHistory.get(j);
                        getBpDetails(onGoingEncounter.findings, abnormalBPData, onGoingPatient);
                    }
                }
            }
            updateTable();
        }
    }

    public void updateTable() {
        DefaultTableModel model = (DefaultTableModel) abnormalJTable.getModel();
        model.setRowCount(0);
        for (Map.Entry<String, ArrayList<Patient>> entry : abnormalBPData.entrySet()) {
            String key = entry.getKey();
            ArrayList<Patient> value = entry.getValue();
            for (int i = 0; i < value.size(); i++) {
                Patient ongoingPatient = value.get(i);
                String bp = "";
                for (int j = 0; j < ongoingPatient.allVisitsHistory.encounterHistory.size(); j++) {
                    Encounter ongoingEncounter = ongoingPatient.allVisitsHistory.encounterHistory.get(j);
                    bp += ongoingEncounter.findings.bloodPressure + ", ";
                }
                Object[] row = {key, ongoingPatient.patientIdentifier, ongoingPatient.personDetails.name};
                model.addRow(row);
            }
        }
    }

    public void getBpDetails(VitalSigns vitals, HashMap<String, ArrayList<Patient>> abnormalBPData, Patient onGoingPatient) {
        String ageGroup = "";
        System.out.println("1");
        if (vitals.age == 0.1) {
            ageGroup = "(0.1) - Neonate";
            if (vitals.bloodPressure < 50 || vitals.bloodPressure >= 70) {
                ArrayList value = abnormalBPData.get(ageGroup);
                value.add(onGoingPatient);
            }
            System.out.println("2");

        } else if (vitals.age > 0.1 && vitals.age <= 1) {
            ageGroup = "(<1) - Infant";
            if (vitals.bloodPressure < 70 || vitals.bloodPressure >= 100) {
                ArrayList value = abnormalBPData.get(ageGroup);
                value.add(onGoingPatient);
            }
            System.out.println("3");

        } else if (vitals.age > 1 && vitals.age <= 3) {
            ageGroup = "(>1 & <=3) - Toddler";
            if (vitals.bloodPressure < 80 || vitals.bloodPressure >= 110) {
                ArrayList value = abnormalBPData.get(ageGroup);
                value.add(onGoingPatient);
            }
            System.out.println("4");

        } else if (vitals.age > 3 && vitals.age <= 5) {
            ageGroup = "(>3 & <=5) - Preschooler";
            if (vitals.bloodPressure < 80 || vitals.bloodPressure >= 110) {
                ArrayList value = abnormalBPData.get(ageGroup);
                value.add(onGoingPatient);
            }
            System.out.println("5");

        } else if (vitals.age > 5 && vitals.age <= 12) {
            ageGroup = "(>5 & <=12) - School Age";
            if (vitals.bloodPressure < 80 || vitals.bloodPressure >= 120) {
                ArrayList value = abnormalBPData.get(ageGroup);
                value.add(onGoingPatient);
            }
            System.out.println("6");

        } else if (vitals.age > 12) {
            ageGroup = "(>12) - Adolescent";
            if (vitals.bloodPressure < 110 || vitals.bloodPressure >= 120) {
                ArrayList value = abnormalBPData.get(ageGroup);
                value.add(onGoingPatient);
            }
            System.out.println("7");

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cityJComboBox = new javax.swing.JComboBox<>();
        brandJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        abnormalJTable = new javax.swing.JTable();
        brandJLabel1 = new javax.swing.JLabel();
        communityJComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        cityJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cityJComboBoxItemStateChanged(evt);
            }
        });
        cityJComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cityJComboBoxFocusGained(evt);
            }
        });
        cityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJComboBoxActionPerformed(evt);
            }
        });
        cityJComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cityJComboBoxPropertyChange(evt);
            }
        });

        brandJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        brandJLabel.setForeground(new java.awt.Color(67, 100, 100));
        brandJLabel.setText("City");

        abnormalJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Age Group", "Patient Id", "Patient Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(abnormalJTable);

        brandJLabel1.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        brandJLabel1.setForeground(new java.awt.Color(67, 100, 100));
        brandJLabel1.setText("Community");

        communityJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                communityJComboBoxItemStateChanged(evt);
            }
        });
        communityJComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                communityJComboBoxFocusGained(evt);
            }
        });
        communityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityJComboBoxActionPerformed(evt);
            }
        });
        communityJComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                communityJComboBoxPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brandJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(brandJLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(communityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandJLabel1))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cityJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cityJComboBoxItemStateChanged
        generateDropdownCommunity();
        openSelectedProfile();
    }//GEN-LAST:event_cityJComboBoxItemStateChanged

    private void cityJComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityJComboBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxFocusGained

    private void cityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxActionPerformed

    private void cityJComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cityJComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxPropertyChange

    private void communityJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_communityJComboBoxItemStateChanged
        openSelectedProfile();
    }//GEN-LAST:event_communityJComboBoxItemStateChanged

    private void communityJComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_communityJComboBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJComboBoxFocusGained

    private void communityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJComboBoxActionPerformed

    private void communityJComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_communityJComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJComboBoxPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable abnormalJTable;
    private javax.swing.JLabel brandJLabel;
    private javax.swing.JLabel brandJLabel1;
    private javax.swing.JComboBox<String> cityJComboBox;
    private javax.swing.JComboBox<String> communityJComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
