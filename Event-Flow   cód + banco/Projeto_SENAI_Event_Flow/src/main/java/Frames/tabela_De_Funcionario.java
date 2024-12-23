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
public class tabela_De_Funcionario extends javax.swing.JFrame {
private void PreencherAtabelaUsandoJoins() {
    String url = "jdbc:mysql://localhost:3306/EventFlow";
    String usuario = "root";
    String senha = "";

    // Consulta SQL usando LEFT JOIN
    String sql = "SELECT f.Nome AS `Nome`, " +
                 "f.E_mail AS `Email`, " +
                 "f.Telefone AS `Telefone`, " +
                 "f.Observacoes AS `Observações`, " +
                 "f.CURSO_TREINAMENTO AS `Formação`, " +
                 "ev.TituloEvento AS `Evento`, " +
                 "ev.DataEvento_Inicial AS `Data do Evento` " +
                 "FROM Funcionario f " +
                 "LEFT JOIN Equipe eq ON f.ID = eq.FuncionarioID " +
                 "LEFT JOIN Evento ev ON eq.ID_Evento = ev.ID_Evento " +
                 "ORDER BY ev.DataEvento_Inicial";

    DefaultTableModel modelo = new DefaultTableModel();

    try (Connection conexao = DriverManager.getConnection(url, usuario, senha);
         Statement statement = conexao.createStatement();
         ResultSet rs = statement.executeQuery(sql)) {

        // Adicionando os nomes das colunas no modelo da tabela
        modelo.addColumn("Nome");
        modelo.addColumn("Email");
        modelo.addColumn("Telefone");
        modelo.addColumn("Observações");
        modelo.addColumn("Formação");
        modelo.addColumn("Evento");
        modelo.addColumn("Data do Evento");

        // Iterando pelo ResultSet e adicionando os dados ao modelo
        while (rs.next()) {
            Object[] row = new Object[7]; // Ajustado para corresponder às 7 colunas
            row[0] = rs.getString("Nome");
            row[1] = rs.getString("Email");
            row[2] = rs.getString("Telefone");
            row[3] = rs.getString("Observações");
            row[4] = rs.getString("Formação");
            row[5] = rs.getString("Evento") != null ? rs.getString("Evento") : "Sem Evento";
            row[6] = rs.getDate("Data do Evento") != null ? rs.getDate("Data do Evento").toString() : "Sem Data";
            modelo.addRow(row);
        }

        // Definindo o modelo na JTable
        jTable1.setModel(modelo);

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao carregar dados da tabela: " + e.getMessage());
    }
}

{
}

    /**
     * Creates new form tabela_De_Funcionario
     */
    public tabela_De_Funcionario() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "Telefone", "Observações", "Formação"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 590, 275));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

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
            java.util.logging.Logger.getLogger(tabela_De_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabela_De_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabela_De_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabela_De_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabela_De_Funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
