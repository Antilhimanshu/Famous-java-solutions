package assingment;

public class CalculatePower {
	
	public static int Power(int x, int power) {
		int ans =1 ;
		while(power!=0) {
			ans *= x;
			--power;
			
			
		}
			
		return ans;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =3;
		int power =4;
		System.out.println(Power(x,power));
	}

}
