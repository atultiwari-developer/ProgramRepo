package arrray;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue1 {
	
	public static void main(String[] args) {
		int[]arr = {4,3,5,8,6,11,9,7};
		int n = arr.length;
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++) {
			pq1.offer(arr[i]);
		}
		while(!pq1.isEmpty()) {
			System.out.print(pq1.poll()+" ");
		}
		
		
	}

}
