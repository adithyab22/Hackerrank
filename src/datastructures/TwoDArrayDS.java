package datastructures;

import java.util.Scanner;

/**
 * 1 1 1 0 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 2 4 4 0 0 0 0 2 0 0 0 0 1 2 4 0
 * Find max of the structure . . .
 * 							   .
 * 							 . . .
 * in the array
 * @author Adithya Balasubramanian
 * 
 */
public class TwoDArrayDS {
//
//	public static void printArray(int[][] array) {
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int arr_i = 0; arr_i < 6; arr_i++) {
			for (int arr_j = 0; arr_j < 6; arr_j++) {
				arr[arr_i][arr_j] = in.nextInt();
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 2; i < arr.length; i++) {
			for (int j = 2; j < arr[i].length; j++) {
				// 00, 01, 02
				// 10, 11, 12
				// 20, 21, 22
				int sum = 0;
				sum += arr[i][j] + arr[i][j - 1] + arr[i][j - 2]
						+ arr[i - 1][j - 1] + arr[i - 2][j] + arr[i - 2][j - 1]
						+ arr[i - 2][j - 2];
				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
}
