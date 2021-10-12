package assignmentday1;

public class PrimeNumber {
	public static void main(String[] args) {
		int input = 13;
		int range = input / 2;
		boolean flag = false;
		for (int i = 2; i <= range; i++) {
			if (input % i == 0) {
				flag = true;
			}
		}
		if (flag = true) {
			System.out.println("This is not a prime number");
		} else {
			System.out.println("This is a prime nnumber");
		}

	}
}
