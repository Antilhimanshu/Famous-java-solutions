
public class FindUniqueElemeny {

	
	public static int findUnique(int[] arr) {
		
		int ans = 0;
		
		for(int i =0; i<arr.length;i++) {
			ans^= arr[i];
	}
		return ans;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2,3,3,9,3,6,2};
		System.out.println(findUnique(arr));
	}
}
