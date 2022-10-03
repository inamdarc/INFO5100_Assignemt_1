/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
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
        jLabel1 = new javax.swing.JLabel();
        LeftWorkArea = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LeftPane.setBackground(new java.awt.Color(204, 204, 204));
        LeftPane.setForeground(new java.awt.Color(204, 204, 204));

        LeftControlPanal.setBackground(new java.awt.Color(255, 255, 255));
        LeftControlPanal.setBorder(new javax.swing.border.MatteBorder(null));

        CreateRecordButton.setBackground(new java.awt.Color(0, 0, 0));
        CreateRecordButton.setForeground(new java.awt.Color(255, 255, 255));
        CreateRecordButton.setText("Create Record");
        CreateRecordButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CreateRecordButton.setOpaque(true);
        CreateRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateRecordButtonActionPerformed(evt);
            }
        });

        ViewRecordButton.setBackground(new java.awt.Color(0, 0, 0));
        ViewRecordButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewRecordButton.setText("View Record");
        ViewRecordButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewRecordButton.setOpaque(true);
        ViewRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRecordButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/chaitanya/Desktop/chai2.jpeg")); // NOI18N

        javax.swing.GroupLayout LeftControlPanalLayout = new javax.swing.GroupLayout(LeftControlPanal);
        LeftControlPanal.setLayout(LeftControlPanalLayout);
        LeftControlPanalLayout.setHorizontalGroup(
            LeftControlPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftControlPanalLayout.createSequentialGroup()
                .addGroup(LeftControlPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftControlPanalLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(LeftControlPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ViewRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CreateRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                    .addGroup(LeftControlPanalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LeftControlPanalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CreateRecordButton, ViewRecordButton});

        LeftControlPanalLayout.setVerticalGroup(
            LeftControlPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftControlPanalLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addComponent(CreateRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(ViewRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(411, Short.MAX_VALUE))
        );

        LeftControlPanalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CreateRecordButton, ViewRecordButton});

        LeftPane.setLeftComponent(LeftControlPanal);

        LeftWorkArea.setBackground(new java.awt.Color(204, 204, 204));
        LeftWorkArea.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/chaitanya/Desktop/chai.jpeg")); // NOI18N

        javax.swing.GroupLayout LeftWorkAreaLayout = new javax.swing.GroupLayout(LeftWorkArea);
        LeftWorkArea.setLayout(LeftWorkAreaLayout);
        LeftWorkAreaLayout.setHorizontalGroup(
            LeftWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftWorkAreaLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LeftWorkAreaLayout.setVerticalGroup(
            LeftWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 928, Short.MAX_VALUE)
        );

        LeftPane.setRightComponent(LeftWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LeftPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LeftPane, javax.swing.GroupLayout.Alignment.TRAILING)
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
                if ("nimbus".equals(info.getName())) {
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
