package assingment;

public class CheckPalindromeRecursive {

	
	public static void main(String [] args) {
		 String input = "HIMIH";
		 System.out.println(isStringPalindrome(input));
	}
	
	public static boolean isStringPalindrome(String input) {
		
		if(input.length()==0 || input.length()==1) {
			return true;
		}
		
		if(input.charAt(0)==input.charAt(input.length()-1))
			return isStringPalindrome(input.substring(1,input.length()-1));
					return false;
		
		
	}
}
