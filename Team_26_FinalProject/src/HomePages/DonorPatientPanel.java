/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomePages;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

/**
 *
 * @author balin
 */
public class DonorPatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorPatientPanel
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public DonorPatientPanel() {
        initComponents();
    }
    
    public DonorPatientPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        aboutThalassemia.setEditable(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        aboutThalassemia = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientBtn.setText("Are you a Thalassemia Patient?");
        patientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientBtnActionPerformed(evt);
            }
        });
        add(patientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));

        jButton2.setText("Want to Donate?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        aboutThalassemia.setColumns(20);
        aboutThalassemia.setRows(5);
        aboutThalassemia.setText("Thalassemia is an inherited (i.e., passed from parents to children through genes) blood disorder caused when \nthe body doesn’t make enough of a protein called hemoglobin, an important part of red blood cells. When there \nisn’t enough hemoglobin, the body’s red blood cells don’t function properly and they last shorter periods of \ntime, so there are fewer healthy red blood cells traveling in the bloodstream.\n\nRed blood cells carry oxygen to all the cells of the body. Oxygen is a sort of food that cells use to \nfunction. When there are not enough healthy red blood cells, there is also not enough oxygen delivered \nto all the other cells of the body, which may cause a person to feel tired, weak or short of breath. \nThis is a condition called anemia. People with thalassemia may have mild or severe anemia. Severe anemia \ncan damage organs and lead to death.\n\nHow do I know if I have thalassemia?\nPeople with moderate and severe forms of thalassemia usually find out about their condition in childhood, \nsince they have symptoms of severe anemia early in life. People with less severe forms of thalassemia may \nonly find out because they are having symptoms of anemia, or maybe because a doctor finds anemia on a \nroutine blood test or a test done for another reason.\n\nBecause thalassemias are inherited, the condition sometimes runs in families. Some people find out about their thalassemia because they have relatives with a similar condition.\n\nPeople who have family members from certain parts of the world have a higher risk for having thalassemia. Traits for thalassemia are more common in people from Mediterranean countries, like Greece and Turkey, and in people from Asia, Africa, and the Middle East. If you have anemia and you also have family members from these areas, your doctor might test your blood further to find out if you have thalassemia.\n");
        jScrollPane1.setViewportView(aboutThalassemia);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 890, 350));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Thalassemia");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void patientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientBtnActionPerformed
        // TODO add your handling code here:
        new DonorReceiverFramePage("receiver", system).show();
    }//GEN-LAST:event_patientBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new DonorReceiverFramePage("donor", system).show();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aboutThalassemia;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton patientBtn;
    // End of variables declaration//GEN-END:variables
}
