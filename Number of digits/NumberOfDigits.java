package assingment;

public class NumberOfDigits {
	public static void main(String[] args) {
		int n =450006;
		System.out.println(count(n));
	}
	
	public static int count(int n) {
		if(n/10==0) 
			return 1;
			return 1 + count(n/10);
		}
		 
		
		
	}


