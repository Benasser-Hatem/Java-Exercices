package Exercices_Etuduant;

public class Etudiant {
	private String nom;
	

	public Etudiant(String nom) {
		this.nom=nom;
	}
public void travailleur() {
	System.out.println(this.nom+ "  Ahmed se met au travail !");
	
}
public void seReposer() {
	System.out.println(this.nom+" Ahmed se repose");
}


}
