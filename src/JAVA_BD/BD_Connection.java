package JAVA_BD;

public class BD_Connection {
	private BD_Connection()
	{
		try {
		Class.forName("com.mysql.jdbcd.Driver");
		System.out.println("Driver Loaded");
		
	}catch (Exception ex) {
		System.out.println(ex);
	}
	}
		public static void main (String[]args) {
			new  BD_Connection();
		}
}
