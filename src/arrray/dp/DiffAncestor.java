package arrray.dp;

import java.util.concurrent.atomic.AtomicInteger;

public class DiffAncestor {
	static int diff = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Node root = new Node(6);
		root.left = new Node(3);
		root.right = new Node(8);
		root.right.left = new Node(2);
		root.right.right = new Node(4);
		root.right.left.left = new Node(1);
		root.right.left.right = new Node(7);

		//System.out.print(maxDifference(root));
		//System.out.println(diff);
		
		System.out.println(maxAncestorDiff(root));
		
		
		
	}
	
	   public static int maxAncestorDiff(Node root) {
	        if(root == null){
	            return 0;
	        }
	        return helper(root, root.data, root.data);
	    }
	   static  int helper(Node root, int min, int max){
	        int gap = Math.abs(min-max);
	        if(root == null){
	            return gap;
	        }
	        
	        min = Math.min(min, root.data);
	        max = Math.max(max, root.data);
	        
	        int newMax = Math.max(helper(root.left, min, max), helper(root.right, min, max));
	        
	        return Math.max(gap, newMax);
	    }
	
	
	public static int maxDifference(Node root, int diff)
	{
		// base case: if tree is empty, return infinity
		if (root == null) {
			return Integer.MAX_VALUE;
		}

		// recur for left and right subtree
		int left = maxDifference(root.left, diff);
		int right = maxDifference(root.right, diff);

		// find maximum difference between current node and its descendants
		int d = root.data - Math.min(left, right);

		// update the maximum difference found so far if required
		diff = Math.max(diff, d);

		// in order for difference to be maximum, the function should return
		// minimum value among all nodes in sub-tree rooted at it
		return Math.min(Math.min(left, right), root.data);
	}

	// Find maximum difference between a node and its descendants in a binary tree
	public static int maxDifference(Node root)
	{
		// Using AtomicBoolean as Integer is passed by value in Java
		//AtomicInteger diff = new AtomicInteger(Integer.MIN_VALUE);
		System.out.println(maxDifference(root, diff));

		return diff;
	}


}
