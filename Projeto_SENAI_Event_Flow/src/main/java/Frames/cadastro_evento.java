/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author marci
 */
public class cadastro_evento extends javax.swing.JFrame {
    /**
     * Creates new form add_evento
     */
    public cadastro_evento() {
        initComponents();
    }
    
    public static cadastro_evento telaAnterior;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_Codigo_Evento = new javax.swing.JLabel();
        jtxtf_Codigo = new javax.swing.JTextField();
        jlbl_Nome_Evento = new javax.swing.JLabel();
        jtxtf_Nome_Evento = new javax.swing.JTextField();
        jlbl_Responsavel = new javax.swing.JLabel();
        jtxtf_Responsavel = new javax.swing.JTextField();
        jlbl_Contato = new javax.swing.JLabel();
        jtxtf_Contato = new javax.swing.JTextField();
        jlbl_Publico = new javax.swing.JLabel();
        jcbx_Publico = new javax.swing.JComboBox<>();
        jlbl_Dt_Inicial = new javax.swing.JLabel();
        jtxtf_Dt_Inicial = new javax.swing.JTextField();
        jlbl_Hr_Inicial = new javax.swing.JLabel();
        jtxtf_Hr_Inicial = new javax.swing.JTextField();
        jlbl_Dt_Termino = new javax.swing.JLabel();
        jtxtf_Dt_Termino = new javax.swing.JTextField();
        jlbl_Hr_Termino = new javax.swing.JLabel();
        jtxtf_Hr_Termino = new javax.swing.JTextField();
        jlbl_Descricao = new javax.swing.JLabel();
        jsclp_Descricao = new javax.swing.JScrollPane();
        jtxta_Descricao = new javax.swing.JTextArea();
        jlbl_Logradouro = new javax.swing.JLabel();
        jtxtf_Logradouro = new javax.swing.JTextField();
        jlbl_Numero = new javax.swing.JLabel();
        jtxtf_Numero = new javax.swing.JTextField();
        jlbl_Complemento = new javax.swing.JLabel();
        jtxtf_Complemento = new javax.swing.JTextField();
        jlbl_Bairro = new javax.swing.JLabel();
        jtxtf_Bairro = new javax.swing.JTextField();
        jlbl_Cidade = new javax.swing.JLabel();
        jtxtf_Cidade = new javax.swing.JTextField();
        jlbl_UF = new javax.swing.JLabel();
        jtxtf_UF = new javax.swing.JTextField();
        jlbl_CEP = new javax.swing.JLabel();
        jtxtf_CEP = new javax.swing.JTextField();
        jlbl_IMG_Perfil = new javax.swing.JLabel();
        jlbl_IMG_Logo_EF = new javax.swing.JLabel();
        jlbl_IMG_Cadastrar = new javax.swing.JLabel();
        jlbl_IMG_Fundo_Cadastrar = new javax.swing.JLabel();
        jlbl_IMG_Evento = new javax.swing.JLabel();
        jlbl_BTN_Salvar = new javax.swing.JLabel();
        jlbl_BTN_Excluir = new javax.swing.JLabel();
        jlbl_BTN_Buscar = new javax.swing.JLabel();
        Jbut_confirmar = new java.awt.Button();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        img_user_evento = new javax.swing.JLabel();
        jlbl_FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 612));
        setName("add_evento"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_Codigo_Evento.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Codigo_Evento.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Codigo_Evento.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Codigo_Evento.setText("CÓDIGO EVENTO");
        getContentPane().add(jlbl_Codigo_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jtxtf_Codigo.setFont(new java.awt.Font("Arial Narrow", 1, 8)); // NOI18N
        jtxtf_Codigo.setForeground(new java.awt.Color(135, 79, 255));
        jtxtf_Codigo.setText("C-0000");
        jtxtf_Codigo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(135, 79, 255)));
        getContentPane().add(jtxtf_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jlbl_Nome_Evento.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Nome_Evento.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Nome_Evento.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Nome_Evento.setText("TITULO EVENTO");
        getContentPane().add(jlbl_Nome_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jtxtf_Nome_Evento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Nome_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 290, 25));

        jlbl_Responsavel.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Responsavel.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Responsavel.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Responsavel.setText("RESPONSAVEL");
        getContentPane().add(jlbl_Responsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jtxtf_Responsavel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Responsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 290, 25));

        jlbl_Contato.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Contato.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Contato.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Contato.setText("CONTATO");
        getContentPane().add(jlbl_Contato, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jtxtf_Contato.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Contato, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 140, 25));

        jlbl_Publico.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Publico.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Publico.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Publico.setText("PUBLICO");
        getContentPane().add(jlbl_Publico, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jcbx_Publico.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jcbx_Publico.setForeground(new java.awt.Color(135, 79, 255));
        jcbx_Publico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ANIVERSÁRIO", "ANIVERSÁRIO KIDS", "BAILÉ", "CASAMENTO", "CHÁ DE BEBÊ", "CHÁ DE CASA NOVA", "CHÁ REVELAÇÃO", "DEBUTANTE", "DIA DAS MÃES", "DIA DOS PAIS", "DIA DOS NAMORADOS", "ENCONTRO", "EUCARISTIA", "FORMATURA", "NOIVADO", "OUTROS", " " }));
        jcbx_Publico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jcbx_Publico.setPreferredSize(new java.awt.Dimension(165, 19));
        jcbx_Publico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_PublicoActionPerformed(evt);
            }
        });
        getContentPane().add(jcbx_Publico, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 140, 25));

        jlbl_Dt_Inicial.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Dt_Inicial.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Dt_Inicial.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Dt_Inicial.setText("DATA INICIAL");
        getContentPane().add(jlbl_Dt_Inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jtxtf_Dt_Inicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Dt_Inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 140, 25));

        jlbl_Hr_Inicial.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Hr_Inicial.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Hr_Inicial.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Hr_Inicial.setText("HORA INICIAL");
        getContentPane().add(jlbl_Hr_Inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jtxtf_Hr_Inicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Hr_Inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 140, 25));

        jlbl_Dt_Termino.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Dt_Termino.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Dt_Termino.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Dt_Termino.setText("DATA TÉRMINO");
        getContentPane().add(jlbl_Dt_Termino, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        jtxtf_Dt_Termino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Dt_Termino, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 140, 25));

        jlbl_Hr_Termino.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Hr_Termino.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Hr_Termino.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Hr_Termino.setText("HORA TÉRMINO");
        getContentPane().add(jlbl_Hr_Termino, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        jtxtf_Hr_Termino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Hr_Termino, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 140, 25));

        jlbl_Descricao.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Descricao.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Descricao.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Descricao.setText("DESCRIÇÃO");
        getContentPane().add(jlbl_Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 50, -1));

        jtxta_Descricao.setColumns(20);
        jtxta_Descricao.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jtxta_Descricao.setForeground(new java.awt.Color(135, 79, 255));
        jtxta_Descricao.setRows(5);
        jtxta_Descricao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jsclp_Descricao.setViewportView(jtxta_Descricao);

        getContentPane().add(jsclp_Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 300, 230));

        jlbl_Logradouro.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Logradouro.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Logradouro.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Logradouro.setText("LOGRADOURO");
        getContentPane().add(jlbl_Logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jtxtf_Logradouro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 270, 25));

        jlbl_Numero.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Numero.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Numero.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Numero.setText("NÚMERO");
        getContentPane().add(jlbl_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        jtxtf_Numero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 70, 25));

        jlbl_Complemento.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Complemento.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Complemento.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Complemento.setText("COMPLEMENTO");
        getContentPane().add(jlbl_Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

        jtxtf_Complemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 239, 25));

        jlbl_Bairro.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Bairro.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Bairro.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Bairro.setText("LOCALIZAÇÃO");
        getContentPane().add(jlbl_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        jtxtf_Bairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 210, 25));

        jlbl_Cidade.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Cidade.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Cidade.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Cidade.setText("CIDADE");
        getContentPane().add(jlbl_Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        jtxtf_Cidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 190, 25));

        jlbl_UF.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_UF.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_UF.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_UF.setText("UF");
        getContentPane().add(jlbl_UF, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));

        jtxtf_UF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_UF, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 40, 25));

        jlbl_CEP.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_CEP.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_CEP.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_CEP.setText("CEP");
        getContentPane().add(jlbl_CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, -1, -1));

        jtxtf_CEP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 130, 25));
        getContentPane().add(jlbl_IMG_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));
        getContentPane().add(jlbl_IMG_Logo_EF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        jlbl_IMG_Cadastrar.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_IMG_Cadastrar.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jlbl_IMG_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_IMG_Cadastrar.setText("CADASTRAR");
        getContentPane().add(jlbl_IMG_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 270, 60));
        getContentPane().add(jlbl_IMG_Fundo_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 310, -1));

        jlbl_IMG_Evento.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_IMG_Evento.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jlbl_IMG_Evento.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_IMG_Evento.setText("EVENTO");
        getContentPane().add(jlbl_IMG_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 22, 180, 60));

        jlbl_BTN_Salvar.setToolTipText("");
        jlbl_BTN_Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_BTN_SalvarMouseClicked(evt);
            }
        });
        getContentPane().add(jlbl_BTN_Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        jlbl_BTN_Excluir.setToolTipText("");
        getContentPane().add(jlbl_BTN_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        jlbl_BTN_Buscar.setToolTipText("");
        getContentPane().add(jlbl_BTN_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, -1, -1));

        Jbut_confirmar.setBackground(new java.awt.Color(255, 255, 255));
        Jbut_confirmar.setFont(new java.awt.Font("Ebrima", 3, 18)); // NOI18N
        Jbut_confirmar.setForeground(new java.awt.Color(135, 79, 255));
        Jbut_confirmar.setLabel("Confirmar");
        Jbut_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbut_confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(Jbut_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voltar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 50, 30));

        jToggleButton1.setBackground(new java.awt.Color(132, 39, 205));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jToggleButton1.setText("inserir imagem");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));
        getContentPane().add(img_user_evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 130, 120));

        jlbl_FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpnl_fundo.png"))); // NOI18N
        jlbl_FUNDO.setName("cadastro_evento"); // NOI18N
        getContentPane().add(jlbl_FUNDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbx_PublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_PublicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbx_PublicoActionPerformed

    private void jlbl_BTN_SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_BTN_SalvarMouseClicked
        cadastro_fornecedor salvar = new cadastro_fornecedor();
        salvar.setVisible(true);
        cadastro_evento.this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jlbl_BTN_SalvarMouseClicked

    private void Jbut_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbut_confirmarActionPerformed
        try {
            // TODO add your handling code here:
            Connection conexao = null;
            PreparedStatement statement= null;
            
            String url = "jdbc:mysql://127.0.0.1:3306/EventFlow";
            String user = "root";
            String password = "";
            
            conexao = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO Evento(TituloEvento, Responsavel_Evento, Contato_Evento, DataEvento_inicial, DataEvento_Final, LocalEvento, HorarioEvento_inicial, HorarioEvento_Final, DescricaoEvento, TipoEvento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = conexao.prepareStatement(sql);
            statement.setString(1,jtxtf_Nome_Evento.getText());
            statement.setString(2, jtxtf_Responsavel.getText());
            statement.setInt(3, Integer.parseInt(jtxtf_Contato.getText()));
            statement.setInt(4, Integer.parseInt(jtxtf_Dt_Inicial.getText()));
            statement.setInt(5, Integer.parseInt(jtxtf_Dt_Termino.getText()));
            statement.setString(6, jtxtf_Bairro.getText());
            statement.setInt(7, Integer.parseInt(jtxtf_Hr_Inicial.getText()));
            statement.setInt(8, Integer.parseInt(jtxtf_Hr_Termino.getText()));
            statement.setString(9, jtxta_Descricao.getText());
            statement.setString(10, jcbx_Publico.getSelectedItem().toString());
            
            System.out.println("Deu certo");
            JOptionPane.showMessageDialog(null, "Evento Cadastrado com sucesso!");
            statement.executeUpdate();
            
            cadastro_evento.this.dispose();
            
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(cadastro_evento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Jbut_confirmarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Dashboard dash = new Dashboard();
        dash.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Escolha uma imagem");

        // os tipos que eu vou permitir
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Imagens", "jpg", "png"));

        // aqui eu estou mostrando o meu filechooser
        int userSelection = fileChooser.showOpenDialog(this);

        if(userSelection == JFileChooser.APPROVE_OPTION){
            File fileToUpload = fileChooser.getSelectedFile();
            System.out.println("Arquivo Selecionado: " + fileToUpload.getAbsolutePath());

            // só to garantindo que a minha JLabel tem um tamanho que seja maior que 0
            if(img_user_evento.getWidth() > 0 && img_user_evento.getHeight() > 0){

                //aqui eu consigo exibir a imagem
                ImageIcon imageIcon = new ImageIcon(fileToUpload.getAbsolutePath());
                Image image = imageIcon.getImage().getScaledInstance(img_user_evento.getWidth(), img_user_evento.getHeight(), Image.SCALE_SMOOTH);
                img_user_evento.setIcon(new ImageIcon(image));
            }
            else{
                System.out.println("A sua jlabel tem altura ou largura igual a 0");
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(cadastro_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro_evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro_evento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Jbut_confirmar;
    private javax.swing.JLabel img_user_evento;
    private javax.swing.JButton jButton2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> jcbx_Publico;
    private javax.swing.JLabel jlbl_BTN_Buscar;
    private javax.swing.JLabel jlbl_BTN_Excluir;
    private javax.swing.JLabel jlbl_BTN_Salvar;
    private javax.swing.JLabel jlbl_Bairro;
    private javax.swing.JLabel jlbl_CEP;
    private javax.swing.JLabel jlbl_Cidade;
    private javax.swing.JLabel jlbl_Codigo_Evento;
    private javax.swing.JLabel jlbl_Complemento;
    private javax.swing.JLabel jlbl_Contato;
    private javax.swing.JLabel jlbl_Descricao;
    private javax.swing.JLabel jlbl_Dt_Inicial;
    private javax.swing.JLabel jlbl_Dt_Termino;
    private javax.swing.JLabel jlbl_FUNDO;
    private javax.swing.JLabel jlbl_Hr_Inicial;
    private javax.swing.JLabel jlbl_Hr_Termino;
    private javax.swing.JLabel jlbl_IMG_Cadastrar;
    private javax.swing.JLabel jlbl_IMG_Evento;
    private javax.swing.JLabel jlbl_IMG_Fundo_Cadastrar;
    private javax.swing.JLabel jlbl_IMG_Logo_EF;
    private javax.swing.JLabel jlbl_IMG_Perfil;
    private javax.swing.JLabel jlbl_Logradouro;
    private javax.swing.JLabel jlbl_Nome_Evento;
    private javax.swing.JLabel jlbl_Numero;
    private javax.swing.JLabel jlbl_Publico;
    private javax.swing.JLabel jlbl_Responsavel;
    private javax.swing.JLabel jlbl_UF;
    private javax.swing.JScrollPane jsclp_Descricao;
    private javax.swing.JTextArea jtxta_Descricao;
    private javax.swing.JTextField jtxtf_Bairro;
    private javax.swing.JTextField jtxtf_CEP;
    private javax.swing.JTextField jtxtf_Cidade;
    private javax.swing.JTextField jtxtf_Codigo;
    private javax.swing.JTextField jtxtf_Complemento;
    private javax.swing.JTextField jtxtf_Contato;
    private javax.swing.JTextField jtxtf_Dt_Inicial;
    private javax.swing.JTextField jtxtf_Dt_Termino;
    private javax.swing.JTextField jtxtf_Hr_Inicial;
    private javax.swing.JTextField jtxtf_Hr_Termino;
    private javax.swing.JTextField jtxtf_Logradouro;
    private javax.swing.JTextField jtxtf_Nome_Evento;
    private javax.swing.JTextField jtxtf_Numero;
    private javax.swing.JTextField jtxtf_Responsavel;
    private javax.swing.JTextField jtxtf_UF;
    // End of variables declaration//GEN-END:variables
}
