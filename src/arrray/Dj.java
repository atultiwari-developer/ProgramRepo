package arrray;

import java.util.HashSet;
import java.util.Stack;

import ds.tree.TNode;

public class Dj {
	
	static HashSet<Integer> hs = new HashSet<>();
	
	public static void main(String[] args) {
		int[]arr = {40, 30, 35, 80, 100};
//		boolean ans = isBST(arr,arr.length);
//		System.out.println("the ans is"+ans);
//	    int in1[] = {67,84,83,90,64}; 
//	    int pre[] = {7,100,91,67,40,87,90,22,21,13}; 
//	    findDupes(in1,pre);
		TNode root1 = new TNode(67);
		//root1.left = new TNode(1);
		root1.right = new TNode(84);
		root1.right.left = new TNode(83);
		root1.right.left.left = new TNode(64);
		root1.right.right = new TNode(90);


		TNode root2 = new TNode(7);
		//root2.left = new TNode(7);
		root2.right = new TNode(100);
		root2.right.left = new TNode(91);
		root2.right.left.left = new TNode(67);
		root2.right.left.left.left = new TNode(40);
		root2.right.left.left.left.left = new TNode(22);
		root2.right.left.left.left.left.left = new TNode(21);
		root2.right.left.left.left.left.left.left = new TNode(13);
		root2.right.left.right = new TNode(87);
		root2.right.left.right.right = new TNode(90);


		findDuplicate(root1,root2);

		
	}
	
	public static void findDuplicate(TNode root1,TNode root2) {
		
		traverseFirst(root1);
		traverseLast(root2);
		
	}
	
	private static void traverseFirst(TNode root1) {
		if(root1 != null) {
			traverseFirst(root1.left);
			hs.add(root1.data);
			traverseFirst(root1.right);			
		}
	}
	private static void traverseLast(TNode root2) {
		if(root2 != null) {
			traverseLast(root2.left);
			if(hs.contains(root2.data)) {
				System.out.print(root2.data+" ");
			}
			traverseLast(root2.right);		

		}
	}

	static void findDupes(int[] a, int[] b) {
	    HashSet<Integer> map = new HashSet<Integer>();
	    for (int i : a)
	        map.add(i);
	    for (int i : b) {
	        if (map.contains(i))
	           System.out.print(i);  
	    }
	}
	
	
	public static boolean isBST(int[]arr,int n) {
		Stack<Integer> s = new Stack<>();
		int root = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<root)
				return false;
			
			while(!s.isEmpty() && s.peek()<arr[i]) {
				root = s.peek();
				s.pop();
			}
			s.push(arr[i]);
		}
		return true;
		
	}

}
