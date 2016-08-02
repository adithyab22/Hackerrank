package bitManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.event.ListSelectionEvent;

/**
 * Quadruples of (W,X,Y,Z) are beautiful if the following conditions are true:
 * W xor X xor Y xor Z != 0
 * Given A,B,C,D; find the beautiful quadruples of the form W,X,Y,Z where the following constraints hold:
 * 1 <= W <= A
 * 1 <= X <= B
 * 1 <= Y <= C
 * 1 <= Z <= D 
 * While counting the number of quadruples, consider the following conditions as same 
 * if the following hold true:
 * 1. They contain same integers
 * 2. Number of times each integer occur in the quadruple is the same
 * 
 * example: 1112 1121
 * 
 * Condtions:
 * 1 <= A,B,C,D <= 3000
 * Example: 1 2 3 4
 * Ans) 11
 * 1112
 * 1113
 * 1114
 * 1123
 * 1124
 * 1134
 * 1222
 * 1223
 * 1224
 * 1233
 * 1234
 * 
 * @author Adithya Balasubramanian
 *
 */
public class BeautifulQuadruples {
	static int count = 0;
	static int equals = 0;
	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//	 static void permute(List<Integer> a, int k) 
//	    {
//		 int result = 0;
//		 List<Integer> tempList = new ArrayList<Integer>();
//	        if (k == a.size()) 
//	        {
//	            for (int i = 0; i < a.size(); i++) 
//	            {
//	            	//if((a.get(i) >= 1)){
//	                System.out.print(" [" + a.get(i) + "] ");
//	                tempList.add(a.get(i));
//	                result ^=a.get(i);
//	            	//}
//	            }
//	            if(result != 0 && tempList != null){
//	            	count++;
//	            	map.put(count, tempList);
//	            	//check this for map
//	            	//http://quiz.geeksforgeeks.org/check-if-two-arrays-are-permutations-of-each-other/
//	            }
//	            System.out.println();
//	        } 
//	        else 
//	        {
//	            for (int i = k; i < a.size(); i++) 
//	            {
//	                int temp = a.get(k);
//	                a.set(k, a.get(i));
//	                a.set(i, temp);
//	 
//	                permute(a, k + 1);
//	 
//	                temp = a.get(k);
//	                a.set(k, a.get(i));
//	                a.set(i, temp);
//	            }
//	        }
//}
	 
	
	static void Rec(List<Integer> digits, int current, int numDigits) {
	    if(numDigits==0){
	        System.out.println(current);
	        if(checkCondition(current)){
	        count++;
	        map.put(count, current);
	        }
	    }
	    else
	        for(int x : digits)
	            Rec(digits, current*10+x, numDigits-1);
	}
	
	static boolean checkCondition(int number){
		int result = 0;
		for(int i =1; i <= 4; i++){
			int pow = (int) Math.pow(10, i);
            int x = (number%pow)/(pow/10);
            result ^= x;
		}
		return result == 1;
	}
	
	 static Boolean arePermutations(int arr1, int arr2)
	    {
	        // Creates an empty hashMap hM
	        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
	 
	        // Traverse through the first array and add elements to hash map
	        for (int i = 1; i <= 4; i++)
	        {
	        	int pow = (int) Math.pow(10, i);
	            int x = (arr1%pow)/(pow/10);
	            if (hM.get(x) == null)
	                hM.put(x, 1);
	            else
	            {
	                int k = hM.get(x);
	                hM.put(x, k+1);
	            }
	        }
	 
	        // Traverse through second array and check if every element is
	        // present in hash map
	        for (int i = 1; i <=4; i++)
	        {
	        	int pow = (int) Math.pow(10, i);
	            int x = (arr2%pow)/(pow/10);
	 
	            // If element is not present in hash map or element
	            // is not present less number of times
	            if (hM.get(x) == null || hM.get(x) == 0)
	                return false;
	 
	            int k = hM.get(x);
	            hM.put(x, k-1);
	        }
	        return true;
	    }
	 
	 static void removeEquals(){
		 for(int i = 1; i <= map.size(); i++){
			 for(int j = i; j <= map.size(); j++){
				 if(i != j && arePermutations(map.get(i), map.get(j))){
					 equals++;
				 }
			 }
		 }
	 }

public static void main(String[] args) {
	List<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	Rec(a, 0, 4);
	removeEquals();
	System.out.println(BeautifulQuadruples.count);
	System.out.println(BeautifulQuadruples.equals);
}
}
