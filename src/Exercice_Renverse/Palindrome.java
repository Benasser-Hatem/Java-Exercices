package Exercice_Renverse;

public class Palindrome {
	@SuppressWarnings("deprecation")
	public Character[] toCharacterArray( String s ) {

		   if ( s == null ) {
		     return null;
		   }

		   int len = s.length();
		   Character[] array = new Character[len];
		   for (int i = 0; i < len ; i++) {
		      array[i] = new Character(s.charAt(i));
		   }

		   return array;
		}
	

}
