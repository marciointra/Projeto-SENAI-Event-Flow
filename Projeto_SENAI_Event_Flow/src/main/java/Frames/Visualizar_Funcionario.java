/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wpass
 */
public class Visualizar_Funcionario extends javax.swing.JFrame {
    
        private void PreencherAtabelaUsandoJoins() {
    // Definir a URL e as credenciais do banco
    String url = "jdbc:mysql://localhost:3306/EventFlow";
    String usuario = "root";
    String senha = "";

    // Consulta SQL
    String sql = "SELECT f.Nome AS 'Nome do Funcionário', " +
                 "ev.TituloEvento AS 'Evento', " +
                 "f.CURSO_TREINAMENTO AS 'Formação do Funcionário', " +
                 "ev.DataEvento_Inicial AS 'Data de Início do Evento' " +
                 "FROM Funcionario f " +
                 "JOIN Equipe eq ON f.ID = eq.FuncionarioID " +
                 "JOIN Evento ev ON eq.ID_Evento = ev.ID_Evento " +
                 "ORDER BY ev.DataEvento_Inicial";

    // Criar o modelo da tabela
    DefaultTableModel modelo = new DefaultTableModel();

    try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
         Statement statement = conexao.createStatement();
         ResultSet rs = statement.executeQuery(sql)) {

        // Definir as colunas para o modelo
        modelo.addColumn("Nome do Funcionário");
        modelo.addColumn("Evento");
        modelo.addColumn("Formação do Funcionário");
        modelo.addColumn("Data de Início do Evento");

        // Preencher os dados no modelo com os resultados da consulta
        while (rs.next()) {
            Object[] row = new Object[4];
            row[0] = rs.getString("Nome do Funcionário");
            row[1] = rs.getString("Evento");
            row[2] = rs.getString("Formação do Funcionário");
            row[3] = rs.getDate("Data de Início do Evento");
            modelo.addRow(row);
        }

        // Associar o modelo à JTable
        jTable1.setModel(modelo);  // Substitua 'minhaTabela' pelo nome real da sua JTable

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao carregar dados da tabela: " + e.getMessage());
    }
}
    /**
     * Creates new form Visualizar_Funcionario
     */
    public Visualizar_Funcionario() {
        initComponents();
        PreencherAtabelaUsandoJoins();
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jlbl_IMG_Evento = new javax.swing.JLabel();
        jlbl_IMG_Cadastrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cadastrar Funcionários");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 320, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pesquisar funcionário");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, 20));

        jButton4.setBackground(new java.awt.Color(129, 25, 184));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 300, -1, 30));

        jTextField2.setBackground(new java.awt.Color(129, 25, 184));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 220, 20));

        jButton2.setBackground(new java.awt.Color(110, 21, 189));
        jButton2.setForeground(new java.awt.Color(110, 21, 189));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voltar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 150, 50, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Montar equipe");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Evento", "Formação", "Prazo "
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 520, 240));

        jButton8.setBackground(new java.awt.Color(129, 25, 184));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 120, 60));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 90, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 50, 10));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 50, 10));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 110, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Formação");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 60, 10));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 110, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Data de nascimento");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 110, 10));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 90, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 50, 10));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 90, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Telefone");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 50, 10));

        jButton9.setBackground(new java.awt.Color(129, 25, 184));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 150, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Funcionários");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, -1, 40));

        jButton7.setBackground(new java.awt.Color(129, 25, 184));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 120, 60));

        jlbl_IMG_Evento.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_IMG_Evento.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jlbl_IMG_Evento.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_IMG_Evento.setText("EQUIPE");
        getContentPane().add(jlbl_IMG_Evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 300, 60));

        jlbl_IMG_Cadastrar.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_IMG_Cadastrar.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jlbl_IMG_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_IMG_Cadastrar.setText("VISUALIZAR");
        getContentPane().add(jlbl_IMG_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 270, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Event.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Dashboard dash = new Dashboard();
        dash.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        tabela_De_Funcionario dash = new tabela_De_Funcionario();
        dash.setVisible(true);  
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3AncestorAdded

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
        Cadastrar_Equipe ce = new Cadastrar_Equipe();
        ce.setVisible(true);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
        Cadastro_De_Funcionário cf = new Cadastro_De_Funcionário();
        cf.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            Connection con = null;
            PreparedStatement statement = null;

            String url = "jdbc:mysql://localhost:3306/EventFlow";
            String user = "root";
            String password = "";

            con = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM funcionario WHERE Nome = ?";

            statement = con.prepareStatement(sql);
            statement.setString(1, jTextField1.getText());

            ResultSet resultset = statement.executeQuery();
            if(resultset.next()){

                String Nome = resultset.getString("Nome");
                jTextField4.setText(Nome);

                String E_mail = resultset.getString("E_mail");
                jTextField5.setText(E_mail);

                String CURSO_TREINAMENTO = resultset.getString("CURSO_TREINAMENTO");
                jTextField3.setText(CURSO_TREINAMENTO);

                String Telefone = resultset.getString("Telefone");
                jTextField6.setText(Telefone);

                String ID_Evento = resultset.getString("ID_Evento");
                jTextField8.setText(ID_Evento);

                String Data_nascimento = resultset.getString("Data_nascimento");
                jTextField7.setText(Data_nascimento);

            }
            else{
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Visualização_fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(Visualizar_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualizar_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualizar_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualizar_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visualizar_Funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel jlbl_IMG_Cadastrar;
    private javax.swing.JLabel jlbl_IMG_Evento;
    // End of variables declaration//GEN-END:variables
}