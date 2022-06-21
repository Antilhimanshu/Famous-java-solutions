package assingment;

public class LastIndexOfNumber {
	
	static int helper(int input[], int x ,int i, int idx){
        if(i == input.length){
            return idx;
        }
        else if(input[i] == x){
                idx = i;
        }
        return helper(input,x,i +1,idx);
    }

    public static int lastIndex(int input[], int x) {
         
        return helper(input,x,0,-1);
    }
	
	public static void main(String[] args) {
		int input[] = {8,9,10,9};
		int x = 8;
		System.out.println(lastIndex(input, x));
	}

}
