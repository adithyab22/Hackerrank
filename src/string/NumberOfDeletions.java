package string;

import java.util.Scanner;

/**
 * Shashank likes strings in which consecutive characters are different. For
 * example, he likes ABABA, while he doesn't like ABAA. Given a string
 * containing characters A and B only, he wants to change it into a string he likes.
 * To do this, he is allowed to delete the characters in the string.
 * 
 * Your task is to find the minimum number of required deletions.
 * 
 * Input Format
 * 
 * The first line contains an integer T, i.e. the number of test cases. The next
 * T lines contain a string each.
 * 
 * Output Format
 * 
 * For each test case, print the minimum number of deletions required.
 * 
 * @author Adithya Balasubramanian
 * 
 */
public class NumberOfDeletions {
	public static int numberOfDeletions(String s) {
		/**
		 * check if next letter is same. if same, increment count else go to
		 * next char
		 */
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				continue;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println(numberOfDeletions(scanner.next()));
		}
		// String s = "AAAB";
		// System.out.println(numberOfDeletions(s));
	}
}
