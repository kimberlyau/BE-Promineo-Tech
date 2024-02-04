package week03;

public class week03ArraysAndMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(sumOfDigits(100));
		reverseArrayOfNumbers();

	}
	
	
	public static void reverseArrayOfNumbers () {
		int[] arr = {2, 3, 4, 5, 1};
		
		int[] reversed = new int[arr.length];
		int counter = 0; 
		
		for (int i = arr.length - 1; i >= 0; i--) {
		    reversed[i] = arr[counter];
		    counter++;
		}
		
		for (int x: reversed) {
		    System.out.println(x);
		}
		
		
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