package week05;

/* Coding Steps — Object Oriented Programming
	 * 1.  Create an interface named Logger.
	 * 2.  Add two void methods to the Logger interface, each should take a String as an argument
	 * 	a.  log
	 * 	b.  error
 */

public interface Logger {
	void log(String input);
	void error(String input);
}
