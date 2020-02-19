package ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class KSumPath {
	static int sumCount = 0;
	public static void main(String[] args) {
		TNode root = new TNode(5);
		root.left = new TNode(-10);
		root.right = new TNode(3);
		root.left.left = new TNode(9);
		root.left.right = new TNode(8);
		root.right.left = new TNode(-4);
		root.right.right = new TNode(7);
		//int sum = nodeSum(root);
		//System.out.println(sum);
		int x = 7;
		int y = countSubtreesWithSumX(root,x);
        System.out.println(y);
//		int count = printKSumPath(root);
//		System.out.println(count);
	}

	private static int printKSumPath(TNode root) {
		int count = 0;
		if(root==null) {
			return 0;
		}
		Queue<TNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TNode temp = queue.poll();
			int sum = 0;
			int k= 4;
			hasSumPath(temp,sum,k);
			count = count+sumCount;			
			if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
			sumCount = 0;
		}
		
		
		return count;
	}

	private static void hasSumPath(TNode node,int sum,int k) {
		if(node==null) {
			return;
		}
		sum = sum + node.data;
		if(sum==k) {
			sumCount++;
		}
		hasSumPath(node.left,sum,k);
		hasSumPath(node.right,sum,k);
		sum = sum-node.data;
	}
	public static  int nodeSum(TNode root) {
		if(root==null)
			return 0;
		return root.data+nodeSum(root.left)+nodeSum(root.right);
	}
	
	
	 public static int countSubtreesWithSumX(TNode root, int x)
	    {
	      if(root==null)
	       return 0;
	       Queue<TNode> queue = new LinkedList<>();
	       queue.offer(root);
	       int count = 0;
	       while(!queue.isEmpty()){
	           TNode temp = queue.poll();
	           int sum = nodeSum(temp);
	          
	           if(sum==x){
	               count++;
	           }
	           if(temp.left != null){
	               queue.offer(temp.left);
	           }
	           if(temp.right != null){
	               queue.offer(temp.right);
	           }
	       }
	       if(count>0)
	       return count-1;
	       return count;
	    }
	 
	

}
