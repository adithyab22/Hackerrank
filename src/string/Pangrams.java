package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Roy wanted to increase his typing speed for programming contests. So, his
 * friend advised him to type the sentence
 * "The quick brown fox jumps over the lazy dog" repeatedly, because it is a
 * pangram. (Pangrams are sentences constructed by using every letter of the
 * alphabet at least once.)
 * 
 * After typing the sentence several times, Roy became bored with it. So he
 * started to look for other pangrams.
 * 
 * Given a sentence s, tell Roy if it is a pangram or not.
 * 
 * Input Format
 * 
 * Input consists of a string s.
 * 
 * @author Adithya Balasubramanian
 * 
 */
public class Pangrams {
	public static String checkPanagram(String word){
		String s = word.toLowerCase(); //change word to lower case to keep consistent with 26
		Set<Character> set = new HashSet<Character>();
		for(int i= 0; i < s.length(); i++){
			if(s.charAt(i)!= ' '){
				set.add(s.charAt(i));
			}
		if(set.size() == 26){
//			for(char c: set){
//				System.out.print(c + " ");
//			}
//			System.out.println();
			return "pangram";
		}
		}
		return "not pangram";
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(checkPanagram(scanner.nextLine()));
//		String s1 = "The quick brown fox jumps over the lazy dog";
//		String s2 = "We promptly judged antique ivory buckles for the next prize";
//		System.out.println(checkPanagram(s1));
//		System.out.println(checkPanagram(s2));
	}
}
