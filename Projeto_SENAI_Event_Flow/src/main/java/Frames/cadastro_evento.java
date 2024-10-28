/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

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
        jlbl_Perfil = new javax.swing.JLabel();
        jlbl_IMG_Perfil = new javax.swing.JLabel();
        jlbl_IMG_Logo_EF = new javax.swing.JLabel();
        jlbl_IMG_Cadastrar = new javax.swing.JLabel();
        jlbl_IMG_Fundo_Cadastrar = new javax.swing.JLabel();
        jlbl_IMG_Evento = new javax.swing.JLabel();
        jlbl_BTN_Salvar = new javax.swing.JLabel();
        jlbl_BTN_Excluir = new javax.swing.JLabel();
        jlbl_BTN_Buscar = new javax.swing.JLabel();
        jlbl_FUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 612));
        setName("add_evento"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_Codigo_Evento.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Codigo_Evento.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Codigo_Evento.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Codigo_Evento.setText("CÓDIGO EVENTO");
        getContentPane().add(jlbl_Codigo_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jtxtf_Codigo.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Codigo.setFont(new java.awt.Font("Arial Narrow", 1, 8)); // NOI18N
        jtxtf_Codigo.setForeground(new java.awt.Color(135, 79, 255));
        jtxtf_Codigo.setText("C-0000");
        jtxtf_Codigo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(135, 79, 255)));
        getContentPane().add(jtxtf_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jlbl_Nome_Evento.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Nome_Evento.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Nome_Evento.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Nome_Evento.setText("NOME EVENTO");
        getContentPane().add(jlbl_Nome_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jtxtf_Nome_Evento.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Nome_Evento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Nome_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 290, 25));

        jlbl_Responsavel.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Responsavel.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Responsavel.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Responsavel.setText("RESPONSAVEL");
        getContentPane().add(jlbl_Responsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jtxtf_Responsavel.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Responsavel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Responsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 290, 25));

        jlbl_Contato.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Contato.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Contato.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Contato.setText("CONTATO");
        getContentPane().add(jlbl_Contato, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jtxtf_Contato.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Contato.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Contato, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 140, 25));

        jlbl_Publico.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Publico.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Publico.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Publico.setText("PUBLICO");
        getContentPane().add(jlbl_Publico, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jcbx_Publico.setBackground(new java.awt.Color(255, 255, 255));
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

        jtxtf_Dt_Inicial.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Dt_Inicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Dt_Inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 140, 25));

        jlbl_Hr_Inicial.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Hr_Inicial.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Hr_Inicial.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Hr_Inicial.setText("HORA INICIAL");
        getContentPane().add(jlbl_Hr_Inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jtxtf_Hr_Inicial.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Hr_Inicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Hr_Inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 140, 25));

        jlbl_Dt_Termino.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Dt_Termino.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Dt_Termino.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Dt_Termino.setText("DATA TÉRMINO");
        getContentPane().add(jlbl_Dt_Termino, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        jtxtf_Dt_Termino.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Dt_Termino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Dt_Termino, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 140, 25));

        jlbl_Hr_Termino.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Hr_Termino.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Hr_Termino.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Hr_Termino.setText("HORA TÉRMINO");
        getContentPane().add(jlbl_Hr_Termino, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        jtxtf_Hr_Termino.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Hr_Termino.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Hr_Termino, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 140, 25));

        jlbl_Descricao.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Descricao.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Descricao.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Descricao.setText("DESCRIÇÃO");
        getContentPane().add(jlbl_Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 50, -1));

        jtxta_Descricao.setBackground(new java.awt.Color(255, 255, 255));
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

        jtxtf_Logradouro.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Logradouro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 270, 25));

        jlbl_Numero.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Numero.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Numero.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Numero.setText("NÚMERO");
        getContentPane().add(jlbl_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        jtxtf_Numero.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Numero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 70, 25));

        jlbl_Complemento.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Complemento.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Complemento.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Complemento.setText("COMPLEMENTO");
        getContentPane().add(jlbl_Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

        jtxtf_Complemento.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Complemento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 239, 25));

        jlbl_Bairro.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Bairro.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Bairro.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Bairro.setText("BAIRRO");
        getContentPane().add(jlbl_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        jtxtf_Bairro.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Bairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 210, 25));

        jlbl_Cidade.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Cidade.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Cidade.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Cidade.setText("CIDADE");
        getContentPane().add(jlbl_Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        jtxtf_Cidade.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Cidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 190, 25));

        jlbl_UF.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_UF.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_UF.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_UF.setText("UF");
        getContentPane().add(jlbl_UF, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));

        jtxtf_UF.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_UF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_UF, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 40, 25));

        jlbl_CEP.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_CEP.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_CEP.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_CEP.setText("CEP");
        getContentPane().add(jlbl_CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, -1, -1));

        jtxtf_CEP.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_CEP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        getContentPane().add(jtxtf_CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 130, 25));

        jlbl_Perfil.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Perfil.setFont(new java.awt.Font("Arial Narrow", 1, 10)); // NOI18N
        jlbl_Perfil.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Perfil.setText("IMAGEM");
        getContentPane().add(jlbl_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jlbl_IMG_Perfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\m.intra\\Documents\\NetBeansProjects\\Projeto_SENAI_Event_Flow\\Projeto_SENAI_Event_Flow\\src\\main\\resources\\imagem.png")); // NOI18N
        getContentPane().add(jlbl_IMG_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jlbl_IMG_Logo_EF.setIcon(new javax.swing.ImageIcon("C:\\Users\\m.intra\\Documents\\NetBeansProjects\\Projeto_SENAI_Event_Flow\\Projeto_SENAI_Event_Flow\\src\\main\\resources\\logo.png")); // NOI18N
        getContentPane().add(jlbl_IMG_Logo_EF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));

        jlbl_IMG_Cadastrar.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_IMG_Cadastrar.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jlbl_IMG_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_IMG_Cadastrar.setText("CADASTRAR");
        getContentPane().add(jlbl_IMG_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 270, 60));

        jlbl_IMG_Fundo_Cadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\m.intra\\Documents\\NetBeansProjects\\Projeto_SENAI_Event_Flow\\Projeto_SENAI_Event_Flow\\src\\main\\resources\\retang-roxo.png")); // NOI18N
        getContentPane().add(jlbl_IMG_Fundo_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 310, -1));

        jlbl_IMG_Evento.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_IMG_Evento.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jlbl_IMG_Evento.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_IMG_Evento.setText("EVENTO");
        getContentPane().add(jlbl_IMG_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 22, 180, 60));

        jlbl_BTN_Salvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\m.intra\\Documents\\NetBeansProjects\\Projeto_SENAI_Event_Flow\\Projeto_SENAI_Event_Flow\\src\\main\\resources\\btn_salvar.png")); // NOI18N
        jlbl_BTN_Salvar.setToolTipText("");
        jlbl_BTN_Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_BTN_SalvarMouseClicked(evt);
            }
        });
        getContentPane().add(jlbl_BTN_Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        jlbl_BTN_Excluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\m.intra\\Documents\\NetBeansProjects\\Projeto_SENAI_Event_Flow\\Projeto_SENAI_Event_Flow\\src\\main\\resources\\btn_excluir.png")); // NOI18N
        jlbl_BTN_Excluir.setToolTipText("");
        getContentPane().add(jlbl_BTN_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        jlbl_BTN_Buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\m.intra\\Documents\\NetBeansProjects\\Projeto_SENAI_Event_Flow\\Projeto_SENAI_Event_Flow\\src\\main\\resources\\btn_buscar.png")); // NOI18N
        jlbl_BTN_Buscar.setToolTipText("");
        getContentPane().add(jlbl_BTN_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, -1, -1));

        jlbl_FUNDO.setIcon(new javax.swing.ImageIcon("C:\\Users\\m.intra\\Documents\\NetBeansProjects\\Projeto_SENAI_Event_Flow\\Projeto_SENAI_Event_Flow\\src\\main\\resources\\jpnl_fundo.png")); // NOI18N
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
    private javax.swing.JLabel jlbl_Perfil;
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
