package atul;

public class ArrangeIndex {
	
	public static void main(String[] args) {
//		int arr[] = {10,11,12};
//		int[]index = {1,0,2};
		
		int[]arr=  {50, 40, 70, 60, 90};
		int[]index = {3,  0,  4,  1,  2};
		int n = arr.length;
		int[]temp = new int[n];
		
		for(int i=0;i<n;i++) {
			temp[index[i]] = arr[i];
		}
		
		for(int i=0;i<n;i++) {
			arr[i] = temp[i];
			index[i] = i;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		}

	
	}


