package com.employee;
import java.util.Date;

import java.util.ArrayList;

public class Account{

	private String nom;
	private String prenom;
	private long numeroCompte;
	private byte clef;
	private double solde;
	private ArrayList<Operations> historique = new ArrayList<Operations>();
	
	private final static String codeBanque = "17515";  // ils sont desidentifiants specifiques à la banque et donc egaux pour tous les comptes
	private final static String codeGuichet = "90000"; // final: on ne peut plus modifier par la suite
	private final static String prefixFrance = "FR76"; // static: pas specifique à l'instance, depend seulement de la classe
	
	// Constructeur
	
	public Account(String nom, String prenom, long numeroCompte, byte clef, double solde){
		this.nom = nom;
		this.prenom = prenom;
		this.numeroCompte = numeroCompte;
		this.clef = clef;
		this.solde = solde;
	}
	
	// Methodes de la classe
	
	public double getSolde(){ 
		return solde;
	}
	
	public void crediter(double montant){
		solde += montant;
		historique.add(new Operations(montant, new Date()));
	}
	
	public void debiter(double montant){
		if (solde >= montant){
			solde -= montant;
			historique.add(new Operations(- montant, new Date()));
		}
	}
	
	public String makeIBAN(){
		return (prefixFrance + " " + codeBanque + " " + codeGuichet + " " +  numeroCompte + " " + clef);
	}
	
	public ArrayList<Operations> getHistorique(){
		return historique;
	}
	
	public String toString(){ // pour afficher un compte avec println
		return "(" + nom + " " + prenom + ", " + makeIBAN() + ")";
	}
}

	
	