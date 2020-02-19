package arrray;

public class LargestThre {
	public static void main(String[] args) {
		int[]arr = {10, 4, 3, 50, 23, 90};
		int n = arr.length;
		printLarThree(arr,n);
		
	}
	
	public static void printLarThree(int[]arr,int n) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			int x = arr[i];
			if(x>first) {
				third  = second;
				second = first;
				first = x;
			}
			
			else if(x>second) {
				third = second;
				second = x;
			}
			
			else if(x>third) {
				third = x;
			}
		}
		
		System.out.println("first ele is"+first);
		System.out.println("second ele is"+second);
		System.out.println("first ele is"+third);
	}
	
	

}
