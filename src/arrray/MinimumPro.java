package arrray;

import java.util.PriorityQueue;

public class MinimumPro {
	
	public static void main(String[] args) {
		int[]arr = {11,8,5,7,5,100};
		int k = 4;
		System.out.println(product(arr,k));
	}
	
	public static int product(int[]arr,int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			pq.offer(arr[i]);
		}
		
		int pro = 1;
		int i=1;
		while(!pq.isEmpty() && i<=k) {
			pro = pro*pq.poll();
			i++;
	
		}
		
		return pro;
	}

}
