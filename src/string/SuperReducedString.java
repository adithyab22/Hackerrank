package string;

import java.util.Scanner;

/**
 * 
 * Shil has a string, , consisting of lowercase English letters. In one
 * operation, he can delete any pair of adjacent letters with same value. For
 * example, string "aabcc" would become either "aab" or "bcc" after operation.
 * Shil wants to reduce S as much as possible. To do this, he will repeat the
 * above operation as many times as it can be performed. Help Shil out by
 * finding and printing S's non-reducible form! Note: If the final string is
 * empty, print .
 * Examples:
 * aaabccddd : abd
 * baab : Empty String
 * aa : Empty String
 * 
 * @author Adithya Balasubramanian
 * 
 */
public class SuperReducedString {
	public static String superReducedString(String s) {
		//store s in a temp variable
		String result = s;
		//reduce s
		for (int i = 1; i <= s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i-1)){
				s = s.substring(0, i-1) + s.substring(i+1);
			}
		}
		//see if it is in its reduced form
		//if yes
		if(result.equals(s)){
			if(s.length() == 0){
				result = "Empty String";
			}
			return result;
		//if not
		}else{
			result = superReducedString(s);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(superReducedString(scanner.next()));
	//	String s = "abc";
	//	System.out.println(superReducedString(s));
	}
}
