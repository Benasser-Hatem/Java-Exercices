package Eleve_credit_ECTS;

public class EleveMaster extends EleveECTS { 

	public EleveMaster(String nom) {
		super(nom);
	}

	public int resultat() {
		int somme = 0;

		for (int note : getListeNotes())
			if (note >= 10) 
				somme += 6;
			else if (note >= 8) 
				somme += 3;
		return somme;
	}
}
