package dprebooot;

import java.util.Arrays;
import java.util.ArrayList;

public class LISPrint {
	
	public static void main(String[] args) {
		//int []arr = {3,10,1,2,20};
		int[]arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
		//int[]arr= {0,4,12,2,10,6,9,13,3,11,7,15};
		int n = arr.length;
		System.out.println("the length of LIS"+printLis(arr,n));
		
	}
	public static int getLisLenght(int []arr,int n){
		
		int[]len = new int[n];
		Arrays.fill(len, 1);
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					len[i] = Math.max(len[i], 1+len[j]);
				}
			}
		}
		
		int maxLen = len[0];
		
		for(int x=1;x<n;x++) {
			if(maxLen<len[x]) {
				maxLen = len[x];
			}
		}
		
		return maxLen;		
	}
	
	public  static ArrayList<Integer> printLis(int []arr,int n){
		ArrayList<Integer> res = new ArrayList<>();
		
		int[]len = new int[n];
		int[]seq = new int[n];
		Arrays.fill(len, 1);
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i] && len[i]<= 1+len[j]) {
					//len[i] = Math.max(len[i], 1+len[j]);
					len[i] = 1+len[j];
					seq[i] = j;
				}
			}
		}
		
		
		
		int maxLen = len[0];
		int index = 0;
		for(int x=1;x<n;x++) {
			if(maxLen<len[x]) {
				maxLen = len[x];
				index = x;
			}
		}
		
		int[]indexArr = new int [maxLen];
		indexArr[0]= index;
        int y = 1;
        int z = Integer.MIN_VALUE;
        int a = Integer.MIN_VALUE;
		for(int i=1;i<maxLen;i++) {
			z = seq[index];
			indexArr[y] = z;
			index = z;
			y++;
		}
		
		for(int s = maxLen-1;s>=0;s--) {
			res.add(arr[indexArr[s]]);
		}
		return res;
	}

}
