package p1;

public class P1_main {
	public static void main ( String [] args) {
		multFrac(5,2,3,4);
		Bruch a = new Bruch(2,3);
		Bruch b = new Bruch(5,2);
		 System.out.println("Der Zähler ist: " + b.z);
	     System.out.println("Der Nenner ist: " + b.n);
	    multFrac(a,b);
	        
		
	}
	public static void multFrac (int z1, int n1, int z2, int n2) {
		int ergebnisZ = z1 * z2;
		int ergebnisN = n1 * n2;
		
		System.out.println(ergebnisZ + " : " + ergebnisN);
		
	}
	
	
	public static class Bruch{
		int z;
		int n;
		

		
		public Bruch (int zaehler, int nenner) {
			this.z = zaehler;
			this.n = nenner;
		}
		
		
	}
	
	public static void multFrac (Bruch a, Bruch b) {
		System.out.println((a.z*b.z)+":"+(a.n*b.n));
	}
	
	

}
