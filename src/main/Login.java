package main;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public String password = "1234";

    public static Login instance;
//newPasswordUpdated

    public Login() {
        initComponents();
        instance = this;
        try {
            BufferedReader br = new BufferedReader(new FileReader("password.txt"));
            password = br.readLine();
            br.close();
        } catch (Exception ex) {
            // ignore
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginContent = new javax.swing.JPanel();
        userTXT = new javax.swing.JTextField();
        passwordTXT = new javax.swing.JTextField();
        passwordLBL = new javax.swing.JLabel();
        userLBL = new javax.swing.JLabel();
        titleLBL = new javax.swing.JLabel();
        loginBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginContent.setBackground(new java.awt.Color(153, 204, 255));

        userTXT.setForeground(new java.awt.Color(153, 204, 255));
        userTXT.setName("userTXT"); // NOI18N

        passwordTXT.setForeground(new java.awt.Color(153, 204, 255));

        passwordLBL.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        passwordLBL.setForeground(new java.awt.Color(255, 255, 255));
        passwordLBL.setText("Contraseña");

        userLBL.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        userLBL.setForeground(new java.awt.Color(255, 255, 255));
        userLBL.setText("Usuario");

        titleLBL.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(255, 255, 255));
        titleLBL.setText("ATM-UDC");

        loginBTN.setForeground(new java.awt.Color(153, 204, 255));
        loginBTN.setText("Entrar");
        loginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginContentLayout = new javax.swing.GroupLayout(loginContent);
        loginContent.setLayout(loginContentLayout);
        loginContentLayout.setHorizontalGroup(
            loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginContentLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginContentLayout.createSequentialGroup()
                        .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginContentLayout.createSequentialGroup()
                                .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(loginContentLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(passwordLBL)
                                        .addGap(43, 43, 43)
                                        .addComponent(passwordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginContentLayout.createSequentialGroup()
                                        .addComponent(userLBL)
                                        .addGap(40, 40, 40)
                                        .addComponent(userTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginContentLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginContentLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(titleLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginContentLayout.setVerticalGroup(
            loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginContentLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(titleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLBL))
                .addGap(42, 42, 42)
                .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLBL)
                    .addComponent(passwordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(loginBTN)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTNActionPerformed

        Menu menu = new Menu();
        String userInput = userTXT.getText();
        String passwordInput = passwordTXT.getText();

        if (!userInput.isEmpty() && !passwordInput.isEmpty()) {

            if (passwordInput.equals(password)) {
                menu.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Clave incorrecta");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar los campos para poder continuar");

        }
    }//GEN-LAST:event_loginBTNActionPerformed

    public void setPassword(String password) {
        this.password = password;
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton loginBTN;
    public javax.swing.JPanel loginContent;
    private javax.swing.JLabel passwordLBL;
    public javax.swing.JTextField passwordTXT;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JLabel userLBL;
    public javax.swing.JTextField userTXT;
    // End of variables declaration//GEN-END:variables
}
