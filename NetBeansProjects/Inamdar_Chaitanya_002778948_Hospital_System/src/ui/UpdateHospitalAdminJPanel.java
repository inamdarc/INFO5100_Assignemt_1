/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Model.CreateHospital;
import Model.CreateHospitalHistory;
import Model.Housing;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chaitanya
 */
public class UpdateHospitalAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateHospitalAdminJPanel
     */
    CreateHospitalHistory createHospitalHistory;
    public UpdateHospitalAdminJPanel(CreateHospitalHistory createHospitalHistory) {
        initComponents();
        this.createHospitalHistory = createHospitalHistory;
        displayHospitalTableInformation();
    }
    private void displayHospitalTableInformation() {
        //btnSave.setVisible(false);
        DefaultTableModel model=(DefaultTableModel) HospTable.getModel();
        model.setRowCount(0);
        for(CreateHospital h : createHospitalHistory.getHospHistory()){
            Object[] row =new Object[5];
            row[0]=h;
            row[1]=h.getHospNo() ;
            row[2]=h.getHousing().getCityname();
            row[3]= h.getHousing().getCommunityName(); 
            row[4]=h.getHousing().getZipcode(); 
            
            
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
        HospTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblHouseNo = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        FieldHospZipCode = new javax.swing.JTextField();
        FieldHospName = new javax.swing.JTextField();
        FieldHospCity = new javax.swing.JTextField();
        FieldHospCommunity = new javax.swing.JTextField();
        lblCity1 = new javax.swing.JLabel();
        FieldHospNo = new javax.swing.JTextField();

        HospTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Hospital No.", "City", "Community", "Zipcode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(HospTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 154));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View/ Update Person");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCity.setText("Hospital Name");

        lblCommunity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCommunity.setText("City");

        lblHouseNo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblHouseNo.setText("Community");

        lblZipCode.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblZipCode.setText("Zipcode:");

        FieldHospZipCode.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        FieldHospName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldHospNameActionPerformed(evt);
            }
        });

        lblCity1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCity1.setText("Hospital No.");

        FieldHospNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldHospNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FieldHospZipCode))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FieldHospCommunity))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(FieldHospCity))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(FieldHospName))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(FieldHospNo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldHospNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FieldHospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldHospCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldHospCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldHospZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = HospTable.getSelectedRow();

        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;

        }
        CreateHospital selectedHosp=createHospitalHistory.getHospHistory().get(selectedRowIndex);
        DefaultTableModel model = (DefaultTableModel) HospTable.getModel();

        if (selectedRowIndex>=0) {

            selectedHosp.setHospitalName(FieldHospName.getText());
            selectedHosp.setHospNo(Integer.parseInt(FieldHospNo.getText()));
            Housing house = new Housing();
            house.setCityname(FieldHospCity.getText());
            house.setCommunityName(FieldHospCommunity.getText());
            house.setZipcode(Integer.parseInt(FieldHospZipCode.getText()));
            selectedHosp.setHousing(house);

        }
        JOptionPane.showMessageDialog(this, "Person Information Updated");
        displayHospitalTableInformation();

        FieldHospName.setText("");
        FieldHospNo.setText("");
        FieldHospCity.setText("");
        FieldHospZipCode.setText("");
        FieldHospCommunity.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = HospTable.getSelectedRow();
        if(selectedRowIndex >= 0)
        {
            CreateHospital selecteHosp=createHospitalHistory.getHospHistory().get(selectedRowIndex);
            DefaultComboBoxModel model = new DefaultComboBoxModel();

            FieldHospName.setText(selecteHosp.getHospitalName());
            FieldHospNo.setText(String.valueOf(selecteHosp.getHospNo()));
            FieldHospCity.setText(selecteHosp.getHousing().getCityname());
            FieldHospZipCode.setText(String.valueOf(selecteHosp.getHousing().getZipcode()));
            FieldHospCommunity.setText(selecteHosp.getHousing().getCommunityName());

        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select one Person Information to view all details");
        }

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = HospTable.getSelectedRow();
        if(selectedRowIndex >= 0)
        {
            CreateHospital selectedPerson=createHospitalHistory.getHospHistory().get(selectedRowIndex);

            createHospitalHistory.deleteHospRecords(selectedRowIndex);
            displayHospitalTableInformation();

        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select one Hospital to Delete all details");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void FieldHospNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldHospNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldHospNameActionPerformed

    private void FieldHospNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldHospNoActionPerformed
        // TODO add your handling code here:

        boolean test = false;
        for (CreateHospital element : createHospitalHistory.getHospHistory()) {
            if (element.getHospNo() == Integer.parseInt(FieldHospNo.getText())) {
                test = true;
                JOptionPane.showMessageDialog(null, "ID already Exists", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_FieldHospNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldHospCity;
    private javax.swing.JTextField FieldHospCommunity;
    private javax.swing.JTextField FieldHospName;
    private javax.swing.JTextField FieldHospNo;
    private javax.swing.JTextField FieldHospZipCode;
    private javax.swing.JTable HospTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCity1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblHouseNo;
    private javax.swing.JLabel lblZipCode;
    // End of variables declaration//GEN-END:variables
}