package prjWokingWithStrings;

public class Lista01 {
	public static void main(String args[])
	{
		String myName = "Vilson Luiz Dalle Mole";
		
		System.out.printf("Meu nome é %s\n", myName.toUpperCase());
		System.out.printf("Meu nome é %s\n", myName);
		System.out.printf("Meu nome tem %d letras\n", letterCount(myName));
		System.out.printf("Meu nome tem %d vogais\n", countVowels(myName));
	}

	public static int letterCount(String txt)
	{
		int count = 0;
		for (int i=0; i<txt.length(); i++)
		{
			if(Character.isAlphabetic(txt.charAt(i)))
				count ++;
		}	
		return count;	
	}
	public static int countVowels(String txt)
	{
		int count = 0;
			
		for (int i=0; i<txt.length(); i++)
		{
			char letter = Character.toLowerCase(txt.charAt(i));
			if (letter == 'a' || letter == 'e' || letter == 'i' 
					|| letter == 'o' || letter == 'u')
				count ++;
		}
		return count;
	}
	public static int consonantsCount()
	{
		for (int i=0; i<txt.length(); i++)
		{
			if(Character.isAlphabetic(txt.charAt(i)))
				count ++;
			char letter = Character.toLowerCase(txt.charAt(i));
			else (letter == 'a' || letter == 'e' || letter == 'i' 
					|| letter == 'o' || letter == 'u')
			
		
	}

}

