/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panels;

public class BalancePanel extends javax.swing.JPanel {

        public BalancePanel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        balanceLBL = new javax.swing.JLabel();
        balanceTitle = new javax.swing.JLabel();
        pesosSign = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        balanceLBL.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        balanceLBL.setForeground(new java.awt.Color(153, 204, 255));
        balanceLBL.setText("...");
        balanceLBL.setName("balanceLBL"); // NOI18N

        balanceTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        balanceTitle.setForeground(new java.awt.Color(153, 204, 255));
        balanceTitle.setText("Your Balance:");

        pesosSign.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        pesosSign.setForeground(new java.awt.Color(153, 204, 255));
        pesosSign.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(balanceLBL)
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(balanceTitle)
                    .addContainerGap(281, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(245, 245, 245)
                    .addComponent(pesosSign)
                    .addContainerGap(330, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(balanceLBL)
                .addGap(220, 220, 220))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(158, 158, 158)
                    .addComponent(balanceTitle)
                    .addContainerGap(291, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(229, Short.MAX_VALUE)
                    .addComponent(pesosSign)
                    .addGap(220, 220, 220)))
        );

        balanceLBL.getAccessibleContext().setAccessibleDescription("");

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel balanceLBL;
    private javax.swing.JLabel balanceTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pesosSign;
    // End of variables declaration//GEN-END:variables
}