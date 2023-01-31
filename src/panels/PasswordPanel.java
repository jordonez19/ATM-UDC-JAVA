package panels;

import java.io.FileWriter;
import javax.swing.JOptionPane;
import main.Login;

public class PasswordPanel extends javax.swing.JPanel {

    public String newPasswordUpdated;

    public PasswordPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        newPasswordTitle = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JLabel();
        confirmPasswordTXT = new javax.swing.JTextField();
        newPasswordTXT = new javax.swing.JTextField();
        changePasswordBTN = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        newPasswordTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        newPasswordTitle.setForeground(new java.awt.Color(153, 204, 255));
        newPasswordTitle.setText("New Password:");

        confirmPassword.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        confirmPassword.setForeground(new java.awt.Color(153, 204, 255));
        confirmPassword.setText("Confirm Password:");

        confirmPasswordTXT.setForeground(new java.awt.Color(153, 204, 255));
        confirmPasswordTXT.setName("confirmPasswordTXT"); // NOI18N
        confirmPasswordTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordTXTActionPerformed(evt);
            }
        });

        newPasswordTXT.setForeground(new java.awt.Color(153, 204, 255));
        newPasswordTXT.setName("userTXT"); // NOI18N
        newPasswordTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordTXTActionPerformed(evt);
            }
        });

        changePasswordBTN.setBackground(new java.awt.Color(153, 204, 255));
        changePasswordBTN.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        changePasswordBTN.setForeground(new java.awt.Color(255, 255, 255));
        changePasswordBTN.setText("Cambiar");
        changePasswordBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePasswordBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPassword)
                    .addComponent(confirmPasswordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordTitle))
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(newPasswordTitle)
                .addGap(21, 21, 21)
                .addComponent(newPasswordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmPassword)
                .addGap(18, 18, 18)
                .addComponent(confirmPasswordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(changePasswordBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
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

    private void newPasswordTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordTXTActionPerformed

    }//GEN-LAST:event_newPasswordTXTActionPerformed

    private void confirmPasswordTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordTXTActionPerformed

    }//GEN-LAST:event_confirmPasswordTXTActionPerformed
    private void changePasswordBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordBTNActionPerformed
          String confirmPassword = confirmPasswordTXT.getText();
        String newPassword = newPasswordTXT.getText();
        if (newPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cant leave spaces in blank");
        } else if (newPassword.equals(confirmPassword)) {
            try {
                FileWriter fileWriter = new FileWriter("password.txt");
                fileWriter.write(newPassword);
                fileWriter.close();
                JOptionPane.showMessageDialog(null, "Password Changed");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Passwords don't match");
        }

    }//GEN-LAST:event_changePasswordBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePasswordBTN;
    private javax.swing.JLabel confirmPassword;
    private javax.swing.JTextField confirmPasswordTXT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField newPasswordTXT;
    private javax.swing.JLabel newPasswordTitle;
    // End of variables declaration//GEN-END:variables
}
