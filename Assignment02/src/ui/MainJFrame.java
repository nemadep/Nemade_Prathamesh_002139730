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

        LoginPage loginPage = new LoginPage(jSplitPane, leftJPanel, rightJPanel);
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
        setResizable(false);

        jSplitPane.setEnabled(false);

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

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logoutJPanelLayout = new javax.swing.GroupLayout(logoutJPanel);
        logoutJPanel.setLayout(logoutJPanelLayout);
        logoutJPanelLayout.setHorizontalGroup(
            logoutJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutJPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        logoutJPanelLayout.setVerticalGroup(
            logoutJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoutJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginPage loginPage = new LoginPage(jSplitPane, leftJPanel, rightJPanel);
        jSplitPane.setRightComponent(loginPage);
        jSplitPane.setDividerLocation((int) (0 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width)));
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JPanel logoutJPanel;
    private javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}
