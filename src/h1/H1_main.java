package h1;

public class H1_main {
	public static void main ( String [] args ) {
		Zahl Z1 = new Zahl ();
		Z1.num = -10;
		
		Z1.setEven();
		Z1.setPositive();
		Z1.setSmall();
		
		System.out.println("Zahl: " + Z1.num);
        System.out.println("Gerade: " + Z1.even);
        System.out.println("Klein (<100): " + Z1.small);
        System.out.println("Positiv: " + Z1.positive);
		
	}
	
	
	
}
