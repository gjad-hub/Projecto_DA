package pt.ua.ibank.interfaces.internalFrames.staff.profile;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import pt.ua.ibank.interfaces.internalFrames.staff.manager.profile.personal.PerfilEmployeePersonalTableModel;
import pt.ua.ibank.interfaces.internalFrames.staff.manager.profile.personal.lastoperations.PerfilStaffLastOperationsTableCellRenderer;
import pt.ua.ibank.interfaces.internalFrames.staff.manager.profile.personal.lastoperations.PerfilStaffLastOperationsTableModel;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilActionRenderer;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilCellEditor;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilTableActionEvent;
import pt.ua.ibank.interfaces.internalFrames.staff.profile.personal.PerfilTableCellRenderer;
import static pt.ua.ibank.utilities.Configs.LocalEmployee;

public class StaffPerfilMainInterface extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     *
     * @param clientEmail
     */
    int clientID;
    boolean isManager;
    private PerfilStaffLastOperationsTableModel lastOperationModel;
    private PerfilEmployeePersonalTableModel personalDataTable;

    public StaffPerfilMainInterface(int clientID, boolean isManager) {
        this.clientID = clientID;
        this.isManager = isManager;
        initComponents();
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        LayeredPaneEditarConta = new javax.swing.JLayeredPane();
        jPanelDadosContainer = new javax.swing.JPanel();
        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/resources/images/icons_20/client.png"));
        Image img = backgroundImage.getImage();
        jPanelDadosDescricao = new javax.swing.JPanel();
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
        personalDataTable = new pt.ua.ibank.interfaces.internalFrames.staff.manager.profile.personal.PerfilEmployeePersonalTableModel(
            clientID);
        jTablePersonalData = new javax.swing.JTable();
        jPanelOperacoesDisponiveis = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnApagarConta = new javax.swing.JButton();
        BtnPromoverConta = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanelDadosCartao = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lastOperationModel = new PerfilStaffLastOperationsTableModel(clientID);
        jTableCardData = new javax.swing.JTable();

        jMenuItem1.setText("there ya go");
        jPopupMenu.add(jMenuItem1);

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(859, 562));
        setLayout(new java.awt.BorderLayout());

        LayeredPaneEditarConta.setBackground(new java.awt.Color(0, 0, 0));
        LayeredPaneEditarConta.setPreferredSize(new java.awt.Dimension(776, 553));

        jPanelDadosContainer.setBackground(new java.awt.Color(102, 102, 102));
        jPanelDadosContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanelDadosContainer.setForeground(new java.awt.Color(102, 102, 102));

        jPanelDadosDescricao.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(319, 36));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Data de criação:");

        lblDataValue.setBackground(new java.awt.Color(255, 255, 255));
        lblDataValue.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblDataValue.setForeground(new java.awt.Color(255, 255, 255));
        lblDataValue.setText(personalDataTable.employee.creationDate.toString());

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
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDataValue))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        lblNomeCompleto.setBackground(new java.awt.Color(255, 255, 255));
        lblNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNomeCompleto.setText(personalDataTable.employee.name);

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
            .addGroup(jPanelDadosDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGroup(jPanelDadosDescricaoLayout.createSequentialGroup()
                        .addComponent(jPanelFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelDadosDescricaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNomeCompleto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
        jTablePersonalData.setRowHeight(20);
        jTablePersonalData.setRowSelectionAllowed(false);
        jTablePersonalData.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTablePersonalData);
        //collumn 1
        jTablePersonalData.getColumnModel().getColumn(0)
        .setCellRenderer(new PerfilTableCellRenderer());

        jTablePersonalData.getColumnModel()
        .getColumn(1)
        .setCellRenderer(new PerfilActionRenderer());
        jTablePersonalData.getColumnModel()
        .getColumn(1)
        .setMaxWidth(150);

        jTablePersonalData.getColumnModel()
        .getColumn(0)
        .setMaxWidth(200);

        // MAX WIDTH

        // EDIT BUTTON STUFF
        PerfilTableActionEvent eventPersonal = new PerfilTableActionEvent() {
            String oldLeft;

            @Override
            public void onEdit(int row) {
            }

            @Override
            public void onCancel(int row) {
            }

            @Override
            public void onSave(int row, Object newValue) {
                personalDataTable.getValueAt(row,0);

                String result = "Operation done successfully";

                if(!personalDataTable.verificarDados((String)newValue,row)){
                    result = "Couldn't complete the operation, please try again";
                    JOptionPane.showMessageDialog(LayeredPaneEditarConta, result);
                    return;
                }
                personalDataTable.setValue(newValue, row);
                personalDataTable.setValueAt(newValue, row, 0);
                jTablePersonalData.repaint();

                if(personalDataTable.getLabel(row).equals("Name:")){
                    lblNomeCompleto.setText((String)newValue);
                }
                personalDataTable.updateClient();
                JOptionPane.showMessageDialog(LayeredPaneEditarConta, result);
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanelDadosPessoaisLayout.setVerticalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelOperacoesDisponiveis.setBackground(new java.awt.Color(255, 255, 255));

        btnApagarConta.setBackground(new java.awt.Color(58, 58, 58));
        btnApagarConta.setForeground(new java.awt.Color(255, 255, 255));
        btnApagarConta.setText("Despedir socio / Apagar conta");
        btnApagarConta.setToolTipText("");
        btnApagarConta.setBorder(null);
        btnApagarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApagarContaMouseClicked(evt);
            }
        });
        btnApagarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarContaActionPerformed(evt);
            }
        });

        BtnPromoverConta.setBackground(new java.awt.Color(58, 58, 58));
        BtnPromoverConta.setForeground(new java.awt.Color(255, 255, 255));
        BtnPromoverConta.setText("Promover para Gerente");
        BtnPromoverConta.setToolTipText("");
        BtnPromoverConta.setBorder(null);
        BtnPromoverConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPromoverContaActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(319, 36));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Operações disponiveis");

        jLabel29.setBackground(new java.awt.Color(51, 51, 51));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/luggage.png"))); // NOI18N
        jLabel29.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelOperacoesDisponiveisLayout = new javax.swing.GroupLayout(jPanelOperacoesDisponiveis);
        jPanelOperacoesDisponiveis.setLayout(jPanelOperacoesDisponiveisLayout);
        jPanelOperacoesDisponiveisLayout.setHorizontalGroup(
            jPanelOperacoesDisponiveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
            .addGroup(jPanelOperacoesDisponiveisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperacoesDisponiveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOperacoesDisponiveisLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BtnPromoverConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApagarConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelOperacoesDisponiveisLayout.setVerticalGroup(
            jPanelOperacoesDisponiveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperacoesDisponiveisLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApagarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnPromoverConta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(46, 46, 46))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(319, 36));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Ultimas operacoes");

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
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
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

        jTableCardData.setModel(lastOperationModel);
        jTableCardData.setRowHeight(40);
        jTableCardData.getColumnModel().getColumn(0).setCellRenderer(new PerfilStaffLastOperationsTableCellRenderer());
        jTableCardData.setRowSelectionAllowed(false);
        jTableCardData.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTableCardData.setShowGrid(false);
        jScrollPane3.setViewportView(jTableCardData);
        jTableCardData.setTableHeader(null);

        javax.swing.GroupLayout jPanelDadosCartaoLayout = new javax.swing.GroupLayout(jPanelDadosCartao);
        jPanelDadosCartao.setLayout(jPanelDadosCartaoLayout);
        jPanelDadosCartaoLayout.setHorizontalGroup(
            jPanelDadosCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanelDadosCartaoLayout.setVerticalGroup(
            jPanelDadosCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosCartaoLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelDadosContainerLayout = new javax.swing.GroupLayout(jPanelDadosContainer);
        jPanelDadosContainer.setLayout(jPanelDadosContainerLayout);
        jPanelDadosContainerLayout.setHorizontalGroup(
            jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDadosDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDadosCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOperacoesDisponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelDadosContainerLayout.setVerticalGroup(
            jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosContainerLayout.createSequentialGroup()
                        .addComponent(jPanelOperacoesDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelDadosCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDadosDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        if (clientID == LocalEmployee.empNum
            || pt.ua.ibank.DAO.EmployeeDAO.isEmployeeDismissedByID(clientID)) {
            jPanelOperacoesDisponiveis.setVisible(false);
        }

        if (isManager) {
            BtnPromoverConta.setVisible(false);
        }

        LayeredPaneEditarConta.setLayer(jPanelDadosContainer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LayeredPaneEditarContaLayout = new javax.swing.GroupLayout(LayeredPaneEditarConta);
        LayeredPaneEditarConta.setLayout(LayeredPaneEditarContaLayout);
        LayeredPaneEditarContaLayout.setHorizontalGroup(
            LayeredPaneEditarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayeredPaneEditarContaLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanelDadosContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        LayeredPaneEditarContaLayout.setVerticalGroup(
            LayeredPaneEditarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LayeredPaneEditarContaLayout.createSequentialGroup()
                .addComponent(jPanelDadosContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        add(LayeredPaneEditarConta, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPromoverContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPromoverContaActionPerformed
        String resultado =
               personalDataTable.promoverFuncionario() ?
               "Operation done Successfully" :
               "Couldn't complete the operation, please try again";
        JOptionPane.showMessageDialog(this, resultado);
    }//GEN-LAST:event_BtnPromoverContaActionPerformed

    private void btnApagarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarContaActionPerformed

        String resultado =
               personalDataTable.apagarFuncionario() ?
               "Operation done Successfully" :
               "Couldn't complete the operation, please try again";
        JOptionPane.showMessageDialog(this, resultado);
    }//GEN-LAST:event_btnApagarContaActionPerformed

    private void btnApagarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApagarContaMouseClicked

    }//GEN-LAST:event_btnApagarContaMouseClicked

    public JButton getBtnApagarConta() {
        return btnApagarConta;
    }

    public JButton getBtnPromoverConta() {
        return BtnPromoverConta;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPromoverConta;
    private javax.swing.JLayeredPane LayeredPaneEditarConta;
    private javax.swing.JButton btnApagarConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelDadosCartao;
    private javax.swing.JPanel jPanelDadosContainer;
    private javax.swing.JPanel jPanelDadosDescricao;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JPanel jPanelFotoPerfil;
    private javax.swing.JPanel jPanelOperacoesDisponiveis;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCardData;
    private javax.swing.JTable jTablePersonalData;
    private javax.swing.JLabel lblDataValue;
    private javax.swing.JLabel lblNomeCompleto;
    // End of variables declaration//GEN-END:variables
}
