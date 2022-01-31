package collection_list;

import java.util.ArrayList;
import java.util.List;

public class Casier {
	ArrayList<Bouteille> listB = new ArrayList<Bouteille>();
	
	public void ajouterB(Bouteille b) {
		
		 listB.add(b);
		
	}
    public void supprimer(Bouteille b)throws CaveException {
    	if(listB.contains(b))
	listB.remove(b);
    	else
    		System.out.println("ther is no bouteille");
}
    public boolean Isempty(Bouteille b) {
	return (listB.isEmpty());
			
}
    public void affichage() {
    	for(Bouteille b :listB) {
    		System.out.println(b.id);
    	}
    }














}
