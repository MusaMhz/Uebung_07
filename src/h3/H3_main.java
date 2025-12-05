package h3;

public class H3_main {
	public static void main ( String [] args) {
			Mensch Elsa = new Mensch();
			Elsa.setName ("Elsa");
			Elsa.setGebJahr (2006);
			Elsa.setAlter();
			
			System.out.println("Name: " + Elsa.getName());     
	        System.out.println("Geburtsjahr: " + Elsa.getGebJahr());
	        System.out.println("Alter: " + Elsa.getAlter());
		}
		
	
}
