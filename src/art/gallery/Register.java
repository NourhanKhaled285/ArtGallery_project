/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

import javax.swing.JFrame;

/**
 *
 * @author Tayba
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
         this.setLocationRelativeTo(null);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButtonRegister = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelRegister = new javax.swing.JLabel();
        jLbl_Close = new javax.swing.JLabel();
        jLbl_minimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLbl_backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        setUndecorated(true);
        setPreferredSize(null);

        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("FirstName :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 100, 110, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("LastName :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 150, 120, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("UserName :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 200, 110, 22);

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(240, 100, 250, 30);

        jTextField2.setBackground(new java.awt.Color(240, 240, 240));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(240, 150, 250, 30);

        jTextField3.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.add(jTextField3);
        jTextField3.setBounds(240, 200, 250, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("PassWord :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 250, 120, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Retype Pass :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 300, 150, 22);

        jPasswordField1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(240, 250, 250, 30);

        jPasswordField2.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(240, 300, 250, 30);

        jButtonRegister.setBackground(new java.awt.Color(153, 204, 0));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegister);
        jButtonRegister.setBounds(380, 360, 110, 31);

        jButton2.setBackground(new java.awt.Color(153, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(240, 360, 110, 31);

        jLabelRegister.setBackground(new java.awt.Color(0, 0, 0));
        jLabelRegister.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelRegister.setText("Click Here To Login");
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelRegister);
        jLabelRegister.setBounds(280, 430, 190, 20);

        jLbl_Close.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLbl_Close.setText("X");
        jLbl_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbl_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbl_CloseMouseClicked(evt);
            }
        });
        jPanel1.add(jLbl_Close);
        jLbl_Close.setBounds(580, -30, 21, 110);

        jLbl_minimize.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLbl_minimize.setText("_");
        jLbl_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbl_minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(jLbl_minimize);
        jLbl_minimize.setBounds(550, -10, 19, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("   Register");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, 0, 240, 44);

        jLbl_backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/IMG-20190403-WA0007.jpg"))); // NOI18N
        jPanel1.add(jLbl_backGround);
        jLbl_backGround.setBounds(-440, 0, 1380, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLbl_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbl_CloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLbl_CloseMouseClicked

    private void jLbl_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbl_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLbl_minimizeMouseClicked

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        // TODO add your handling code here:
          LogIn lgf=new LogIn();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLbl_Close;
    private javax.swing.JLabel jLbl_backGround;
    private javax.swing.JLabel jLbl_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
