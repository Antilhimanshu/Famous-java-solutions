package assingment;

public class SumOfArray {
	
	public static int sum(int input[]) {
		

		if(input.length == 1) {
		 return input[0];
		}
		else {
		int[] smallOutput = new int[input.length-1];
		
		for(int i =0; i<input.length-1;i++) {
			smallOutput[i] = input[i];
		}
		
		int output = input[input.length-1] + sum(smallOutput);
		return output;
		}
	
	}

	public static void main(String[] args) {



		int input[] = {9,8,9};
		System.out.println(sum(input));

	}

}



//public static int sum(int input[]) {
//
//if (input.length==1)
//{
//    return input[0];
//}
//
//int[] smallOutput = new int[input.length-1];
//for (int i=0;i<input.length-1;i++)
//{
//    smallOutput[i]=input[i];
//}
//
//int output=input[input.length-1]+sum(smallOutput);
//return output;
//}
