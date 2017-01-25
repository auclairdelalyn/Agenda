/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.villalem.admin;

/**
 *
 * @author Villalemons
 */
public class ITadmin extends javax.swing.JFrame {

    /**
     * Creates new form ITadmin
     */
    public ITadmin() {
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
        btnQuitter = new javax.swing.JButton();
        btnAjoutSalle = new javax.swing.JButton();
        btnModificationSalle = new javax.swing.JButton();
        btnSupprimerSalle = new javax.swing.JButton();
        btnCreationUtilisateur = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Paramètres administrateur");

        btnQuitter.setBackground(java.awt.Color.green);
        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        btnAjoutSalle.setText("Ajouter une salle");

        btnModificationSalle.setText("Modifier une salle");

        btnSupprimerSalle.setText("Supprimer une salle");

        btnCreationUtilisateur.setText("Créer un nouvel utilisateur");

        jButton1.setText("Modifier un utilisateur");

        jButton2.setText("Supprimer un utilisateur");

        jButton3.setText("Accéder à l'historique");

        jButton4.setText("Consulter une facture");

        jButton5.setText("Voir les statistiques");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAjoutSalle)
                        .addGap(121, 121, 121)
                        .addComponent(btnModificationSalle)
                        .addGap(134, 134, 134)
                        .addComponent(btnSupprimerSalle))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreationUtilisateur)
                        .addGap(121, 121, 121)
                        .addComponent(jButton1)
                        .addGap(134, 134, 134)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(121, 121, 121)
                        .addComponent(jButton4)
                        .addGap(134, 134, 134)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnQuitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAjoutSalle, btnCreationUtilisateur, btnModificationSalle, btnSupprimerSalle, jButton1, jButton2, jButton3, jButton4, jButton5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjoutSalle)
                    .addComponent(btnModificationSalle)
                    .addComponent(btnSupprimerSalle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreationUtilisateur)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnQuitterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjoutSalle;
    private javax.swing.JButton btnCreationUtilisateur;
    private javax.swing.JButton btnModificationSalle;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnSupprimerSalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
