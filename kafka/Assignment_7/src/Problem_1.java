//calculating no of characters and alphabets and special symbol in an string//
import java.util.Scanner;//importing package

public class Problem_1 {
	
	private static Scanner sc; //scanner class
	public static void main(String[] args) {
		String aldisp_str; //defining string alphabet, digit, special character
		int i, alph, digi, spl; //initializing values
		alph = digi = spl = 0;
		char ch;
		
		sc= new Scanner(System.in); //creating object to access package
		System.out.print("\nPlease Enter Alpha Numeric Special String =  ");
		aldisp_str = sc.nextLine(); //calling scanner class
		
		for(i = 0; i < aldisp_str.length(); i++)
		{
			ch = aldisp_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;//condition for alphabet
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;//condition for digit
			}
			else {
				spl++;//condition for special character
			}
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + alph);
		System.out.println("Number of Digit Characters     =  " + digi);
		System.out.println("Number of Special Characters   =  " + spl);
	}
}