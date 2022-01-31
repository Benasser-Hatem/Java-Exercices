package Exercices_Eleves;

public class TestEleve  {
	
public static void main (String [] args) {
	Eleve eleve = new Eleve("malek");
	eleve.ajouterNote(18);
	eleve.ajouterNote(12);
	eleve.ajouterNote(14);
	eleve.ajouterNote(16);
System.out.println(eleve.toString());	
	
	
	
}
}
