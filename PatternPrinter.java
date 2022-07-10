import java.util.Scanner;

class PatternPrinter 
{
 	public static void main(String[] args) 
 	{
 		Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number ");
 		int n = in .nextInt();
 		patternPrinter(n);
 	}

 	static void patternPrinter(int n) 
 	{ int a=n;
 		// write your code here
 		for (int i = n; i > 0; i--)
 		{
 		    for (int j = n; j > 0; j--)
 		    {
 				for (int k = 0; k < i; k++)
 				{
 					System.out.print(n + " ");
 				}
 				n--;
 			}
 			System.out.println();
 			n=a;
 		}
 	}
}