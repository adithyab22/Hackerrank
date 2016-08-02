package string;

import java.util.Scanner;

/**
 * Alice has a binary string, B, of length n. She thinks a binary string is
 * beautiful if and only if it doesn't contain the substring "010".
 * 
 * In one step, Alice can change a 0 to a 1 (or vice-versa). Count and print the
 * minimum number of steps needed to make Alice see the string as beautiful.
 * 
 * @author SDLC-Consultant
 * 
 */
public class BeautifulBinaryString {
	public static int changesRequired(String s) {
		int count = 0;
		if (s.length() > 2) {
			for (int i = 2; i < s.length(); i++) {
				if (s.charAt(i) == '0' && s.charAt(i - 1) == '1'
						&& s.charAt(i - 2) == '0') {
					count++;
					i+=2;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String B = in.next();
		if (n > 2) {
			System.out.println(changesRequired(B));
		}
		
	}
}
