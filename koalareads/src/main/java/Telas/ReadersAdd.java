package Telas;

import PGSQL.DataBaseConnection;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author GilbertoNeto
 */
public class ReadersAdd extends javax.swing.JFrame {
    
    DataBaseConnection conecta = new DataBaseConnection();

    /**
     * Creates new form Readers
     */
    public ReadersAdd() {
        initComponents();
        conecta.conexao();
        setExtendedState(MAXIMIZED_BOTH);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextIdLeitor = new javax.swing.JTextArea();
        jTextNomeLeitor = new javax.swing.JTextArea();
        jTextTelefoneLeitor = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextEnderecoLeitor = new javax.swing.JTextArea();
        jTextEmailLeitor = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Koalareads");
        setBackground(new java.awt.Color(0, 0, 153));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/Logo-IV.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1150, 335, 490, 460);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LEITORES");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(133, 90, 130, 33);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(133, 298, 80, 30);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 21)); // NOI18N
        jButton3.setForeground(new java.awt.Color(48, 105, 157));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/3. Salvar.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(900, 327, 70, 70);

        jTextIdLeitor.setColumns(20);
        jTextIdLeitor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20)); // NOI18N
        jTextIdLeitor.setRows(5);
        jPanel1.add(jTextIdLeitor);
        jTextIdLeitor.setBounds(133, 330, 740, 40);

        jTextNomeLeitor.setColumns(20);
        jTextNomeLeitor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20)); // NOI18N
        jTextNomeLeitor.setRows(5);
        jPanel1.add(jTextNomeLeitor);
        jTextNomeLeitor.setBounds(133, 430, 740, 40);

        jTextTelefoneLeitor.setColumns(20);
        jTextTelefoneLeitor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20)); // NOI18N
        jTextTelefoneLeitor.setRows(5);
        jPanel1.add(jTextTelefoneLeitor);
        jTextTelefoneLeitor.setBounds(133, 530, 740, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CADASTRO E EDI��O");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(261, 90, 430, 33);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(133, 398, 60, 30);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(133, 498, 110, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Endere�o:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(133, 598, 110, 30);

        jTextEnderecoLeitor.setColumns(20);
        jTextEnderecoLeitor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20)); // NOI18N
        jTextEnderecoLeitor.setRows(5);
        jPanel1.add(jTextEnderecoLeitor);
        jTextEnderecoLeitor.setBounds(133, 630, 740, 40);

        jTextEmailLeitor.setColumns(20);
        jTextEmailLeitor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20)); // NOI18N
        jTextEmailLeitor.setRows(5);
        jPanel1.add(jTextEmailLeitor);
        jTextEmailLeitor.setBounds(133, 730, 740, 40);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(133, 698, 70, 30);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 21)); // NOI18N
        jButton7.setForeground(new java.awt.Color(48, 105, 157));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/2. Apagar.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(900, 417, 70, 70);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 21)); // NOI18N
        jButton8.setForeground(new java.awt.Color(48, 105, 157));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/5. Voltar.PNG"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton8StateChanged(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(900, 700, 70, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into leitores (id_leitores,nome_leitores,telefone_leitores,email_leitores,endereco_leitores)values(?,?,?,?,?)");
            pst.setString(1,jTextIdLeitor.getText());
            pst.setString(2,jTextNomeLeitor.getText());
            pst.setString(3,jTextTelefoneLeitor.getText());
            pst.setString(4,jTextEmailLeitor.getText());
            pst.setString(5,jTextEnderecoLeitor.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane,"Adicionado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ReadersAdd.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(rootPane,"Erro ao adicionar\nErro: "+ex);
        }
        Readers obj = new Readers();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        conecta.executaSQL("delete from leitores where id_leitores='"+jTextIdLeitor.getText()+"'");
        JOptionPane.showMessageDialog(rootPane,"Deletado com sucesso!");
        Readers obj = new Readers();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton8StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8StateChanged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Readers obj = new Readers();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(ReadersAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReadersAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReadersAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadersAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadersAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextEmailLeitor;
    private javax.swing.JTextArea jTextEnderecoLeitor;
    private javax.swing.JTextArea jTextIdLeitor;
    private javax.swing.JTextArea jTextNomeLeitor;
    private javax.swing.JTextArea jTextTelefoneLeitor;
    // End of variables declaration//GEN-END:variables
}
