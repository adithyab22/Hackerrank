package bitManipulation;

import java.util.Scanner;

/**
 * All numbers are in pairs except one. Find that number.
 * XOR: 00:0 01:1 10:1 11:0
 * 
 * @author Adithya Balasubramanian
 * 
 */
public class LonelyInteger {
	private static int lonelyInteger(int[] a) {
		int result = 0;
		for (int i : a) {
			result ^= i;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println(lonelyInteger(a));
	}

}
