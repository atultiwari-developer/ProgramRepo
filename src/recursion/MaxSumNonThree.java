package recursion;

public class MaxSumNonThree {
	
	public static void main(String[] args) {
		int arr[] = {3000, 2000, 1000, 3, 10};
		int n = arr.length;
		
		int res = MaxSumInc(arr,n);
		System.out.println("the result is"+res);
	}
	
	public static int MaxSumInc(int[]arr,int n) {
	   int[]sum = new int[n];
	   if(n>=1) {
		   sum[0] = arr[0];
	   }
	    if(n>=2) {
		   sum[1] = arr[0] + arr[1];
	   }
	    if(n>2) {
	    	sum[2] = Math.max(sum[1],Math.max(arr[0]+arr[2],arr[1]+arr[2]));
	    }
	    for(int i=3;i<n;i++) {
	    	sum[i] = Math.max(Math.max(sum[i-1],sum[i-2]+arr[i]),arr[i]+arr[i-1]+sum[i-3]);
	    }
	    
	    return sum[n-1];
	}

}
