/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import Model.CreateCommunityHistory;
import Model.CreateHospitalHistory;
import Model.CreatePerson;
import Model.CreatePersonHistory;
import Model.EncounterHistory;
import Model.PatientDirectory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chaitanya
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
     CreatePersonHistory createPersonHistory;
     PatientDirectory patientDirectory;
     EncounterHistory encounterHistory;
     CreateHospitalHistory createHospitalHistory;
     CreateCommunityHistory createCommunityHistory;


    public MainJFrame( CreateCommunityHistory createCommunityHistory,CreatePersonHistory createPersonHistory,PatientDirectory patientDirectory,EncounterHistory encounterHistory,CreateHospitalHistory createHospitalHistory) {
        initComponents();
        this.createPersonHistory = createPersonHistory;
        this.patientDirectory=patientDirectory;
        this.encounterHistory=encounterHistory;
        this.createHospitalHistory = createHospitalHistory;
        this.createCommunityHistory = createCommunityHistory;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SystemAdminBtn = new javax.swing.JButton();
        HospAdminBtn = new javax.swing.JButton();
        CommAdminBtn = new javax.swing.JButton();
        DoctorBtn = new javax.swing.JButton();
        PatientBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1315, 659));
        setSize(new java.awt.Dimension(1315, 659));

        jPanel1.setLayout(null);

        SystemAdminBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        SystemAdminBtn.setText("System Admin");
        SystemAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAdminBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SystemAdminBtn);
        SystemAdminBtn.setBounds(160, 460, 200, 36);

        HospAdminBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        HospAdminBtn.setText("Hospital Admin");
        HospAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospAdminBtnActionPerformed(evt);
            }
        });
        jPanel1.add(HospAdminBtn);
        HospAdminBtn.setBounds(390, 460, 210, 36);

        CommAdminBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        CommAdminBtn.setText("Community Admin");
        CommAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommAdminBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CommAdminBtn);
        CommAdminBtn.setBounds(630, 460, 250, 36);

        DoctorBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        DoctorBtn.setText("Doctor");
        DoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DoctorBtn);
        DoctorBtn.setBounds(920, 460, 109, 36);

        PatientBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        PatientBtn.setText("Patient");
        PatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientBtnActionPerformed(evt);
            }
        });
        jPanel1.add(PatientBtn);
        PatientBtn.setBounds(1070, 460, 110, 36);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/chaitanya/Desktop/Hospital Management System/build/classes/hmbackground.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1309, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1315, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SystemAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAdminBtnActionPerformed
        // TODO add your handling code here:
        SystemAdminLoginForm SA = new SystemAdminLoginForm(createPersonHistory,patientDirectory,encounterHistory,createHospitalHistory,createCommunityHistory);
        SA.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_SystemAdminBtnActionPerformed

    private void HospAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospAdminBtnActionPerformed
        // TODO add your handling code here:
        HospitalAdminLoginForm HA = new HospitalAdminLoginForm(createPersonHistory,patientDirectory,encounterHistory,createHospitalHistory,createCommunityHistory);
        HA.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_HospAdminBtnActionPerformed

    private void CommAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommAdminBtnActionPerformed
        // TODO add your handling code here:
        CommunityAdminLoginForm CA = new CommunityAdminLoginForm(createCommunityHistory,createPersonHistory,patientDirectory,encounterHistory,createHospitalHistory);
        CA.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_CommAdminBtnActionPerformed

    private void DoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorBtnActionPerformed
        // TODO add your handling code here:
        DoctorLoginForm DF = new DoctorLoginForm(createPersonHistory,patientDirectory,encounterHistory,createCommunityHistory,createHospitalHistory);
        DF.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_DoctorBtnActionPerformed

    private void PatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientBtnActionPerformed
        // TODO add your handling code here:
        PatientLoginForm PF = new PatientLoginForm(createPersonHistory,patientDirectory,encounterHistory,createHospitalHistory,createCommunityHistory);
        PF.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_PatientBtnActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CommAdminBtn;
    private javax.swing.JButton DoctorBtn;
    private javax.swing.JButton HospAdminBtn;
    private javax.swing.JButton PatientBtn;
    private javax.swing.JButton SystemAdminBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
