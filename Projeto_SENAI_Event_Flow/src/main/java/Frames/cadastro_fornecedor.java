/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

/**
 *
 * @author marci
 */
public class cadastro_fornecedor extends javax.swing.JFrame {

    /**
     * Creates new form cadastro_evento
     */
    public cadastro_fornecedor() {
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

        jpnl_fundo = new javax.swing.JPanel();
        jlbl_Codigo_Fornecedor = new javax.swing.JLabel();
        jtxtf_Fornecedor = new javax.swing.JTextField();
        jlbl_Nome_Fornecedor = new javax.swing.JLabel();
        jtxtf_Nome_Fornecedor = new javax.swing.JTextField();
        jlbl_Responsavel = new javax.swing.JLabel();
        jtxtf_Responsavel = new javax.swing.JTextField();
        jlbl_Contato = new javax.swing.JLabel();
        jtxtf_Contato = new javax.swing.JTextField();
        jlbl_Tipo_Servico = new javax.swing.JLabel();
        jcbx_Tipo_Servico = new javax.swing.JComboBox<>();
        jlbl_Dt_Cadastro = new javax.swing.JLabel();
        jtxtf_Dt_Cadastro = new javax.swing.JTextField();
        jlbl_Estatus = new javax.swing.JLabel();
        jcbx_Estatus = new javax.swing.JComboBox<>();
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
        jlbl_Perfil = new javax.swing.JLabel();
        jlbl_IMG_Perfil = new javax.swing.JLabel();
        jlbl_IMG_Logo_EF = new javax.swing.JLabel();
        jlbl_IMG_Cadastrar = new javax.swing.JLabel();
        jlbl_IMG_Fundo_Cadastrar = new javax.swing.JLabel();
        jlbl_IMG_Evento = new javax.swing.JLabel();
        jlbl_BTN_Buscar = new javax.swing.JLabel();
        jlbl_BTN_Excluir = new javax.swing.JLabel();
        jlbl_BTN_Salvar = new javax.swing.JLabel();
        jlbl_FUNDO = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 612));
        setName("cadastro_evento"); // NOI18N

        jpnl_fundo.setMinimumSize(new java.awt.Dimension(920, 612));
        jpnl_fundo.setPreferredSize(new java.awt.Dimension(920, 612));
        jpnl_fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_Codigo_Fornecedor.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Codigo_Fornecedor.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Codigo_Fornecedor.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Codigo_Fornecedor.setText("CÓDIGO FORNECEDOR");
        jpnl_fundo.add(jlbl_Codigo_Fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jtxtf_Fornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Fornecedor.setFont(new java.awt.Font("Arial Narrow", 1, 8)); // NOI18N
        jtxtf_Fornecedor.setForeground(new java.awt.Color(135, 79, 255));
        jtxtf_Fornecedor.setText("Renan lindao dds19");
        jtxtf_Fornecedor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(135, 79, 255)));
        jpnl_fundo.add(jtxtf_Fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jlbl_Nome_Fornecedor.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Nome_Fornecedor.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Nome_Fornecedor.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Nome_Fornecedor.setText("RAZÃO SOCIAL");
        jpnl_fundo.add(jlbl_Nome_Fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jtxtf_Nome_Fornecedor.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Nome_Fornecedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpnl_fundo.add(jtxtf_Nome_Fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 290, 25));

        jlbl_Responsavel.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Responsavel.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Responsavel.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Responsavel.setText("RESPONSÁVEL");
        jpnl_fundo.add(jlbl_Responsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jtxtf_Responsavel.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Responsavel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpnl_fundo.add(jtxtf_Responsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 290, 25));

        jlbl_Contato.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Contato.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Contato.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Contato.setText("CONTATO");
        jpnl_fundo.add(jlbl_Contato, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jtxtf_Contato.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Contato.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpnl_fundo.add(jtxtf_Contato, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 140, 25));

        jlbl_Tipo_Servico.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Tipo_Servico.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Tipo_Servico.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Tipo_Servico.setText("SERVIÇO PRESTADO");
        jpnl_fundo.add(jlbl_Tipo_Servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jcbx_Tipo_Servico.setBackground(new java.awt.Color(255, 255, 255));
        jcbx_Tipo_Servico.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jcbx_Tipo_Servico.setForeground(new java.awt.Color(135, 79, 255));
        jcbx_Tipo_Servico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRODUTOS DESCARTAVEIS", "BEBIDAS", "COMIDAS", "SALGADOS", "SONORIZAÇÃO", "MULTIMIDEA", "ARRANJO", "DECORAÇÃO", "FLORICULTURA", "MESAS & CADEIRAS" }));
        jcbx_Tipo_Servico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jcbx_Tipo_Servico.setPreferredSize(new java.awt.Dimension(165, 19));
        jcbx_Tipo_Servico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_Tipo_ServicoActionPerformed(evt);
            }
        });
        jpnl_fundo.add(jcbx_Tipo_Servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 140, 25));

        jlbl_Dt_Cadastro.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Dt_Cadastro.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Dt_Cadastro.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Dt_Cadastro.setText("DATA DE CADASTRO");
        jpnl_fundo.add(jlbl_Dt_Cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jtxtf_Dt_Cadastro.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Dt_Cadastro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpnl_fundo.add(jtxtf_Dt_Cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 140, 25));

        jlbl_Estatus.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Estatus.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Estatus.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Estatus.setText("ESTATUS");
        jpnl_fundo.add(jlbl_Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jcbx_Estatus.setBackground(new java.awt.Color(255, 255, 255));
        jcbx_Estatus.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jcbx_Estatus.setForeground(new java.awt.Color(135, 79, 255));
        jcbx_Estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INATIVO", "PENDENTE" }));
        jcbx_Estatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jcbx_Estatus.setPreferredSize(new java.awt.Dimension(165, 19));
        jcbx_Estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_EstatusActionPerformed(evt);
            }
        });
        jpnl_fundo.add(jcbx_Estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 140, 25));

        jlbl_Descricao.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Descricao.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Descricao.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Descricao.setText("OBSERVAÇÕES");
        jpnl_fundo.add(jlbl_Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 80, -1));

        jtxta_Descricao.setBackground(new java.awt.Color(255, 255, 255));
        jtxta_Descricao.setColumns(20);
        jtxta_Descricao.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jtxta_Descricao.setForeground(new java.awt.Color(135, 79, 255));
        jtxta_Descricao.setRows(5);
        jtxta_Descricao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jsclp_Descricao.setViewportView(jtxta_Descricao);

        jpnl_fundo.add(jsclp_Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 300, 180));

        jlbl_Logradouro.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Logradouro.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Logradouro.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Logradouro.setText("LOGRADOURO");
        jpnl_fundo.add(jlbl_Logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jtxtf_Logradouro.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Logradouro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpnl_fundo.add(jtxtf_Logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 270, 25));

        jlbl_Numero.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Numero.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Numero.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Numero.setText("NÚMERO");
        jpnl_fundo.add(jlbl_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        jtxtf_Numero.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Numero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpnl_fundo.add(jtxtf_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 70, 25));

        jlbl_Complemento.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Complemento.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Complemento.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Complemento.setText("COMPLEMENTO");
        jpnl_fundo.add(jlbl_Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        jtxtf_Complemento.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Complemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpnl_fundo.add(jtxtf_Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 239, 25));

        jlbl_Bairro.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Bairro.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Bairro.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Bairro.setText("BAIRRO");
        jpnl_fundo.add(jlbl_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jtxtf_Bairro.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Bairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpnl_fundo.add(jtxtf_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 210, 25));

        jlbl_Cidade.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Cidade.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Cidade.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Cidade.setText("CIDADE");
        jpnl_fundo.add(jlbl_Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        jtxtf_Cidade.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Cidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpnl_fundo.add(jtxtf_Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 190, 25));

        jlbl_UF.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_UF.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_UF.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_UF.setText("UF");
        jpnl_fundo.add(jlbl_UF, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, -1, -1));

        jtxtf_UF.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_UF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpnl_fundo.add(jtxtf_UF, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 40, 25));

        jlbl_CEP.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_CEP.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_CEP.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_CEP.setText("CEP");
        jpnl_fundo.add(jlbl_CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, -1));

        jtxtf_CEP.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_CEP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpnl_fundo.add(jtxtf_CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 130, 25));

        jlbl_Perfil.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Perfil.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Perfil.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Perfil.setText("IMAGEM");
        jpnl_fundo.add(jlbl_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));
        jpnl_fundo.add(jlbl_IMG_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));
        jpnl_fundo.add(jlbl_IMG_Logo_EF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        jlbl_IMG_Cadastrar.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_IMG_Cadastrar.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jlbl_IMG_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_IMG_Cadastrar.setText("CADASTRAR");
        jpnl_fundo.add(jlbl_IMG_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 270, 60));
        jpnl_fundo.add(jlbl_IMG_Fundo_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 310, -1));

        jlbl_IMG_Evento.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_IMG_Evento.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jlbl_IMG_Evento.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_IMG_Evento.setText("FORNECEDOR");
        jpnl_fundo.add(jlbl_IMG_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 22, 300, 60));

        jlbl_BTN_Buscar.setToolTipText("");
        jpnl_fundo.add(jlbl_BTN_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, -1, -1));

        jlbl_BTN_Excluir.setToolTipText("");
        jpnl_fundo.add(jlbl_BTN_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        jlbl_BTN_Salvar.setToolTipText("");
        jlbl_BTN_Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_BTN_SalvarMouseClicked(evt);
            }
        });
        jpnl_fundo.add(jlbl_BTN_Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        jlbl_FUNDO.setName("cadastro_evento"); // NOI18N
        jpnl_fundo.add(jlbl_FUNDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jpnl_fundo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnl_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnl_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbx_Tipo_ServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_Tipo_ServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbx_Tipo_ServicoActionPerformed

    private void jlbl_BTN_SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_BTN_SalvarMouseClicked
    cadastro_evento salvar = new cadastro_evento();
    salvar.setVisible(true);
    cadastro_fornecedor.this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jlbl_BTN_SalvarMouseClicked

    private void jcbx_EstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_EstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbx_EstatusActionPerformed

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
            java.util.logging.Logger.getLogger(cadastro_fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro_fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro_fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro_fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro_fornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbx_Estatus;
    private javax.swing.JComboBox<String> jcbx_Tipo_Servico;
    private javax.swing.JLabel jlbl_BTN_Buscar;
    private javax.swing.JLabel jlbl_BTN_Excluir;
    private javax.swing.JLabel jlbl_BTN_Salvar;
    private javax.swing.JLabel jlbl_Bairro;
    private javax.swing.JLabel jlbl_CEP;
    private javax.swing.JLabel jlbl_Cidade;
    private javax.swing.JLabel jlbl_Codigo_Fornecedor;
    private javax.swing.JLabel jlbl_Complemento;
    private javax.swing.JLabel jlbl_Contato;
    private javax.swing.JLabel jlbl_Descricao;
    private javax.swing.JLabel jlbl_Dt_Cadastro;
    private javax.swing.JLabel jlbl_Estatus;
    private javax.swing.JLabel jlbl_FUNDO;
    private javax.swing.JLabel jlbl_IMG_Cadastrar;
    private javax.swing.JLabel jlbl_IMG_Evento;
    private javax.swing.JLabel jlbl_IMG_Fundo_Cadastrar;
    private javax.swing.JLabel jlbl_IMG_Logo_EF;
    private javax.swing.JLabel jlbl_IMG_Perfil;
    private javax.swing.JLabel jlbl_Logradouro;
    private javax.swing.JLabel jlbl_Nome_Fornecedor;
    private javax.swing.JLabel jlbl_Numero;
    private javax.swing.JLabel jlbl_Perfil;
    private javax.swing.JLabel jlbl_Responsavel;
    private javax.swing.JLabel jlbl_Tipo_Servico;
    private javax.swing.JLabel jlbl_UF;
    private javax.swing.JPanel jpnl_fundo;
    private javax.swing.JScrollPane jsclp_Descricao;
    private javax.swing.JTextArea jtxta_Descricao;
    private javax.swing.JTextField jtxtf_Bairro;
    private javax.swing.JTextField jtxtf_CEP;
    private javax.swing.JTextField jtxtf_Cidade;
    private javax.swing.JTextField jtxtf_Complemento;
    private javax.swing.JTextField jtxtf_Contato;
    private javax.swing.JTextField jtxtf_Dt_Cadastro;
    private javax.swing.JTextField jtxtf_Fornecedor;
    private javax.swing.JTextField jtxtf_Logradouro;
    private javax.swing.JTextField jtxtf_Nome_Fornecedor;
    private javax.swing.JTextField jtxtf_Numero;
    private javax.swing.JTextField jtxtf_Responsavel;
    private javax.swing.JTextField jtxtf_UF;
    // End of variables declaration//GEN-END:variables
}
