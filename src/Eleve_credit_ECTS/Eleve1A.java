package Eleve_credit_ECTS;

public class Eleve1A extends EleveECTS { 

    public Eleve1A(String nom) {
	super(nom);
    }
    
    public int resultat() {
	if (this.getMoyenne() >= 12) return 60;
	return 0;
    }
}


