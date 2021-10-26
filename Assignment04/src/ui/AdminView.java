/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import assignment04.Person;
import assignment04.PersonDirectory;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author prathameshnemade
 */
public class AdminView extends javax.swing.JPanel {

    /**
     * Creates new form AdminView
     */
    public AdminView() {
        initComponents();
        jSplitPane1.setDividerLocation((int) (0.35 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width - 300)));
        DefaultListModel model = new DefaultListModel();
        if (PersonDirectory.allPeople.isEmpty()) {
            uploadedJList.setModel(model);
            JOptionPane.showMessageDialog(this, "People Directory Empty!", "View Details", ERROR_MESSAGE);
        } else {
            PersonDirectory.allPeople.forEach(car -> {
                model.addElement(car.personId + " - " + car.name);
            });
            uploadedJList.setModel(model);
            uploadedJList.setSelectedIndex(0);
            try {
                openSelectedProfile();
            } catch (ParseException ex) {
                Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
            }
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

        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addressJLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        identifierJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        zipCodeJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cityJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stateJLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        communityNameJLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dobJLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emailJLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mobileNoJLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uploadedJList = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Person Directory");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(67, 100, 100));
        jLabel2.setText("Name:");

        nameJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nameJLabel.setForeground(new java.awt.Color(67, 100, 100));
        nameJLabel.setText("Select Person to see details!");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(67, 100, 100));
        jLabel3.setText("Address:");

        addressJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addressJLabel.setForeground(new java.awt.Color(67, 100, 100));
        addressJLabel.setText("Select Person to see details!");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(67, 100, 100));
        jLabel4.setText("Person Identifier:");

        identifierJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        identifierJLabel.setForeground(new java.awt.Color(67, 100, 100));
        identifierJLabel.setText("Select Person to see details!");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(67, 100, 100));
        jLabel5.setText("Zip Code:");

        zipCodeJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        zipCodeJLabel.setForeground(new java.awt.Color(67, 100, 100));
        zipCodeJLabel.setText("Select Person to see details!");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(67, 100, 100));
        jLabel6.setText("City:");

        cityJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cityJLabel.setForeground(new java.awt.Color(67, 100, 100));
        cityJLabel.setText("Select Person to see details!");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(67, 100, 100));
        jLabel7.setText("State:");

        stateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        stateJLabel.setForeground(new java.awt.Color(67, 100, 100));
        stateJLabel.setText("Select Person to see details!");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(67, 100, 100));
        jLabel8.setText("Community Name:");

        communityNameJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        communityNameJLabel.setForeground(new java.awt.Color(67, 100, 100));
        communityNameJLabel.setText("Select Person to see details!");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(67, 100, 100));
        jLabel9.setText("DOB:");

        dobJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        dobJLabel.setForeground(new java.awt.Color(67, 100, 100));
        dobJLabel.setText("Select Person to see details!");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(67, 100, 100));
        jLabel10.setText("Email ID:");

        emailJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        emailJLabel.setForeground(new java.awt.Color(67, 100, 100));
        emailJLabel.setText("Select Person to see details!");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(67, 100, 100));
        jLabel11.setText("Mobile No.:");

        mobileNoJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        mobileNoJLabel.setForeground(new java.awt.Color(67, 100, 100));
        mobileNoJLabel.setText("Select Person to see details!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameJLabel)
                    .addComponent(addressJLabel)
                    .addComponent(identifierJLabel)
                    .addComponent(zipCodeJLabel)
                    .addComponent(cityJLabel)
                    .addComponent(stateJLabel)
                    .addComponent(communityNameJLabel)
                    .addComponent(emailJLabel)
                    .addComponent(dobJLabel)
                    .addComponent(mobileNoJLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(identifierJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addressJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(zipCodeJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cityJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(stateJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(communityNameJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dobJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailJLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(mobileNoJLabel))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        uploadedJList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uploadedJListFocusGained(evt);
            }
        });
        uploadedJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadedJListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uploadedJList);

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Directory:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSplitPane1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jSplitPane1)
                    .addGap(22, 22, 22)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void uploadedJListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uploadedJListFocusGained
        try {
            openSelectedProfile();
        } catch (ParseException ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadedJListFocusGained

    private void uploadedJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadedJListMouseClicked
        try {
            openSelectedProfile();
        } catch (ParseException ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadedJListMouseClicked

    private void openSelectedProfile() throws ParseException {
        int seletedPersonIndex = uploadedJList.getSelectedIndex();//get the index of the selection made in the left section.
        if (seletedPersonIndex != -1) {
            Person selectedPerson = PersonDirectory.allPeople.get(seletedPersonIndex);
            identifierJLabel.setText(String.valueOf(selectedPerson.personId));
            nameJLabel.setText(String.valueOf(selectedPerson.name));
            addressJLabel.setText(String.valueOf(selectedPerson.address));
            zipCodeJLabel.setText(String.valueOf(selectedPerson.address.zipcode));
            cityJLabel.setText(String.valueOf(selectedPerson.city.city));
            stateJLabel.setText(String.valueOf(selectedPerson.city.state));
            communityNameJLabel.setText(String.valueOf(selectedPerson.community.communityName));
            dobJLabel.setText((String.valueOf((new SimpleDateFormat("MM/dd/yyyy", Locale.US)).format(selectedPerson.dob))));
            emailJLabel.setText(String.valueOf(selectedPerson.email));
            mobileNoJLabel.setText(String.valueOf(selectedPerson.mobileNo));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JLabel communityNameJLabel;
    private javax.swing.JLabel dobJLabel;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JLabel identifierJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel mobileNoJLabel;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JLabel stateJLabel;
    private javax.swing.JList<String> uploadedJList;
    private javax.swing.JLabel zipCodeJLabel;
    // End of variables declaration//GEN-END:variables
}