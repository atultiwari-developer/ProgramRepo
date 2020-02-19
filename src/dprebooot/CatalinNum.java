package dprebooot;

public class CatalinNum {
	public static void main(String[] args) {
	
		int x = 5;
		
		System.out.println("the catalin number is"+getCatalinNum(x));
	}
	public static int getCatalinNum(int x){
		
		int[]arr = new int[x+2];
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2;i<=x;i++) {
			arr[i] = 0;
			for(int j=0;j<i;j++) {
				arr[i] += arr[j]*arr[i-j-1];
			}
		}
		return arr[x];
	}

}
