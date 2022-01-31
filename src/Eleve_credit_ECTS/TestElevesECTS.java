package Eleve_credit_ECTS;

import java.util.ArrayList;

public class TestElevesECTS {
	
	public static void main(String[] arg) {
		ArrayList<EleveECTS> listeEleves = new ArrayList<EleveECTS>();
		EleveECTS unEleve = new Eleve1A("Rami");
		unEleve.ajouterNote(12);
		unEleve.ajouterNote(17);
		unEleve.ajouterNote(8);
		listeEleves.add(unEleve);


		unEleve = new EleveMaster("Ahmed");
		unEleve.ajouterNote(11);
		unEleve.ajouterNote(7);
		unEleve.ajouterNote(9);
		unEleve.ajouterNote(18);
		listeEleves.add(unEleve);

		unEleve = new EleveMaster("Mohamed");
		unEleve.ajouterNote(15);
		unEleve.ajouterNote(14);
		unEleve.ajouterNote(19);
		unEleve.ajouterNote(12);
		listeEleves.add(unEleve);

		for (EleveECTS eleve : listeEleves)
			System.out.println("Nombre de credits de " + eleve.getNom() + " : " +
					eleve.resultat());
	}
}