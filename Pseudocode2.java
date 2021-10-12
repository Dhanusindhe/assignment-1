package assignmentday1;

public class Pseudocode2 {

	// Check if the number is positive or negative
	// 1. Initialize a number, say, int number= 35;
	// 2. If a number is positive, print "The number is positive"
	// If a number is negative, print "The number is negative"
	// If it nether negative nor positive, print as "The number is neither positive
	// nor negative"

	public static void main(String[] args) {
		int num = 35;
		if (num < 0) {
			System.out.println("The number is negative");
		} else if (num > 0) {
			System.out.println("The number is positive");
		} else {
			System.out.println("The number is neutral");
		}
	}
}
