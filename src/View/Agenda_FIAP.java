/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author Fabio
 */
public class Agenda_FIAP extends javax.swing.JFrame {

   
    
    
    public Agenda_FIAP() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cod1_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nome1_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        end1_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tel1_txt = new javax.swing.JTextField();
        consultar_BTN = new javax.swing.JButton();
        alterar_BTN = new javax.swing.JButton();
        limpar_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cod2_txt = new javax.swing.JTextField();
        excluir_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        end_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tel_txt = new javax.swing.JTextField();
        FECHAR_BTN = new javax.swing.JButton();
        SALVAR_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 400, 90);

        jLabel5.setText("CÓDIGO : ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 100, 80, 30);
        jPanel2.add(cod1_txt);
        cod1_txt.setBounds(80, 100, 90, 30);

        jLabel6.setText("NOME : ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 150, 70, 20);
        jPanel2.add(nome1_txt);
        nome1_txt.setBounds(80, 140, 190, 30);

        jLabel7.setText("ENDEREÇO : ");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 190, 90, 16);
        jPanel2.add(end1_txt);
        end1_txt.setBounds(80, 180, 190, 30);

        jLabel8.setText("TELEFONE  : ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 220, 90, 20);
        jPanel2.add(tel1_txt);
        tel1_txt.setBounds(80, 220, 190, 30);

        consultar_BTN.setText("CONSULTAR");
        consultar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_BTNActionPerformed(evt);
            }
        });
        jPanel2.add(consultar_BTN);
        consultar_BTN.setBounds(280, 100, 110, 30);

        alterar_BTN.setText("ALTERAR");
        alterar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterar_BTNActionPerformed(evt);
            }
        });
        jPanel2.add(alterar_BTN);
        alterar_BTN.setBounds(280, 140, 110, 30);

        limpar_btn.setText("LIMPAR");
        limpar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_btnActionPerformed(evt);
            }
        });
        jPanel2.add(limpar_btn);
        limpar_btn.setBounds(280, 180, 110, 30);

        jTabbedPane1.addTab("CONSULTAR/ ALTERAR", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel9.setText("INSIRA O CÓDIGO QUE DESEJA EXCLUIR");

        excluir_btn.setText("EXCLUIR");
        excluir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cod2_txt)
                            .addComponent(excluir_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(cod2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir_btn)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EXCLUIR", jPanel3);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("CADASTRO DE CLIENTE ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 10, 210, 40);

        jLabel2.setText("NOME  : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 70, 70, 30);
        jPanel1.add(nome_txt);
        nome_txt.setBounds(110, 70, 230, 30);

        jLabel3.setText("ENDEREÇO : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 120, 120, 30);
        jPanel1.add(end_txt);
        end_txt.setBounds(110, 120, 230, 30);

        jLabel4.setText("TELEFONE : ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 170, 80, 20);
        jPanel1.add(tel_txt);
        tel_txt.setBounds(110, 160, 230, 30);

        FECHAR_BTN.setText("FECHAR");
        FECHAR_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FECHAR_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(FECHAR_BTN);
        FECHAR_BTN.setBounds(300, 220, 80, 30);

        SALVAR_BTN.setText("SALVAR");
        SALVAR_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALVAR_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(SALVAR_BTN);
        SALVAR_BTN.setBounds(50, 220, 100, 30);

        jTabbedPane1.addTab("CADASTRAR", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FECHAR_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FECHAR_BTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_FECHAR_BTNActionPerformed

    private void SALVAR_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALVAR_BTNActionPerformed
        Model.CRUD_DAO.cadastrar();
    }//GEN-LAST:event_SALVAR_BTNActionPerformed

    private void consultar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_BTNActionPerformed
       Model.CRUD_DAO.consultar();
    }//GEN-LAST:event_consultar_BTNActionPerformed

    private void alterar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterar_BTNActionPerformed
       Model.CRUD_DAO.atualizar();
    }//GEN-LAST:event_alterar_BTNActionPerformed

    private void limpar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_btnActionPerformed
        // TODO add your handling code here:
        Model.CRUD_DAO.limpar();
    }//GEN-LAST:event_limpar_btnActionPerformed

    private void excluir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_btnActionPerformed
        // TODO add your handling code here:
        String x = JOptionPane.showInputDialog(null, "Deseja realmente excluir?\n1-Sim\n2-Não");
        int valor = Integer.parseInt(x);
        if (valor == 1) {
            Model.CRUD_DAO.delete();
        } else {
            JOptionPane.showMessageDialog(null, "Continuando...");
        }
    }//GEN-LAST:event_excluir_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda_FIAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda_FIAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda_FIAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda_FIAP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda_FIAP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FECHAR_BTN;
    private javax.swing.JButton SALVAR_BTN;
    private javax.swing.JButton alterar_BTN;
    public static javax.swing.JTextField cod1_txt;
    public static javax.swing.JTextField cod2_txt;
    private javax.swing.JButton consultar_BTN;
    public static javax.swing.JTextField end1_txt;
    public static javax.swing.JTextField end_txt;
    private javax.swing.JButton excluir_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpar_btn;
    public static javax.swing.JTextField nome1_txt;
    public static javax.swing.JTextField nome_txt;
    public static javax.swing.JTextField tel1_txt;
    public static javax.swing.JTextField tel_txt;
    // End of variables declaration//GEN-END:variables
}
