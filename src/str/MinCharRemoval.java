package str;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinCharRemoval {	
	public static int minValue(String str,int k) {
		 int l = str.length();
		 if(k>=l) {
			return 0; 
		 }
		
		 int[]arr = new int[26];
		 
		 for(int i=0;i<l;i++) {
			 arr[str.charAt(i)-'a']++;
		 }
		 
	       // Comparator<Integer> c = new IntCom(); 
	        
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder()); 
	        
	        for(int i=0;i<26;i++) {
	        	if(arr[i] != 0) {
	        		pq.add(arr[i]);
	        	}
	        }
	        
	        while(k>0) {
	        	int temp = pq.peek();
	        	temp = temp-1;
	        	pq.poll();
	        	pq.add(temp);
	        	k--;
	        }
	        
	        int res = 0;
	        while(!pq.isEmpty()) {
	        	int temp = pq.peek();
	        	res = res + temp*temp;
	        	pq.poll();
	        }

		 
		
		return res;
		
	}
	
	public static void main(String[] args) {
		
		String str = "abccc";
		int k = 1;
		System.out.println(minValue(str,k));

		
	}

}
