package assingment;

public class ReplacePi {
	
	public static void main(String[] args) {
		
		
		String input = "xpixxcpi";
		System.out.println(replace(input));
	}
	public static String replace(String input) {
		
		if(input.length()==1) {
			return input;
			
		}
		
	 String smallAns = replace(input.substring(1));
	 if(input.charAt(0)=='p' && smallAns.charAt(0)=='i')
	 {
		 return "3.14" + smallAns.substring(1);
	 }
	 
	 return input.charAt(0) + smallAns;
	}

}
