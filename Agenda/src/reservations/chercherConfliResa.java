/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;
import static gestionagenda.GestionAgenda.rq;
import java.sql.*;

/**
 *
 * @author alexis
 */
public class chercherConfliResa extends javax.swing.JFrame {

    /**
     * Creates new form chercherConfliResa
     */
    public chercherConfliResa() {
        initComponents();
        jLabelConflitOui.setVisible(false);
        jLabelConflitNon.setVisible(false);
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
        txtDateDebut = new javax.swing.JTextField();
        txtDateFin = new javax.swing.JTextField();
        jButtonRechercheResa = new javax.swing.JButton();
        jLabelConflitOui = new javax.swing.JLabel();
        jLabelConflitNon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Entrez une date de début et de fin:");

        txtDateDebut.setText("2017-02-01 09:00:00");
        txtDateDebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateDebutActionPerformed(evt);
            }
        });

        txtDateFin.setText("2017-02-01 10:00:00");

        jButtonRechercheResa.setText("Rechercher");
        jButtonRechercheResa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercheResaActionPerformed(evt);
            }
        });

        jLabelConflitOui.setText("Il existe au moins une réservation à ce moment");

        jLabelConflitNon.setText("Il n'y a pas d'autre réservation à ce moment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConflitNon)
                    .addComponent(jLabelConflitOui)
                    .addComponent(jButtonRechercheResa)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDateFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(txtDateDebut, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRechercheResa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelConflitOui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelConflitNon)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateDebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateDebutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateDebutActionPerformed

    private void jButtonRechercheResaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercheResaActionPerformed
        try {
            //vérifie si il existe une autre réservation à partir de BdDAO.java
            if (rq.autreReservation(txtDateDebut.getText(),txtDateFin.getText())) {
                jLabelConflitOui.setVisible(true);
                jLabelConflitNon.setVisible(false);
            } else {
                jLabelConflitNon.setVisible(true);
                jLabelConflitOui.setVisible(false);
            }
            
        } catch (SQLException ex) {
            //Logger.getLogger(ITagenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRechercheResaActionPerformed

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
            java.util.logging.Logger.getLogger(chercherConfliResa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chercherConfliResa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chercherConfliResa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chercherConfliResa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chercherConfliResa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRechercheResa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelConflitNon;
    private javax.swing.JLabel jLabelConflitOui;
    private javax.swing.JTextField txtDateDebut;
    private javax.swing.JTextField txtDateFin;
    // End of variables declaration//GEN-END:variables
}
