/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import classes.Car;
import classes.User;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author prathameshnemade
 */
public class MainJFrame extends javax.swing.JFrame {

    public static ArrayList<User> adminLists = new ArrayList<User>();
    public static ArrayList<User> usersLists = new ArrayList<User>();
    public static ArrayList<Car> allCars = new ArrayList<Car>();
    public static ArrayList<Object> allDropdownLists = new ArrayList<Object>();

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        logoutJButton.setVisible(false);
        try {
            parseJSON("/Users/prathameshnemade/Desktop/NEU/AED/Nemade_Prathamesh_002139730/Assignment02/src/ui/AuthenticationConfig.json");
            parseDropdownJSON("/Users/prathameshnemade/Desktop/NEU/AED/Nemade_Prathamesh_002139730/Assignment02/src/ui/carsDropdown.json");

        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            injectComponents();
        }
    }

    private void injectComponents() {

        LoginPage loginPage = new LoginPage(jSplitPane, leftJPanel, rightJPanel, logoutJButton);
        jSplitPane.setRightComponent(loginPage);

    }

    private void parseJSON(String path) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        try {
            Object obj = jsonParser.parse(new FileReader(path));
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject adminList = (JSONObject) jsonObject.get("admin");
            JSONObject usersList = (JSONObject) jsonObject.get("users");

            Iterator<Object> adminIterator = adminList.keySet().iterator();
            Iterator<Object> userIterator = usersList.keySet().iterator();

            int index = 1000;
            while (adminIterator.hasNext()) {
                Object key = adminIterator.next();
                Object value = (Object) adminList.get(key);
                JSONObject tempObject = (JSONObject) value;
                String tempEmail = (String) tempObject.get("email");
                String tempName = (String) tempObject.get("name");
                String tempPassword = (String) tempObject.get("password");
                User user = new User();
                user.email = tempEmail;
                user.name = tempName;
                user.setPassword(tempPassword);
                user.type = ("admin");
                user.uniqueIdentifier = index;
                adminLists.add(user);
                index++;
            }

            while (userIterator.hasNext()) {
                Object key = userIterator.next();
                Object value = (Object) usersList.get(key);
                JSONObject tempObject = (JSONObject) value;
                String tempEmail = (String) tempObject.get("email");
                String tempName = (String) tempObject.get("name");
                String tempPassword = (String) tempObject.get("password");
                User user = new User();
                user.email = tempEmail;
                user.name = tempName;
                user.setPassword(tempPassword);
                user.type = ("user");
                user.uniqueIdentifier = index;
                usersLists.add(user);
                index++;
            }

            System.out.println(String.valueOf(usersList));
            System.out.println(String.valueOf(adminList));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void parseDropdownJSON(String path) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        try {
            Object obj = jsonParser.parse(new FileReader(path));
            JSONObject jsonObject = (JSONObject) obj;
            allDropdownLists = (ArrayList<Object>) jsonObject.get("Makes");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        jSplitPane = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        rightJPanel = new javax.swing.JPanel();
        logoutJPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logoutJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
        setResizable(false);

        jSplitPane.setEnabled(false);

        leftJPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftJPanel.setPreferredSize(new java.awt.Dimension(483, 762));
        leftJPanel.setSize(new java.awt.Dimension(200, 762));

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(leftJPanel);

        rightJPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout rightJPanelLayout = new javax.swing.GroupLayout(rightJPanel);
        rightJPanel.setLayout(rightJPanelLayout);
        rightJPanelLayout.setHorizontalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rightJPanelLayout.setVerticalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane.setRightComponent(rightJPanel);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logoutJButton.setBackground(new java.awt.Color(67, 100, 100));
        logoutJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        logoutJButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(67, 100, 100));
        jLabel1.setText("CAR MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutJButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(logoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout logoutJPanelLayout = new javax.swing.GroupLayout(logoutJPanel);
        logoutJPanel.setLayout(logoutJPanelLayout);
        logoutJPanelLayout.setHorizontalGroup(
            logoutJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutJPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        logoutJPanelLayout.setVerticalGroup(
            logoutJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutJPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSplitPane)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoutJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        LoginPage loginPage = new LoginPage(jSplitPane, leftJPanel, rightJPanel, logoutJButton);
        logoutJButton.setVisible(false);
        jSplitPane.setRightComponent(loginPage);
        jSplitPane.setDividerLocation((int) (0 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width)));
    }//GEN-LAST:event_logoutJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPanel logoutJPanel;
    private javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}
