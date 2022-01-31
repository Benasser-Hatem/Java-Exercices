package Eleve_Comparable;

import java.util.ArrayList;

public class GroupeEleves {
	public ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();
	public int nombre() {		
		return listeEleves.size();
	}
	public ArrayList<Eleve> getListeEleves() {
		return listeEleves;
	}
public void ajouterEleve(Eleve eleve) {
	listeEleves.add(eleve);
}
public Eleve chercher(String nom) {
	for (Eleve eleve : listeEleves) 
		if (eleve.getNom().equals(nom)) return eleve;
	return null;
}

public void lister() {
	System.out.println("Liste des eleves : ");
	for (Eleve eleve : listeEleves) {
		System.out.println(eleve);
	}
}

}