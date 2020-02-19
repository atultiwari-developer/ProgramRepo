package dprebooot;

import java.util.Arrays;

public class FactTabu {
	static int arr[] = new int[100];
	public static void main(String[] args) {
		Arrays.fill(arr, -1);
		arr[0] = 1;
		arr[1] = 1;

		int res = calFact(5);
		System.out.println("the result is"+res);
		
		
		
	}
	public static int calFact(int x) {
		for(int i=1;i<=x;i++) {
			arr[i] = i*arr[i-1];
		}
		return arr[x];
	}

}
