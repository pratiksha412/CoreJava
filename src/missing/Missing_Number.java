package missing;


public class Missing_Number {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1,2,3,4,5,6,7,9,10};
		int sumofRange = 10* (10+ 1)/2;
		int sumofNumbers =0;
		for(int num : numbers) {
			 sumofNumbers += num;
			 
		}
		int missingNumber = sumofRange - sumofNumbers;
		System.out.println("The missing number is:"+ missingNumber);
	}
		
	}
