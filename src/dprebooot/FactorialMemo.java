package dprebooot;

import java.util.Arrays;

public class FactorialMemo {
    static int[]arr = new int[100];
	public static void main(String[] args) {
		Arrays.fill(arr,-1);
		System.out.println("the factorial of x is"+calFact(5));
		
		
	}
	
	public static int calFact(int x) {
	     if(arr[x] == -1) {
	 		if(x==0) {
				return arr[x] = 1;
			}
			return arr[x] = calFact(x-1)*x;
 
	     }
	     return arr[x];
	}

}
