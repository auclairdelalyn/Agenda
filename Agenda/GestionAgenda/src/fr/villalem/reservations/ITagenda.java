/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.villalem.reservations;

import fr.villalem.admin.ITadmin;
import fr.villalem.labd.ITconnexion;
import javax.swing.JButton;
import javax.swing.JLabel;


/**
 *
 * @author Villalemons
 */
public class ITagenda extends javax.swing.JFrame {

    /**
     * Creates new form ITagenda
     */
    public ITagenda() {
        initComponents();
        lbOJD.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        btnDeconnexion = new javax.swing.JButton();
        txtWelcome = new javax.swing.JLabel();
        panelAgenda1 = new fr.villalem.reservations.PanelAgenda();
        btnSemainePrecedente = new javax.swing.JButton();
        btnSemainePrecedente1 = new javax.swing.JButton();
        lbOJD = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuParamAdmin = new javax.swing.JMenuItem();
        jMenuDeconnexion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuChercherConflit = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("ICI C LACCUEIL :DDDDDD");

        btnAdmin.setText("Paramètres administrateur");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnDeconnexion.setText("Deconnexion");
        btnDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeconnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgenda1Layout = new javax.swing.GroupLayout(panelAgenda1);
        panelAgenda1.setLayout(panelAgenda1Layout);
        panelAgenda1Layout.setHorizontalGroup(
            panelAgenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panelAgenda1Layout.setVerticalGroup(
            panelAgenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        btnSemainePrecedente.setText("<");

        btnSemainePrecedente1.setText(">");
        btnSemainePrecedente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemainePrecedente1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Fichier");

        jMenuParamAdmin.setText("Paramètres administrateur");
        jMenuParamAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuParamAdminActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuParamAdmin);

        jMenuDeconnexion.setText("Déconnexion");
        jMenuDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeconnexionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuDeconnexion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Test");

        jMenuChercherConflit.setText("Chercher confli réservation");
        jMenuChercherConflit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuChercherConflitActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuChercherConflit);

        jMenuItem2.setText("test tableau");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem1.setText("Cal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeconnexion)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbOJD)
                    .addComponent(panelAgenda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnSemainePrecedente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSemainePrecedente1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbOJD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSemainePrecedente)
                    .addComponent(btnSemainePrecedente1))
                .addGap(18, 18, 18)
                .addComponent(panelAgenda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        ITadmin itadmin = new ITadmin();
        itadmin.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeconnexionActionPerformed
        ITconnexion itco = new ITconnexion();
        this.dispose();
        itco.setVisible(true);
    }//GEN-LAST:event_btnDeconnexionActionPerformed

    private void jMenuDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeconnexionActionPerformed
        ITconnexion itco = new ITconnexion();
        this.dispose();
        itco.setVisible(true);
    }//GEN-LAST:event_jMenuDeconnexionActionPerformed

    private void jMenuParamAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuParamAdminActionPerformed
        ITadmin itadmin = new ITadmin();
        itadmin.setVisible(true);
    }//GEN-LAST:event_jMenuParamAdminActionPerformed

    private void jMenuChercherConflitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuChercherConflitActionPerformed
        chercherConfliResa chercherConflit = new chercherConfliResa();
        chercherConflit.setVisible(true);
    }//GEN-LAST:event_jMenuChercherConflitActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TestTableau t1 = new TestTableau();
        t1.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnSemainePrecedente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemainePrecedente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSemainePrecedente1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ITCal cal = new ITCal();
        cal.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //Méthodes
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnDeconnexion;
    private javax.swing.JButton btnSemainePrecedente;
    private javax.swing.JButton btnSemainePrecedente1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuChercherConflit;
    private javax.swing.JMenuItem jMenuDeconnexion;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuParamAdmin;
    private javax.swing.JLabel lbOJD;
    private fr.villalem.reservations.PanelAgenda panelAgenda1;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
    
    public JButton getBtnAdmin() {return btnAdmin;}
    public JLabel getTxtWelcome() {return txtWelcome;}

}
