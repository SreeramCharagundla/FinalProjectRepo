/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdministrativeRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Magic.Design.MyJLabel;
import Magic.Design.MyJTextField;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Magic.Design.MyJButton;
import Magic.Design.MyTableFormat;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pravallika
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.system = system;
        
        organizationJTable.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateOrganizationComboBox();
        
        enterpriseNameTextField1.setText(enterprise.getName());
        
    }
     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);
        for (Organization o : organizationDir.getOrganizationList()) {
            for (Employee employee : o.getEmployeeDirectory().getEmployeeList()) {
                Object[] row = new Object[3];
                row[0] = o;
                row[1] = o.getRealName();
                row[2] = employee.getName();
                model.addRow(row);
            }

        }

    }
    public void populateOrganizationComboBox(){
        organizationJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationJComboBox.addItem(organization);
            
            
            
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationEmpJComboBox.addItem(organization.getRealName());
        }
    }

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[3];
            row[0] = organization;
            row[1] = organization.getRealName();
            row[2] = employee;
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameSeparator = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        organizationJComboBox = new javax.swing.JComboBox();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        nameSeparator1 = new javax.swing.JSeparator();
        nameSeparator3 = new javax.swing.JSeparator();
        btnCreateEmp = new javax.swing.JButton();
        nameSeparator4 = new javax.swing.JSeparator();
        enterpriseNameTextField1 = new javax.swing.JTextField();

        enterpriseNameTextField.setBackground(new java.awt.Color(55, 96, 128));
        enterpriseNameTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        enterpriseNameTextField.setBorder(null);
        enterpriseNameTextField.setCaretColor(new java.awt.Color(30, 59, 92));
        enterpriseNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enterpriseNameTextFieldFocusGained(evt);
            }
        });
        enterpriseNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseNameTextFieldActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 221, 228));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 204)));
        organizationJTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(51, 51, 51));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Type", "Organization Name", "Organization Admin Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        organizationJTable.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                organizationJTableInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 670, 300));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Enterprise:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(1550, 70));

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Organization Admins");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(505, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Create Admin");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 233, 36));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Organization Admin Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 180, 26));

        nameSeparator.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(nameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 300, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Type of Organization");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 200, 26));

        nameJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nameJTextField.setBorder(null);
        jPanel2.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 220, 30));

        organizationJComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        organizationJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                organizationJComboBoxItemStateChanged(evt);
            }
        });
        organizationJComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                organizationJComboBoxMouseClicked(evt);
            }
        });
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 210, 30));

        organizationEmpJComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 222, 210, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Name of Organization");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 220, 26));

        nameSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(nameSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 358, 300, -1));

        nameSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(nameSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 300, 10));

        btnCreateEmp.setText("Create Admin");
        btnCreateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmpActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreateEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 370, 450));

        nameSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(nameSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 200, 10));

        enterpriseNameTextField1.setEditable(false);
        enterpriseNameTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterpriseNameTextField1.setBorder(null);
        add(enterpriseNameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void enterpriseNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterpriseNameTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseNameTextFieldFocusGained

    private void enterpriseNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseNameTextFieldActionPerformed

    private void organizationJComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizationJComboBoxMouseClicked
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_organizationJComboBoxMouseClicked

    private void organizationJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_organizationJComboBoxItemStateChanged
        // TODO add your handling code here:
         Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        organizationEmpJComboBox.removeAllItems();
        organizationEmpJComboBox.addItem(organization.getRealName());
        
    }//GEN-LAST:event_organizationJComboBoxItemStateChanged

    private void organizationJTableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_organizationJTableInputMethodTextChanged
//        int selectedRow = organizationJTable.getSelectedRow();
//        Organization organization = (Organization) organizationJTable.getSelectedRow();
//        organization.getEmployeeDirectory().createEmployee(name);
//        uidTextField.setText( String.valueOf(tblPatient.getValueAt(selectedRow, 0)));
    }//GEN-LAST:event_organizationJTableInputMethodTextChanged

    private void btnCreateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmpActionPerformed
        String check1 = "";
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        
        if (organizationJComboBox.getSelectedItem().equals(null) )
        {
            organizationJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            organizationJComboBox.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, 
                    new JLabel("<html><b>Select an Organization Type!</b></html>"), 
                    "Warning", JOptionPane.WARNING_MESSAGE);
            check1 = "return";
        }
        
        else if (organizationEmpJComboBox.getSelectedItem().equals(null) )
        {
           organizationEmpJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            organizationEmpJComboBox.setForeground(Color.red);
             JOptionPane.showMessageDialog(null, 
                     new JLabel("<html><b>Select an Organization Name!</b></html>"), 
                     "Warning", JOptionPane.WARNING_MESSAGE);
            check1 = "return";
        }
        else if (nameJTextField.getText().isEmpty()) {
           nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            nameJTextField.setForeground(Color.red);
             JOptionPane.showMessageDialog(null, 
                     new JLabel("<html><b>Employee Name can not be same!</b></html>"), 
                     "Warning", JOptionPane.WARNING_MESSAGE);
            //JOptionPane.showMessageDialog(null, "Employee name cannot be empty.");
            check1 = "return";
            return;
        }
        
        else{
        
            for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {

            if (employee.getName().equals(nameJTextField.getText())) {
                JOptionPane.showMessageDialog(null, 
                        new JLabel("<html><b>Multiple employees can not have same name!</b></html>"), 
                        "Warning", JOptionPane.WARNING_MESSAGE);
                check1 = "return";
                return;
            }}
        }
        
        if(check1 == "")
        {
        
        String name = nameJTextField.getText();
        
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);
        
        final ImageIcon icon = new ImageIcon("..\\src\\Images\\approved.png");
        JOptionPane.showMessageDialog(null, "New Employee Created!","Approved",JOptionPane.INFORMATION_MESSAGE,icon);
                   
        //JOptionPane.showMessageDialog(null, "Employee created successfully!");
        
        nameJTextField.setText("");
        //organizationJComboBox.removeItem(organizationJComboBox.getSelectedItem());
        //organizationEmpJComboBox.removeItem(organizationEmpJComboBox.getSelectedItem());
        dB4OUtil.storeSystem(system);
        }
    }//GEN-LAST:event_btnCreateEmpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEmp;
    private javax.swing.JTextField enterpriseNameTextField;
    private javax.swing.JTextField enterpriseNameTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JSeparator nameSeparator;
    private javax.swing.JSeparator nameSeparator1;
    private javax.swing.JSeparator nameSeparator3;
    private javax.swing.JSeparator nameSeparator4;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
