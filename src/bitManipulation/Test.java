package bitManipulation;

import java.util.Arrays;

public class Test {

	
	static int[] digits = {1,2,3,4};

	static void Rec(int current, int numDigits) {
	    if(numDigits==0)
	        System.out.println(current);
	    else
	        for(int x : digits)
	            Rec(current*10+x, numDigits-1);
	}
	/**
	 * 1111
	 * 1112
	 * 1113
	 * 1114
	 * 1121
	 * 1122
	 * 1123
	 * 1124
	 * 1131
	 * 1132
	 * 1133
	 * 1134
	 * 1141
	 * 1142
	 * 1142
	 * 1144
	 * 1211
	 * 1212
	 * 1213
	 * 1214
	 */
	public static void main(String[] args) {
		int y = (2131%10000)/1000;
		System.out.println(y);
		
		System.out.println(21321^0);
	}
}