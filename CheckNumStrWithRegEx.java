import java.lang.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * This code should work with all the possible cases 
 * If not, go take a bath and return (1)
 */
 
 // @author : rootTraveller, June 2017

 
class CheckNumStrWithRegEx{
	public CheckNumStrWithRegEx() {
	}
	
	private static boolean isNumeric(String str) {
		String regex = "[0-9]+";  //only digits, one or more OR can use "//d+"
		Pattern pattern = Pattern.compile(regex);  //pattern to be search; Notice - No new keyword
		Matcher matcher = pattern.matcher(str);  //matcher - target string 
		if(matcher.matches() == true) return true;
		else return false;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = new String();
		do {
			System.out.print("Input : ");		str = sc.nextLine();
			String status = isNumeric(str) == true ? "Numeric Only" : "Not a Numeric String";
			System.out.println(status);
		} while(!str.equalsIgnoreCase("EXIT"));
	}
}
