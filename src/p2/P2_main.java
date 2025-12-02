package p2;

public class P2_main {
	public static void main (String [] args) {
		
	}
	
	public class LetterGame {
		String keyString = new String ("FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI\n"
				+ "QUER DURCH BAYERN!");
		String word = new String ("");
		
		public void setWord(int [] a) {
			for (int i = 0; i < a.length; i++) {
				word += keyString.charAt(a[i]);
				
			}
		}
		
	}
}
