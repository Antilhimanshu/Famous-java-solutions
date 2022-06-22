package assingment;

public class MultiplicationRecursive {
	
//	public static void main(String[] args) {
//		int m =9;
//		int n =9;
//		multiplyTwoIntegers(m, n);
//	}
//	
//	public static int multiplyTwoIntegers(int m, int n) {
//		int mul ;
//		
//		if( m ==0) {
//			mul =0;
//		}
//		
//		else {
//			mul = m*n;
//		}
//		
//		System.out.println(mul);
//		return mul;
//	}
	
	public static int multiplication( int m , int n) {
		if(m==0|| n==0) {
			return 0;
		}
		
		int SmallOutput = multiplication(m, n-1);
		return (m+SmallOutput);
	}
	
	
	

}
