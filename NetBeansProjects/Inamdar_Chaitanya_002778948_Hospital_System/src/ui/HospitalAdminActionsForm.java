/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import Model.CreateCommunityHistory;
import Model.CreateHospitalHistory;
import Model.CreatePersonHistory;
import Model.EncounterHistory;
import Model.PatientDirectory;

/**
 *
 * @author chaitanya
 */
public class HospitalAdminActionsForm extends javax.swing.JFrame {

    /**
     * Creates new form HospitalAdminActionsForm
     */
        CreatePersonHistory createPersonHistory;
       PatientDirectory patientDirectory;
       EncounterHistory encounterHistory;
       CreateHospitalHistory createHospitalHistory;
       CreateCommunityHistory createCommunityHistory;
    
    public HospitalAdminActionsForm(CreatePersonHistory createPersonHistory,PatientDirectory patientDirectory,
            EncounterHistory encounterHistory,
            CreateHospitalHistory createHospitalHistory,CreateCommunityHistory createCommunityHistory) {
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

        jSplitPane = new javax.swing.JSplitPane();
        ControlPane = new javax.swing.JPanel();
        BtnCreateHospital = new javax.swing.JButton();
        btnUpdateHospital = new javax.swing.JButton();
        HospAdminMainPageBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        WorkArea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlPane.setBackground(new java.awt.Color(191, 191, 156));

        BtnCreateHospital.setText("Create/View Hospital");
        BtnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateHospitalActionPerformed(evt);
            }
        });

        btnUpdateHospital.setText("Update Hospital");
        btnUpdateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHospitalActionPerformed(evt);
            }
        });

        HospAdminMainPageBtn.setText("Log Out");
        HospAdminMainPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospAdminMainPageBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Update Patient Encounters");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPaneLayout = new javax.swing.GroupLayout(ControlPane);
        ControlPane.setLayout(ControlPaneLayout);
        ControlPaneLayout.setHorizontalGroup(
            ControlPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnCreateHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUpdateHospital, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ControlPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HospAdminMainPageBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );
        ControlPaneLayout.setVerticalGroup(
            ControlPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HospAdminMainPageBtn)
                .addGap(94, 94, 94)
                .addComponent(BtnCreateHospital)
                .addGap(30, 30, 30)
                .addComponent(btnUpdateHospital)
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addContainerGap(402, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(ControlPane);

        WorkArea.setBackground(new java.awt.Color(177, 177, 203));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME HOSPITAL ADMIN!");

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        WorkAreaLayout.setVerticalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkAreaLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1315, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHospitalActionPerformed
        // TODO add your handling code here:

        UpdateHospitalAdminJPanel updateHospitalAdminJPanel = new UpdateHospitalAdminJPanel(createHospitalHistory);
        jSplitPane.setRightComponent(updateHospitalAdminJPanel);
    }//GEN-LAST:event_btnUpdateHospitalActionPerformed

    private void HospAdminMainPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospAdminMainPageBtnActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        HospitalAdminLoginForm HLF = new HospitalAdminLoginForm(createPersonHistory,patientDirectory,encounterHistory,createHospitalHistory,createCommunityHistory);
        HLF.setVisible(true);

    }//GEN-LAST:event_HospAdminMainPageBtnActionPerformed

    private void BtnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateHospitalActionPerformed
        // TODO add your handling code here:
        CreateViewHospitalAdminJPanel createViewHospitalAdminJPanel = new CreateViewHospitalAdminJPanel(createHospitalHistory);
        jSplitPane.setRightComponent(createViewHospitalAdminJPanel);
    }//GEN-LAST:event_BtnCreateHospitalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        UpdateHospPatientAJPanel updateHospPatientAJPanel = new UpdateHospPatientAJPanel(patientDirectory);
        jSplitPane.setRightComponent(updateHospPatientAJPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreateHospital;
    private javax.swing.JPanel ControlPane;
    private javax.swing.JButton HospAdminMainPageBtn;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton btnUpdateHospital;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
