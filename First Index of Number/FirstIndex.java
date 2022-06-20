package assingment;

public class FirstIndex {
	public static int firstIndex(int input[], int x) {
		return firstIndex(input, x,0);
		
	}
	
	public static int firstIndex(int input[], int x, int s) {
		
		if (s==input.length-1) {
			if(input[s]==x) {
				return s;
			}
			else {
				return -1;
			}
		}
		
		if(input[s]==x)
		{
			return s;
		}
		
		
		int small = firstIndex(input,x,s+1);
		return small;
	}
	

	
	public static void main(String[] args) {
	int	input[] = {9,8,0,4};
		int x =8;
		
		System.out.println(firstIndex(input, x));
		
	}
}
