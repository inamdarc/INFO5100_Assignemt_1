/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Model.CreatePerson;
import Model.CreatePersonHistory;
import Model.Patient;
import Model.PatientDirectory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chaitanya
 */
public class PatientViewEncounter extends javax.swing.JPanel {

    /**
     * Creates new form PatientViewEncounter
     */
    PatientDirectory patientDirectory;
    CreatePersonHistory createPersonHistory;
    public PatientViewEncounter(PatientDirectory patientDirectory,CreatePersonHistory createPersonHistory) {
        initComponents();
        this.patientDirectory=patientDirectory;
        this.createPersonHistory = createPersonHistory;
        displayPatientTableInfo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "Name", "Age", "Blood Pressure", "Tempreture", "Blood Group", "Pulse", "Is Normal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPatient);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(492, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void displayPatientTableInfo() {
        //btnSave.setVisible(false);
        DefaultTableModel model=(DefaultTableModel) tblPatient.getModel();
        model.setRowCount(0);
        for(Patient p : patientDirectory.getPatientList()){
            
           
            Object[] row =new Object[10];
            row[0]=p.getPatientId();
            row[1]=p.getFName() + " " + p.getLName();
            row[2]=p.getAge();
            row[3]=p.getVs().getBloodPressure(); 
            row[4]=p.getVs().getTempreture(); 
            row[5]=p.getVs().getPulese(); 
            row[6]=p.getVs().getBloodGroup();
            row[7]=p.isIsNormal()? "Normal" : "Abnormal";
            model.addRow(row);
            
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPatient;
    // End of variables declaration//GEN-END:variables
}
