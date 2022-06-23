package assingment;

public class GeometricSum {
	
	public static double findGeometricSum(int k) {
		
		
		if(k==0) {
			return 1;
		}
		
		double smallOutput = findGeometricSum(k-1);
		return(Math.pow(0.5, k)+ smallOutput);
	}
	
	public static void main(String[] args) {
		int k =3;
		System.out.println(findGeometricSum(k));
	}

}
