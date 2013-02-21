
public class RomanComputer {

	public int RomanComputer(String string) {
		
		
		int number = 0;
		RomanToNumeral Chiffre = new RomanToNumeral();
		
		String[] tabStr = string.split(" ");
		if (tabStr[1] == "+")
		{
			int rom1 = Chiffre.RomanToNumeral(tabStr[0]);
			int rom2 = Chiffre.RomanToNumeral(tabStr[2]);
			int add = rom1 + rom2;
			Convert(add);
			return add;
		}
		
	}
}
