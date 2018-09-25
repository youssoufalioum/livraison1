package com.objis.cameroun.Rexam.service;
import java.util.Scanner;

import com.objis.cameroun.Rexam.domaine.Eleve;


/**Classe qui traite les savoir faire dont l'utilisateur fait appel
 * @version 1.0 rexam
 * @author youssouf
 *
 */
public class EleveService {
	
	/**
	 * Methode qui permet d'afficher un message de bienvenue � l'utilisateur
	 */
	public void bienvenue() {
		System.out.println("Bienvenue dans votre application de gestion de resultat des examens de fin d'annee");
		//System.out.println();
		System.out.println("Saisissez les donnees de l'eleve");
		System.out.println();
		return;
	}
	
	
	/**
	 * Methode qui permet d'enregistrer les �l�ves et qui a comme param�tre la variable eleve de type Eleve
	 * @param eleve
	 */
	public void enregistrereleves(Eleve eleve) {
		
		
		Scanner ee=new Scanner(System.in);
		System.out.println("Saisir matricule de l'eleve");
		eleve.setMatricule(ee.nextLine());
		System.out.println("Saisir Nom et prenom de l'eleve");
		eleve.setNomprenom(ee.nextLine());
		System.out.println("Saisir Date de naissance de l'eleve");
		eleve.setDatenaissance(ee.nextLine());
		System.out.println("Saisir Lieu de naissance de l'eleve");
		eleve.setLieunaissance(ee.nextLine());
		System.out.println("Saisir Serie de l'eleve");
		eleve.setSerie(ee.nextLine());
		System.out.println("Saisir la Decision du jury");
		eleve.setDecisionjuge(ee.nextLine());
		System.out.println();
		return;
		
	}
	
	


	/**
	 * Methode qui permet d'afficher les donn�es de l'�l�ve notament le matricule, Nom et prenom, Date de naissance, Lieu de naissance, Serie, Decision du jury
	 * @param eleve
	 */
	public void afficherdonneeseleves(Eleve eleve) {
		String tableaueleves[]= {eleve.getMatricule(),eleve.getNomprenom(),eleve.getDatenaissance(),eleve.getLieunaissance(),eleve.getSerie(),eleve.getDecisionjuge()};
		for(int i=0; i<tableaueleves.length;i++) {
			System.out.println(tableaueleves[i]);
			
		}
		
	}
	
}
