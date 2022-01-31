package collection_list;



public class TestCave {

	public static void main(String[] args) {
		try {       
        Bouteille b1=new Bouteille(1);
        Bouteille b2=new Bouteille(12);
        Bouteille b3=new Bouteille(7);
        Bouteille b4=new Bouteille(4);
        Casier C1=new Casier();
        Casier C2=new Casier();
        C1.ajouterB(b1);
        C1.ajouterB(b2);
        C2.ajouterB(b3);
        C2.ajouterB(b4);
        Cave Cv=new Cave();
        Cv.ajouterC(C1);
        Cv.ajouterC(C2);        
        
		C1.supprimer(b1);
	
        Cv.affiche();
		} catch (CaveException e) {
			
			e.printStackTrace();
		}
	}

}
