/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cashier;

import javax.swing.JOptionPane;

/**
 *
 * @author Sampath
 */
public class payment extends javax.swing.JFrame {

    /**
     * Creates new form payment
     */
    public payment() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p_nic = new javax.swing.JTextField();
        val = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bal = new javax.swing.JTextField();
        pay = new javax.swing.JTextField();
        gtbal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmplt = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        chng = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 222, 222));
        jPanel1.setMaximumSize(new java.awt.Dimension(498, 286));
        jPanel1.setMinimumSize(new java.awt.Dimension(498, 286));
        jPanel1.setPreferredSize(new java.awt.Dimension(498, 286));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payments");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 230, 30));

        jLabel2.setText("Patient NIC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 30));

        p_nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                p_nicKeyTyped(evt);
            }
        });
        jPanel1.add(p_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 180, 30));
        jPanel1.add(val, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 100, 30));

        jLabel3.setText("Payment");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 130, 30));

        jLabel4.setText("Balance");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 30));

        jLabel5.setText("Value");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 30));
        jPanel1.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 100, 30));
        jPanel1.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, 30));

        gtbal.setText("Get Balance");
        gtbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtbalActionPerformed(evt);
            }
        });
        jPanel1.add(gtbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 140, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Rs.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 40, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Rs.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 40, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rs.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 40, 30));

        cmplt.setText("Complete Payment");
        cmplt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpltActionPerformed(evt);
            }
        });
        jPanel1.add(cmplt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 140, 40));

        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 140, 40));

        chng.setText("Change Password");
        chng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chngActionPerformed(evt);
            }
        });
        jPanel1.add(chng, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gtbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gtbalActionPerformed
        // TODO add your handling code here:
        double value = Double.valueOf(val.getText());
        double paymnt = Double.valueOf(pay.getText());
        
        double balance = paymnt-value;
        bal.setText(Double.toString(balance));
    }//GEN-LAST:event_gtbalActionPerformed

    private void cmpltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpltActionPerformed
        // TODO add your handling code here:
        String pNIC = p_nic.getText();
        String value = "Rs. "+val.getText();
        Controller.Payment_con pc = new Controller.Payment_con();
        
        if(pNIC.equals("")){
            JOptionPane.showMessageDialog(null, "Input patient's nic no..", "Validation Error..",JOptionPane.INFORMATION_MESSAGE);
        }else{
            pc.setPay(pNIC, value);
        }
        p_nic.setText("");
        val.setText("");
        pay.setText("");
        bal.setText("");
    }//GEN-LAST:event_cmpltActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JOptionPane.showMessageDialog(null, "Successfully logged out by Cashier...", "<<<<  Logout  >>>>",JOptionPane.INFORMATION_MESSAGE);
        Login.login l =new Login.login();
        l.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void chngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chngActionPerformed
        // TODO add your handling code here:
        Login.PasswordChange pc = new Login.PasswordChange();
        pc.setUser("Cashier");
        pc.setVisible(true);
    }//GEN-LAST:event_chngActionPerformed

    private void p_nicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p_nicKeyTyped
        // TODO add your handling code here:
        char a = evt.getKeyChar();
        if(p_nic.getText().length() == 10){
            evt.consume();
        }
    }//GEN-LAST:event_p_nicKeyTyped

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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bal;
    private javax.swing.JButton chng;
    private javax.swing.JButton cmplt;
    private javax.swing.JButton gtbal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField p_nic;
    private javax.swing.JTextField pay;
    private javax.swing.JTextField val;
    // End of variables declaration//GEN-END:variables
}
