package week05;
/*
 * 5. Implement the SpacedLogger methods:
 * 	Note:  The SpacedLogger should add a space or " " between each character of the String argument passed into its methods.
 * 	a. If the log method received “Hello” as an argument, it should print H e l l o
 * 	b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
 */

public class SpacedLogger implements Logger {
	@Override
	public void log(String input) {
		String spacedString = "";
		for (int i = 0; i < input.length(); i++) {
			spacedString += input.charAt(i);
			
			// if not the last letter
			if (i != input.length() - 1) {
				spacedString += " ";
			}
		}
		System.out.println(spacedString);
	}
	
	@Override
	public void error(String input) {
		String spacedString = "ERROR: ";
		for (int i = 0; i < input.length(); i++) {
			spacedString += input.charAt(i);
			
			// if not the last letter
			if (i != input.length() - 1) {
				spacedString += " ";
			}
		}
		System.out.println(spacedString);
	}
}
