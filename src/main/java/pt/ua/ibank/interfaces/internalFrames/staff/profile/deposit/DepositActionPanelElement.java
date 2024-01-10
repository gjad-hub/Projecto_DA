/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pt.ua.ibank.interfaces.internalFrames.staff.profile.deposit;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author ricar
 */
public class DepositActionPanelElement extends javax.swing.JPanel {

    /**
     * Creates new form ClientProfilePanelAction
     */
    public DepositActionPanelElement() {
        initComponents();
        cmdRefuse.setVisible(true);
        cmdAccept.setVisible(true);
    }

    public void InitEvent(DepositTableActionEvent event, int row) {
        cmdAccept.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            event.onAcceptTransaction(row);
        });
        cmdRefuse.addActionListener((ActionEvent e) -> {
            event.onRejectTransaction(row);
            cmdRefuse.setVisible(true);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdAccept = new pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilActionButton();
        cmdRefuse = new pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilActionButton();

        setBackground(new java.awt.Color(255, 255, 255));

        cmdAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/tick.png"))); // NOI18N
        cmdAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAcceptActionPerformed(evt);
            }
        });

        cmdRefuse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/cancel.jpg"))); // NOI18N
        cmdRefuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRefuseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(cmdRefuse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdAccept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdRefuse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdAccept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelActionPerformed

    }//GEN-LAST:event_cmdCancelActionPerformed

    private void cmdAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAcceptActionPerformed
        cmdRefuse.setVisible(false);
        cmdAccept.setVisible(false);
        System.out.println("Aceite!");
    }//GEN-LAST:event_cmdAcceptActionPerformed

    private void cmdRefuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRefuseActionPerformed
        cmdRefuse.setVisible(false);
        cmdAccept.setVisible(false);
    }//GEN-LAST:event_cmdRefuseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilActionButton cmdAccept;
    private pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilActionButton cmdRefuse;
    // End of variables declaration//GEN-END:variables
}
