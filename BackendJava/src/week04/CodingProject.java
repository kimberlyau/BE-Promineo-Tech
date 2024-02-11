package week04;

import java.util.*;

public class CodingProject {
	
	/* 
	 * 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n 
	 * number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	 */
	public static String wordRepeat(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		
		return result;
	}
	
	/*
	 * 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first
	 * and the last name as a String separated by a space).
	 */
	public static String fullNameCreation(String firstName, String lastName) {
		String result = firstName + " " + lastName;
		return result;
	}
	
	/* 
	 * 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	 */
	public static boolean isBigNumArray(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		
		if (sum > 100) {
			return true;
		} else {
			return true; 
		}

	}

	/* 
	 * 10. Write a method that takes an array of double and returns the average of all the elements in the array.
	 */
	public static double avgOfDoubles(double[] dArr) {
		double sum = 0.0;
		
		for (double d : dArr) {
			sum += d;
		}
		
		return sum / dArr.length;
	}

	/* 
	 * 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
	 * greater than the average of the elements in the second array.
	 */
	public static boolean isLargerAvg(double[] dArr1, double[] dArr2) {
		if (avgOfDoubles(dArr1) > avgOfDoubles(dArr2)) {
			return true;
		} else { 
			return false;
		}
	}

	/* 
	 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it 
	 * is hot outside and if moneyInPocket is greater than 10.50.
	 */
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	 * 
	 * maxNumber takes an double[] and finds the max number in the array. This could apply to things like shopping lists and
	 * finding the most expensive item
	 */
	public static double maxNumber(double[] dArr) {
		double max = 0.0;
		for (double d : dArr) {
			if (d > max) {
				max = d;
			}
		}
		
		return max;
	}


	public static void main(String[] args) {
		/* 
		 * 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		 * 		a. Programmatically subtract the value of the first element in the array from the value in the last element of the
		 * 			array (i.e. do not use ages[7] in your code). Print the result to the console.  
		 * 	b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more
		 * 			elements).  
		 * 		i. Make sure that there are 9 elements of type int in this new array.  
		 * 		ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new
		 * 			array ages2 from the last element of ages2). 
		 * 		iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		 *  c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int subtractionResult = ages[ages.length - 1] - ages[0];
		System.out.println(subtractionResult);
		
		int[] ages2 = new int[9];
		int subtractionResult2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println(subtractionResult2);
		
		
		int sum = 0;
		for (int i : ages) {
			sum += i;
		}

		System.out.println("1. Average age is " + sum/ages.length);
		
		/*
		 * 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”
		 * 		“Bob”.
		 * 		a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result 
		 * 			to the console.
		 * 		b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and 
		 * 			print the result to the console.
		 */
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		sum = 0;
		for (String s1 : names) {
			sum += s1.length();
		}
		
		System.out.println("2. Average for names is " + sum/names.length);
		
		
		/*
		 * 3. How do you access the last element of any array?
		 */
		
		System.out.println("3. The last name in names is: " + names[names.length - 1]);

		
		/*
		 * 4. How do you access the first element of any array?
		 */
		
		System.out.println("4. The first name in names is: " + names[0]);

		
		/*
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add 
		 * 	the length of each name to the nameLengths array.
		 */
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		System.out.println("5. The array nameLengths: " + Arrays.toString(nameLengths));
		
		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the 
		 * result to the console.
		 */
		sum = 0;
		for (int l : nameLengths) {
			sum += l;
		}
		
		System.out.println("6. The sum of the nameLengths array is: " + sum);

		/* 
		 * 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n 
		 * number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */
		
		System.out.println("7. The function wordRepeat returns: " + wordRepeat("Hello", 3));
		
		/*
		 * 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first
		 * and the last name as a String separated by a space).
		 */
		
		System.out.println("8. The full name is : " + fullNameCreation("Kim", "Au"));
		

		/* 
		 * 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		 */
		int[] nums = {101, 102, 103, 104};
		System.out.println("9. Is the sum of all ints in array " + Arrays.toString(nums) + " greater than 100? " + isBigNumArray(nums));

		/* 
		 * 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		 */
		
		double[] myDoublesArray1 = {10.2, 8.6, 9.8, 3.6, 12.9};
		System.out.println("10. The average in the array of doubles " + Arrays.toString(myDoublesArray1) + " is "
				+ avgOfDoubles(myDoublesArray1));

		/* 
		 * 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
		 * greater than the average of the elements in the second array.
		 */
		double[] myDoublesArray2 = {12.8, 3.6, 9.5, 1.6, 1.9};
		System.out.println("11. Is the average of the first doubles array larger than the second? " 
				+ isLargerAvg(myDoublesArray1, myDoublesArray2));

		/* 
		 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it 
		 * is hot outside and if moneyInPocket is greater than 10.50.
		 */
		
		boolean isHot = true;
		double money = 9.99;
		System.out.println("12. Given the conditions, will a person buy a drink? " + willBuyDrink(isHot, money));
		
		/*
		 * 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		 */
		double[] shoppingList = {19.99, 21.05, 5.99, 18.00, 35.50};
		System.out.println("13. The max number of the shopping list is: " + maxNumber(shoppingList));
		
		List<String> list = new ArrayList<>();
		Set<StringBuilder> strSet = new HashSet<>();
		Map<String, String> map = new HashMap<>();
	}

}
