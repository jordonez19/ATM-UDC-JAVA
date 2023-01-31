package panels;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import main.Menu;

public class WithdrawPanel extends javax.swing.JPanel {

    public static WithdrawPanel instance;
    public double finalBalance;

    public WithdrawPanel() {
        initComponents();
        instance = this;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Balance10BTN1 = new javax.swing.JButton();
        Balance20BTN = new javax.swing.JButton();
        Balance50BTN2 = new javax.swing.JButton();
        Balance100BTN3 = new javax.swing.JButton();
        Balance200BTN4 = new javax.swing.JButton();
        OtroValorBTN5 = new javax.swing.JButton();
        atmDepositTitle = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Balance10BTN1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Balance10BTN1.setForeground(new java.awt.Color(153, 204, 255));
        Balance10BTN1.setText("$10.000");
        Balance10BTN1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Balance10BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Balance10BTN1ActionPerformed(evt);
            }
        });

        Balance20BTN.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Balance20BTN.setForeground(new java.awt.Color(153, 204, 255));
        Balance20BTN.setText("$20.000");
        Balance20BTN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Balance20BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Balance20BTNActionPerformed(evt);
            }
        });

        Balance50BTN2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Balance50BTN2.setForeground(new java.awt.Color(153, 204, 255));
        Balance50BTN2.setText("$50.000");
        Balance50BTN2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Balance50BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Balance50BTN2ActionPerformed(evt);
            }
        });

        Balance100BTN3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Balance100BTN3.setForeground(new java.awt.Color(153, 204, 255));
        Balance100BTN3.setText("$100.000");
        Balance100BTN3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Balance100BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Balance100BTN3ActionPerformed(evt);
            }
        });

        Balance200BTN4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Balance200BTN4.setForeground(new java.awt.Color(153, 204, 255));
        Balance200BTN4.setText("$200.000");
        Balance200BTN4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Balance200BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Balance200BTN4ActionPerformed(evt);
            }
        });

        OtroValorBTN5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        OtroValorBTN5.setForeground(new java.awt.Color(153, 204, 255));
        OtroValorBTN5.setText("Otro valor");
        OtroValorBTN5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        OtroValorBTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtroValorBTN5ActionPerformed(evt);
            }
        });

        atmDepositTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        atmDepositTitle.setForeground(new java.awt.Color(153, 204, 255));
        atmDepositTitle.setText("ATM - WITHDRAW");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Balance10BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Balance50BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Balance20BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Balance100BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OtroValorBTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Balance200BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(atmDepositTitle)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(atmDepositTitle)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Balance100BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Balance10BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Balance200BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Balance20BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OtroValorBTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Balance50BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Balance10BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Balance10BTN1ActionPerformed
        Menu.instance.currentBalance -=  10000;
        JOptionPane.showMessageDialog(null, "$10.000 han sido retirados en la cuenta, ya puedes consultar tu nuevo saldo.");
    }//GEN-LAST:event_Balance10BTN1ActionPerformed

    private void Balance20BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Balance20BTNActionPerformed
        Menu.instance.currentBalance -= 20000;
        JOptionPane.showMessageDialog(null, "$20.000 han sido retirados en la cuenta, ya puedes consultar tu nuevo saldo.");
    }//GEN-LAST:event_Balance20BTNActionPerformed

    private void Balance50BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Balance50BTN2ActionPerformed
        Menu.instance.currentBalance -= 50000;
        JOptionPane.showMessageDialog(null, "$50.000 han sido retirados en la cuenta, ya puedes consultar tu nuevo saldo.");
    }//GEN-LAST:event_Balance50BTN2ActionPerformed

    private void Balance100BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Balance100BTN3ActionPerformed
        Menu.instance.currentBalance -= 100000;
        JOptionPane.showMessageDialog(null, "$100.000 han sido retirados en la cuenta, ya puedes consultar tu nuevo saldo.");
    }//GEN-LAST:event_Balance100BTN3ActionPerformed

    private void Balance200BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Balance200BTN4ActionPerformed
        Menu.instance.currentBalance -= 200000;
        JOptionPane.showMessageDialog(null, "$200.000 han sido retirados en la cuenta, ya puedes consultar tu nuevo saldo.");
    }//GEN-LAST:event_Balance200BTN4ActionPerformed

    private void OtroValorBTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtroValorBTN5ActionPerformed
        String input = JOptionPane.showInputDialog(instance, "Enter deposit amount:");
        try {
            double value = Double.parseDouble(input);
            Menu.instance.currentBalance -= value;
            JOptionPane.showMessageDialog(instance, "Successfully deposited " + value + ".");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(instance, "Invalid deposit amount.");
        }
    }//GEN-LAST:event_OtroValorBTN5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Balance100BTN3;
    public javax.swing.JButton Balance10BTN1;
    public javax.swing.JButton Balance200BTN4;
    public javax.swing.JButton Balance20BTN;
    public javax.swing.JButton Balance50BTN2;
    public javax.swing.JButton OtroValorBTN5;
    private javax.swing.JLabel atmDepositTitle;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
