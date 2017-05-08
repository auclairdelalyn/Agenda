/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villalem.reservations;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import villalem.admin.ITadmin;
import villalem.labd.ITconnexion;


/**
 *
 * @author Villalemons
 */
public class ITagenda extends javax.swing.JFrame {


    
    
    public Calendar c = Calendar.getInstance();
    public SimpleDateFormat sdf = new SimpleDateFormat("dd-MM");;
    public SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
    
    private Boolean vuSemaine = true;
    private Boolean vuJour = false;
    
    private final static String VU_JOUR = "jour";
    private final static String VU_SEMAINE = "semaine";
    
    /**
     * Creates new form ITagenda
     */
    public ITagenda() {
    	
        initComponents();
        lbOJD.setText("");
        //c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //String st2  = Integer.toString(c.getFirstDayOfWeek());
        //String st = c.getTime().toString();

        String st = sdf.format(c.getTime());
        jLabel2.setText(st);
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
        btnAdmin = new javax.swing.JButton();
        btnDeconnexion = new javax.swing.JButton();
        txtWelcome = new javax.swing.JLabel();
        btnSemainePrecedente = new javax.swing.JButton();
        btnSemaineSuivante = new javax.swing.JButton();
        lbOJD = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelAgenda1 = new villalem.reservations.PanelAgenda();
        panelJour = new villalem.reservations.PanelJour();
        panelCentre = new javax.swing.JPanel();
        btnRemplirTableau = new javax.swing.JButton();
        lblLundi = new javax.swing.JLabel();
        lblLundiStatic = new javax.swing.JLabel();
        lblMardiStatic = new javax.swing.JLabel();
        lblMercrediStatic = new javax.swing.JLabel();
        lblJeudiStatic = new javax.swing.JLabel();
        lblVendrediStatic = new javax.swing.JLabel();
        lblVendrediStatic.setHorizontalAlignment(SwingConstants.CENTER);
        lblSamediStatic = new javax.swing.JLabel();
        lblDimancheStatic = new javax.swing.JLabel();
        lblMardi = new javax.swing.JLabel();
        lblMercredi = new javax.swing.JLabel();
        lblJeudi = new javax.swing.JLabel();
        lblSamedi = new javax.swing.JLabel();
        lblVendredi = new javax.swing.JLabel();
        lblDimanche = new javax.swing.JLabel();
        lblLundiSemaine = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuParamAdmin = new javax.swing.JMenuItem();
        jMenuDeconnexion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuChercherConflit = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        btnSemainePrecedente.setText("<");
        btnSemainePrecedente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemainePrecedenteActionPerformed(evt);
            }
        });

        btnSemaineSuivante.setText(">");
        btnSemaineSuivante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemaineSuivanteActionPerformed(evt);
            }
        });
        
        panelCardLayout = new JPanel();

        javax.swing.GroupLayout panelCentreLayout = new javax.swing.GroupLayout(panelCentre);
        panelCentreLayout.setHorizontalGroup(
        	panelCentreLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(panelCardLayout, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
        );
        panelCentreLayout.setVerticalGroup(
        	panelCentreLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(panelCardLayout, GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );
        panelCardLayout.setLayout(new CardLayout(0, 0));
        panelCentre.setLayout(panelCentreLayout);

        btnRemplirTableau.setText("Remplir tableau");
        btnRemplirTableau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemplirTableauActionPerformed(evt);
            }
        });

       
    	lblLundi.setText("00-00");

        lblLundiStatic.setText("lun.");

        lblMardiStatic.setText("mar.");

        lblMercrediStatic.setText("mer.");

        lblJeudiStatic.setText("jeu.");

        lblVendrediStatic.setText("ven.");

        lblSamediStatic.setText("sam.");

        lblDimancheStatic.setText("dim.");

        lblMardi.setText("00-00");

        lblMercredi.setText("00-00");

        lblJeudi.setText("00-00");

        lblSamedi.setText("00-00");

        lblVendredi.setText("00-00");

        lblDimanche.setText("00-00");
    
        lblLundiSemaine.setText("...");

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

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
        
        btnJour = new JButton("Jour");
        btnJour.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		btnJour(evt);
        	}
        });
        
        btnSemaine = new JButton("Semaine");
        btnSemaine.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		btnSemaine(evt);
        	}
        });
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(37)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(txtWelcome, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel2)
        					.addGap(23)
        					.addComponent(lbOJD)
        					.addGap(65)
        					.addComponent(btnSemainePrecedente, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnSemaineSuivante, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
        					.addComponent(btnAdmin, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
        					.addGap(30)
        					.addComponent(btnDeconnexion)
        					.addGap(69))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(27)
        					.addComponent(btnRemplirTableau)
        					.addGap(18)
        					.addComponent(lblLundiSemaine)
        					.addGap(169)
        					.addComponent(btnJour)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnSemaine)
        					.addContainerGap(263, Short.MAX_VALUE))))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(192)
        			.addComponent(lblLundiStatic)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblLundi)
        			.addGap(64)
        			.addComponent(lblMardiStatic)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblMardi)
        			.addGap(72)
        			.addComponent(lblMercrediStatic)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblMercredi)
        			.addGap(60)
        			.addComponent(lblJeudiStatic)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblJeudi)
        			.addGap(69)
        			.addComponent(lblVendrediStatic)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblVendredi)
        			.addGap(64)
        			.addComponent(lblSamediStatic)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblSamedi)
        			.addGap(75)
        			.addComponent(lblDimancheStatic)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblDimanche)
        			.addContainerGap(86, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(63, Short.MAX_VALUE)
        			.addComponent(panelCentre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(52))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lbOJD)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnSemainePrecedente)
        						.addComponent(btnSemaineSuivante)
        						.addComponent(btnRemplirTableau)
        						.addComponent(lblLundiSemaine)))
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(btnJour)
        					.addComponent(btnSemaine)))
        			.addGap(21)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblLundi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(lblLundiStatic)
        				.addComponent(lblMardiStatic)
        				.addComponent(lblMercrediStatic)
        				.addComponent(lblJeudiStatic)
        				.addComponent(lblVendrediStatic)
        				.addComponent(lblSamediStatic)
        				.addComponent(lblDimancheStatic)
        				.addComponent(lblMardi)
        				.addComponent(lblMercredi)
        				.addComponent(lblJeudi)
        				.addComponent(lblSamedi)
        				.addComponent(lblVendredi)
        				.addComponent(lblDimanche))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panelCentre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel2)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(txtWelcome, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        					.addGap(27))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnDeconnexion, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnAdmin, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
        					.addGap(18))))
        );
        getContentPane().setLayout(layout);
        JScrollPane scrollPane = new JScrollPane(panelJour,   ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(25);
        panelCardLayout.add(panelAgenda1, VU_SEMAINE);
        panelCardLayout.add(scrollPane, VU_JOUR);
        ((CardLayout)panelCardLayout.getLayout()).show(panelCardLayout, VU_SEMAINE);
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

    @SuppressWarnings("null")
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TestTableau t1 = null;
        try {
            t1 = new TestTableau();
        } catch (SQLException ex) {
            Logger.getLogger(ITagenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        t1.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnSemaineSuivanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemaineSuivanteActionPerformed
    	if(vuSemaine) {
	        c.add(Calendar.DAY_OF_YEAR, 7);//ajoute 7 jours au calendrier
	        remplirLabelsJours();
	        if(!panelAgenda1.ListeEvenements.isEmpty())//vide les évènements de la semaine précédente
	        	panelAgenda1.ListeEvenements.clear();
	        panelAgenda1.repaint();//repaint() redessine l'agenda 
	        panelAgenda1.remplirAgenda(c);
    	}
    	else if(vuJour) {
    		c.add(Calendar.DAY_OF_YEAR, 1);
    		 remplirLabelsJours();
    		if(!panelJour.getListeEvenements().isEmpty())
    			panelJour.getListeEvenements().clear();
    		panelJour.repaint();
    		panelJour.remplirAgenda(c);
    	}
	        
    }//GEN-LAST:event_btnSemaineSuivanteActionPerformed

    private void btnSemainePrecedenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemainePrecedenteActionPerformed
	    if(vuSemaine) {
	    	c.add(Calendar.DAY_OF_YEAR, -7);//enlève 7 jours au calendrier
	        remplirLabelsJours();
	        panelAgenda1.ListeEvenements.clear();//vide les évènements de la semaine suivante
	        panelAgenda1.repaint();//repaint() redessine l'agenda
	        panelAgenda1.remplirAgenda(c);
	    }
        else if(vuJour) {
    		c.add(Calendar.DAY_OF_YEAR, -1);
    		remplirLabelsJours();
    		panelJour.getListeEvenements().clear();
    		panelJour.repaint();
    		panelJour.remplirAgenda(c);
    	}
    }//GEN-LAST:event_btnSemainePrecedenteActionPerformed

    private void btnRemplirTableauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemplirTableauActionPerformed
        remplirLabelsJours();
        panelAgenda1.ListeEvenements.clear();//vide les évènements de la semaine suivante
        panelAgenda1.repaint();//repaint() redessine l'agenda
        panelAgenda1.remplirAgenda(c);
    }//GEN-LAST:event_btnRemplirTableauActionPerformed
    
    
    private void btnJour(ActionEvent evt) {
    	c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); 
    	vuJour = true;
    	vuSemaine = false;
    	((CardLayout)panelCardLayout.getLayout()).show(panelCardLayout, VU_JOUR);
    	remplirLabelsJours();
    	panelJour.repaint();
    }
    
    private void btnSemaine(ActionEvent evt) {
    	vuSemaine = true;
    	vuJour = false;
    	((CardLayout)panelCardLayout.getLayout()).show(panelCardLayout, VU_SEMAINE);
    	remplirLabelsJours();
    	panelAgenda1.repaint();  	
    }

    //Méthodes
    /**
     * affiche les dates de chaque jour:
     */
    private void remplirLabelsJours() {
    	
    	if(vuSemaine) {
    		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); 
	        String lun = sdf2.format(c.getTime());
	        lblLundi.setText(sdf.format(c.getTime()));
	        lblLundiStatic.setText("lun");
	        c.add(Calendar.DAY_OF_YEAR, 1);
	        lblMardi.setText(sdf.format(c.getTime()));
	        lblMardiStatic.setText("mar");
	        c.add(Calendar.DAY_OF_YEAR, 1);
	        lblMercredi.setText(sdf.format(c.getTime()));
	        lblMercrediStatic.setText("mer");
	        c.add(Calendar.DAY_OF_YEAR, 1);
	        lblJeudi.setText(sdf.format(c.getTime()));
	        lblJeudiStatic.setText("jeu");
	        c.add(Calendar.DAY_OF_YEAR, 1);
	        lblVendredi.setText(sdf.format(c.getTime()));
	        lblVendrediStatic.setText("ven");
	        c.add(Calendar.DAY_OF_YEAR, 1);
	        lblSamedi.setText(sdf.format(c.getTime()));
	        lblSamediStatic.setText("sam");
	        c.add(Calendar.DAY_OF_YEAR, 1);
	        lblDimanche.setText(sdf.format(c.getTime()));
	        lblDimancheStatic.setText("dim");
	        String dim = sdf2.format(c.getTime());
	        lblLundiSemaine.setText("Semaine du " + lun + " au " + dim);
    	}
    	else if(vuJour) {
			lblLundi.setText("");
			lblLundiStatic.setText("");
			lblMardi.setText("");
			lblMardiStatic.setText("");
			lblMercredi.setText("");
			lblMercrediStatic.setText("");
			lblJeudi.setText("");
		    lblJeudiStatic.setText("");
			lblVendredi.setText("");
			lblVendrediStatic.setText("");
			lblSamedi.setText("");
			lblSamediStatic.setText("");
			lblDimanche.setText("");
			lblDimancheStatic.setText("");
    		int numJour =  c.get(Calendar.DAY_OF_WEEK); // on recupere le numero du jour
    		String strJour = sdf.format(c.getTime());
    		switch(numJour) {
    		case 2:
    			lblLundi.setText(strJour);
    			lblLundiStatic.setText("lun");
    			break;
    		case 3:
    			lblMardi.setText(strJour);
    			lblMardiStatic.setText("mar");
    			break;
    		case 4: 
    			lblMercredi.setText(strJour);
    			lblMercrediStatic.setText("mer");
    			break;
    		case 5: 
    			lblJeudi.setText(strJour);
    			lblJeudiStatic.setText("jeu");
    			break;
    		case 6: 
    			lblVendredi.setText(strJour);
    			lblVendrediStatic.setText("ven");
    			break;
    		case 7: 
    			lblSamedi.setText(strJour);
    			lblSamediStatic.setText("sam");
    			break;
    		case 1: 
    			lblDimanche.setText(strJour);
    			lblDimancheStatic.setText("dim");
    			break;
    		}
    		System.out.println("numero du jour :"+numJour);
    		
    		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
    		String lundi = sdf2.format(c.getTime());
    		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);// dimanche
    		String dimanche = sdf2.format(c.getTime());
    		c.set(Calendar.DAY_OF_WEEK, numJour);
    		
	        lblLundiSemaine.setText("Semaine du " + lundi + " au " + dimanche);	       
    	}
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnDeconnexion;
    private javax.swing.JButton btnRemplirTableau;
    private javax.swing.JButton btnSemainePrecedente;
    private javax.swing.JButton btnSemaineSuivante;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuChercherConflit;
    private javax.swing.JMenuItem jMenuDeconnexion;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuParamAdmin;
    private javax.swing.JLabel lbOJD;
    private javax.swing.JLabel lblDimanche;
    private javax.swing.JLabel lblDimancheStatic;
    private javax.swing.JLabel lblJeudi;
    private javax.swing.JLabel lblJeudiStatic;
    private javax.swing.JLabel lblLundi;
    private javax.swing.JLabel lblLundiSemaine;
    private javax.swing.JLabel lblLundiStatic;
    private javax.swing.JLabel lblMardi;
    private javax.swing.JLabel lblMardiStatic;
    private javax.swing.JLabel lblMercredi;
    private javax.swing.JLabel lblMercrediStatic;
    private javax.swing.JLabel lblSamedi;
    private javax.swing.JLabel lblSamediStatic;
    private javax.swing.JLabel lblVendredi;
    private javax.swing.JLabel lblVendrediStatic;
    private villalem.reservations.PanelAgenda panelAgenda1;
    private villalem.reservations.PanelJour panelJour;
    private javax.swing.JPanel panelCentre;
    private javax.swing.JLabel txtWelcome;
    private JButton btnJour;
    private JButton btnSemaine;
    private JPanel panelCardLayout;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAdmin() {return btnAdmin;}
    public JLabel getTxtWelcome() {return txtWelcome;}
}
