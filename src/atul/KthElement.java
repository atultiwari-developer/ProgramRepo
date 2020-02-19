package atul;

import java.util.PriorityQueue;

public class KthElement {
	
	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		int n = arr.length;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0;i<n;i++) {
			pq.offer(arr[i]);
		}
		int j=1;
		while(j<k) {
			pq.poll();
			j++;
		}	
		System.out.println(pq.peek());

	}

}
