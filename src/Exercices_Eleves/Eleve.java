package Exercices_Eleves;
import java.util.*;
public class Eleve {
	private String nom;
	private ArrayList<Integer> listNotes;
    private double moyenne;
	public Eleve(String nom) {
		this.nom = nom;
		listNotes = new ArrayList<Integer>();
		
	
		
	}
	
	public String getNom() {
		return nom;
	}

	public ArrayList getListNotes() {
		return listNotes;
	}
	
	public double getMoyenne() {
		return moyenne;
	}

public void ajouterNote(int note) {
	
	if (note<0) {
		listNotes.add(0);
	}else if (note>20) {
		listNotes.add(20);
	}else {
		listNotes.add(note);
	}
	int somme=0;
	for (int i = 0;i<listNotes.size();i++) {
	somme=somme+listNotes.get(i);	
	
	}
	moyenne=somme/listNotes.size();
}
	@Override
	public String toString() {
		return "Eleve [nom=" + nom + ", listNotes=" + listNotes + ", moyenne=" + moyenne + "]";
	}
		
}

	


