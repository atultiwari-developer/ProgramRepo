package ds.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Array1 {
	static int preIndex = 0;
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		int[]arr = {1,-3,2,3,6,-1};
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
		}
			
		   StringBuffer sb = new StringBuffer();
			Map<Integer,Integer> map = new TreeMap<>();
			for(int i=0;i<al.size();i++) {
				int key = Math.abs(al.get(i));
		     if(!map.containsKey(key)) {
		    	 map.put(key, 1);
		     }
		     else {
		    	 map.put(key, map.get(key)+1);
		     }
			}
			
			for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
				if(entry.getValue()>=2) {
					int key = -entry.getKey();
					if(al.contains(key)) {
						sb.append(key+" "+entry.getKey()+" ");
					}
				}
			}
			if(sb.length()==0) {
			System.out.println(0);
			}
			else
			System.out.println(sb);


				
	
	}

		
		

	

	private static void printPostOrder(int[] in1, int[] pre, int n) {
		// TODO Auto-generated method stub
	    int root = search(in1, pre[0], n); 
	//    printInOrder(pre);
	//    System.out.println();
	    
	//	  printInOrder(in1);
	//	    System.out.println();

	    // If left subtree is not empty, 
	    // print left subtree 
	    if (root != 0) 
	        printPostOrder(in1, Arrays.copyOfRange(pre, 1, n), root); 
	    if (root != n - 1) 
	        printPostOrder(Arrays.copyOfRange(in1, root+1, n), 
	            Arrays.copyOfRange(pre, 1+root, n), n - root - 1); 
	    System.out.print( pre[0] + " "); 

	}
	
	private static void printInOrder(int[] pre) {
		for(int i=0;i<pre.length;i++){
			System.out.print(pre[i]+" ");
		}
		
		
	}

	public static int search(int[]in1,int x,int n) {
		
		for(int i=0;i<n;i++) {
			if(in1[i]==x) {
				return i;
			}
		}
		return -1;
	} 
	
	public static void printPostOrder2(int[]in,int[] pre,int start,int end) {
		if(start>end) {
			return;
		}
		int index = search1(in,start,end,pre[preIndex++]);
		printPostOrder2(in,pre,start,index-1);
		printPostOrder2(in,pre,index+1,end);
        System.out.print(in[index]+" ");
		
	}

	private static int search1(int[] in, int start, int end, int x) {
		int i=0;
		for(i=start;i<end;i++) {
			if(in[i]==x) {
				return i;
			}
		}
		return i;
	}

}
