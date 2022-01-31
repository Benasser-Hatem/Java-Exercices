package malekjamila;

public class point {
	private int a,b;
	public int somme () {
		int somme=a+b;
		return somme;
	}
public int geta() {
	return a;
}
public void seta(int x) {
		a=x;
}
public int getb() {
	return b;
}
public void setb(int y) {
	b=y;
}
@Override
public String toString() {
	return "point [a=" + a + ", b=" + b + "]";
}
}
