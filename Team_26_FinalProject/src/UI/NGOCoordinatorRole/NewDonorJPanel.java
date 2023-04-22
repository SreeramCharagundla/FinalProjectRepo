/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.NGOCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.People.DonorRequest;
import Magic.Design.*;
import Business.People.DonorRequestDirectory;
import Magic.Design.MyJButton;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.SwingUtilities.getWindowAncestor;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sreeram
 */
public class NewDonorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewDonorJPanel
     */
    
    private boolean emailValid;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private byte[] tempdP;
    private ButtonGroup radioGroup1;
    private ButtonGroup radioGroup2;
    private ButtonGroup radioGroup3;
    private ButtonGroup radioGroup4;
            
    public NewDonorJPanel(EcoSystem system)
    {
        initComponents();
        this.system = system;
        this.radioGroup1 = new ButtonGroup();
        this.radioGroup2 = new ButtonGroup();
        this.radioGroup3 = new ButtonGroup();
        this.radioGroup4 = new ButtonGroup();
        
       // ButtonGroup radioGroup1 = new ButtonGroup();
        radioGroup1.add(btnYesQ1);
        radioGroup1.add(btnNoQ1);
  
      //  ButtonGroup radioGroup2 = new ButtonGroup();
        radioGroup2.add(btnYesQ2);
        radioGroup2.add(btnNoQ2);
        
      //  ButtonGroup radioGroup3 = new ButtonGroup();
        radioGroup3.add(btnYesQ3);
        radioGroup3.add(btnNoQ3);
        
       // ButtonGroup radioGroup4 = new ButtonGroup();
        radioGroup4.add(btnYesQ4);
        radioGroup4.add(btnNoQ4);
        
        populateGenderComboBox();
        populateStateComboBox();
    
    
    }
  
  private void populateGenderComboBox(){
           genderJComboBox.addItem("Male");
           genderJComboBox.addItem("Female");
           genderJComboBox.addItem("Other");
        }
  
  private void populateStateComboBox(){
           stateJComboBox.addItem("California");
           stateJComboBox.addItem("Massachusetts");
           stateJComboBox.addItem("Georgia");
           stateJComboBox.addItem("Arizona");
           stateJComboBox.addItem("Texas");
           stateJComboBox.addItem("Florida");
           stateJComboBox.addItem("Illinois");
      }
    public static boolean phoneNumberValidator(String contact) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(contact);
        return matcher.matches();
        }
    public static boolean zipCodeValidator(String zip) {
        Pattern pattern;
        Matcher matcher;
        String zip_pattern = "^[0-9]{5}$";
        pattern = Pattern.compile(zip_pattern);
        matcher = pattern.matcher(zip);
        return matcher.matches();
        } 
    public static boolean emailValidator(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
        }
    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
        }

    private void disableAllButton(){
    
        uidText.setEnabled(false);
        nameText.setEnabled(false);
        dobDateField.setEnabled(false);
        ageText.setEnabled(false);
        emailText.setEnabled(false);
        contactText.setEnabled(false);
        genderJComboBox.setEnabled(false);
        digTypesTextField.setEnabled(false);
        streetText.setEnabled(false);
        cityText.setEnabled(false);
        stateJComboBox.setEnabled(false);
        zipText.setEnabled(false);
        btnYesQ1.setEnabled(false);
        btnNoQ1.setEnabled(false);
        btnYesQ2.setEnabled(false);
        btnNoQ2.setEnabled(false);
        btnYesQ3.setEnabled(false);
        btnNoQ3.setEnabled(false);
        btnYesQ4.setEnabled(false);
        btnNoQ4.setEnabled(false);
        addPhotoButton.setEnabled(false);
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uidText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        addPhotoButton = new javax.swing.JButton();
        btnYesQ2 = new javax.swing.JRadioButton();
        btnNoQ2 = new javax.swing.JRadioButton();
        btnNoQ1 = new javax.swing.JRadioButton();
        btnYesQ1 = new javax.swing.JRadioButton();
        btnNoQ3 = new javax.swing.JRadioButton();
        btnYesQ3 = new javax.swing.JRadioButton();
        btnNoQ4 = new javax.swing.JRadioButton();
        btnYesQ4 = new javax.swing.JRadioButton();
        lblProfilePicture = new javax.swing.JLabel();
        dobDateField = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        stateJComboBox = new javax.swing.JComboBox();
        genderJComboBox = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        digTypesTextField = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        nameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 180, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 218, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Reg Num");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        uidText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(uidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("DOB");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Age");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, -1));

        ageText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ageText.setEnabled(false);
        ageText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageTextMouseClicked(evt);
            }
        });
        ageText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTextKeyPressed(evt);
            }
        });
        add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 180, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Gender");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Blood Type");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, 20));

        streetText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(streetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 180, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Street address");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("City");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        cityText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 180, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("State");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("ZipCode");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, -1));

        zipText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(zipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 180, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Contact Number");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        contactText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, 180, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Email ID");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        emailText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emailText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailTextMouseClicked(evt);
            }
        });
        emailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uEmailKeyTyped(evt);
            }
        });
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 170, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("You do not weigh less than 45kgs ");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 340, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("You do not any history with Breathing problem");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("You do not any history with Diabities and Blood Pressure");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 470, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("You are not suffering with any Anaemic conditions");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 630, 630, 20));

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 700, 110, 40));

        addPhotoButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addPhotoButton.setText("Add photo");
        addPhotoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhotoButtonActionPerformed(evt);
            }
        });
        add(addPhotoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 320, 120, 40));

        btnYesQ2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnYesQ2.setText("Yes");
        add(btnYesQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, -1, -1));

        btnNoQ2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNoQ2.setText("No");
        add(btnNoQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 540, -1, -1));

        btnNoQ1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNoQ1.setText("No");
        add(btnNoQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 480, -1, -1));

        btnYesQ1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnYesQ1.setText("Yes");
        add(btnYesQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 480, -1, -1));

        btnNoQ3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNoQ3.setText("No");
        add(btnNoQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, -1, -1));

        btnYesQ3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnYesQ3.setText("Yes");
        add(btnYesQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, -1, -1));

        btnNoQ4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNoQ4.setText("No");
        add(btnNoQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 660, -1, -1));

        btnYesQ4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnYesQ4.setText("Yes");
        add(btnYesQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 660, -1, -1));

        lblProfilePicture.setBackground(new java.awt.Color(0, 0, 0));
        lblProfilePicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        add(lblProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 170, 130, 130));

        dobDateField.setBackground(new java.awt.Color(255, 255, 255));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobDateFieldFocusLost(evt);
            }
        });
        dobDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dobDateFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dobDateFieldMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                agePop(evt);
            }
        });
        dobDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uDobKeyTyped(evt);
            }
        });
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 170, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("New Form");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 700, 120, 40));

        stateJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        stateJComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        stateJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateJComboBoxActionPerformed(evt);
            }
        });
        add(stateJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 180, -1));

        genderJComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        genderJComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        genderJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderJComboBoxActionPerformed(evt);
            }
        });
        add(genderJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 170, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Donor Registration Form ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1666, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1690, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 1140, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Donor Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 140, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Address Details");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 20, 360));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("By Registering to join this cause, you are confirming that");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        digTypesTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(digTypesTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 180, -1));

        btnBack.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 750, 110, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        DonorRequest donorRequest = new DonorRequest();
        Date currentDate = new Date(); 
         if ( lblProfilePicture == null ){
            lblProfilePicture.setBorder(BorderFactory.createLineBorder(Color.RED));
            lblProfilePicture.setForeground(Color.red);
            addPhotoButton.setBorder(BorderFactory.createLineBorder(Color.RED));
            addPhotoButton.setForeground(Color.red);       
        }
        if ( stateJComboBox.getSelectedItem().equals("") ){
            stateJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            stateJComboBox.setForeground(Color.red);
        }
        if ( genderJComboBox.getSelectedItem().equals("") ){
            genderJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            genderJComboBox.setForeground(Color.red);
        }
        if ( digTypesTextField.getText().equals("") ){
            digTypesTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            digTypesTextField.setForeground(Color.red);
        }
        if (nameText.getText().isEmpty()) {
            nameText.setBorder(BorderFactory.createLineBorder(Color.RED));
            nameText.setForeground(Color.red);
        }
        if (uidText.getText().isEmpty()) {
            uidText.setBorder(BorderFactory.createLineBorder(Color.RED));
            uidText.setForeground(Color.red);
        } 
        if (emailText.getText().isEmpty()) {
            emailText.setBorder(BorderFactory.createLineBorder(Color.RED));
            emailText.setForeground(Color.red);
        }
        if (contactText.getText().isEmpty()) {
            contactText.setBorder(BorderFactory.createLineBorder(Color.RED));
            contactText.setForeground(Color.red);
        }
        if (zipText.getText().isEmpty()) {
            zipText.setBorder(BorderFactory.createLineBorder(Color.RED));
            zipText.setForeground(Color.red);
        }
        if (cityText.getText().isEmpty()) {
            cityText.setBorder(BorderFactory.createLineBorder(Color.RED));
            cityText.setForeground(Color.red);
        }
        if (streetText.getText().isEmpty()) {
            streetText.setBorder(BorderFactory.createLineBorder(Color.RED));
            streetText.setForeground(Color.red);
        }      
        if (dobDateField.getDate() == null ) {
            dobDateField.setBorder(BorderFactory.createLineBorder(Color.RED));
            dobDateField.setForeground(Color.red);
        }
         if (ageText.getText().isEmpty()) {
            ageText.setBorder(BorderFactory.createLineBorder(Color.RED));
            ageText.setForeground(Color.red);
        }
         if(btnNoQ1.isSelected() || 
                 btnNoQ2.isSelected() ||
                 btnNoQ3.isSelected() ||
                 btnNoQ4.isSelected()) {
             JOptionPane.showMessageDialog(null,new JLabel(  "<html>Based on the inputs, we could not accept your Blood!<br> Thanks for your interest to save the Humanity!</html>") , "Error", JOptionPane.ERROR_MESSAGE);
             return ;
         }
       //
       //
       //
       //
       
        if (    nameText.getText().isEmpty()        || emailText.getText().isEmpty()        || cityText.getText().isEmpty() ||
                contactText.getText().isEmpty()     || zipText.getText().isEmpty()          || streetText.getText().isEmpty() || 
                uidText.getText().isEmpty()         || 
                dobDateField.getDate() == null      || 
                ageText.getText().isEmpty()         ||
                String.valueOf(genderJComboBox.getSelectedItem()).equals("") || 
                String.valueOf(digTypesTextField.getText()).equals("") || 
                String.valueOf(stateJComboBox.getSelectedItem()).equals(""))
            { 
            JOptionPane.showMessageDialog(null,new JLabel(  "<html><b>All fields are mandatory!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
             return ;
            }
   
        
        else if(  !btnNoQ1.isSelected()  &&  !btnYesQ1.isSelected()   ||
                  !btnNoQ2.isSelected()  &&  !btnYesQ2.isSelected()   ||
                  !btnNoQ3.isSelected()  &&  !btnYesQ3.isSelected()   ||
                  !btnNoQ4.isSelected()  &&  !btnYesQ4.isSelected()   )
        {
        JOptionPane.showMessageDialog(null,new JLabel("<html><b>All fields are mandatory!</b></html>"), "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
    
        else if (!isAlpha(nameText.getText()))
        {
         nameText.setBorder(BorderFactory.createLineBorder(Color.RED));
            nameText.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Name must contain only alphabets</b>!</html>") , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if (!isAlpha(cityText.getText()))
        {
         cityText.setBorder(BorderFactory.createLineBorder(Color.RED));
            cityText.setForeground(Color.red);
         JOptionPane.showMessageDialog(null, new JLabel("<html><b>Name of the City must contain only alphabets!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
            return;
            //JOptionPane.showMessageDialog(null, "City name must contain only alphabets." , "Error", JOptionPane.ERROR_MESSAGE);
            //return;
        }
        
        else   if ( !phoneNumberValidator(contactText.getText())   ){
           //JOptionPane.showMessageDialog(null, "Contact number should be 10 digit and Zip should be 5 digit" , "Error", JOptionPane.ERROR_MESSAGE);
           JOptionPane.showMessageDialog(null, new JLabel("<html><b>Contact Number should be 10 digit!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
           // return;
           return;
        }
        else   if ( !zipCodeValidator(zipText.getText()) ){
           //JOptionPane.showMessageDialog(null, "Contact number should be 10 digit and Zip should be 5 digit" , "Error", JOptionPane.ERROR_MESSAGE);
           JOptionPane.showMessageDialog(null, new JLabel("<html><b>Zip should be 5 digit!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);
           return;
        }
        else   if ( !emailValidator(emailText.getText()) ){
           //JOptionPane.showMessageDialog(null, "Email ID must be in correct format!" , "Error", JOptionPane.ERROR_MESSAGE);
JOptionPane.showMessageDialog(null, new JLabel("<html><b>Email ID must be in correct format!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);

           return;
        } 
        
        else if (dobDateField.getDate().after(currentDate)) {
             //JOptionPane.showMessageDialog(null, "Date should be past date", "Error", JOptionPane.ERROR_MESSAGE);
             JOptionPane.showMessageDialog(null, new JLabel("<html><b>Are you booking for your children? Sorry, we don't accept it as of today!</b></html>") , "Error", JOptionPane.ERROR_MESSAGE);

             return;}          
          
          else{
            try {
                donorRequest.getDIG().updateDIGlist(digTypesTextField.getText());
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><b>Patient's Blood Type can only be one of these A, B, AB, O</b></html>"));
                return;
            }

            int n = JOptionPane.showConfirmDialog(null,new JLabel("<html><b>Would you like to submit the form?</b></html>"),
                    "CONFIRMATION REQUIRED",JOptionPane.YES_NO_OPTION);

            if(n == 0)
            {
                
        donorRequest.setDonorID(uidText.getText()); // UID
        donorRequest.setName(nameText.getText()); // Name
        donorRequest.setDob(dobDateField.getDate()); // DOB 
        donorRequest.setAge(Integer.parseInt(ageText.getText())); // Age
        donorRequest.setGender((String) genderJComboBox.getSelectedItem()); // gender
        donorRequest.setStreetAddress(streetText.getText()); // streetAddress
        donorRequest.setCity(cityText.getText()); // city
        donorRequest.setState((String) stateJComboBox.getSelectedItem()); // state
        donorRequest.setZipCode(Integer.parseInt(zipText.getText())); // zipCode
        donorRequest.setContact(Long.parseLong(contactText.getText())); // contact
        donorRequest.setEmailID(emailText.getText()); // emailID
        donorRequest.setStatus("New Request"); // status
        //donorRequest.setImagePath(photoTextField.getText()); 
        donorRequest.setdP(tempdP);
        
        for(DonorRequest dnr : system.getDonorRequestDirectory().getDonorRequestList()){
            //System.out.println("PRINITNG IT HERE!!");
           // System.out.println(dnr.getName());
        }
        
        if(btnYesQ1.isSelected())
        {donorRequest.setBrainInjury(true); //  labConfirmation
        }
        else if(btnNoQ1.isSelected())
        {donorRequest.setBrainInjury(false); //  labConfirmation
        }
        
        if(btnYesQ2.isSelected())
        {donorRequest.setBreathingProb(true); //  symptoms
        }
        else if(btnNoQ2.isSelected())
        {donorRequest.setBreathingProb(false); //  symptoms
        }
        
        if(btnYesQ3.isSelected())
        {donorRequest.setDiabitiesBP(true); //  symptoms
        }
        else if(btnNoQ3.isSelected())
        {donorRequest.setDiabitiesBP(false); //  symptoms
        }
        
        if(btnYesQ4.isSelected())
        {donorRequest.setChronicPains(true); //  followUpTest
        }
        else if(btnNoQ4.isSelected())
        {donorRequest.setChronicPains(false); //  followUpTest
        }
        system.getDonorRequestDirectory().addDonorRequest(donorRequest); 
        JOptionPane.showMessageDialog(null, new JLabel("<html><b>Thank you for volunteering to save a life!</b></html>"));
        
        dB4OUtil.storeSystem(system);
        disableAllButton();
        }}
        btnSubmit.setEnabled(false);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void addPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhotoButtonActionPerformed
        // TODO add your handling code here:
       /* JFileChooser chooser1 = new JFileChooser();
        chooser1.showOpenDialog(null);
        File f = chooser1.getSelectedFile();
        String filename = f.getAbsolutePath();
        photoTextField.setText(filename);
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(), Image.SCALE_SMOOTH);
        jLabel23.setIcon(icon);*/
       
       
       JFileChooser file = new JFileChooser();
          file.setCurrentDirectory(new File(System.getProperty("user.dir")));
          //filter the files
          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
          file.addChoosableFileFilter(filter);
          int result = file.showSaveDialog(null);
           //if the user click on save in Jfilechooser
          if(result == JFileChooser.APPROVE_OPTION){
              File selectedFile = file.getSelectedFile();
              tempdP = new byte[(int) selectedFile.length()]; 
                FileInputStream fis;
             try {
                 fis = new FileInputStream(selectedFile);
                 fis.read(tempdP);
                 fis.close();
             } catch (IOException ex) {
                 Logger.getLogger(NewDonorJPanel.class.getName()).log(Level.SEVERE, null, ex);
             }             
              lblProfilePicture.setIcon(ResizeImage(selectedFile.getAbsolutePath()));
              lblProfilePicture.setIcon(setPicture(selectedFile.getAbsolutePath(),lblProfilePicture));
          }

          else if(result == JFileChooser.CANCEL_OPTION){
             // System.out.println("No File Select");
          }
       
          
       
    }//GEN-LAST:event_addPhotoButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        lblProfilePicture.setIcon(null);
        radioGroup1.clearSelection();
        radioGroup2.clearSelection();
        radioGroup3.clearSelection();
        radioGroup4.clearSelection();
        uidText.setEnabled(true);
        nameText.setEnabled(true);
        dobDateField.setEnabled(true);
        ageText.setEnabled(false);
        emailText.setEnabled(true);
        contactText.setEnabled(true);
        genderJComboBox.setEnabled(true);
        digTypesTextField.setEnabled(true);
        streetText.setEnabled(true);
        cityText.setEnabled(true);
        stateJComboBox.setEnabled(true);
        zipText.setEnabled(true);
        btnYesQ1.setEnabled(true);
        btnNoQ1.setEnabled(true);
        btnYesQ2.setEnabled(true);
        btnNoQ2.setEnabled(true);
        btnYesQ3.setEnabled(true);
        btnNoQ3.setEnabled(true);
        btnYesQ4.setEnabled(true);
        btnNoQ4.setEnabled(true);
        addPhotoButton.setEnabled(true);
        
        uidText.setText("");
        nameText.setText("");
        ageText.setText("");
        emailText.setText("");
        contactText.setText("");
        streetText.setText("");
        cityText.setText("");
        zipText.setText("");
        digTypesTextField.setText("");
        
        genderJComboBox.setSelectedItem("");
        stateJComboBox.setSelectedItem("");
        
        dobDateField.setCalendar(null);
        
        btnYesQ1.setSelected(false);
        btnNoQ1.setSelected(false);
        btnYesQ2.setSelected(false);
        btnNoQ2.setSelected(false);
        btnYesQ3.setSelected(false);
        btnNoQ3.setSelected(false);
        btnYesQ4.setSelected(false);
        btnNoQ4.setSelected(false);
        
        lblProfilePicture.removeAll();
        
        btnSubmit.setEnabled(true);
            
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void stateJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateJComboBoxActionPerformed
       
        
    }//GEN-LAST:event_stateJComboBoxActionPerformed

    private void genderJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderJComboBoxActionPerformed

    private void uEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uEmailKeyTyped
        // TODO add your handling code here:
        if (!emailValidator(emailText.getText())) {
            emailValid = false;
        } else {
//            emailText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            emailText.setForeground(Color.BLACK);
            emailValid = true;
        }
        
        
        
    }//GEN-LAST:event_uEmailKeyTyped

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void uDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uDobKeyTyped
        // TODO add your handling code here:
        // System.out.println("date");
    /*

        Date dob = dobDateField.getDate();
    
        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday;  //Birth date
        birthday = LocalDate.of(dob);
 
        Period p = Period.between(birthday, today);
        
        ageText.setText(String.valueOf(p.getYears()));
    String dobq=  calculateAge(dob, today);    
        
    }

    
*/
  /*  public  int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
  
      */
    }//GEN-LAST:event_uDobKeyTyped

    private void ageTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextKeyPressed

    private void ageTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageTextMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        //System.out.println(dob.getYear());
        ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    
      /*  LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday;  //Birth date
        birthday = LocalDate.of(dob);
 
        Period p = Period.between(birthday, today);
        
        ageText.setText(String.valueOf(p.getYears()));
        String dobq=  calculateAge(dob, today);  
        */
        
    }//GEN-LAST:event_ageTextMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
       // System.out.println(dob.getYear());
        ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_formMouseClicked

    private void dobDateFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMouseExited
  //    Date dob = dobDateField.getDate();
 //       System.out.println(dob.getYear());
    //    ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_dobDateFieldMouseExited

    public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblProfilePicture.getWidth(), lblProfilePicture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
     private ImageIcon setPicture(String carImageLocation, JLabel carImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(carImageLocation);
        Image picCar = imageCar.getImage();
        Image resizedImage = picCar.getScaledInstance(carImage.getWidth(), carImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        
        return selectedCarPicture;  
}    
    
    private void dobDateFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMousePressed
     
    }//GEN-LAST:event_dobDateFieldMousePressed

    
    private void dobDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDateFieldFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_dobDateFieldFocusLost

    private void agePop(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agePop
        // TODO add your handling code here:
        Date dob = dobDateField.getDate();
        System.out.println(dob.getYear());
        ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
        
    }//GEN-LAST:event_agePop

    private void emailTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTextMouseClicked
        // TODO add your handling code here:
        
        Date dob = dobDateField.getDate();
      //  System.out.println(dob.getYear());
        ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_emailTextMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        NewDonorJPanel.super.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPhotoButton;
    private javax.swing.JTextField ageText;
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnNoQ1;
    private javax.swing.JRadioButton btnNoQ2;
    private javax.swing.JRadioButton btnNoQ3;
    private javax.swing.JRadioButton btnNoQ4;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JRadioButton btnYesQ1;
    private javax.swing.JRadioButton btnYesQ2;
    private javax.swing.JRadioButton btnYesQ3;
    private javax.swing.JRadioButton btnYesQ4;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField contactText;
    private javax.swing.JTextField digTypesTextField;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JTextField emailText;
    private javax.swing.JComboBox genderJComboBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox stateJComboBox;
    private javax.swing.JTextField streetText;
    private javax.swing.JTextField uidText;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables
}
