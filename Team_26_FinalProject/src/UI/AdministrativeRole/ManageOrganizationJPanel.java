/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdministrativeRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Magic.Design.MyJLabel;
import Magic.Design.MyJTextField;
import static Business.Enterprise.Enterprise.EnterpriseType.NGO;
import static Business.Enterprise.Enterprise.EnterpriseType.Insurance;
import Business.Organization.Organization;
import Business.Organization.Organization.ThalassemiaCentreType;
import Business.Organization.Organization.NGOType;
import Business.Organization.Organization.InsuranceType;
import Business.Organization.Organization.BloodBankType;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import Magic.Design.MyTableFormat;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Magic.Design.MyJButton;
import static Business.Enterprise.Enterprise.EnterpriseType.BloodBank;
import static Business.Enterprise.Enterprise.EnterpriseType.ThalassemiaCentre;


public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory, Enterprise enterprise, EcoSystem system ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterprise = enterprise;
        this.system = system;
        organizationJTable.getTableHeader().setDefaultRenderer(new MyTableFormat());
        enterpriseNameTextField1.setText(enterprise.getName());
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        boolean add = true; 
       // for (Type type : Organization.Type.values()){
        //    if (!type.getValue().equals(Type.Admin.getValue()))
        //        organizationJComboBox.addItem(type);
       // }
       
       System.out.println(enterprise.getEnterpriseType());
       System.out.println(enterprise.getEnterpriseType().toString().equals(BloodBank.toString()));
       if(enterprise.getEnterpriseType().toString().equals(Insurance.toString())){
        for(Organization.InsuranceType legalType: Organization.InsuranceType.values()){
            add = true;
            if (legalType.getValue().equals(Organization.InsuranceType.InsuranceOfficer.getValue())){
                for (Organization organization : directory.getOrganizationList()) {
                    if(organization.getName().equals(legalType.getValue()))
                        add = false;
                }
                if(add)
                    organizationJComboBox.addItem(legalType);
            }
        }
        }
       
       else if(enterprise.getEnterpriseType().toString().equals(BloodBank.toString())){
        for(Organization.BloodBankType liverType: Organization.BloodBankType.values()){
            add = true;
            System.out.println(liverType.getValue());
            System.out.println(Organization.BloodBankType.BloodBank.getValue());
            if (liverType.getValue().equals(Organization.BloodBankType.BloodBank.getValue())){
                for (Organization organization : directory.getOrganizationList()) {
                    if(organization.getName().equals(liverType.getValue()))
                        add = false;
                }
                if(add)
                    organizationJComboBox.addItem(liverType);
            }
        }
        }
       else if(enterprise.getEnterpriseType().toString().equals(ThalassemiaCentre.toString())){
        for(Organization.ThalassemiaCentreType cirrhosisType: Organization.ThalassemiaCentreType.values()){
            if (cirrhosisType.getValue().equals(Organization.ThalassemiaCentreType.ThalassemiaCentre.getValue())){
                organizationJComboBox.addItem(cirrhosisType);
            }
        }
        }
       else if(enterprise.getEnterpriseType().toString().equals(NGO.toString())){
        for(Organization.NGOType govtType: Organization.NGOType.values()){
            add = true;
            if (govtType.getValue().equals(Organization.NGOType.NGO.getValue())){
                for (Organization organization : directory.getOrganizationList()) {
                    if(organization.getName().equals(govtType.getValue()))
                        add = false;
                }
                if(add)
                    organizationJComboBox.addItem(govtType);
            }
        }
        }
       else{
        for (Organization.Type type : Organization.Type.values()){ 
            add = true;
            if (type.getValue().equals(Organization.Type.SystemCoordinator.getValue())
                    ||type.getValue().equals(Organization.Type.Doctor.getValue())
                    ||type.getValue().equals(Organization.Type.MedicalTechnician.getValue())
                    ) {
                for (Organization organization : directory.getOrganizationList()) {
                    if(organization.getName().equals(type.getValue()))
                        add = false;
                }
                if(add)
                    organizationJComboBox.addItem(type);
            }
        }
       
    }
    }
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getName();
            row[1] = organization.getRealName();
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        panel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOrgRealName = new javax.swing.JTextField();
        nameSeparator = new javax.swing.JSeparator();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        nameSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameSeparator4 = new javax.swing.JSeparator();
        enterpriseNameTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 221, 228));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 204)));
        organizationJTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(51, 51, 51));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Type", "Organization Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setGridColor(new java.awt.Color(0, 0, 0));
        organizationJTable.setRowHeight(30);
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 650, 270));

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        panel1.setPreferredSize(new java.awt.Dimension(250, 400));
        panel1.setRequestFocusEnabled(false);
        panel1.setVerifyInputWhenFocusTarget(false);
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create Organization");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 328, 36));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name of Organization");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 26));

        txtOrgRealName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtOrgRealName.setBorder(null);
        txtOrgRealName.setCaretColor(new java.awt.Color(30, 59, 92));
        txtOrgRealName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOrgRealNameFocusGained(evt);
            }
        });
        txtOrgRealName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgRealNameActionPerformed(evt);
            }
        });
        panel1.add(txtOrgRealName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 312, 290, 30));

        nameSeparator.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(nameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 280, 10));

        organizationJComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        panel1.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 261, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select Organization Type ");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 250, -1));

        addJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addJButton.setText("Add Organization");
        addJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        panel1.add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 190, 40));

        nameSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(nameSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 290, 10));

        add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 400, 460));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("                                                               Manage Organization");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1508, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Enterprise:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        nameSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(nameSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 240, 10));

        enterpriseNameTextField1.setEditable(false);
        enterpriseNameTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enterpriseNameTextField1.setBorder(null);
        add(enterpriseNameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        String check1 = "";    
        
        if (txtOrgRealName.getText().isEmpty()) {
            txtOrgRealName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtOrgRealName.setForeground(Color.red);

            JOptionPane.showMessageDialog(null, 
                    new JLabel("<html><b>Organization Name can not be empty!</b></html>") , 
                    "Error", JOptionPane.ERROR_MESSAGE);
                   

            //JOptionPane.showMessageDialog(null, "Organization name cannot be empty!");
            check1 = "do not go further!";
            return;
        }

        
        for (Organization organization : directory.getOrganizationList()) {

            if (organization.getName().equals(txtOrgRealName.getText())) {
                
            JOptionPane.showMessageDialog(null, 
                    new JLabel("<html><b>Organization name already exists!</b></html>") , 
                    "Error", JOptionPane.ERROR_MESSAGE);
            
                check1 = "do not go further!";
                return;
            }
        }

// Main Process after validation checks
        if(check1.equals("")){
        if(enterprise.getEnterpriseType().toString().equals(Insurance.toString())){
            directory.createInsuranceOrganization((InsuranceType)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText());
        }
        else if(enterprise.getEnterpriseType().toString().equals(NGO.toString())){
            directory.createNGOOrganization((NGOType)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText());
        }
        else if(enterprise.getEnterpriseType().toString().equals(BloodBank.toString())){
            directory.createBloodOrganization((BloodBankType)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText());
        }
        else if(enterprise.getEnterpriseType().toString().equals(ThalassemiaCentre.toString())){
            directory.createThalassemiaCentreOrganization((ThalassemiaCentreType)organizationJComboBox.getSelectedItem(), txtOrgRealName.getText());
        }
        else{
            
        Type type = (Type) organizationJComboBox.getSelectedItem();
        directory.createOrganization(type, txtOrgRealName.getText());
        }
        populateTable();
        
        
       JOptionPane.showMessageDialog(null, 
               new JLabel("<html><b>"+ txtOrgRealName.getText() + " Organization Created!</b></html>"),
                "Approved",
                JOptionPane.INFORMATION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/images/approved.png"))
       );
                   
        
        
        dB4OUtil.storeSystem(system);
        
        
        txtOrgRealName.setText("");
//        organizationJComboBox.removeItem(organizationJComboBox.getSelectedItem());
        }
        populateCombo();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void txtOrgRealNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOrgRealNameFocusGained
        // TODO add your handling code here:
        txtOrgRealName.setText("");
    }//GEN-LAST:event_txtOrgRealNameFocusGained

    private void txtOrgRealNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgRealNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgRealNameActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JTextField enterpriseNameTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator nameSeparator;
    private javax.swing.JSeparator nameSeparator1;
    private javax.swing.JSeparator nameSeparator4;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField txtOrgRealName;
    // End of variables declaration//GEN-END:variables
}
