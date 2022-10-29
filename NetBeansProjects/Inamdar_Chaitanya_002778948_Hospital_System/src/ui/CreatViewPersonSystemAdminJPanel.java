/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Model.CreatePerson;
import Model.CreatePersonHistory;
import Model.UserDirectory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chaitanya
 */
public class CreatViewPersonSystemAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatViewSystemAdminJPanel
     */
    CreatePersonHistory createPersonHistory;
    public CreatViewPersonSystemAdminJPanel(CreatePersonHistory createPersonHistory) {
        initComponents();
        this.createPersonHistory = createPersonHistory;
        
        

        
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
        FieldZipCode = new javax.swing.JTextField();
        FieldCity = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        FieldCommunity = new javax.swing.JComboBox<>();
        lblFirstName = new javax.swing.JLabel();
        FieldFName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        FieldLName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        FieldAge = new javax.swing.JTextField();
        lblPersonId = new javax.swing.JLabel();
        FieldUniqueID = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        FieldAddress = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        lblAgeError = new javax.swing.JLabel();
        lblLastNameError = new javax.swing.JLabel();
        lblFirstNameError = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PersonTable = new javax.swing.JTable();
        lblEmail = new javax.swing.JLabel();
        FieldEmail = new javax.swing.JTextField();
        lblEmailError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblZipcodeError = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FieldRole = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        FieldPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FieldGender = new javax.swing.JTextField();
        lblHouseNo = new javax.swing.JLabel();
        FieldHouseNo = new javax.swing.JComboBox<>();

        CreatePanel.setBackground(new java.awt.Color(158, 174, 204));

        lblCity.setText("City:");

        FieldZipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldZipCodeKeyReleased(evt);
            }
        });

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

        lblFirstName.setText("First Name:");

        FieldFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldFNameKeyReleased(evt);
            }
        });

        lblLastName.setText("Last Name:");

        FieldLName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldLNameKeyReleased(evt);
            }
        });

        lblAge.setText("Age:");

        FieldAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldAgeKeyReleased(evt);
            }
        });

        lblPersonId.setText("Unique Id:");

        FieldUniqueID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUniqueIDActionPerformed(evt);
            }
        });

        lblAddress.setText("Address:");

        lblZipCode.setText("Zipcode:");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        PersonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Role", "Name", "Age", "Address", "User ID", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PersonTable);

        lblEmail.setText("Email:");

        FieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldEmailKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Person Details :");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create/View Person Details");

        jLabel2.setText("Role");

        FieldRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "System Admin", "Hospital Admin", "Community Admin", "Doctor", "Patient" }));

        jLabel3.setText("Password:");

        jLabel5.setText("Gender");

        lblHouseNo.setText("HouseNo:");

        FieldHouseNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldHouseNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreatePanelLayout = new javax.swing.GroupLayout(CreatePanel);
        CreatePanel.setLayout(CreatePanelLayout);
        CreatePanelLayout.setHorizontalGroup(
            CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1297, Short.MAX_VALUE)
            .addGroup(CreatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreatePanelLayout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(CreatePanelLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CreatePanelLayout.createSequentialGroup()
                                .addComponent(lblHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FieldHouseNo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCreate)
                                .addGap(700, 700, 700))
                            .addGroup(CreatePanelLayout.createSequentialGroup()
                                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CreatePanelLayout.createSequentialGroup()
                                        .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreatePanelLayout.createSequentialGroup()
                                                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(FieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(CreatePanelLayout.createSequentialGroup()
                                                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(FieldLName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreatePanelLayout.createSequentialGroup()
                                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(FieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(CreatePanelLayout.createSequentialGroup()
                                                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(FieldFName, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                    .addComponent(FieldRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFirstNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLastNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAgeError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEmailError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(CreatePanelLayout.createSequentialGroup()
                                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CreatePanelLayout.createSequentialGroup()
                                        .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblZipcodeError, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CreatePanelLayout.createSequentialGroup()
                                        .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FieldUniqueID)
                                            .addComponent(FieldPassword)
                                            .addComponent(FieldGender, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                                    .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(CreatePanelLayout.createSequentialGroup()
                                            .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(FieldCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CreatePanelLayout.createSequentialGroup()
                                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(FieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(CreatePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        CreatePanelLayout.setVerticalGroup(
            CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreatePanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreatePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CreatePanelLayout.createSequentialGroup()
                        .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FieldFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFirstNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblLastNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEmailError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAgeError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldUniqueID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FieldZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblZipcodeError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(CreatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate))
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jScrollPane1.setViewportView(CreatePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1309, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   private void displayPersonTableInformation() {
        //btnSave.setVisible(false);
        DefaultTableModel model=(DefaultTableModel) PersonTable.getModel();
        model.setRowCount(0);
        for(CreatePerson e : createPersonHistory.getHistory()){
            Object[] row =new Object[6];
            row[0]=e.getRole();
            row[1]=e.getFName() + ", " + e.getLName() ;
            row[2]=e.getAge();
            row[3]= e.getHouseNo() + ", " + e.getCommunity() + ", " + e.getCity() + ", " + e.getZipCode(); 
            row[4]=e.getUniqueId(); 
            row[5]=e.getPassword();
            model.addRow(row);
        }
}
    
    private void FieldZipCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldZipCodeKeyReleased
        // TODO add your handling code here:
        if(FieldZipCode.getText().trim() != "")
        {
            Pattern pat = Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$");
            Matcher matchEmailId= pat.matcher(FieldZipCode.getText());
            if(!matchEmailId.matches())
            {
                lblZipcodeError.setText("Enter Valid Zipcode");
            }
            else
            {
                lblZipcodeError.setText(null);
            }
        }
    }//GEN-LAST:event_FieldZipCodeKeyReleased

    private void FieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCityActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("--Select Community--");
        model.addElement("Park Drive");
        model.addElement("Huntington");
        model.addElement("Fenway");
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
            }
            else if(FieldCommunity.getSelectedItem().toString() == "Huntington")
            {
                model.addElement("2011");
                model.addElement("2012");
                model.addElement("2013");
            }
            else if(FieldCommunity.getSelectedItem().toString() == "Fenway")
            {
                model.addElement("3011");
                model.addElement("3012");
                model.addElement("3013");
            }
        }
        FieldHouseNo.setModel(model);
    }//GEN-LAST:event_FieldCommunityActionPerformed

    private void FieldFNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldFNameKeyReleased
        // TODO add your handling code here:
        if(FieldFName.getText().trim() != "")
        {
            Pattern pat = Pattern.compile("^[a-zA-Z\\s]+");
            Matcher matchName= pat.matcher(FieldFName.getText());
            if(!matchName.matches())
            {
                lblFirstNameError.setText("Enter Valid First Name");
            }
            else
            {
                lblFirstNameError.setText(null);
            }
        }
    }//GEN-LAST:event_FieldFNameKeyReleased

    private void FieldAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldAgeKeyReleased
        // TODO add your handling code here:
        if(FieldAge.getText().trim() != "")
        {
            Pattern pat = Pattern.compile("^100|[1-9]?\\d$");
            Matcher matchName= pat.matcher(FieldAge.getText());
            if(!matchName.matches())
            {
                lblAgeError.setText("Enter Valid Age");
            }
            else
            {
                lblAgeError.setText(null);
            }
        }
    }//GEN-LAST:event_FieldAgeKeyReleased

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String Role = FieldRole.getSelectedItem().toString();
        String FName = FieldFName.getText();
        String LName = FieldLName.getText();
        String Email = FieldEmail.getText();
        int Age = Integer.parseInt(FieldAge.getText());
        String Gender = FieldGender.getText();
        int UniqueID = Integer.parseInt(FieldUniqueID.getText());
        String Password = FieldPassword.getText();
        String City = FieldCity.getSelectedItem().toString();
        String Community = FieldCommunity.getSelectedItem().toString();
        String Address = FieldAddress.getText();
        int ZipCode = Integer.parseInt(FieldZipCode.getText());
        int HouseNo = Integer.parseInt(FieldHouseNo.getSelectedItem().toString());
        
        
            CreatePerson e = createPersonHistory.addNewPerson();

            e.setRole(Role);
            e.setFName(FName);
            e.setLName(LName);
            e.setEmail(Email);
            e.setAge(Age);
            e.setGender(Gender);
            e.setUniqueId(UniqueID);
            e.setPassword(Password);
            e.setCity(City);
            e.setCommunity(Community);
            e.setAddress(Address);
            e.setZipCode(ZipCode);
            e.setHouseNo(HouseNo);
            
        
        
        
            JOptionPane.showMessageDialog(this, "New Person is created.");
        
        
        
        
            displayPersonTableInformation();
            FieldRole.setSelectedItem("");
            FieldFName.setText("");
            FieldLName.setText("");
            FieldEmail.setText("");
            FieldAge.setText("");
            FieldGender.setText("");
            FieldUniqueID.setText("");
            FieldPassword.setText("");
            FieldCity.setSelectedItem("");
            FieldCommunity.setSelectedItem("");  
            FieldAddress.setText(""); 
            FieldZipCode.setText(""); 
            FieldHouseNo.setSelectedItem("");  



            
            
            
        
        

        


            
            

        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void FieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldEmailKeyReleased
        // TODO add your handling code here:
        if(FieldEmail.getText().trim() != "")
        {
            Pattern pat = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
            Matcher matchEmailId= pat.matcher(FieldEmail.getText());
            if(!matchEmailId.matches())
            {
                lblEmailError.setText("Enter Valid Email");
            }
            else
            {
                lblEmailError.setText(null);
            }
        }
    }//GEN-LAST:event_FieldEmailKeyReleased

    private void FieldLNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldLNameKeyReleased
        // TODO add your handling code here:
        if(FieldLName.getText().trim() != "")
        {
            Pattern pat = Pattern.compile("^[a-zA-Z\\s]+");
            Matcher matchName= pat.matcher(FieldLName.getText());
            if(!matchName.matches())
            {
                lblLastNameError.setText("Enter Valid First Name");
            }
            else
            {
                lblLastNameError.setText(null);
            }
        }
    }//GEN-LAST:event_FieldLNameKeyReleased

    private void FieldHouseNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldHouseNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldHouseNoActionPerformed

    private void FieldUniqueIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUniqueIDActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_FieldUniqueIDActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreatePanel;
    private javax.swing.JTextField FieldAddress;
    private javax.swing.JTextField FieldAge;
    private javax.swing.JComboBox<String> FieldCity;
    private javax.swing.JComboBox<String> FieldCommunity;
    private javax.swing.JTextField FieldEmail;
    private javax.swing.JTextField FieldFName;
    private javax.swing.JTextField FieldGender;
    private javax.swing.JComboBox<String> FieldHouseNo;
    private javax.swing.JTextField FieldLName;
    private javax.swing.JTextField FieldPassword;
    private javax.swing.JComboBox<String> FieldRole;
    private javax.swing.JTextField FieldUniqueID;
    private javax.swing.JTextField FieldZipCode;
    private javax.swing.JTable PersonTable;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgeError;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailError;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstNameError;
    private javax.swing.JLabel lblHouseNo;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLastNameError;
    private javax.swing.JLabel lblPersonId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JLabel lblZipcodeError;
    // End of variables declaration//GEN-END:variables
}
