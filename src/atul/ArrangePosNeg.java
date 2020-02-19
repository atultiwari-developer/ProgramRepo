package atul;

public class ArrangePosNeg {
	
	public static void main(String[] args) {
		int[]arr = {1,2,3,-4,-1,4};
		
		int n = arr.length;
		rearrange(arr,n);
		System.out.println("after arrangement");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void rearrange(int[]arr,int n) {
		
		
		int outplace = -1;
		
		for(int i=0;i<n;i++) {
		
		if(outplace>=0) {
			if((arr[i]>=0 && arr[outplace] <0) ||(arr[i] <0 && arr[outplace] >=0)) {
				rightRotate(arr,n,outplace,i);
				if(i-outplace>2) {
					outplace+=2;
				}
				else
					outplace = -1;
				
			}
			
			
			
		}
		if(outplace==-1) {
			if((arr[i]>=0 && i%2==0) || (arr[i]<0 && i%2==1)) {
				outplace = i;
			}
		}
		
		}
		
	}

	private static void rightRotate(int[] arr, int n, int outplace, int i) {
		
		int temp = arr[i];
		for(int j=i;j>outplace;j--) {
			arr[j] = arr[j-1];
		}
		arr[outplace] = temp;
		
		
	}

}
