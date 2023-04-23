/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.BloodBankCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Blood_Bank_Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import Magic.Design.*;
import javax.swing.ImageIcon;
import Magic.Design.MyJLabel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;
import UI.BloodBankCoordinatorRole.ManageBloodBankCoordinatorProfile;

/**
 *
 * @author pravallika
 */


public class BloodBankCoordinatorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodBankCoordinatorWorkAreaJPanel
     */
    boolean a = true;
    private UserAccount userAccount;
    private Blood_Bank_Organization liverBankOrganization;
    private Enterprise enterprise;
    private EcoSystem system;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public BloodBankCoordinatorWorkAreaJPanel(UserAccount account, Blood_Bank_Organization liverBankOrganization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userAccount = account;
        this.liverBankOrganization = liverBankOrganization;
        this.enterprise = enterprise;
        this.system = business;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        BtnProfile = new javax.swing.JLabel();
        BtnManageRequests = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(15, 29, 52));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.GridLayout(1, 0));

        BtnProfile.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnProfile.setForeground(new java.awt.Color(255, 255, 255));
        BtnProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnProfile.setText("Profile");
        BtnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnProfileMouseClicked(evt);
            }
        });
        Header.add(BtnProfile);

        BtnManageRequests.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnManageRequests.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageRequests.setText("Manage Requests");
        BtnManageRequests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageRequestsMouseClicked(evt);
            }
        });
        Header.add(BtnManageRequests);

        add(Header, java.awt.BorderLayout.PAGE_START);

        userProcessContainer.setBackground(new java.awt.Color(255, 214, 243));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProfileMouseClicked
        // TODO add your handling code here:
        ManageBloodBankCoordinatorProfile manageliverBankProfile = new ManageBloodBankCoordinatorProfile(userAccount,liverBankOrganization,enterprise);
        userProcessContainer.add("ManageLiverBankCoordinatorProfile",manageliverBankProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnProfileMouseClicked

    private void BtnManageRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageRequestsMouseClicked
        // TODO add your handling code here:
        BloodRequestJPanel liverBankRequestJPanel = new BloodRequestJPanel( userAccount,  liverBankOrganization, enterprise, network, system);
        userProcessContainer.add("LiverRequestJPanel",liverBankRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_BtnManageRequestsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnManageRequests;
    private javax.swing.JLabel BtnProfile;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
