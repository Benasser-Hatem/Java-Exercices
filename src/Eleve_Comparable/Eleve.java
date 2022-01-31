package Eleve_Comparable;

import java.util.ArrayList;

public class Eleve implements Comparable<Eleve> {
	
	private String nom;
	private ArrayList<Integer> listeNotes;;
	public String getNom() {
		return nom;
	}
	public ArrayList<Integer> getListeNotes() {
		return listeNotes;
	}
	
	public double getMoyenne() {
		return moyenne;
	}
	private double moyenne;
	public Eleve(String nom) {
		super();
		this.nom = nom;
		this.listeNotes = new ArrayList<Integer>();
	}
	
public void ajouterNote(int note) {
		
	if (note<0) {
	listeNotes.add(0);}
	else if (note>20) {
		listeNotes.add(20);
	}
		else {
		listeNotes.add(note)	;
	}
	int i,somme = 0;
	for (i=0;i<listeNotes.size();i++) {
		somme = somme +listeNotes.get(i);}
	
		moyenne = somme/listeNotes.size();
	}
public int compareTo(Eleve autreEleve) {
	if (this.moyenne < autreEleve.moyenne) return -1;
	if (this.moyenne > autreEleve.moyenne) return 1;
	return 0;
}  
public String toString() {
	return "Eleve [nom=" + nom + ", listeNotes=" + listeNotes + ", moyenne=" + moyenne + "]";
}		
}

