package dprebooot;

public class MaximumSumBitonic {
	
	public static void main(String[] args) {
		int arr[] = { 1, 15, 51, 45, 33, 100, 12, 18, 9};
		int n = arr.length;
		int[]lisSum = getLisSum(arr,n);
		int[]ldsSum = getLdsSum(arr,n);
		int maxValue = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			maxValue = Math.max(maxValue, lisSum[i]+ldsSum[i]-arr[i]) ;
		}
		System.out.println("the sum is"+maxValue);
		
	}
	
	public static  int[] getLisSum(int[]arr,int n){
		
		int[]lis = new int[n];
		for(int i=0;i<arr.length;i++) {
			lis[i] = arr[i];
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j] && lis[i]<lis[j]+arr[i]) {
					lis[i]=lis[j]+arr[i];
				}
			}
		}
		return lis;
	}
	
	public static int[] getLdsSum(int[]arr,int n){
		int[]lds = new int[n];
		for(int i=0;i<arr.length;i++) {
			lds[i] = arr[i];
		}
		
		for(int i=n-2;i>=0;i--) {
			for(int j=n-1;j>i;j--) {
				if(arr[i]>arr[j] && lds[i]<lds[j]+arr[i]) {
					lds[i]=lds[j]+arr[i];
				}
			}
		}
		return lds;

	}


}
