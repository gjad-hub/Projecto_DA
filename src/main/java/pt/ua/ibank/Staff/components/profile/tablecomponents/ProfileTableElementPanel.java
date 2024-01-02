/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pt.ua.ibank.Staff.components.profile.tablecomponents;

import java.awt.Color;

/**
 *
 * @author ricar
 */
public class ProfileTableElementPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClientProfileListElementPanel
     *
     * @param isGray
     * @param title
     * @param value
     */
    public ProfileTableElementPanel(boolean isGray, String title,
            String value) {
        initComponents();
        this.lblTtitle.setText(title);
        this.lblValue.setText(value);

        Color bgColor = new Color(0xFFFFFFFF);
        if (isGray) {
            bgColor = new Color(0xF7, 0xF7, 0xF7);
        }
        this.setBackground(bgColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTtitle = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        lblTtitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTtitle.setText("Title");

        lblValue.setText("value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblTtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(lblValue)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTtitle)
                    .addComponent(lblValue))
                .addGap(0, 5, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTtitle;
    private javax.swing.JLabel lblValue;
    // End of variables declaration//GEN-END:variables
}
