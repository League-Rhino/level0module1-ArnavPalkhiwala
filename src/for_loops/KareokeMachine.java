package for_loops;

public class KareokeMachine {
	public static void main(String[] args) {
		/*
		 * KareokeMachine BieberFever
		 *
		 * 1)Write a program that uses a for loop to print baby baby baby oh Code should only contain one “baby”, and
		 * one “oh” 2) Every 2nd time the “oh” should be “no” 3) Each chorus ends with “I thought you'd always be mine”.
		 */
		// Contact GitHub API Training Shop Blog About

		for (int i = 0; i < 9; i++) {

			if (i != 3 && i != 7 && i != 8) {
				System.out.println("Baby, ");

			}

			if (i == 3) {
				System.out.println("Oh");
			} else if (i == 7) {
				System.out.println("No");
			} else if (i == 8) {
				System.out.println("I thought you'd always be mine!");
			}

		}

	}
}
