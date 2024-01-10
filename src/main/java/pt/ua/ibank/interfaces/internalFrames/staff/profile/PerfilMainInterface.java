/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pt.ua.ibank.interfaces.internalFrames.staff.profile;

import com.mysql.cj.conf.ConnectionUrlParser.Pair;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import pt.ua.ibank.DTO.Deposito;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilCellEditor;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.card.PerfilCardTableModel;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.card.PerfilCardTableCellRenderer;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilTableActionEvent;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilTableCellRenderer;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilPersonalTableModel;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.deposit.DepositActionRenderer;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.deposit.DepositCellEditor;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.deposit.DepositTableActionEvent;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.deposit.DepositTableCellRenderer;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.deposit.DepositTableModel;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.modcomment.PerfilCommentTableCellRenderer;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.modcomment.PerfilCommentTableModel;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilActionRenderer;

/**
 *
 * @author ricar
 */
public class PerfilMainInterface extends javax.swing.JPanel {

    private String clientEmail;

    //PerfilPersonalTableModel personalDataTable = new PerfilPersonalTableModel(clientEmail);
    //PerfilCardTableModel cardDataTable = new PerfilCardTableModel(clientEmail);
    //PerfilCommentTableModel pctm = new PerfilCommentTableModel(clientEmail);
    PerfilPersonalTableModel personalDataTable = new PerfilPersonalTableModel();
    PerfilCardTableModel cardDataTable = new PerfilCardTableModel();
    PerfilCommentTableModel pctm = new PerfilCommentTableModel();
    DepositTableModel dtm = new DepositTableModel();
    PerfilCommentTableCellRenderer fuckme = new PerfilCommentTableCellRenderer();

    /**
     * Creates new form NewJPanel
     */
    public PerfilMainInterface() {
        initComponents();
        lblNomeCompleto.setText(personalDataTable.client.nome);
        lblDataValue.setText("01/2024");
    }

    public PerfilMainInterface(String clientEmail) {
        initComponents();
        this.clientEmail = clientEmail;
        lblNomeCompleto.setText(personalDataTable.client.nome);
    }

    private static void AdicionarComentarioPerfil(
            PerfilCommentTableModel commentModel, String message) {
        JFrame frame = new JFrame("Comment Input");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        // Create a label
        JLabel label = new JLabel("Enter your comment:");
        panel.add(label);

        // Create a text field for user input
        JTextField textField = new JTextField(20);
        panel.add(textField);

        // Create a button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            String input = textField.getText();
            String resultado = commentModel.adicionarComentario(message + input)
                    ? "Operação feita com sucesso"
                    : "Operação feita sem sucesso, tente novamente";
            JOptionPane.showMessageDialog(frame, resultado);
            frame.dispose();

        });
        panel.add(submitButton);

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    submitButton.doClick(); // Simulate a click on the submitButton
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        // Set up the frame
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LayeredPaneEditarConta = new javax.swing.JLayeredPane();
        jPanelDadosContainer = new javax.swing.JPanel();
        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/images/icons_20/client.png"));
        Image img = backgroundImage.getImage();
        jPanelDadosDescricao = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblDataValue = new javax.swing.JLabel();
        lblNomeCompleto = new javax.swing.JLabel();
        jPanelFotoPerfil = new JPanel() {
            protected void paintComponent(Graphics g) {

                // Draw the background image
                g.drawImage(img, 0, 0,getWidth(), getHeight(), null);
            }
        };
        jPanelDadosPessoais = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        //PerfilPersonalTableModel personalDataTable = new PerfilPersonalTableModel(clientEmail);
        PerfilPersonalTableModel personalDataTable = new PerfilPersonalTableModel();
        jTablePersonalData = new javax.swing.JTable();
        jPanelDadosCartao = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCardData = new javax.swing.JTable();
        jPanelDadosComentarios = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        jPanelDepositosPorAprovar = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTableDepositDatatr = new org.jdesktop.swingx.JXTable();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(859, 562));
        setLayout(new java.awt.BorderLayout());

        LayeredPaneEditarConta.setBackground(new java.awt.Color(0, 0, 0));
        LayeredPaneEditarConta.setPreferredSize(new java.awt.Dimension(776, 553));

        jPanelDadosContainer.setBackground(new java.awt.Color(102, 102, 102));
        jPanelDadosContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanelDadosContainer.setForeground(new java.awt.Color(102, 102, 102));

        jPanelDadosDescricao.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setBackground(new java.awt.Color(58, 58, 58));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Adicionar comentario");
        jButton3.setToolTipText("");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(58, 58, 58));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ações de conta");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(319, 36));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Data de criação:");

        lblDataValue.setBackground(new java.awt.Color(255, 255, 255));
        lblDataValue.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDataValue.setForeground(new java.awt.Color(255, 255, 255));
        lblDataValue.setText("Data");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel14)
                .addGap(27, 27, 27)
                .addComponent(lblDataValue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDataValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblNomeCompleto.setBackground(new java.awt.Color(255, 255, 255));
        lblNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNomeCompleto.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeCompleto.setText("Nome completo");

        jPanelFotoPerfil.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFotoPerfil.setMaximumSize(new java.awt.Dimension(262, 262));
        jPanelFotoPerfil.setPreferredSize(new java.awt.Dimension(262, 262));

        javax.swing.GroupLayout jPanelFotoPerfilLayout = new javax.swing.GroupLayout(jPanelFotoPerfil);
        jPanelFotoPerfil.setLayout(jPanelFotoPerfilLayout);
        jPanelFotoPerfilLayout.setHorizontalGroup(
            jPanelFotoPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );
        jPanelFotoPerfilLayout.setVerticalGroup(
            jPanelFotoPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelDadosDescricaoLayout = new javax.swing.GroupLayout(jPanelDadosDescricao);
        jPanelDadosDescricao.setLayout(jPanelDadosDescricaoLayout);
        jPanelDadosDescricaoLayout.setHorizontalGroup(
            jPanelDadosDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosDescricaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDadosDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(jPanelFotoPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDadosDescricaoLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosDescricaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNomeCompleto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosDescricaoLayout.setVerticalGroup(
            jPanelDadosDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(319, 36));

        jPanel1.setBackground(new java.awt.Color(76, 88, 160));
        jPanel1.setOpaque(false);

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/pencil.png"))); // NOI18N
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dados Pessoais");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        jTablePersonalData.setTableHeader(null);
        jTablePersonalData.setModel(personalDataTable);
        jTablePersonalData.setRowHeight(35);
        jTablePersonalData.setRowSelectionAllowed(false);
        jTablePersonalData.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTablePersonalData.setShowHorizontalLines(false);
        jTablePersonalData.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTablePersonalData);
        //collumn 1
        jTablePersonalData.getColumnModel().getColumn(0)
        .setCellRenderer(new PerfilTableCellRenderer());

        jTablePersonalData.getColumnModel()
        .getColumn(1)
        .setCellRenderer(new PerfilActionRenderer());
        jTablePersonalData.getColumnModel()
        .getColumn(1)
        .setMaxWidth(100);

        jTablePersonalData.getColumnModel()
        .getColumn(0)
        .setMaxWidth(150);

        // MAX WIDTH

        // EDIT BUTTON STUFF
        PerfilTableActionEvent eventPersonal = new PerfilTableActionEvent() {
            String oldLeft;

            @Override
            public void onEdit(int row) {
                oldLeft = ((Pair<String, String>) personalDataTable.getValueAt(
                    row, 0)).left;
        }

        @Override
        public void onCancel(int row) {
            // do nothing
        }

        @Override
        public void onSave(int row, String newValue) {
            System.out.println(newValue);
            if(newValue.length() > 2)
            {
                personalDataTable.getValueAt(row, 0);
                Pair<String, String> newRecord = new Pair(oldLeft, newValue);
                personalDataTable.setValueAt(newRecord, row, 0);
                jTablePersonalData.repaint();
                if(oldLeft == "Nome:"){
                    lblNomeCompleto.setText(newValue);
                }
            }
        }
    };

    jTablePersonalData.getColumnModel()
    .getColumn(1)
    .setCellEditor(new PerfilCellEditor(eventPersonal));
    jTablePersonalData.setRowHeight(40);

    jTablePersonalData.setRowSelectionAllowed(false);

    jTablePersonalData.setSelectionBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
    jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
    jPanelDadosPessoaisLayout.setHorizontalGroup(
        jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    );
    jPanelDadosPessoaisLayout.setVerticalGroup(
        jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
    );

    jPanel7.setBackground(new java.awt.Color(0, 0, 0));
    jPanel7.setPreferredSize(new java.awt.Dimension(319, 36));

    jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel26.setForeground(new java.awt.Color(255, 255, 255));
    jLabel26.setText("Cartões");

    jLabel27.setBackground(new java.awt.Color(51, 51, 51));
    jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
    jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/luggage.png"))); // NOI18N
    jLabel27.setOpaque(true);

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
            .addGap(37, 37, 37))
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
    jScrollPane3.setBorder(null);

    jTableCardData.setModel(cardDataTable);
    jTableCardData.setRowHeight(40);
    jTableCardData.setRowSelectionAllowed(false);
    jTableCardData.setSelectionBackground(new java.awt.Color(255, 255, 255));
    jTableCardData.setShowGrid(false);
    jScrollPane3.setViewportView(jTableCardData);
    jTableCardData.setTableHeader(null);

    jTableCardData.getColumnModel().getColumn(0)
    .setCellRenderer(new PerfilCardTableCellRenderer());

    javax.swing.GroupLayout jPanelDadosCartaoLayout = new javax.swing.GroupLayout(jPanelDadosCartao);
    jPanelDadosCartao.setLayout(jPanelDadosCartaoLayout);
    jPanelDadosCartaoLayout.setHorizontalGroup(
        jPanelDadosCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    );
    jPanelDadosCartaoLayout.setVerticalGroup(
        jPanelDadosCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelDadosCartaoLayout.createSequentialGroup()
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
            .addGap(0, 0, 0))
    );

    jPanel5.setBackground(new java.awt.Color(0, 0, 0));
    jPanel5.setPreferredSize(new java.awt.Dimension(319, 36));

    jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
    jLabel12.setText("Comentarios");

    jLabel13.setBackground(new java.awt.Color(51, 51, 51));
    jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/staffToolsIcon.png"))); // NOI18N
    jLabel13.setOpaque(true);

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel12)
            .addContainerGap(119, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel12))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jXTable1.setModel(pctm
    );
    jScrollPane2.setViewportView(jXTable1);
    jXTable1.setRowHeight(90);
    jXTable1.setTableHeader(null);

    jXTable1.getColumnModel().getColumn(0)
    .setCellRenderer(new PerfilCommentTableCellRenderer());

    javax.swing.GroupLayout jPanelDadosComentariosLayout = new javax.swing.GroupLayout(jPanelDadosComentarios);
    jPanelDadosComentarios.setLayout(jPanelDadosComentariosLayout);
    jPanelDadosComentariosLayout.setHorizontalGroup(
        jPanelDadosComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
        .addComponent(jScrollPane2)
    );
    jPanelDadosComentariosLayout.setVerticalGroup(
        jPanelDadosComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelDadosComentariosLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
    );

    jPanel9.setBackground(new java.awt.Color(0, 0, 0));
    jPanel9.setPreferredSize(new java.awt.Dimension(319, 36));

    jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel18.setForeground(new java.awt.Color(255, 255, 255));
    jLabel18.setText("Depositos");

    jLabel19.setBackground(new java.awt.Color(51, 51, 51));
    jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/staffToolsIcon.png"))); // NOI18N
    jLabel19.setOpaque(true);

    javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
    jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel18)
            .addContainerGap(192, Short.MAX_VALUE))
    );
    jPanel9Layout.setVerticalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(0, 7, Short.MAX_VALUE))
    );

    jTableDepositDatatr.setModel(dtm);
    jTableDepositDatatr.setRowHeight(30);

    javax.swing.GroupLayout jPanelDepositosPorAprovarLayout = new javax.swing.GroupLayout(jPanelDepositosPorAprovar);
    jPanelDepositosPorAprovar.setLayout(jPanelDepositosPorAprovarLayout);
    jPanelDepositosPorAprovarLayout.setHorizontalGroup(
        jPanelDepositosPorAprovarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        .addComponent(jTableDepositDatatr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanelDepositosPorAprovarLayout.setVerticalGroup(
        jPanelDepositosPorAprovarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelDepositosPorAprovarLayout.createSequentialGroup()
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jTableDepositDatatr, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
    );

    //collumn 1
    jTableDepositDatatr.getColumnModel().getColumn(0)
    .setCellRenderer(new DepositTableCellRenderer());

    jTableDepositDatatr.getColumnModel()
    .getColumn(1)
    .setCellRenderer(new DepositActionRenderer());

    jTableDepositDatatr.getColumnModel()
    .getColumn(1).setMaxWidth(90);
    jTableDepositDatatr.getColumnModel()
    .getColumn(1).setMinWidth(50);

    // EDIT BUTTON STUFF
    DepositTableActionEvent eventDeposit = new DepositTableActionEvent() {
        String oldLeft;

        @Override
        public void onAcceptTransaction(int row){
            dtm.aprovarDeposito(row);
        }

        @Override
        public void onRejectTransaction(int row){
            Deposito d = (Deposito)dtm.getValueAt(row,0);

            AdicionarComentarioPerfil(pctm,"[deposito n"+d.idDeposito+"] ");
            dtm.reprovarDeposito(row);
        }
    };

    jTableDepositDatatr.getColumnModel()
    .getColumn(1)
    .setCellEditor(new DepositCellEditor(eventDeposit));

    jTableDepositDatatr.setRowSelectionAllowed(true);

    javax.swing.GroupLayout jPanelDadosContainerLayout = new javax.swing.GroupLayout(jPanelDadosContainer);
    jPanelDadosContainer.setLayout(jPanelDadosContainerLayout);
    jPanelDadosContainerLayout.setHorizontalGroup(
        jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanelDadosDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addGroup(jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
                    .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanelDadosCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
                    .addComponent(jPanelDadosComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanelDepositosPorAprovar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanelDadosContainerLayout.setVerticalGroup(
        jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelDadosDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
                    .addGroup(jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelDadosCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelDepositosPorAprovar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelDadosComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
    );

    int personalDataTableWidth = jTablePersonalData.getSize().width;
    int personalDataTableHeight = ((jTablePersonalData.getModel().getRowCount()+1) * 40)-5;
    jPanelDadosPessoais.setPreferredSize(new Dimension(personalDataTableWidth, personalDataTableHeight));

    LayeredPaneEditarConta.setLayer(jPanelDadosContainer, javax.swing.JLayeredPane.DEFAULT_LAYER);

    javax.swing.GroupLayout LayeredPaneEditarContaLayout = new javax.swing.GroupLayout(LayeredPaneEditarConta);
    LayeredPaneEditarConta.setLayout(LayeredPaneEditarContaLayout);
    LayeredPaneEditarContaLayout.setHorizontalGroup(
        LayeredPaneEditarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(LayeredPaneEditarContaLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDadosContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    LayeredPaneEditarContaLayout.setVerticalGroup(
        LayeredPaneEditarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(LayeredPaneEditarContaLayout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jPanelDadosContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap(63, Short.MAX_VALUE))
    );

    add(LayeredPaneEditarConta, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AdicionarComentarioPerfil(pctm, "");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LayeredPaneEditarConta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelDadosCartao;
    private javax.swing.JPanel jPanelDadosComentarios;
    private javax.swing.JPanel jPanelDadosContainer;
    private javax.swing.JPanel jPanelDadosDescricao;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JPanel jPanelDepositosPorAprovar;
    private javax.swing.JPanel jPanelFotoPerfil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCardData;
    private org.jdesktop.swingx.JXTable jTableDepositDatatr;
    private javax.swing.JTable jTablePersonalData;
    private org.jdesktop.swingx.JXTable jXTable1;
    private javax.swing.JLabel lblDataValue;
    private javax.swing.JLabel lblNomeCompleto;
    // End of variables declaration//GEN-END:variables
}
