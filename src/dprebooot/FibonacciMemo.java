package dprebooot;

import java.util.Arrays;

public class FibonacciMemo {
	static int[]arr = new int[100];
	public static void main(String[] args) {
		Arrays.fill(arr,-1);
		int res = calFibo(5);
		System.out.println("the res is"+res);
		
	}
	
	
	static int calFibo(int x) {
		if(arr[x]==-1) {
			if(x<=1) {
				return arr[x] = 1;
			}
			return arr[x] = calFibo(x-1)+calFibo(x-2);
		}
		return arr[x];
	}

}
