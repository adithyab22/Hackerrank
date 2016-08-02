package datastructures;

import java.util.Scanner;
/**
 * find number of pairs where ai + aj is divisible by k and j > i
 * @author SDLC-Consultant
 *
 */
public class DivisibleSumPairs {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int count = 0;
	        for(int i = 0; i < a.length; i++){
	           int j = a.length -1;
	            while(j > i){
	                if((a[i] + a[j])%k ==0){
	                    count++;
	                }
	                j--;
	            }
	        }
	        System.out.println(count);
	    }
}
