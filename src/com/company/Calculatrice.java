package com.company;

import java.awt.BorderLayout;

import javax.swing.JFrame;


public class Calculatrice extends JFrame {


	public Calculatrice(){
		this.setSize(250, 250);
		this.setTitle("Calculette Graphique");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		initComposant();
		this.setVisible(true);
	}

	private void initComposant(){
		Controleur controleur = new Controleur();
		
		Modele modele = new Modele();
		View view = new View();
		
		controleur.setModele(modele);
		controleur.setView(view);

		this.getContentPane().add(view, BorderLayout.NORTH);
		this.getContentPane().add(controleur.getBouton());
	}
}
