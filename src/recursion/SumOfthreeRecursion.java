package recursion;

import java.util.Arrays;

public class SumOfthreeRecursion {
	static int arr[] = {100, 1000, 100, 1000, 1};  
    static int sum[]= new int[10000];
	public static void main(String[] args) {
		
		int n  = arr.length;
		Arrays.fill(sum, -1);
		int res = getSum(n);
		System.out.println("the res"+res);
		
	}
	
	public static int getSum(int n) {
		if(sum[n]!=-1) {
			return sum[n];
		}
		if(n==0) {
			return sum[n] = 0;
		}
		if(n==1) {
			return sum[n] = arr[0];
		}
		if(n==2) {
			return sum[n] = arr[1]+arr[0];

		}
		return sum[n]= Math.max(getSum(n-1), Math.max(getSum(n-2)+arr[n-1],getSum(n-3)+arr[n-1]+arr[n-2]));
		
	}

}
