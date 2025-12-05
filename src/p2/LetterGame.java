package p2;

public class LetterGame {
	public String keyString;
	public String word;
	
	
	public LetterGame () {
		keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI\n"
				+ "QUER DURCH BAYERN!";
		word = ("");
	}
		
	public void setWord(int [] a) {
		word = "";
		
		for (int i = 0; i < a.length; i++) {
			int position = a[i];
			
			word = word + keyString.charAt(position);
		}
		}
		
		
	
	
	
}	

