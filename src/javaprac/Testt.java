package javaprac;

public class Testt {
	public static void main(String[] args) {
		
		int k = 3;
		int[]arr = {3,6,8,11,14};
		int n = arr.length;
		int []res = getSeries(arr,n,k);
		for(int t=0;t<n;t++) {
			System.out.println(res[t]+" ");
		}
		
		
	}
	
	public static int[] getSeries(int []arr,int n,int k) {
		int[]brr = new int[n];
		int count = 1;
		int x = 0;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if( (j !=n) && (arr[j-1]+k)==arr[j]) {
					count++;
				}
				else {
					brr[x] = count;
					count = 1;
					x++;
					break;
				}
			}
		}
		
		
		return brr;
	}

}
