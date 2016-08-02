package bitManipulation;

public class BitWiseShiftOperators {
public static void main(String[] args) {
	int i = 1; //10
	System.out.println(">> operator:" + (i>>1)); //01 = 1
	System.out.println("<< operator:"+ (i << 1)); // 100 = 4
	System.out.println(">>> operator:" + (i >>> 1)); //01 = 1
	//System.out.println("<<< operator:" + (i <<< 1)); //<<< doesnt exist
	
}
}
