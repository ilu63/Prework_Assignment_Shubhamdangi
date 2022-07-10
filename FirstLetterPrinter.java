import java.util.Scanner;

class FirstLetterPrinter 
{
	public static void main (String[] args) 
	{
 		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String input = in.nextLine();
			firstLetterPrinter(input);
		}
	}

	static String firstLetterPrinter(String str) 
	{
	    String[] words = str.split(" ");
		
		for (String word : words){
		System.out.print(word.charAt(0));
		}
		
		return str;
	}
}