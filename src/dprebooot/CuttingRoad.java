package dprebooot;

public class CuttingRoad {
	
	public static void main(String[] args) {
	    int arr[] = {1, 5, 8, 9, 10, 17, 17, 20}; 
            int x =  getMaxProft(arr,arr.length);
            System.out.println("the value of x"+x);
	}

	private static int getMaxProft(int[] arr, int length) {
	     if(length<=0)
	    	 return 0;
	     int maxProfit = Integer.MIN_VALUE;

	     
	     for(int i=0;i<length;i++) {
	    	 maxProfit = Math.max(maxProfit, arr[i]+getMaxProft(arr,length-i-1));
	     }
		return maxProfit;
	}

}
