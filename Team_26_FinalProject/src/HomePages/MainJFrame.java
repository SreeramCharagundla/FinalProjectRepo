/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HomePages;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pravallika
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() throws IOException {
        initComponents();
        jPanel1.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("./HomePages/Image.jpeg"))));
        userNameLabel.setForeground(Color.BLACK);
        passwordLabel.setForeground(Color.BLACK);
        
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPanel = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        rightJPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        imgHope = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        leftJPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        userNameJTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        donorSignUpBtn = new javax.swing.JButton();
        patientRegistrationBtn = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 720));

        jSplitPane1.setDividerLocation(150);

        rightJPanel.setAutoscrolls(true);
        rightJPanel.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 1200));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(imgHope, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1296, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        rightJPanel.add(jPanel1, "card2");

        jSplitPane1.setRightComponent(rightJPanel);

        leftJPanel.setAutoscrolls(true);
        leftJPanel.setPreferredSize(new java.awt.Dimension(1150, 720));
        leftJPanel.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setAutoscrolls(true);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        loginJButton.setText("Login");
        loginJButton.setBorder(new javax.swing.border.MatteBorder(null));
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(loginJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, 31));

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 239, 118, -1));

        userNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(userNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 179, 118, -1));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordLabel.setText("Password");
        jPanel3.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 216, -1, -1));

        userNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        userNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userNameLabel.setText("Username");
        jPanel3.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, 70, 20));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        donorSignUpBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        donorSignUpBtn.setText("Want to contribute?");
        donorSignUpBtn.setBorder(new javax.swing.border.MatteBorder(null));
        donorSignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorSignUpBtnActionPerformed(evt);
            }
        });
        jPanel2.add(donorSignUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, 150, 30));

        patientRegistrationBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        patientRegistrationBtn.setText("Are you a Patient?");
        patientRegistrationBtn.setBorder(new javax.swing.border.MatteBorder(null));
        patientRegistrationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientRegistrationBtnActionPerformed(evt);
            }
        });
        jPanel2.add(patientRegistrationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 71, 150, 30));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 366, 150, -1));

        logoutJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.setBorder(new javax.swing.border.MatteBorder(null));
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 90, 29));

        jLabel3.setMaximumSize(new java.awt.Dimension(65, 65));
        jLabel3.setMinimumSize(new java.awt.Dimension(65, 65));
        jLabel3.setPreferredSize(new java.awt.Dimension(65, 65));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 6, 104, 126));

        leftJPanel.add(jPanel3, "card2");

        jSplitPane1.setLeftComponent(leftJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        
        donorSignUpBtn.setEnabled(true);
        patientRegistrationBtn.setEnabled(true);
        

        userNameJTextField.setText("");
        passwordField.setText("");

        rightJPanel.removeAll();

        JPanel blankJP = new JPanel();
        blankJP.setBackground(new Color(241, 250, 238)); //[241,250,238]
        rightJPanel.add("blankJP", blankJP);
        //        rightJPanel.add("blankJP", imgHope);

        rightJPanel.setBackground(new Color(241, 250, 238));
        //        imgHope.setVisible(true);
        CardLayout crdLyt = (CardLayout) rightJPanel.getLayout();
        crdLyt.next(rightJPanel);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String userName = userNameJTextField.getText();
        imgHope.setVisible(false);
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        //        System.out.println(system.getName());
        //        System.out.println("1");
        //        System.out.println(system.getUserAccountDirectory());
        //        System.out.println("2");
        //        System.out.println(userName);
        //        System.out.println(password);
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        Network inNetwork=null;

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterprise_Directory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                            userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if(userAccount!=null){
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                inNetwork = network;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            JOptionPane.showMessageDialog(null,
                new JLabel("<html><b>" + " Invalid Credentials!</b></html>"),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );

            //JOptionPane.showMessageDialog(null, "Invalid credentials!");
            return;
        }
        else{
            CardLayout layout=(CardLayout)rightJPanel.getLayout();
            System.out.println(inEnterprise);
            System.out.println(userAccount.getRole());
            System.out.println(system);
            rightJPanel.add("workArea",userAccount.getRole().createWorkArea(rightJPanel, userAccount, inOrganization, inEnterprise, system, inNetwork));

            layout.next(rightJPanel);
        }

        //        jLabel11.setEnabled(false);
        //logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        donorSignUpBtn.setEnabled(false);
        patientRegistrationBtn.setEnabled(false);
        
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void patientRegistrationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientRegistrationBtnActionPerformed
        new DonorReceiverFramePage("receiver", system).show();
        //        imgHope.setVisible(false);
    }//GEN-LAST:event_patientRegistrationBtnActionPerformed

    private void donorSignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorSignUpBtnActionPerformed
        new DonorReceiverFramePage("donor", system).show();
        //        imgHope.setVisible(false);
    }//GEN-LAST:event_donorSignUpBtnActionPerformed

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
                try {
                    new MainJFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donorSignUpBtn;
    private javax.swing.JLabel imgHope;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JButton loginJButton;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton patientRegistrationBtn;
    private javax.swing.JPanel rightJPanel;
    private javax.swing.JLabel rightPanel;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
