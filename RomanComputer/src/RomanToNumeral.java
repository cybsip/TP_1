
public class RomanToNumeral {

	int I = 1;
	int V = 5;
	int X = 10;
	int L = 50;
	int C = 100;
	int D = 500;
	int M = 1000;
	
	public int RomanToNumeral(String string) {
		int number = 0;
		char[]  tabChar = string.toCharArray();
		int suivant;
		for (int i = 0; i < string.length() ; ++i)
		{
			if (tabChar[i] == 'I')
			{
				if (string.length() > i+1 && tabChar[i+1] != 'I')
				{
					suivant = RomanToNumeral(tabChar[i+1] + "");
					if (suivant < 50 && suivant > 1)
					{	
						number = number + suivant - 1;
						++i;
					}
					else 
						// pour les cas impossibles IM, IC, etc..
						return -1000;
				}
				else 
					number = number + 1;
			}
				
			else if (tabChar[i] == 'V')
			{
				if (string.length() > i+1 ) 					
				{
					suivant = RomanToNumeral(tabChar[i+1] + "");
					if (suivant < L && suivant > V)
					{	
						number = number + suivant - V;
						++i;
					}
					else if (suivant <= V)
						number = number + V;
					else 
						// pour les cas impossibles VM, VC, etc..
						return -1000;
				}
				else
					number = number + V;
				
			}
			
			else if (tabChar[i] == 'X')
			{
				if (string.length() > i+1 ) 					
				{
					suivant = RomanToNumeral(tabChar[i+1] + "");
					if (suivant < M && suivant > X)
					{	
						number = number + suivant - X;
						++i;
					}
					else if (suivant <= X)
						number = number + X;
					else 
						// pour les cas impossibles VM, VC, etc..
						return -1000;
				}
				else
					number = number + X;
			}
			
			else if (tabChar[i] == 'L')
				number = number + L;
			
			else if (tabChar[i] == 'C')
			{
				if (string.length() > i+1 ) 					
				{
					suivant = RomanToNumeral(tabChar[i+1] + "");
					if (suivant > C)
					{	
						number = number + suivant - C;
						++i;
					}
					else if (suivant <= C)
						number = number + C;
					else 
						// pour les cas impossibles VM, VC, etc..
						return -1000;
				}
				else
					number = number + C;
			}
			
			else if (tabChar[i] == 'D')
					number = number + D;
			
			
			else if (tabChar[i] == 'M')
				number = number + M;
			else
				return -1000;
		}
		

		
		return number;
	
	}
	

}
