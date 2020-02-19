package arrray.dp;

import java.util.Arrays;

public class CatalinaNumDp {
	int[]arr = new int[10];

	public static void main(String[] args) {
		CatalinaNumDp obj = new CatalinaNumDp();
		Arrays.fill(obj.arr,-1);
		int n = obj.arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(obj.findCatalinNum(i));
		}
	}

	private int findCatalinNum(int n) {
		// TODO Auto-generated method stub
		if(arr[n] ==-1) {
		
			int res = 0;
		if(n<=1) {
			arr[n] = 1;
			return arr[n];
		}
		
		for(int i=0;i<n;i++) {
		res += findCatalinNum(i)*findCatalinNum(n-i-1);
		}
		arr[n] = res;
		
		}
		return arr[n];
	}

}
