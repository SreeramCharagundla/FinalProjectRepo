/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.NGOCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.People.Donor;
import Business.People.DonorDirectory;
import Magic.Design.*;
import Magic.Design.MyJLabel;
import Magic.Design.MyJButton;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pravallka
 */
public class CreateDonorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorListJPanel
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";

    /**
     * Creates an authorized Credential object.
     *
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        //InputStream in = Google.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        // InputStream in =  new FileInputStream("C:\\Users\\adwai\\Documents\\NetBeansProjects\\google\\credentials.json");
        InputStream in = new FileInputStream("credentials.json");
        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
        }
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");

    }

    public CreateDonorJPanel(EcoSystem system) throws GeneralSecurityException, IOException {
        initComponents();
        this.system = system;

        tblGoogleSheet.getTableHeader().setDefaultRenderer(new MyTableFormat());
        donorTable.getTableHeader().setDefaultRenderer(new MyTableFormat());
        populateTable();
        populateGoogleSheetTable();

    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) donorTable.getModel();

        dtm.setRowCount(0);

        for (Donor donor : system.getDonorDirectory().getDonorList()) {
            Object row[] = new Object[2];
            row[0] = donor;
            row[1] = donor.getName();
            // row[2]=donor.getContact();

            dtm.addRow(row);
        }
    }

    private void populateGoogleSheetTable() throws GeneralSecurityException, IOException {
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        final String spreadsheetId = "1YulpIxHOwFfDMM57n7hbxZueFSsw-q414bD5tzNMUv0";
        final String range = "Form Responses 2!A2:S";
        //final String range = "Form Responses 1!A2:E";
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
        } else {

            DefaultTableModel dtm = (DefaultTableModel) tblGoogleSheet.getModel();

            dtm.setRowCount(0);

            for (List row : values) {

                System.out.println(row.get(1));
                System.out.println(row.get(3));
                Object row1[] = new Object[4];

                row1[1] = row.get(1);
                row1[2] = row.get(2);
                row1[0] = row.get(3);
                row1[3] = row.get(7);
                dtm.addRow(row1);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGoogleSheet = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        buttonCreate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        donorTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uidTextField = new javax.swing.JTextField();
        digTypeTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 221, 228));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblGoogleSheet.setBackground(new java.awt.Color(0, 0, 0));
        tblGoogleSheet.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblGoogleSheet.setForeground(new java.awt.Color(255, 255, 255));
        tblGoogleSheet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name", "Contact", "Blood Group"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGoogleSheet.setFocusable(false);
        tblGoogleSheet.setGridColor(new java.awt.Color(0, 0, 0));
        tblGoogleSheet.setRowHeight(30);
        tblGoogleSheet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblGoogleSheetMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblGoogleSheet);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 1200, 210));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Donor Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 760, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Contact");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, 30));

        nameTextField.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        nameTextField.setEnabled(false);
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 212, -1));

        contactTextField.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        contactTextField.setEnabled(false);
        add(contactTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 212, -1));

        buttonCreate.setBackground(new java.awt.Color(31, 31, 31));
        buttonCreate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCreate.setForeground(new java.awt.Color(255, 255, 255));
        buttonCreate.setText("Create Donor");
        buttonCreate.setBorder(new javax.swing.border.MatteBorder(null));
        buttonCreate.setEnabled(false);
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });
        add(buttonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 150, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Create Donor Profile");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));

        donorTable.setBackground(new java.awt.Color(0, 0, 0));
        donorTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        donorTable.setForeground(new java.awt.Color(255, 255, 255));
        donorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        donorTable.setGridColor(new java.awt.Color(0, 0, 0));
        donorTable.setRowHeight(30);
        jScrollPane2.setViewportView(donorTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 1180, 220));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Create Donor Profile");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1576, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("UID");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Blood Group");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, -1, 30));

        uidTextField.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        uidTextField.setEnabled(false);
        add(uidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 450, 230, -1));

        digTypeTextField.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        digTypeTextField.setEnabled(false);
        add(digTypeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        // TODO add your handling code here:

        Donor donor = new Donor();
        donor.setName(nameTextField.getText());
        donor.setDonorID(uidTextField.getText());

        System.out.println(contactTextField.getText());
        donor.setContact((int) Double.parseDouble(contactTextField.getText()));
        try {
            donor.getDig().updateDIGlist(digTypeTextField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><b>Donor's DIAG Type can only be one of these DIAG_A,DIAG_B,DIAG_C,DIAG_DR,DIAG_DBQ1</b></html>"));
            return;
        }
        donor.setStatus("Government Approved");
        system.getDonorDirectory().addDonor(donor);

        dB4OUtil.storeSystem(system);
        populateTable();
        JOptionPane.showMessageDialog(null, new JLabel("<html><b>A new Donor added! </b></html>"));

        //JOptionPane.showMessageDialog(null,"new Donor added!");
        nameTextField.setText("");
        contactTextField.setText("");
        uidTextField.setText("");
        digTypeTextField.setText("");
        buttonCreate.setEnabled(false);

//        String message = "Thank you for choosing our hospital, and we wish you all the best in your continued journey to good health.";
//        String phoneNumber = contactTextField.getText();
//        System.out.println(message);
//        System.out.println(phoneNumber);
//
//        // Set up the HTTP request
//        OkHttpClient client = new OkHttpClient().newBuilder().build();
//        MediaType mediaType = MediaType.parse("application/json");
//        String json = "{\n"
//                + "  \"messages\": [\n"
//                + "    {\n"
//                + "        \"channel\": \"sms\",\n"
//                + "        \"recipients\": [\"" + phoneNumber + "\"],\n"
//                + "        \"content\": \"" + message + "\",\n"
//                + "        \"msg_type\": \"text\",\n"
//                + "        \"data_coding\": \"text\"\n"
//                + "    }\n"
//                + "  ],\n"
//                + "  \"message_globals\": {\n"
//                + "    \"originator\": \"SignOTP\",\n"
//                + "    \"report_url\": \"https://the_url_to_recieve_delivery_report.com\"\n"
//                + "  }\n"
//                + "}";
//        System.out.println(json);
//        RequestBody body = RequestBody.create(json, mediaType);
//        Request request = new Request.Builder()
//                .url("https://api.d7networks.com/messages/v1/send")
//                .method("POST", body)
//                .addHeader("Content-Type", "application/json")
//                .addHeader("Accept", "application/json")
//                .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJhdXRoLWJhY2tlbmQ6YXBwIiwic3ViIjoiZGZiN2UyM2QtOTBhOC00MWMwLWIxODAtMmJlNzU1NjBmZWVjIn0.40F_e1OscqERvESmJcMZ_5Z_bIt7zJcGLOxptpTC2Dg ")
//                .build();
//
//        // Send the HTTP request and handle the response
//        try {
//            Response response = client.newCall(request).execute();
//            if (response.isSuccessful()) {
//                System.out.println("SMS sent successfully.");
//            } else {
//                System.out.println("Failed to send SMS: " + response.body().string());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//String message = "Thank you for choosing our hospital, and we wish you all the best in your continued journey to good health.";
//        String phoneNumber = contactTextField.getText();
//        System.out.println(message);
//        System.out.println(phoneNumber);
//
//        // Set up the HTTP request
//        OkHttpClient client = new OkHttpClient().newBuilder().build();
//        MediaType mediaType = MediaType.parse("application/json");
//        String json = "{\n"
//                + "  \"messages\": [\n"
//                + "    {\n"
//                + "        \"channel\": \"sms\",\n"
//                + "        \"recipients\": [\"" + phoneNumber + "\"],\n"
//                + "        \"content\": \"" + message + "\",\n"
//                + "        \"msg_type\": \"text\",\n"
//                + "        \"data_coding\": \"text\"\n"
//                + "    }\n"
//                + "  ],\n"
//                + "  \"message_globals\": {\n"
//                + "    \"originator\": \"SignOTP\",\n"
//                + "    \"report_url\": \"https://the_url_to_recieve_delivery_report.com\"\n"
//                + "  }\n"
//                + "}";
//        System.out.println(json);
//        RequestBody body = RequestBody.create( mediaType,json);
//        Request request = new Request.Builder()
//                .url("https://api.d7networks.com/messages/v1/send")
//                .method("POST", body)
//                .addHeader("Content-Type", "application/json")
//                .addHeader("Accept", "application/json")
//                .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJhdXRoLWJhY2tlbmQ6YXBwIiwic3ViIjoiZGZiN2UyM2QtOTBhOC00MWMwLWIxODAtMmJlNzU1NjBmZWVjIn0.40F_e1OscqERvESmJcMZ_5Z_bIt7zJcGLOxptpTC2Dg ")
//                .build();
//
//        // Send the HTTP request and handle the response
//        try {
//            Response response = client.newCall(request).execute();
//            if (response.isSuccessful()) {
//                System.out.println("SMS sent successfully.");
//            } else {
//                System.out.println("Failed to send SMS: " + response.body().string());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

String message = "Thank you for choosing our hospital, and we wish you all the best in your continued journey to good health.";
        String phoneNumber = contactTextField.getText();
        System.out.println(message);
        System.out.println(phoneNumber);

        Unirest.setTimeouts(0, 0);
        try {
            HttpResponse<String> response = Unirest.post("https://api.d7networks.com/messages/v1/send")
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJhdXRoLWJhY2tlbmQ6YXBwIiwic3ViIjoiNGZlYTk3MDQtOWI4ZS00NDE4LThjNGYtMDAzNDY1YTA3ZmIyIn0.V1OgEQqc_LLSZI0qqlX5kTadgodzkuV4y5TYXDJRJMc")
                    .body("{\n"
                            + "  \"messages\": [\n"
                            + "    {\n"
                            + "        \"channel\": \"sms\",\n"
                            + "        \"recipients\": [\"" + phoneNumber + "\"],\n"
                            + "        \"content\": \"" + message + "\",\n"
                            + "        \"msg_type\": \"text\",\n"
                            + "        \"data_coding\": \"text\"\n"
                            + "    }\n"
                            + "  ],\n"
                            + "  \"message_globals\": {\n"
                            + "    \"originator\": \"SignOTP\",\n"
                            + "    \"report_url\": \"https://the_url_to_recieve_delivery_report.com\"\n"
                            + "  }\n"
                            + "}")
                    .asString();
            System.out.println("SMS sent successfully.");
        } catch (UnirestException ex) {
            Logger.getLogger(CreateDonorJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCreateActionPerformed

    private void tblGoogleSheetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGoogleSheetMousePressed
        // TODO add your handling code here:
        // TODO add your handling code here:

        int selectedRow = tblGoogleSheet.getSelectedRow();
        if (selectedRow < 0) {

        } else {

            nameTextField.setText(String.valueOf(tblGoogleSheet.getValueAt(selectedRow, 1)));
            contactTextField.setText(String.valueOf(tblGoogleSheet.getValueAt(selectedRow, 2)));
            uidTextField.setText(String.valueOf(tblGoogleSheet.getValueAt(selectedRow, 0)));
            digTypeTextField.setText(String.valueOf(tblGoogleSheet.getValueAt(selectedRow, 3)));

            buttonCreate.setEnabled(true);
        }
    }//GEN-LAST:event_tblGoogleSheetMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreate;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JTextField digTypeTextField;
    private javax.swing.JTable donorTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable tblGoogleSheet;
    private javax.swing.JTextField uidTextField;
    // End of variables declaration//GEN-END:variables
}
