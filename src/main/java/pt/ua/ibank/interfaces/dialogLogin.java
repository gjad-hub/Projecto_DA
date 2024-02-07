package pt.ua.ibank.interfaces;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.SwingUtilities;
import pt.ua.ibank.DAO.ClientDAO;
import pt.ua.ibank.DTO.Client;
import pt.ua.ibank.utilities.Configs;
import static pt.ua.ibank.utilities.Configs.LocalClient;
import pt.ua.ibank.utilities.Hash;
import static pt.ua.ibank.utilities.Configs.SUCCESS_CODE;
import static pt.ua.ibank.utilities.Configs.ERROR_CODE;
import static pt.ua.ibank.utilities.Configs.EMAIL_ERROR_CODE;

public class dialogLogin extends javax.swing.JDialog {

    public dialogLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        startup();
    }

    private void startup() {
        email_input.requestFocus();
        email_input.setBackground(new java.awt.Color(0, 0, 0, 1));
        password_input.setBackground(new java.awt.Color(0, 0, 0, 1));

        Fnome.setBackground(new java.awt.Color(0, 0, 0, 1));
        Femail.setBackground(new java.awt.Color(0, 0, 0, 1));
        Ftelemovel.setBackground(new java.awt.Color(0, 0, 0, 1));
        FNif.setBackground(new java.awt.Color(0, 0, 0, 1));
        FPass.setBackground(new java.awt.Color(0, 0, 0, 1));
        FRPass.setBackground(new java.awt.Color(0, 0, 0, 1));
        FMorada.setBackground(new java.awt.Color(0, 0, 0, 1));

        panelCreateAccount.setVisible(false);

        Configs.loadU();
        email_input.setText(Configs.Uname);
        save_email.setSelected(Configs.Usave);
        KeyListeners();
    }

    private void KeyListeners() {
        email_input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    password_input.requestFocus();
                }
            }
        });

        password_input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    login.requestFocus();
                    loginActionPerformed(null);
                }
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    email_input.requestFocus();
                }
            }
        });

        login.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    password_input.requestFocus();
                }
            }
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

        jPanel1 = new javax.swing.JPanel();
        image_1 = new javax.swing.JLabel();
        panel = new javax.swing.JTabbedPane();
        panelLogin = new javax.swing.JPanel();
        error = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email_input = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        password_input = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        save_email = new javax.swing.JCheckBox();
        login = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lblCreateAccount1 = new javax.swing.JLabel();
        see = new javax.swing.JCheckBox();
        panelCreateAccount = new javax.swing.JPanel();
        erro_create = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Ftelemovel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FPass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        FRPass = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Femail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        FNif = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Fnome = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        FMorada = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        image_1.setBackground(new java.awt.Color(255, 255, 255));
        image_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logo_png.png"))); // NOI18N

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panelLogin.setBackground(new java.awt.Color(62, 171, 191));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        error.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        error.setForeground(new java.awt.Color(255, 200, 96));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelLogin.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 420, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 420, 41));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(199, 226, 255));
        jLabel9.setText("Email");
        panelLogin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 360, -1));

        email_input.setFont(email_input.getFont().deriveFont(email_input.getFont().getSize()+2f));
        email_input.setForeground(new java.awt.Color(255, 255, 255));
        email_input.setBorder(null);
        panelLogin.add(email_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 310, 30));

        jLabel10.setForeground(new java.awt.Color(199, 226, 255));
        jLabel10.setText("_________________________________________________________________");
        panelLogin.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 319, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Olá! Bem-vindo ao IBank!");
        panelLogin.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 420, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(199, 226, 255));
        jLabel13.setText("Password");
        panelLogin.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 360, -1));

        password_input.setFont(password_input.getFont().deriveFont(password_input.getFont().getSize()+2f));
        password_input.setForeground(new java.awt.Color(255, 255, 255));
        password_input.setBorder(null);
        password_input.setCaretColor(new java.awt.Color(255, 255, 255));
        panelLogin.add(password_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 310, 30));

        jLabel14.setForeground(new java.awt.Color(199, 226, 255));
        jLabel14.setText("_________________________________________________________________");
        panelLogin.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 319, 40));

        save_email.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        save_email.setForeground(new java.awt.Color(199, 226, 255));
        save_email.setText("Guardar email");
        save_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_emailActionPerformed(evt);
            }
        });
        panelLogin.add(save_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(62, 171, 191));
        login.setText("LOGIN");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        panelLogin.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 360, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(199, 226, 255));
        jLabel15.setText("Ainda não tem conta?");
        panelLogin.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        lblCreateAccount1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblCreateAccount1.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateAccount1.setText("Criar Conta");
        lblCreateAccount1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreateAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateAccount1MouseClicked(evt);
            }
        });
        panelLogin.add(lblCreateAccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        see.setForeground(new java.awt.Color(255, 255, 255));
        see.setText("Ver");
        see.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeActionPerformed(evt);
            }
        });
        panelLogin.add(see, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 60, 30));

        panel.addTab("Login", panelLogin);

        panelCreateAccount.setBackground(new java.awt.Color(62, 171, 191));
        panelCreateAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        erro_create.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        erro_create.setForeground(new java.awt.Color(255, 200, 96));
        erro_create.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelCreateAccount.add(erro_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 420, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Criar Conta");
        panelCreateAccount.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 420, 41));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(199, 226, 255));
        jLabel4.setText("Nº de Telemóvel");
        panelCreateAccount.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 360, -1));

        Ftelemovel.setFont(Ftelemovel.getFont().deriveFont(Ftelemovel.getFont().getSize()+2f));
        Ftelemovel.setForeground(new java.awt.Color(255, 255, 255));
        Ftelemovel.setBorder(null);
        panelCreateAccount.add(Ftelemovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 310, 30));

        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 319, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(199, 226, 255));
        jLabel7.setText("Password");
        panelCreateAccount.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 360, -1));

        FPass.setFont(FPass.getFont().deriveFont(FPass.getFont().getSize()+2f));
        FPass.setForeground(new java.awt.Color(255, 255, 255));
        FPass.setBorder(null);
        FPass.setCaretColor(new java.awt.Color(255, 255, 255));
        panelCreateAccount.add(FPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 310, 30));

        jLabel8.setForeground(new java.awt.Color(199, 226, 255));
        jLabel8.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 319, 40));

        btnCreateAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(62, 171, 191));
        btnCreateAccount.setText("CRIAR CONTA");
        btnCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateAccountMouseClicked(evt);
            }
        });
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        panelCreateAccount.add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 360, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(199, 226, 255));
        jLabel11.setText("Já tem uma conta?");
        panelCreateAccount.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, -1, -1));

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Login");
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        panelCreateAccount.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(199, 226, 255));
        jLabel16.setText("Repetir Password");
        panelCreateAccount.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 360, -1));

        FRPass.setFont(FRPass.getFont().deriveFont(FRPass.getFont().getSize()+2f));
        FRPass.setForeground(new java.awt.Color(255, 255, 255));
        FRPass.setBorder(null);
        FRPass.setCaretColor(new java.awt.Color(255, 255, 255));
        panelCreateAccount.add(FRPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 310, 30));

        jLabel17.setForeground(new java.awt.Color(199, 226, 255));
        jLabel17.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 319, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(199, 226, 255));
        jLabel18.setText("Email");
        panelCreateAccount.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 360, -1));

        Femail.setFont(Femail.getFont().deriveFont(Femail.getFont().getSize()+2f));
        Femail.setForeground(new java.awt.Color(255, 255, 255));
        Femail.setBorder(null);
        panelCreateAccount.add(Femail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 310, 30));

        jLabel19.setForeground(new java.awt.Color(199, 226, 255));
        jLabel19.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 319, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(199, 226, 255));
        jLabel20.setText("NIF");
        panelCreateAccount.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 360, -1));

        FNif.setFont(FNif.getFont().deriveFont(FNif.getFont().getSize()+2f));
        FNif.setForeground(new java.awt.Color(255, 255, 255));
        FNif.setBorder(null);
        panelCreateAccount.add(FNif, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 310, 30));

        jLabel21.setForeground(new java.awt.Color(199, 226, 255));
        jLabel21.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 319, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(199, 226, 255));
        jLabel22.setText("Nome Completo");
        panelCreateAccount.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 360, -1));

        Fnome.setFont(Fnome.getFont().deriveFont(Fnome.getFont().getSize()+2f));
        Fnome.setForeground(new java.awt.Color(255, 255, 255));
        Fnome.setBorder(null);
        panelCreateAccount.add(Fnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 310, 30));

        jLabel23.setForeground(new java.awt.Color(199, 226, 255));
        jLabel23.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 319, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bem-vindo! Por favor, preencha as informações abaixo para criar sua nova conta.");
        panelCreateAccount.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 420, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(199, 226, 255));
        jLabel24.setText("Morada");
        panelCreateAccount.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 360, -1));

        FMorada.setFont(FMorada.getFont().deriveFont(FMorada.getFont().getSize()+2f));
        FMorada.setForeground(new java.awt.Color(255, 255, 255));
        FMorada.setBorder(null);
        panelCreateAccount.add(FMorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 310, 30));

        jLabel25.setForeground(new java.awt.Color(199, 226, 255));
        jLabel25.setText("_________________________________________________________________");
        panelCreateAccount.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 319, 40));

        panel.addTab("Criar conta", panelCreateAccount);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(image_1)
                .addGap(0, 0, 0)
                .addComponent(panel)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void save_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save_emailActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String email = email_input.getText();
        String password = new String(password_input.getPassword());

        if (password.isEmpty() && email.isEmpty()) {
            error.setText("Campos vazios!");
            return;
        } else if (email.isEmpty()) {
            email_input.requestFocus();
            error.setText("Campo de email vazio!");
            return;
        } else if (password.isEmpty()) {
            password_input.requestFocus();
            error.setText("Campo de password vazio!");
            return;
        }

        error.setText("");
        if (save_email.isSelected()) {
            Configs.Uname = email_input.getText();
            Configs.Usave = save_email.isSelected();
            Configs.saveU();
        } else {
            Configs.Uname = "";
            Configs.Usave = false;
            Configs.saveU();
        }

        LocalClient = new Client(email_input.getText(), new String(
                                  password_input.getPassword()));
        if (LocalClient.autenticar()) {
            Configs.loginOK = true;
            this.dispose();
        } else {
            error.setText("Erro ao autenticar! Credenciais incorretas!");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void lblCreateAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccount1MouseClicked
        panel.setSelectedIndex(1);
    }//GEN-LAST:event_lblCreateAccount1MouseClicked

    private void btnCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateAccountMouseClicked

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        erro_create.setText("");

        String password = new String(FPass.getPassword());
        String repeatPassword = new String(FRPass.getPassword());

        String regexNome = "^[a-zA-ZáéíóúÁÉÍÓÚäëïöüÄËÏÖÜãõÃÕñÑçÇ\\s'-]+$";
        String regexEmail =
               "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        String regexTelefoneNif = "^\\d{9}$";
        //String emailRegexSimples = "^(.+)@(.+)$";
        String regexPassword = "^.{8,}$";

        Pattern patternNome = Pattern.compile(regexNome);
        Matcher matcherNome = patternNome.matcher(Fnome.getText());

        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(Femail.getText());

        Pattern patternPhoneNumberNif = Pattern.compile(regexTelefoneNif);
        Matcher matcherPhoneNumber = patternPhoneNumberNif.matcher(
                Ftelemovel.getText());
        Matcher matcherNIF = patternPhoneNumberNif.matcher(FNif.getText());

        Pattern patternPassword = Pattern.compile(regexPassword);
        Matcher matcherPassword = patternPassword.matcher(password);

        if (Fnome.getText().isEmpty() || Femail.getText().isEmpty() || Ftelemovel.getText().isEmpty() || FNif.getText().isEmpty() || password.isEmpty() || repeatPassword.isEmpty()) {
            erro_create.setText(
                    "Um ou mais campos vazios! Por favor preencha-os!");
        } else if (!matcherNome.find()) {
            erro_create.setText("Nome inválido!");
            Fnome.setText("");
        } else if (!matcherEmail.find()) {
            erro_create.setText("Email inválido!");
            Femail.setText("");
        } else if (!matcherPhoneNumber.find()) {
            erro_create.setText("Nº de Telemóvel Inválido!");
            Ftelemovel.setText("");
        } else if (!matcherNIF.find()) {
            erro_create.setText("NIF inválido!");
            FNif.setText("");
        } else if (!matcherPassword.find()) {
            erro_create.setText(
                    "Password inválida! Tem de conter pelo menos 8 caracteres!");
            FPass.setText("");
            FRPass.setText("");
        } else if (!password.equals(repeatPassword)) {
            erro_create.setText("Passwords inseridas não são iguais!");
            FPass.setText("");
            FRPass.setText("");
        } else {

            try {
                String hashedPassword = Hash.generateStorngPasswordHash(
                       new String(FPass.getPassword()));
                int verify = ClientDAO.CreateClient(Fnome.getText(),
                                                    FMorada.getText(),
                                                    Femail.getText(),
                                                    Ftelemovel.getText(),
                                                    FNif.getText(),
                                                    hashedPassword);

                switch (verify) {
                    case EMAIL_ERROR_CODE ->
                        erro_create.setText("Endereço de email já existente !");
                    case ERROR_CODE ->
                        erro_create.setText(
                                "Algo inesperado aconteceu tente novamente mais tarde !");
                    case SUCCESS_CODE -> {
                        erro_create.setText("Sucesso ao criar cliente !");
                        SwingUtilities.invokeLater(() -> {
                            try {
                                Thread.sleep(1500);
                                panel.setSelectedIndex(0);
                                email_input.requestFocus();
                                email_input.setText(Femail.getText());
                            } catch (InterruptedException ex) {
                                System.out.println(ex);
                            }
                        });

                    }


                }

            } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        panel.setSelectedIndex(0);
    }//GEN-LAST:event_lblLoginMouseClicked

    private void seeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeActionPerformed
        if (see.isSelected()) {
            password_input.setEchoChar((char) 0);
        } else {
            password_input.setEchoChar('*');
        }
    }//GEN-LAST:event_seeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                         : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogLogin.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogLogin.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogLogin.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogLogin.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogLogin dialog = new dialogLogin(new javax.swing.JFrame(),
                                                     true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FMorada;
    private javax.swing.JTextField FNif;
    private javax.swing.JPasswordField FPass;
    private javax.swing.JPasswordField FRPass;
    private javax.swing.JTextField Femail;
    private javax.swing.JTextField Fnome;
    private javax.swing.JTextField Ftelemovel;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JTextField email_input;
    private javax.swing.JLabel erro_create;
    private javax.swing.JLabel error;
    private javax.swing.JLabel image_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCreateAccount1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JButton login;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JPanel panelCreateAccount;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField password_input;
    private javax.swing.JCheckBox save_email;
    private javax.swing.JCheckBox see;
    // End of variables declaration//GEN-END:variables
}
