package collection_list;

import java.util.ArrayList;

public class Cave {
	public ArrayList<Casier> listC = new ArrayList<Casier>();
	public void ajouterC(Casier c ) {
		listC.add(c);
	}
       public void affiche() {
	    for(Casier c:listC) {
		c.affichage();;
	}
}
}
