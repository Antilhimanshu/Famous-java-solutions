package assingment;

public class CheckNumber {
	
	public static boolean checkNumber(int input[], int x) {
		
		if(input.length==1)
		{
			if(input[0]==x) {
				return true;
			}
			else
			{
				return false;
			}
		}
		
		else if(input[input.length-1]==x)
		{
			return true;
		}
		
		int[] check = new int[input.length-1];
		for(int i =0;i<input.length-1;i++)
		{
			check[i]=input[i];
		}
		
		boolean istrue = checkNumber(check,x);
		return istrue;
		 
				
			
		}
			 
	 
	
	public static void main(String[] args) {
		int input[] = {6,6,5,4,7};
		int x = 9;
		System.out.println(checkNumber(input, x));
	}

}
