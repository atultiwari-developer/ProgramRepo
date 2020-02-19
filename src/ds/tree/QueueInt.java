package ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInt {

	public static void main(String[] args) {
		
		TreeNode root = null;
//		root = new TreeNode(1);
//		root.right = new TreeNode(2);
//		root.right.right = new TreeNode(4);
//		root.right.right.right = new TreeNode(5);
//		root.right.right.right.right = new TreeNode(6);
//		root.right.right.right.right.right = new TreeNode(7);
//		root.right.right.right.right.left = new TreeNode(8);
		
		root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.right = new TreeNode(60);

		
		leftView(root);
		
//		System.out.print(root.getData()+" ");
//		leftBoundryTra(root.left);
//		printLeaf(root);
//		rightBoundryTra(root.right);
	}
	
	public static void leftBoundryTra(TreeNode root) {
		
		if(root != null) {
			if(root.left != null) {
				System.out.print(root.getData()+" ");
				leftBoundryTra(root.left);
			}
			else if(root.right != null){
				System.out.print(root.getData()+" ");
				leftBoundryTra(root.right);

			}
		}
		
	}
	
	public static void rightBoundryTra(TreeNode root) {
		if(root != null) {
			if(root.right != null) {
				rightBoundryTra(root.right);
				System.out.print(root.getData()+" ");
			}
			else if(root.left != null) {
				rightBoundryTra(root.left);
				System.out.println(root.getData()+" ");


			}
		}
	}
	
	public static  void printLeaf(TreeNode root) {
		
		if(root != null) {
			printLeaf(root.left);
			if(root.left == null && root.right==null) {
				System.out.print(root.getData()+" ");
			}
			printLeaf(root.right);
		}
	}
	
	
  public static void leftView(TreeNode root)
    {
      if(root==null)
      return;
      
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);
      queue.offer(null);
      boolean flg = true;
      while(!queue.isEmpty()){
    	  TreeNode temp = queue.poll();
          if(temp != null){
            if(flg){
              System.out.print(temp.getData()+" ");
          }
          if(temp.left != null){
              queue.offer(temp.left);
          }
          if(temp.right != null){
              queue.offer(temp.right);
          }
          flg = false;
  
          }
          else{
              if(!queue.isEmpty()){
                  queue.offer(null);
                  flg = true;
              }
          }
      }
      
    }

	
	
	
		
}
