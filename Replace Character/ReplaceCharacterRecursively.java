package assingment;

public class ReplaceCharacterRecursively {
	
	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.length() == 0) {
			return input;
		}
		
		String ans = "";
		if(input.charAt(0)==c1) {
			ans = c2 + replaceCharacter(input.substring(1,input.length()), c1, c2);
			return ans;
		}
		
		else {
			ans = input.charAt(0) + replaceCharacter(input.substring(1,input.length()), c1, c2);
		return ans;
		}
	}
	
	public static void main(String[] args) {
		String input = "xasdfx";
		char c1 = 'a';
		char c2 ='x';
		System.out.println(replaceCharacter(input, c1, c2));
	}

}
