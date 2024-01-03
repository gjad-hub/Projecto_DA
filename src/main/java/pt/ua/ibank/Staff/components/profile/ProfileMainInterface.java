/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pt.ua.ibank.Staff.components.profile;

import com.mysql.cj.conf.ConnectionUrlParser.Pair;
import pt.ua.ibank.Staff.components.profile.ProfileActionRenderer;
import pt.ua.ibank.Staff.components.profile.tablecomponents.ProfileTableActionEvent;
import pt.ua.ibank.Staff.components.profile.tablecomponents.ProfileTableCellRenderer;

/**
 *
 * @author ricar
 */
public class ProfileMainInterface extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public ProfileMainInterface() {
        initComponents();

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
        jPanelDadosDescricao = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblNomeCompleto = new javax.swing.JLabel();
        jPanelFotoPerfil = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanelDadosPessoais = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pt.ua.ibank.Staff.components.profile.tablecomponents.ProfilePersonalTableModel personalDataTable = new pt.ua.ibank.Staff.components.profile.tablecomponents.ProfilePersonalTableModel();
        jTablePersonalData = new javax.swing.JTable();
        jPanelDadosEmpregado = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pt.ua.ibank.Staff.components.profile.tablecomponents.ProfileCompanyTableModel companyDataTable = new pt.ua.ibank.Staff.components.profile.tablecomponents.ProfileCompanyTableModel();
        jTableCompanyData = new javax.swing.JTable();
        jPanelDadosComentarios = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanelDepositosPorAprovar = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jListComentariosModeracao1 = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(859, 562));

        LayeredPaneEditarConta.setPreferredSize(new java.awt.Dimension(776, 553));

        jPanelDadosContainer.setBackground(new java.awt.Color(255, 255, 255));

        jPanelDadosDescricao.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setBackground(new java.awt.Color(76, 108, 169));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Adicionar comentario");
        jButton3.setToolTipText("");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(76, 108, 169));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ações de conta");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(76, 88, 160));
        jPanel3.setPreferredSize(new java.awt.Dimension(319, 36));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Data de criação:");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("Data");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28))
                .addContainerGap())
        );

        lblNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNomeCompleto.setForeground(new java.awt.Color(0, 0, 0));
        lblNomeCompleto.setText("Nome completo");

        jPanelFotoPerfil.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFotoPerfil.setPreferredSize(new java.awt.Dimension(262, 262));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/client.png"))); // NOI18N

        javax.swing.GroupLayout jPanelFotoPerfilLayout = new javax.swing.GroupLayout(jPanelFotoPerfil);
        jPanelFotoPerfil.setLayout(jPanelFotoPerfilLayout);
        jPanelFotoPerfilLayout.setHorizontalGroup(
            jPanelFotoPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelFotoPerfilLayout.setVerticalGroup(
            jPanelFotoPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFotoPerfilLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelDadosDescricaoLayout = new javax.swing.GroupLayout(jPanelDadosDescricao);
        jPanelDadosDescricao.setLayout(jPanelDadosDescricaoLayout);
        jPanelDadosDescricaoLayout.setHorizontalGroup(
            jPanelDadosDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
            .addComponent(jPanelFotoPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosDescricaoLayout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosDescricaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNomeCompleto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDadosDescricaoLayout.setVerticalGroup(
            jPanelDadosDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosDescricaoLayout.createSequentialGroup()
                .addComponent(jPanelFotoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(76, 88, 160));
        jPanel2.setPreferredSize(new java.awt.Dimension(319, 36));

        jPanel1.setBackground(new java.awt.Color(76, 88, 160));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/pencil.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dados Pessoais");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTablePersonalData.setTableHeader(null);
        jTablePersonalData.setModel(personalDataTable);
        jTablePersonalData.setRowHeight(40);
        jTablePersonalData.setRowSelectionAllowed(false);
        jTablePersonalData.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTablePersonalData);
        //collumn 1
        jTablePersonalData.getColumnModel().getColumn(0)
        .setCellRenderer(new ProfileTableCellRenderer());

        jTablePersonalData.getColumnModel()
        .getColumn(1)
        .setCellRenderer(new ProfileActionRenderer());

        jTablePersonalData.getColumnModel()
        .getColumn(1)
        .setMinWidth(40);
        jTablePersonalData.getColumnModel()
        .getColumn(0)
        .setMinWidth(90);

        // MAX WIDTH

        // EDIT BUTTON STUFF
        ProfileTableActionEvent eventPersonal = new ProfileTableActionEvent() {
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
            }
        }
    };

    jTablePersonalData.getColumnModel()
    .getColumn(1)
    .setCellEditor(new pt.ua.ibank.Staff.components.profile.tablecomponents.ProfileCellEditor(eventPersonal));
    jTablePersonalData.setRowHeight(40);

    jTablePersonalData.setRowSelectionAllowed(false);

    jTablePersonalData.setSelectionBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
    jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
    jPanelDadosPessoaisLayout.setHorizontalGroup(
        jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    );
    jPanelDadosPessoaisLayout.setVerticalGroup(
        jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
    );

    jPanel7.setBackground(new java.awt.Color(76, 88, 160));
    jPanel7.setPreferredSize(new java.awt.Dimension(319, 36));

    jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel26.setForeground(new java.awt.Color(255, 255, 255));
    jLabel26.setText("Dados de Empregado");

    jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
    jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/luggage.png"))); // NOI18N

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jLabel27)
            .addGap(3, 3, 3)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(40, 40, 40))
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

    jTableCompanyData.setModel(companyDataTable);
    jTableCompanyData.setRowHeight(40);
    jTableCompanyData.setRowSelectionAllowed(false);
    jTableCompanyData.setSelectionBackground(new java.awt.Color(255, 255, 255));
    jScrollPane3.setViewportView(jTableCompanyData);
    jTableCompanyData.setTableHeader(null);

    jTableCompanyData.getColumnModel().getColumn(0)
    .setCellRenderer(new ProfileTableCellRenderer());
    //collumn 1
    jTableCompanyData.getColumnModel().getColumn(0)
    .setCellRenderer(new ProfileTableCellRenderer());
    jTableCompanyData.getColumnModel()
    .getColumn(1)
    .setCellRenderer(new ProfileActionRenderer());

    ProfileTableActionEvent eventCompany = new ProfileTableActionEvent() {
        String oldLeft;

        @Override
        public void onEdit(int row) {
            oldLeft = ((Pair<String, String>) companyDataTable.getValueAt(
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
            companyDataTable.getValueAt(row, 0);
            Pair<String, String> newRecord = new Pair(oldLeft, newValue);
            companyDataTable.setValueAt(newRecord, row, 0);
            jTableCompanyData.repaint();
        }
    }
    };

    jTableCompanyData.getColumnModel()
    .getColumn(1)
    .setCellEditor(new pt.ua.ibank.Staff.components.profile.tablecomponents.ProfileCellEditor(eventCompany));

    javax.swing.GroupLayout jPanelDadosEmpregadoLayout = new javax.swing.GroupLayout(jPanelDadosEmpregado);
    jPanelDadosEmpregado.setLayout(jPanelDadosEmpregadoLayout);
    jPanelDadosEmpregadoLayout.setHorizontalGroup(
        jPanelDadosEmpregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    );
    jPanelDadosEmpregadoLayout.setVerticalGroup(
        jPanelDadosEmpregadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelDadosEmpregadoLayout.createSequentialGroup()
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
    );

    jPanel5.setBackground(new java.awt.Color(76, 88, 160));
    jPanel5.setPreferredSize(new java.awt.Dimension(319, 36));

    jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
    jLabel12.setText("Comentarios");

    jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/staffToolsIcon.png"))); // NOI18N

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jLabel13)
            .addGap(3, 3, 3)
            .addComponent(jLabel12)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(0, 7, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanelDadosComentariosLayout = new javax.swing.GroupLayout(jPanelDadosComentarios);
    jPanelDadosComentarios.setLayout(jPanelDadosComentariosLayout);
    jPanelDadosComentariosLayout.setHorizontalGroup(
        jPanelDadosComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
    );
    jPanelDadosComentariosLayout.setVerticalGroup(
        jPanelDadosComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelDadosComentariosLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel9.setBackground(new java.awt.Color(76, 88, 160));
    jPanel9.setPreferredSize(new java.awt.Dimension(319, 36));

    jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    jLabel18.setForeground(new java.awt.Color(255, 255, 255));
    jLabel18.setText("Depositos por aprovar");

    jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/icons_20/staffToolsIcon.png"))); // NOI18N

    javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
    jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jLabel19)
            .addGap(3, 3, 3)
            .addComponent(jLabel18)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    jListComentariosModeracao1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    //JListDadosEmpregado3.setCellRenderer(profileCellRenderer);

    javax.swing.GroupLayout jPanelDepositosPorAprovarLayout = new javax.swing.GroupLayout(jPanelDepositosPorAprovar);
    jPanelDepositosPorAprovar.setLayout(jPanelDepositosPorAprovarLayout);
    jPanelDepositosPorAprovarLayout.setHorizontalGroup(
        jPanelDepositosPorAprovarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        .addComponent(jListComentariosModeracao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanelDepositosPorAprovarLayout.setVerticalGroup(
        jPanelDepositosPorAprovarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelDepositosPorAprovarLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jListComentariosModeracao1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanelDadosContainerLayout = new javax.swing.GroupLayout(jPanelDadosContainer);
    jPanelDadosContainer.setLayout(jPanelDadosContainerLayout);
    jPanelDadosContainerLayout.setHorizontalGroup(
        jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addComponent(jPanelDadosDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addGroup(jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
                    .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanelDadosEmpregado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
                    .addComponent(jPanelDadosComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanelDepositosPorAprovar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGap(0, 0, 0))
    );
    jPanelDadosContainerLayout.setVerticalGroup(
        jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
                    .addComponent(jPanelDadosDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(153, 153, 153))
                .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
                    .addGroup(jPanelDadosContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
                            .addComponent(jPanelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelDadosComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelDadosContainerLayout.createSequentialGroup()
                            .addComponent(jPanelDadosEmpregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelDepositosPorAprovar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap())))
    );

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
        .addComponent(jPanelDadosContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 670, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LayeredPaneEditarConta, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                .addContainerGap()))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 574, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LayeredPaneEditarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap()))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JList<String> jListComentariosModeracao1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelDadosComentarios;
    private javax.swing.JPanel jPanelDadosContainer;
    private javax.swing.JPanel jPanelDadosDescricao;
    private javax.swing.JPanel jPanelDadosEmpregado;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JPanel jPanelDepositosPorAprovar;
    private javax.swing.JPanel jPanelFotoPerfil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCompanyData;
    private javax.swing.JTable jTablePersonalData;
    private javax.swing.JLabel lblNomeCompleto;
    // End of variables declaration//GEN-END:variables
}
