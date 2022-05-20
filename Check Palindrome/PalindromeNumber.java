package github;

public class PalindromeNumber {
	
    public static boolean isPalindrome(int x) {
    int palindrome = x;
    int reverse = 0;

    // Compute the reverse
    while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
    }

    // The integer is palindrome if integer and reverse are equal
    return x == reverse;  

}
        
        
        
      




public static void main(String[] args) {
	int x =121;
	//isPalindrome(x);
	System.out.println(isPalindrome(x));
}
}
