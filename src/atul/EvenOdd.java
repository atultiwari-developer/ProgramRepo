package atul;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		int[]arr= {0,1,2,3,4,5,6,7,8};
		
		int n  =arr.length;
		for(int index=0;index<n;index++) {
			if((index & 0x01)==0) {
				System.out.println(index);
			}
		}

		
	}
	

}
