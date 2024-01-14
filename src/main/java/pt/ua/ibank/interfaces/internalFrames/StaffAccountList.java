/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pt.ua.ibank.interfaces.internalFrames;

import java.awt.event.ActionEvent;
import pt.ua.ibank.interfaces.staffInterface;

/**
 *
 * @author ricar
 */
public class StaffAccountList extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     *
     * @param parent
     */
    public StaffAccountList(staffInterface parent) {
        initComponents();

        javax.swing.JButton openProfileButton =
                            contasInterfaceContainer.getOpenProfileButton();

        openProfileButton.addActionListener((ActionEvent e) -> {
            int clientID = contasInterfaceContainer.getCurrCliente().numCliente;
            parent.addWindow(new StaffProfilePanel(parent, clientID));
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

        contasInterfaceContainer = new pt.ua.ibank.interfaces.internalFrames.staff.accounts.ContasMainInterface();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Funcionarios");
        setFrameIcon(null);
        getContentPane().add(contasInterfaceContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pt.ua.ibank.interfaces.internalFrames.staff.accounts.ContasMainInterface contasInterfaceContainer;
    // End of variables declaration//GEN-END:variables
}
