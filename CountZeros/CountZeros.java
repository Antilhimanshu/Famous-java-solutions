package assingment;

public class CountZeros {
	
	public static void main(String[] args) {
		
		int input = 100 ;
		System.out.println(input);
	}
	
	public static int countZerosRec(int input) {
		
		if(input == 0) {
			return 0;
		}
		
		int smallOutput = countZerosRec(input/10);
		if(input %10 ==0)
		{
			return smallOutput+1;
			
		}
		else
		{
			return smallOutput;
		}
			
		
		
	}

}
