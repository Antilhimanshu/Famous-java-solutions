
public class TripletSum {
	
	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        
        int count = 0;
        
        for(int i = 0; i<arr.length; i++){
            
            for(int j = i+1; j<arr.length; j++){
                
                for (int k = j+1; k<arr.length; k++){
                    
                    if ((arr[i] + arr[j] + arr[k])==num){
                        count++;
                    }
                }
            }
        }
        
        return count;
	}
	
	public static void main(String[] args) {
		int[] arr  = {1,2,3,4,5,6,7};
		int num = 12;
		System.out.println(tripletSum(arr, num));
	}
	
	
}
