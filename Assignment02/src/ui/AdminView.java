/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import classes.Car;
import java.awt.Dimension;
import java.awt.Toolkit;
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
        jSplitPane1.setDividerLocation((int) (0.4 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width - 300)));
        DefaultListModel model = new DefaultListModel();
        if (MainJFrame.allCars.isEmpty()) {
            uploadedJList.setModel(model);
            JOptionPane.showMessageDialog(this, "No Cars Available!!", "View Car Details", ERROR_MESSAGE);
        } else {
            MainJFrame.allCars.forEach(car -> {
                model.addElement(car.id + " - " + car.getSerialNo());
            });
            uploadedJList.setModel(model);
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        availableFromJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        availableTillJLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        identifierJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        brandJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        manufacturerYearJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        seatsJLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        modelNoJLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        manufacturerJLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cityJLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mceJLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        serialNoJLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        availableSeatsJLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uploadedJList = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Available From:");

        availableFromJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        availableFromJLabel.setText("-");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Available Till:");

        availableTillJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        availableTillJLabel.setText("-");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("ID:");

        identifierJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        identifierJLabel.setText("-");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Brand:");

        brandJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        brandJLabel.setText("-");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("Manufacturer Year:");

        manufacturerYearJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        manufacturerYearJLabel.setText("-");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("Total Seats:");

        seatsJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        seatsJLabel.setText("-");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setText("Model No.:");

        modelNoJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        modelNoJLabel.setText("-");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setText("Manufacturer:");

        manufacturerJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        manufacturerJLabel.setText("-");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setText("City:");

        cityJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cityJLabel.setText("-");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setText("Maintenance Expiry:");

        mceJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        mceJLabel.setText("-");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setText("Serial No.:");

        serialNoJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        serialNoJLabel.setText("-");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setText("Available Seats:");

        availableSeatsJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        availableSeatsJLabel.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availableFromJLabel)
                    .addComponent(availableTillJLabel)
                    .addComponent(identifierJLabel)
                    .addComponent(brandJLabel)
                    .addComponent(manufacturerYearJLabel)
                    .addComponent(seatsJLabel)
                    .addComponent(modelNoJLabel)
                    .addComponent(cityJLabel)
                    .addComponent(manufacturerJLabel)
                    .addComponent(mceJLabel)
                    .addComponent(serialNoJLabel)
                    .addComponent(availableSeatsJLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(identifierJLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(availableFromJLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(availableTillJLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(brandJLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(manufacturerYearJLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(seatsJLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(modelNoJLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(manufacturerJLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cityJLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(mceJLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serialNoJLabel)
                    .addComponent(jLabel12))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(availableSeatsJLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(150, 365));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View All Cars");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSplitPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void uploadedJListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uploadedJListFocusGained
        openSelectedProfile();
    }//GEN-LAST:event_uploadedJListFocusGained

    private void uploadedJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadedJListMouseClicked
        openSelectedProfile();
    }//GEN-LAST:event_uploadedJListMouseClicked

    private void openSelectedProfile() {
        int seletedCarIndex = uploadedJList.getSelectedIndex();//get the index of the selection made in the left section.
        if (seletedCarIndex != -1) {
            Car selectedCar = MainJFrame.allCars.get(seletedCarIndex);
            identifierJLabel.setText(String.valueOf(selectedCar.id));
            availableFromJLabel.setText(String.valueOf(selectedCar.availabilityFrom));
            availableTillJLabel.setText(String.valueOf(selectedCar.availabilityTo));
            brandJLabel.setText(String.valueOf(selectedCar.brand));
            manufacturerYearJLabel.setText(String.valueOf(selectedCar.manufactureYear));
            seatsJLabel.setText(String.valueOf(selectedCar.seats));
            modelNoJLabel.setText(String.valueOf(selectedCar.modelNo));
            manufacturerJLabel.setText(String.valueOf(selectedCar.manufacturer));
            cityJLabel.setText(String.valueOf(selectedCar.city));
            mceJLabel.setText(String.valueOf(selectedCar.getMaintenanceCerticateExpiry()));
            serialNoJLabel.setText(String.valueOf(selectedCar.getSerialNo()));
            availableSeatsJLabel.setText(String.valueOf(selectedCar.getAvailableSeats()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableFromJLabel;
    private javax.swing.JLabel availableSeatsJLabel;
    private javax.swing.JLabel availableTillJLabel;
    private javax.swing.JLabel brandJLabel;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JLabel identifierJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel manufacturerJLabel;
    private javax.swing.JLabel manufacturerYearJLabel;
    private javax.swing.JLabel mceJLabel;
    private javax.swing.JLabel modelNoJLabel;
    private javax.swing.JLabel seatsJLabel;
    private javax.swing.JLabel serialNoJLabel;
    private javax.swing.JList<String> uploadedJList;
    // End of variables declaration//GEN-END:variables
}
