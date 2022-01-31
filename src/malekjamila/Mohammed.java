package malekjamila;

public class Mohammed {
	public static void main (String []args) {
		int m=5;
		int x=8;
	  somme(x);
		System.out.println("la somme est : "+x);
		
	}

	public static void somme (int a){
	int somme = a++;
	System.out.println(somme);
	}
}