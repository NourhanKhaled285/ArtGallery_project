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
public class search_category extends javax.swing.JFrame {

    /**
     * Creates new form search_category
     */
    public search_category() {
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLbl_minimize = new javax.swing.JLabel();
        jLbl_Close = new javax.swing.JLabel();
        jLbl_backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(250, 170, 420, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("search");
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 270, 190, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter the category :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 140, 210, 100);

        jLbl_minimize.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLbl_minimize.setText("_");
        jLbl_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbl_minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(jLbl_minimize);
        jLbl_minimize.setBounds(650, 0, 30, 50);

        jLbl_Close.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLbl_Close.setText("X");
        jLbl_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbl_CloseMouseClicked(evt);
            }
        });
        jPanel1.add(jLbl_Close);
        jLbl_Close.setBounds(690, 0, 21, 60);

        jLbl_backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/art/gallery/IMG-20190403-WA0009.jpg"))); // NOI18N
        jPanel1.add(jLbl_backGround);
        jLbl_backGround.setBounds(0, 0, 1010, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLbl_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbl_CloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLbl_CloseMouseClicked

    private void jLbl_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbl_minimizeMouseClicked
        // TODO add your handling code here:
                         this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLbl_minimizeMouseClicked

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
            java.util.logging.Logger.getLogger(search_category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLbl_Close;
    private javax.swing.JLabel jLbl_backGround;
    private javax.swing.JLabel jLbl_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
