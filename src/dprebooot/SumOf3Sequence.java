package dprebooot;

public class SumOf3Sequence {
	
	public static void main(String[] args) {
		
		int arr[] = {100, 1000, 100, 1000, 1}; 
		int n  = arr.length;
		int res = getSum(arr,n);
		System.out.println("the res"+res);
	}
	
	public static int getSum(int[]arr,int n) {
		int []sum = new int[n];
		if(n>=1) {
			sum[0] = arr[0];
		}
		if(n>=2) {
			sum[1] = arr[0] + arr[1];
					
		}
		if(n>2) {
			sum[2] = Math.max(sum[1],Math.max(arr[0]+arr[2], arr[1]+arr[2]));
		}
		
		for(int i=3;i<n;i++) {
			sum[i] = Math.max(sum[i-1], Math.max(sum[i-2]+arr[i], sum[i-3]+arr[i-1]+arr[i]));
		}
		
		return sum[n-1];
		
	}

}
