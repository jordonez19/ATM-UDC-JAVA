package main;

import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.JPanel;
import panels.BalancePanel;
import panels.DepositPanel;
import panels.PasswordPanel;
import panels.WithdrawPanel;

public class Menu extends javax.swing.JFrame {

    public static Menu instance;
    public double currentBalance = 1000000;

    public Menu() {
        initComponents();
        instance = this;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BalanceBTN = new javax.swing.JButton();
        DepositBTN = new javax.swing.JButton();
        WithdrawBTN = new javax.swing.JButton();
        PasswordBTN = new javax.swing.JButton();
        ExitBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Content.setBackground(new java.awt.Color(153, 204, 255));
        Content.setPreferredSize(new java.awt.Dimension(600, 500));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BalanceBTN.setBackground(new java.awt.Color(153, 204, 255));
        BalanceBTN.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        BalanceBTN.setForeground(new java.awt.Color(255, 255, 255));
        BalanceBTN.setText("Balance");
        BalanceBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceBTNActionPerformed(evt);
            }
        });

        DepositBTN.setBackground(new java.awt.Color(153, 204, 255));
        DepositBTN.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        DepositBTN.setForeground(new java.awt.Color(255, 255, 255));
        DepositBTN.setText("Deposit");
        DepositBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBTNActionPerformed(evt);
            }
        });

        WithdrawBTN.setBackground(new java.awt.Color(153, 204, 255));
        WithdrawBTN.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        WithdrawBTN.setForeground(new java.awt.Color(255, 255, 255));
        WithdrawBTN.setText("Withdraw");
        WithdrawBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawBTNActionPerformed(evt);
            }
        });

        PasswordBTN.setBackground(new java.awt.Color(153, 204, 255));
        PasswordBTN.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        PasswordBTN.setForeground(new java.awt.Color(255, 255, 255));
        PasswordBTN.setText("Password Change");
        PasswordBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordBTNActionPerformed(evt);
            }
        });

        ExitBTN.setBackground(new java.awt.Color(153, 204, 255));
        ExitBTN.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ExitBTN.setForeground(new java.awt.Color(255, 255, 255));
        ExitBTN.setText("Exit");
        ExitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("ATM - UDC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DepositBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WithdrawBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BalanceBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BalanceBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DepositBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WithdrawBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BalanceBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceBTNActionPerformed
        BalancePanel balance = new BalancePanel();
        DecimalFormat formatter = new DecimalFormat("#,###.00");

        balance.balanceLBL.setText(formatter.format(currentBalance));
        ShowPanel(balance);

    }//GEN-LAST:event_BalanceBTNActionPerformed

    private void DepositBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBTNActionPerformed
        DepositPanel deposit = new DepositPanel();
        ShowPanel(deposit);
    }//GEN-LAST:event_DepositBTNActionPerformed

    private void WithdrawBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawBTNActionPerformed
        WithdrawPanel withdraw = new WithdrawPanel();
        ShowPanel(withdraw);
    }//GEN-LAST:event_WithdrawBTNActionPerformed

    private void PasswordBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordBTNActionPerformed
        PasswordPanel password = new PasswordPanel();
        ShowPanel(password);
    }//GEN-LAST:event_PasswordBTNActionPerformed

    private void ExitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBTNActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ExitBTNActionPerformed

    private void ShowPanel(JPanel p) {
        p.setSize(600, 500);
        p.setLocation(0, 0);
        Content.removeAll();
        Content.add(p, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BalanceBTN;
    public javax.swing.JPanel Content;
    private javax.swing.JButton DepositBTN;
    private javax.swing.JButton ExitBTN;
    private javax.swing.JButton PasswordBTN;
    private javax.swing.JButton WithdrawBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
