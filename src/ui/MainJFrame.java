/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.EmployeeHistory;

/**
 *
 * @author chaitanya
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    EmployeeHistory history;
    
    
    public MainJFrame() {
        initComponents();
        
        history = new EmployeeHistory();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftPane = new javax.swing.JSplitPane();
        LeftControlPanal = new javax.swing.JPanel();
        CreateRecordButton = new javax.swing.JButton();
        ViewRecordButton = new javax.swing.JButton();
        LeftWorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreateRecordButton.setText("Create Record");
        CreateRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateRecordButtonActionPerformed(evt);
            }
        });

        ViewRecordButton.setText("View Record");
        ViewRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRecordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftControlPanalLayout = new javax.swing.GroupLayout(LeftControlPanal);
        LeftControlPanal.setLayout(LeftControlPanalLayout);
        LeftControlPanalLayout.setHorizontalGroup(
            LeftControlPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftControlPanalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(LeftControlPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ViewRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateRecordButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LeftControlPanalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CreateRecordButton, ViewRecordButton});

        LeftControlPanalLayout.setVerticalGroup(
            LeftControlPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftControlPanalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(CreateRecordButton)
                .addGap(18, 18, 18)
                .addComponent(ViewRecordButton)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        LeftControlPanalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CreateRecordButton, ViewRecordButton});

        LeftPane.setLeftComponent(LeftControlPanal);

        javax.swing.GroupLayout LeftWorkAreaLayout = new javax.swing.GroupLayout(LeftWorkArea);
        LeftWorkArea.setLayout(LeftWorkAreaLayout);
        LeftWorkAreaLayout.setHorizontalGroup(
            LeftWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );
        LeftWorkAreaLayout.setVerticalGroup(
            LeftWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        LeftPane.setRightComponent(LeftWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LeftPane, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LeftPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRecordButtonActionPerformed
        // TODO add your handling code here:
        ViewEmployeeDetails viewEmployeeDetails = new ViewEmployeeDetails(history);
        LeftPane.setRightComponent(viewEmployeeDetails);
        
    }//GEN-LAST:event_ViewRecordButtonActionPerformed

    private void CreateRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateRecordButtonActionPerformed
        // TODO add your handling code here:
        CreateEmployeeDetails createEmployeeDetails = new CreateEmployeeDetails(history);
        LeftPane.setRightComponent(createEmployeeDetails);
        
        
        
    }//GEN-LAST:event_CreateRecordButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateRecordButton;
    private javax.swing.JPanel LeftControlPanal;
    private javax.swing.JSplitPane LeftPane;
    private javax.swing.JPanel LeftWorkArea;
    private javax.swing.JButton ViewRecordButton;
    // End of variables declaration//GEN-END:variables
}