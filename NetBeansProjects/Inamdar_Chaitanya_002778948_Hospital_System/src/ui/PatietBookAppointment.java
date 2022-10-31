/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author chaitanya
 */




import Model.CreateHospital;
import Model.CreatePersonHistory;

import Model.CreateHospitalHistory;
import Model.CreatePerson;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PatietBookAppointment extends javax.swing.JPanel {

    /**
     * Creates new form PatietBookAppointment
     */
    CreatePersonHistory createPersonHistory;
    CreateHospitalHistory createHospitalHistory;
    public PatietBookAppointment(CreatePersonHistory createPersonHistory, CreateHospitalHistory createHospitalHistory) {
        this.createPersonHistory = createPersonHistory;
        this.createHospitalHistory=createHospitalHistory;
        initComponents();
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
        CreatePanel = new javax.swing.JPanel();
        lblCity = new javax.swing.JLabel();
        FieldCity = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        FieldCommunity = new javax.swing.JComboBox<>();
        BtnBookApoint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AppointTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblZipcodeError = new javax.swing.JLabel();
        lblHouseNo = new javax.swing.JLabel();
        FieldHouseNo = new javax.swing.JComboBox<>();
        lblHouseNo1 = new javax.swing.JLabel();
        FieldDoctor = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(158, 174, 204));

        CreatePanel.setBackground(new java.awt.Color(158, 174, 204));

        lblCity.setText("City:");

        FieldCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select City --", "Boston" }));
        FieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCityActionPerformed(evt);
            }
        });

        lblCommunity.setText("Community:");

        FieldCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCommunityActionPerformed(evt);
            }
        });

        BtnBookApoint.setText("Book Apointment");
        BtnBookApoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBookApointActionPerformed(evt);
            }
        });

        AppointTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "City", "Community", "Hospital", "Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(AppointTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Hospital Lookup:");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create/View Person Details");

        lblHouseNo.setText("Hospital");

        FieldHouseNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldHouseNoActionPerformed(evt);
            }
        });

        lblHouseNo1.setText("Doctor");

        FieldDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreatePanelLayout = new javax.swing.GroupLayout(CreatePanel);
        CreatePanel.setLayout(CreatePanelLayout);
        CreatePanelLayout.setHorizontalGroup(
            CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1385, Short.MAX_VALUE)
                    .addGroup(CreatePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CreatePanelLayout.createSequentialGroup()
                        .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(CreatePanelLayout.createSequentialGroup()
                                .addGap(569, 569, 569)
                                .addComponent(lblZipcodeError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(CreatePanelLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CreatePanelLayout.createSequentialGroup()
                                .addComponent(lblHouseNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FieldDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(CreatePanelLayout.createSequentialGroup()
                                        .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CreatePanelLayout.createSequentialGroup()
                                        .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(CreatePanelLayout.createSequentialGroup()
                                    .addComponent(lblHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(FieldHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(828, Short.MAX_VALUE))))
            .addGroup(CreatePanelLayout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(BtnBookApoint)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CreatePanelLayout.setVerticalGroup(
            CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(BtnBookApoint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblZipcodeError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );

        jScrollPane1.setViewportView(CreatePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1315, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
     
    private void FieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCityActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        model.addElement("--Select Community--");
        model.addElement("Park Drive");
        model.addElement("Huntington");
        model.addElement("Fenway");
        
        for(CreateHospital c : createHospitalHistory.getHospHistory()){
            model.addElement(c.getHousing().getCommunityName());
        }
        FieldCommunity.setModel(model);

    }//GEN-LAST:event_FieldCityActionPerformed

    private void FieldCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCommunityActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        if(FieldCommunity.getSelectedItem()!= null)
        {
            model.addElement("--Select House No--");
            if(FieldCommunity.getSelectedItem().toString() == "Park Drive")
            {
                model.addElement("1011");
                model.addElement("1012");
                model.addElement("1013");
                for(CreateHospital c : createHospitalHistory.getHospHistory()){
                   model.addElement(c.getHousing().getHouseNo());
                   }
            }
            else if(FieldCommunity.getSelectedItem().toString() == "Huntington")
            {
                model.addElement("2011");
                model.addElement("2012");
                model.addElement("2013");
                for(CreateHospital c : createHospitalHistory.getHospHistory()){
                   model.addElement(c.getHousing().getHouseNo());
                   }
            }
            else if(FieldCommunity.getSelectedItem().toString() == "Fenway")
            {
                model.addElement("3011");
                model.addElement("3012");
                model.addElement("3013");
                for(CreateHospital c : createHospitalHistory.getHospHistory()){
                   model.addElement(c.getHousing().getHouseNo());
                   }
            }
        }
        FieldHouseNo.setModel(model);
        

        
      

        
    }//GEN-LAST:event_FieldCommunityActionPerformed

    private void BtnBookApointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBookApointActionPerformed
        // TODO add your handling code here:
        for (CreatePerson e : createPersonHistory.getHistory())
        {  
            e.setAppointStat(1);
        }
       

        JOptionPane.showMessageDialog(this, "You have Successfully booked the appointment!");

        

    }//GEN-LAST:event_BtnBookApointActionPerformed

    private void FieldHouseNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldHouseNoActionPerformed
        // TODO add your handling code here:
         DefaultComboBoxModel model = new DefaultComboBoxModel();

        model.addElement("--Select Doctor--");
            if(FieldHouseNo.getSelectedItem().toString() == "1011")
            {
                
                for(CreatePerson c : createPersonHistory.getHistory()){
                   if(c.getRole() == "Doctor"){
                   model.addElement(c.getRole() + " " + c.getFName());
                   }}
            }
            else if(FieldHouseNo.getSelectedItem().toString() == "1012")
            {
                
                for(CreatePerson c : createPersonHistory.getHistory()){
                   if(c.getRole() == "Doctor"){
                   model.addElement(c.getRole() + " " + c.getFName());
                   }}
            }
            else{
                for(CreatePerson c : createPersonHistory.getHistory()){
                   if(c.getRole() == "Doctor"){
                   model.addElement(c.getRole() + " " + c.getFName());
                   }}
            }
                
            
            FieldDoctor.setModel(model);
       
    }//GEN-LAST:event_FieldHouseNoActionPerformed

    private void FieldDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldDoctorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FieldDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointTable;
    private javax.swing.JButton BtnBookApoint;
    private javax.swing.JPanel CreatePanel;
    private javax.swing.JComboBox<String> FieldCity;
    private javax.swing.JComboBox<String> FieldCommunity;
    private javax.swing.JComboBox<String> FieldDoctor;
    private javax.swing.JComboBox<String> FieldHouseNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblHouseNo;
    private javax.swing.JLabel lblHouseNo1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZipcodeError;
    // End of variables declaration//GEN-END:variables
}
