/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import classes.Car;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author prathameshnemade
 */
public class AdminAdvanceAdd extends javax.swing.JPanel {

    public JPanel jPanelMainRight;
    ArrayList<Car> allUploadedCars = new ArrayList<Car>();

    /**
     * Creates new form AdminAdvanceAdd
     */
    public AdminAdvanceAdd(JPanel jPanelMainRight) {
        initComponents();
        this.jPanelMainRight = jPanelMainRight;
        jSplitPane1.setDividerLocation((int) (0.2 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width - 300)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uploadFileJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        updatedAtJLabel = new javax.swing.JLabel();
        createdAtJLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uploadedJList = new javax.swing.JList<>();

        uploadFileJButton.setText("Upload File");
        uploadFileJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadFileJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Click to upload file: ");

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

        updatedAtJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        updatedAtJLabel.setText("-");

        createdAtJLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        createdAtJLabel.setText("-");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel15.setText("Updated At:");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel14.setText("Created At:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
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
                    .addComponent(availableSeatsJLabel)
                    .addComponent(updatedAtJLabel)
                    .addComponent(createdAtJLabel))
                .addContainerGap(144, Short.MAX_VALUE))
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
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createdAtJLabel)
                    .addComponent(jLabel14))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(updatedAtJLabel))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uploadFileJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(uploadFileJButton))
                .addGap(18, 18, 18)
                .addComponent(jSplitPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void uploadFileJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadFileJButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter jsonFilter = new FileNameExtensionFilter("only JSON", "json");
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(jsonFilter);
        int option = fileChooser.showOpenDialog(jPanelMainRight);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                parseJSON(file.getAbsolutePath());
            } catch (IOException ex) {
                Logger.getLogger(AdminAdvanceAdd.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(AdminAdvanceAdd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_uploadFileJButtonActionPerformed

    private void uploadedJListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uploadedJListFocusGained
        openSelectedProfile();
    }//GEN-LAST:event_uploadedJListFocusGained

    private void uploadedJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadedJListMouseClicked
        openSelectedProfile();
    }//GEN-LAST:event_uploadedJListMouseClicked

    private void openSelectedProfile() {
        int seletedCarIndex = uploadedJList.getSelectedIndex();//get the index of the selection made in the left section.
        if (seletedCarIndex != -1) {
            Car selectedCar = allUploadedCars.get(seletedCarIndex);
            identifierJLabel.setText(String.valueOf(selectedCar.id));
            availableFromJLabel.setText(String.valueOf(selectedCar.availabilityFrom));
            availableTillJLabel.setText(String.valueOf(selectedCar.availabilityTo));
            brandJLabel.setText(String.valueOf(selectedCar.brand));
            manufacturerYearJLabel.setText(String.valueOf(selectedCar.manufactureYear));
            seatsJLabel.setText(String.valueOf(selectedCar.seats));
            modelNoJLabel.setText(String.valueOf(selectedCar.modelNo));
            manufacturerJLabel.setText(String.valueOf(selectedCar.manufacturer));
            cityJLabel.setText(String.valueOf(selectedCar.city));
            mceJLabel.setText(String.valueOf((new SimpleDateFormat("MM/dd/yyyy", Locale.US)).format((selectedCar.getMaintenanceCerticateExpiry()))));
            serialNoJLabel.setText(String.valueOf(selectedCar.getSerialNo()));
            availableSeatsJLabel.setText(String.valueOf(selectedCar.getAvailableSeats()));
            createdAtJLabel.setText(String.valueOf((new SimpleDateFormat("MM/dd/yyyy hh:mm:ss", Locale.US)).format((selectedCar.createdAt))));
            updatedAtJLabel.setText(String.valueOf((new SimpleDateFormat("MM/dd/yyyy hh:mm:ss", Locale.US)).format((selectedCar.updatedAt))));
        }
    }

    private void parseJSON(String path) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        try {
            ArrayList uploadedCars = (ArrayList) jsonParser.parse(new FileReader(path));
            int identifier = MainJFrame.allCars.size();
            for (Object car : uploadedCars) {
                JSONObject car1 = (JSONObject) car;
                Car tempCar = new Car();
                tempCar.id = identifier;
                tempCar.createdAt = new Date();
                tempCar.updatedAt = new Date();
                tempCar.availabilityFrom = (String) car1.get("availabilityFrom");
                tempCar.availabilityTo = (String) car1.get("availabilityTo");
                tempCar.brand = (String) car1.get("brand");
                tempCar.manufactureYear = (long) car1.get("manufactureYear");
                tempCar.seats = (long) car1.get("seats");
                tempCar.modelNo = (String) car1.get("modelNo");
                tempCar.manufacturer = (String) car1.get("manufacturer");
                tempCar.city = (String) car1.get("city");

                DateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
                try {
                    dateFormatter.setLenient(false);
                    Date mce = dateFormatter.parse((String) car1.get("maintenanceCerticateExpiry"));
                    tempCar.setMaintenanceCerticateExpiry(mce);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Invalid JSON!", "Upload Car Details", ERROR_MESSAGE);
                }

                tempCar.setSerialNo((String) car1.get("serialNo"));
                tempCar.setAvailableSeats((long) car1.get("availableSeats"));
                allUploadedCars.add(tempCar);
                identifier++;
            }

            DefaultListModel model = new DefaultListModel();
            allUploadedCars.forEach(car -> {
                model.addElement(car.id + " - " + car.getSerialNo());
                MainJFrame.allCars.add(car);

            });
            uploadedJList.setModel(model);
            JOptionPane.showMessageDialog(this, "Uploaded successfully!!", "Upload Car Details", INFORMATION_MESSAGE);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminAdvanceAdd.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Invalid JSON!", "Upload Car Details", ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableFromJLabel;
    private javax.swing.JLabel availableSeatsJLabel;
    private javax.swing.JLabel availableTillJLabel;
    private javax.swing.JLabel brandJLabel;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JLabel createdAtJLabel;
    private javax.swing.JLabel identifierJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel manufacturerJLabel;
    private javax.swing.JLabel manufacturerYearJLabel;
    private javax.swing.JLabel mceJLabel;
    private javax.swing.JLabel modelNoJLabel;
    private javax.swing.JLabel seatsJLabel;
    private javax.swing.JLabel serialNoJLabel;
    private javax.swing.JLabel updatedAtJLabel;
    private javax.swing.JButton uploadFileJButton;
    private javax.swing.JList<String> uploadedJList;
    // End of variables declaration//GEN-END:variables
}
