package Week03;

public class ArraysAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(100));

	}
	
	public static int sumOfDigits(int num) {
		int sum = 0;
		
		while (num >= 10) {
			// Get last digit
			sum += num % 10;
			
			// Remove last digit
			num /= 10;
		}
		
		sum += num;
		
		return sum;
	}
	
	public static void repeatWords (int numTimes, String userWord) {	
	    // WRITE YOUR CODE HERE
	    String result = "";
	    for (int i = 0; i < numTimes; i++) {
	        result = result + userWord;
	    }
	    
	    System.out.println(result);
	}
	


}
