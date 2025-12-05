package h3;

public class Mensch {
		public String name;
		public int gebJahr, alter;
		
		
		public void setName(String neuerName) {
			name = neuerName;
		}
		
		public void setGebJahr (int neuesGebJahr) {
			if (neuesGebJahr <= 2025) {
				gebJahr = neuesGebJahr;
			}
			
		}
		
		public void setAlter () {
			if (gebJahr <= 2025) {
				alter = 2025 - gebJahr;
			}
		}
		
		
		public String getName (){
			return name;
		}
		
		public int getGebJahr () {
			return gebJahr;
		}
		
		public int getAlter () {
			return alter;
		}
		
		
		
		
		
		
		
}

