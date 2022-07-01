
public class CheckArrayRotation {
	public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        
        int len = arr.length;
        int min_element = Integer.MAX_VALUE;
        int min_index = Integer.MAX_VALUE;
        
         if (len==0){
             return 0;
         }
        
        for(int i = 0; i<len; i++){
            if(arr[i]<min_element){
                min_element = arr[i];
                min_index = i;
            }
        }
        
        return min_index;
    }

	public static void main(String[] args) {
		int[] arr = {5,6,1,2,3,4};
		System.out.println(arrayRotateCheck(arr));
	}

}
