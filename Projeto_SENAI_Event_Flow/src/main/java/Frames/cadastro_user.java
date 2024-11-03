/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author h.moreira
 */
public class cadastro_user extends javax.swing.JFrame {

    /**
     * Creates new form Event_Flow
     */
    public cadastro_user() {
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

        jLabel1 = new javax.swing.JLabel();
        jbtn_login = new javax.swing.JButton();
        jlbl_ja_possui_uma_conta = new javax.swing.JLabel();
        jlbl_Salvar = new javax.swing.JLabel();
        jckb_Lembrar_Senha = new javax.swing.JCheckBox();
        jpswdf_Confirmar_Password = new javax.swing.JPasswordField();
        jlbl_Confirmar_Senha = new javax.swing.JLabel();
        jpswdf_Password = new javax.swing.JPasswordField();
        jlbl_Senha = new javax.swing.JLabel();
        jtxtf_Email = new javax.swing.JTextField();
        jlbl_Email = new javax.swing.JLabel();
        jtxtf_Nome = new javax.swing.JTextField();
        jlbl_Nome = new javax.swing.JLabel();
        jlbl_por_que = new javax.swing.JLabel();
        jlbl_todo_mundo_quer_estar_no_centro = new javax.swing.JLabel();
        jlbl_da_festa = new javax.swing.JLabel();
        jlbl_Event = new javax.swing.JLabel();
        jlbl_Flow = new javax.swing.JLabel();
        jlbl_Logo_EF = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        jlblFundo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        setForeground(new java.awt.Color(102, 0, 153));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(460, 640));
        setName("cadastrar_user"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_login.setBackground(new java.awt.Color(135, 79, 255));
        jbtn_login.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_login.setText("Login");
        jbtn_login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jbtn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 591, -1, -1));

        jlbl_ja_possui_uma_conta.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_ja_possui_uma_conta.setText("Já possui uma conta?");
        getContentPane().add(jlbl_ja_possui_uma_conta, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 593, -1, -1));

        jlbl_Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_SalvarMouseClicked(evt);
            }
        });
        getContentPane().add(jlbl_Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 523, -1, -1));

        jckb_Lembrar_Senha.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        jckb_Lembrar_Senha.setForeground(new java.awt.Color(255, 255, 255));
        jckb_Lembrar_Senha.setText("Lembrar senha");
        jckb_Lembrar_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jckb_Lembrar_SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jckb_Lembrar_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 464, -1, -1));

        jpswdf_Confirmar_Password.setBackground(new java.awt.Color(255, 255, 255));
        jpswdf_Confirmar_Password.setFont(new java.awt.Font("Roboto Slab SemiBold", 1, 10)); // NOI18N
        jpswdf_Confirmar_Password.setText("jPasswordField1");
        jpswdf_Confirmar_Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpswdf_Confirmar_Password.setMinimumSize(new java.awt.Dimension(65, 25));
        jpswdf_Confirmar_Password.setPreferredSize(new java.awt.Dimension(65, 25));
        getContentPane().add(jpswdf_Confirmar_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 426, 240, -1));

        jlbl_Confirmar_Senha.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jlbl_Confirmar_Senha.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_Confirmar_Senha.setText("Confirme a senha");
        getContentPane().add(jlbl_Confirmar_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 406, -1, -1));

        jpswdf_Password.setBackground(new java.awt.Color(255, 255, 255));
        jpswdf_Password.setFont(new java.awt.Font("Roboto Slab SemiBold", 1, 10)); // NOI18N
        jpswdf_Password.setText("jPasswordField1");
        jpswdf_Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jpswdf_Password.setMinimumSize(new java.awt.Dimension(65, 25));
        jpswdf_Password.setPreferredSize(new java.awt.Dimension(65, 25));
        getContentPane().add(jpswdf_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 376, 240, -1));

        jlbl_Senha.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jlbl_Senha.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_Senha.setText("Informe a senha");
        getContentPane().add(jlbl_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 356, -1, -1));

        jtxtf_Email.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Email.setFont(new java.awt.Font("Roboto Slab SemiBold", 1, 10)); // NOI18N
        jtxtf_Email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jtxtf_Email.setMinimumSize(new java.awt.Dimension(65, 25));
        jtxtf_Email.setPreferredSize(new java.awt.Dimension(65, 25));
        jtxtf_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_EmailActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtf_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 320, -1));

        jlbl_Email.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jlbl_Email.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_Email.setText("Email");
        getContentPane().add(jlbl_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jtxtf_Nome.setBackground(new java.awt.Color(255, 255, 255));
        jtxtf_Nome.setFont(new java.awt.Font("Roboto Slab SemiBold", 1, 10)); // NOI18N
        jtxtf_Nome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(135, 79, 255), 1, true));
        jtxtf_Nome.setMinimumSize(new java.awt.Dimension(65, 25));
        jtxtf_Nome.setPreferredSize(new java.awt.Dimension(65, 25));
        jtxtf_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_NomeActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtf_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 320, -1));

        jlbl_Nome.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        jlbl_Nome.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_Nome.setText("Nome");
        getContentPane().add(jlbl_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 248, -1, -1));

        jlbl_por_que.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbl_por_que.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_por_que.setText("Por que ");
        getContentPane().add(jlbl_por_que, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jlbl_todo_mundo_quer_estar_no_centro.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbl_todo_mundo_quer_estar_no_centro.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_todo_mundo_quer_estar_no_centro.setText("todo mundo quer estar no centro");
        getContentPane().add(jlbl_todo_mundo_quer_estar_no_centro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jlbl_da_festa.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbl_da_festa.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_da_festa.setText("da festa");
        getContentPane().add(jlbl_da_festa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        jlbl_Event.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_Event.setFont(new java.awt.Font("Arial Black", 3, 48)); // NOI18N
        jlbl_Event.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_Event.setText("EVENT");
        getContentPane().add(jlbl_Event, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 118, 200, -1));

        jlbl_Flow.setBackground(new java.awt.Color(135, 79, 255));
        jlbl_Flow.setFont(new java.awt.Font("Arial Black", 3, 48)); // NOI18N
        jlbl_Flow.setForeground(new java.awt.Color(135, 79, 255));
        jlbl_Flow.setText("FLOW");
        getContentPane().add(jlbl_Flow, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 118, 180, -1));
        getContentPane().add(jlbl_Logo_EF, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 20, -1, -1));

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 536, -1, -1));

        jlblFundo.setForeground(new java.awt.Color(51, 51, 51));
        jlblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpnl_Dark_Gray.jpeg"))); // NOI18N
        getContentPane().add(jlblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 450, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jckb_Lembrar_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jckb_Lembrar_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jckb_Lembrar_SenhaActionPerformed

    private void jtxtf_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_EmailActionPerformed

    private void jtxtf_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_NomeActionPerformed

    private void jbtn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_loginActionPerformed
        // TODO add your handling code here:
        home home = new home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_loginActionPerformed

    private void jlbl_SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_SalvarMouseClicked
        home telaHome = new home();
        telaHome.setVisible(true);
        cadastro_user.this.dispose();
    }//GEN-LAST:event_jlbl_SalvarMouseClicked

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        try {
            // TODO add your handling code here:
            Connection conexao = null;
            PreparedStatement statement = null;
            
            String url = "jdbc:mysql://127.0.0.1:3306/EventFlow";
            
            String user = "root";
            String password = "";
            
            conexao = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO Usuario (Nome_Usuario, Email_Usuario, Senha) VALUES(?, ?, ?)";
            statement = conexao.prepareStatement(sql);
            statement.setString(1, jtxtf_Nome.getText()); // Nome
            statement.setString(2, jtxtf_Email.getText()); // Email
            statement.setString(3, jpswdf_Confirmar_Password.getText()); // Senha
            
            System.out.println("Deu certo");
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
            
            this.dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(cadastro_user.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(cadastro_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtn_login;
    private javax.swing.JCheckBox jckb_Lembrar_Senha;
    private javax.swing.JLabel jlblFundo;
    private javax.swing.JLabel jlbl_Confirmar_Senha;
    private javax.swing.JLabel jlbl_Email;
    private javax.swing.JLabel jlbl_Event;
    private javax.swing.JLabel jlbl_Flow;
    private javax.swing.JLabel jlbl_Logo_EF;
    private javax.swing.JLabel jlbl_Nome;
    private javax.swing.JLabel jlbl_Salvar;
    private javax.swing.JLabel jlbl_Senha;
    private javax.swing.JLabel jlbl_da_festa;
    private javax.swing.JLabel jlbl_ja_possui_uma_conta;
    private javax.swing.JLabel jlbl_por_que;
    private javax.swing.JLabel jlbl_todo_mundo_quer_estar_no_centro;
    private javax.swing.JPasswordField jpswdf_Confirmar_Password;
    private javax.swing.JPasswordField jpswdf_Password;
    private javax.swing.JTextField jtxtf_Email;
    private javax.swing.JTextField jtxtf_Nome;
    // End of variables declaration//GEN-END:variables
}
