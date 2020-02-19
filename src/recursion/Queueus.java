package recursion;

import java.util.Arrays;

public class Queueus {
	
	public static void main(String[] args) {
		int[]arr = {1,3,5,4,6,9};
		StringBuffer sb  = new StringBuffer();
		
		Arrays.sort(arr);
		int n = arr.length;
		int x;
		boolean ans = false;
		for(int i=0;i<n;) {
			x= arr[i];
			if(!ans) {
				sb.append(x+" ");	
			}
			if((i+1<n)&& x+1==arr[i+1]) {
				ans= true;
				i++;
				continue;
			}
			if(ans) {
				sb.append("-"+arr[i]+" ");
				ans = false;
			}
			i++;
		}
		
		System.out.println(sb);
	}
	

}
