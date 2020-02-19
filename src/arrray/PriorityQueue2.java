package arrray;

public class PriorityQueue2 {
	
	public static void main(String[] args) {
        int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
        int n = arr.length;
        int k = 3;
        int x = KthSmallest(arr,0,arr.length-1,k);
        System.out.println("the value os x"+x);

	}
	
	public static int KthSmallest(int []arr,int l,int r, int k) {
		
		if(k>0 && k <= r-l+1) {
			int pos = partition(arr,l,r);
			
	          if (pos-l == k-1) 
	                return arr[pos]; 
	              
	            // If position is more, recur for 
	            // left subarray 
	            if (pos-l > k-1)  
	                return KthSmallest(arr, l, pos-1, k); 
	  
	            // Else recur for right subarray 
	            return KthSmallest(arr, pos+1, r, k-pos+l-1); 	            	  			
			
		}
		
        return Integer.MAX_VALUE; 

		
		
	}
	
	public static int partition(int[]arr,int l,int r) {
		
		int x = arr[r];
		int i = l;
		for(int j=l;j<=r-1;j++) {
			if(arr[j]<=x) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		
		int temp1 = arr[r];
		arr[r] = arr[i];
		arr[i] = temp1;
		return i;
		
	}

}
