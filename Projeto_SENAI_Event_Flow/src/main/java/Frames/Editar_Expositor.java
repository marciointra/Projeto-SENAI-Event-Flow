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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wpass
 */
public class Editar_Expositor extends javax.swing.JFrame {

    /**
     * Creates new form Editar_Expositor
     */
    public Editar_Expositor() {
        initComponents();
    }
    
public void jTable1(String sql) throws SQLException {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/EventFlow", "root", "");
    PreparedStatement teste = con.prepareStatement(sql);
    ResultSet resultado = teste.executeQuery();
    
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setNumRows(0);
    
    while (resultado.next()) {
        model.addRow(new Object[] {
            resultado.getString("Email_Expositor"),
            resultado.getString("Nome_Expositor"),
            resultado.getString("ID_Expositor"),
        });
    }
    teste.close();
    con.close();
}
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jlbl_visualizar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(135, 79, 255));
        background.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        background.setForeground(new java.awt.Color(135, 79, 255));
        background.setText("EXPOSITOR");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 250, 60));

        jLabel5.setBackground(new java.awt.Color(135, 79, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CEP");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 160, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 340, -1));

        jLabel6.setBackground(new java.awt.Color(135, 79, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email_Expositor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 160, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 340, -1));

        jLabel7.setBackground(new java.awt.Color(135, 79, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Responsável");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 160, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 340, -1));

        jButton1.setBackground(new java.awt.Color(135, 79, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 40, 30));

        jLabel4.setBackground(new java.awt.Color(135, 79, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome expositor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 280, -1));

        jLabel8.setBackground(new java.awt.Color(135, 79, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 160, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 340, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 340, -1));

        jLabel3.setBackground(new java.awt.Color(135, 79, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Insira o ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, -1));

        jButton2.setBackground(new java.awt.Color(135, 79, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 90, -1));

        jlbl_visualizar.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_visualizar.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jlbl_visualizar.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_visualizar.setText("EDITAR");
        getContentPane().add(jlbl_visualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Email_Expositor", "Nome_Expositor", "ID_Expositor"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 340, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpnl_fundo.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded

        try {
            // TODO add your handling code here:
            this.jTable1("SELECT Email_Expositor, Nome_Expositor, ID_Expositor FROM Expositor ORDER BY Nome_Expositor DESC");
        } catch (SQLException ex) {
            Logger.getLogger(Editar_Expositor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Connection conexao = null;
            PreparedStatement statement = null;

            String url = "jdbc:mysql://localhost:3306/EventFlow";
            String user = "root";
            String password = "";

            conexao = DriverManager.getConnection(url, user, password);
            String sql = "SELECT ID_Expositor, Nome_Expositor, Email_Expositor, CEP, Responsavel FROM Expositor WHERE ID_Expositor = ?";

            statement = conexao.prepareStatement(sql);
            statement.setString(1, jTextField1.getText());
            // statement.setInt(1, Integer.parseInt(jTextField1.getText()));

            ResultSet resultSet =  statement.executeQuery();
            if(resultSet.next()){

                //inserir o id tmb no jtext de

                String ID_Evento = resultSet.getString("ID_Expositor");
                id.setText(ID_Evento);

                String Nome_Expositor = resultSet.getString("Nome_Expositor");
                jTextField4.setText(Nome_Expositor);

                String Email_Expositor = resultSet.getString("Email_Expositor");
                jTextField3.setText(Email_Expositor);

                String CEP = resultSet.getString("CEP");
                jTextField5.setText(CEP);

                String Responsavel = resultSet.getString("Responsavel");
                jTextField6.setText(Responsavel);

            }
            else{
                JOptionPane.showMessageDialog(null, "Evento não encontrado. tente novamente.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Editar_Evento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            // TODO add your handling code here:
            Connection conexao = null;
            PreparedStatement statement = null;

            String url = "jdbc:mysql://localhost:3306/EventFlow";
            String usuario = "root";
            String senha = "";

            conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "UPDATE Expositor SET Nome_Expositor = ?, Email_Expositor = ?, CEP = ?, Responsavel = ? WHERE ID_Expositor = ?";
            statement = conexao.prepareStatement(sql);
            statement.setString(1, jTextField4.getText());
            statement.setString(2, jTextField3.getText());
            statement.setString(3, jTextField5.getText());
            statement.setString(4, jTextField6.getText());
            statement.setString(5, id.getText());

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro atualizado!");
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Editar_Evento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_Expositor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Expositor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Expositor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Expositor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_Expositor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel jlbl_visualizar;
    // End of variables declaration//GEN-END:variables

private void CCAncestorAdded(javax.swing.event.AncestorEvent evt) {                                 
    try {
        String sql = "SELECT Email_Expositor, Nome_Expositor, Tipo_Parceria FROM Expositor ORDER BY Nome_Expositor DESC";
        this.jTable1(sql);
    } catch (SQLException ex) {
        java.util.logging.Logger.getLogger(Tabela_visualizar_expositor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}
}

