package arrray.dp;

import java.util.Arrays;

public class Memoization {
	int[]arr = new int[100];
     
	public static void main(String[] args) {
		 Memoization obj = new Memoization();
		 Arrays.fill(obj.arr,-1);
		 int n = 40;
		int x =  obj.fibonacci(n);
		System.out.println(x);
	}

	private int fibonacci(int n) {
		if(arr[n]==-1) {
		if(n<=1) {
			arr[n] = n;
		}
		else {
			arr[n] = fibonacci(n-1) + fibonacci(n-2);
		}
		}
		return arr[n];
	}
	


}
