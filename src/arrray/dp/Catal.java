package arrray.dp;

public class Catal {
	static int[]arr;
	public static void main(String[] args) {
		int x=5;
		arr = new int[x+1];
		arr[0] = 1;
		arr[1] = 1;
		int res = getCatal(x);
		System.out.println("the number is"+res);
	}
	
	public static  int getCatal(int x) {
		
		for(int i=2;i<=x;i++) {
			arr[i]= 0;
			for(int j=0;j<i;j++) {
				arr[i]+=arr[j]*arr[i-j-1];
			}
		}
		return arr[x];
	}
	

}
