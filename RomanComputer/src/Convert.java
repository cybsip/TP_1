
public class Convert {

	int I = 1;
	int V = 5;
	int X = 10;
	int L = 50;
	int C = 100;
	int D = 500;
	int M = 1000;
	
	public String Convert(int chiffre) {
		String sChiffre = chiffre.toString();
		char[]  tabChif = sChiffre.toCharArray();
		int resultat = 0;
		for (int i = 0; i < sChiffre.length() ; ++i)
		{	
			if (tabChif[i] == 'L')
				resultat = resultat + L;
			if (tabChif[i] == 'D')
				resultat = resultat + D;
			if (tabChif[i] == 'M')
				resultat = resultat + M;
			
		}
		
	}
}
