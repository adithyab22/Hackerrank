package string;

import java.util.Scanner;

/**
 * James found a love letter his friend Harry has written for his girlfriend.
 * James is a prankster, so he decides to meddle with the letter. He changes all
 * the words in the letter into palindromes.
 * 
 * To do this, he follows two rules:
 * 
 * 1. He can reduce the value of a letter, e.g. he can change d to c, but he cannot
 * change c to d. 
 * 2. In order to form a palindrome, if he has to repeatedly reduce
 * the value of a letter, he can do it until the letter becomes a. Once a letter
 * has been changed to a, it can no longer be changed. Each reduction in the
 * value of any letter is counted as a single operation. Find the minimum number
 * of operations required to convert a given string into a palindrome.
 * 
 * @author Adithya Balasubramanian
 * 
 */
public class LoveLetterMystery {
	public static int numberOfChanges(String s) {
		int count = 0;
		for (int i = 0; i < s.length() - s.length() / 2; i++) {
			count += Math.abs(s.charAt(i) - s.charAt(s.length() - i - 1));
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println(numberOfChanges(scanner.next()));
		}
		// String s = "abc";
		// System.out.println(numberOfChanges(s));
	}
}
