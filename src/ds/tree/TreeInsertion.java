package ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TreeInsertion {
	public TreeNode root;
	public static int high = 0;

	public static void main(String[] args) {
		
		//int[]arr = {2,5,3,7,6,11,9,13,25,17};
		
	//	int[]arr   = {1,2,3,4,5,6,7,8};
		int[]brr = {10,20,30,40,50,60,70,80};
		int[]arr = {1,2,3,4,5};
		int n = arr.length;
		TreeInsertion obj = new TreeInsertion();
		TreeNode root = null;
		TreeNode root1 = null;
		
/*		for(int i=0;i<n;i++) {
		//root = insertBinariTree(root,arr[i]);
		
		root = insertEle(arr[i],root);
			
			//root = myPractice(root,arr[i]);
			//res = obj.insert(res,arr[i]);
		
		}
*/		
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.left.left = new TreeNode(5);
		
		//inorderTraversal(root);
		//IterativePreOrderTra(root);
		//preOrderTraversal(root);
		//preIterativeTrsversa(root);
		//inOrderTrave(root);
		
		//System.out.println("max is"+findMaxItr(root));
		//System.out.println("the value is present"+searchValItr(root,4));
		//System.out.println("the size of the tree"+treeSize(root));
		
		//System.out.println("level order traversal"+levelOrderTraver(root));
		System.out.println("geeks level order traversal");
		
		//levelOrder(root);
		
		System.out.println(postOrderItr(root));
		
//		System.out.println("depth of the tree"+(depthLevel(root)));
//		TreeNode deeepNode = deepestNode(root);
//		System.out.println(deeepNode.getData());
//		int count = eitherLeftOrRight(root);
//		System.out.println("the eitherLeftOrRight node count"+count);
		
//		for(int j=0;j<brr.length;j++) {
//			root1 = insertBinariTree(root1,arr[j]);
//
//		}
//		boolean res = structIdenticalOrNot(root,root1);
//		System.out.println("structurely same or not"+res);
		System.out.println("the hiehgt of the tree is"+heightItr(root));

		
	}
	
	public  static void preOrderTraversal(TreeNode root) {
		
		if(root != null) {
			System.out.print(root.getData()+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
		
	}
	
	public  static void preIterativeTrsversa(TreeNode root){
		
		if(root==null) {
			return;
		}
		Stack<TreeNode> st = new Stack<>();
		st.push(root);
		
		while(!st.isEmpty()) {
			TreeNode temp = st.pop();

			System.out.print(temp.getData()+" ");
			
			if(temp.right != null) {
				st.push(temp.right);
			}
			if(temp.left!=null) {
				st.push(temp.left);

			}
		}
		
		
	}
	
	private static void inorderTraversal(TreeNode root) {
		if(root!=null) {
			inorderTraversal(root.getLeft());

			System.out.print(root.getData()+" ");
			inorderTraversal(root.getRight());

			
		}		
	}
	
	public static void inOrderTrave(TreeNode root) {
		if(root==null)
			return;
		
		Stack<TreeNode> st = new Stack<>();
		boolean done = false;
		TreeNode currentNode  = root;
		
		while(!done) {
			if(currentNode != null) {
				st.push(currentNode);
				currentNode = currentNode.left;
			}
			else {
				if(st.isEmpty()) {
					done = true;
				}
				else {
				currentNode = st.pop();
				System.out.print(currentNode.getData()+" ");
				currentNode = currentNode.right;
				}
			}
		}
		
		
	}
	
	
	public static void IterativePreOrderTra(TreeNode root) {
		
		TreeNode temp  = root;
		
		Stack<TreeNode> st = new Stack<>();
		st.push(temp);
		
		while(!st.isEmpty()) {
			if(temp.left != null) {
				st.push(temp.left);
				temp = temp.left;
			}
			else {
				
				System.out.println(temp.getData());

				if(temp.right != null) {
					st.push(temp.right);
				}
				temp  = temp.right;
	            
			}
		}
		
		
		
	}

	private  static TreeNode insertEle(int data,TreeNode root) {
		TreeNode newNode = new TreeNode(data);

		TreeNode temp  =root;
		if(root==null) {
			root = newNode;
			return root;
		}
		
		else {
			while(temp != null) {
				if(temp.getData() <data) {
					if(temp.getRight() != null) {
						temp = temp.getRight();
					}
					else { 
						temp.right = newNode;
						break;
					}
					
				}
				else {
					if(temp.getLeft() != null) {
						temp = temp.getLeft();

					}
					else {
						temp.left = newNode;
						break;
					}
					

				}
			}
			
		}
		return root;

	}
	
	
	public static TreeNode insertBinariTree(TreeNode root,int data) {
		
		if(root==null) {
			return new TreeNode(data);
		}
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			
			if(temp != null) {
				if(temp.left != null) {
					queue.offer(temp.left);
				}
				else {
					temp.left = new TreeNode(data);
					return root;
				}
				if(temp.right != null) {
					queue.offer(temp.right);
				}
				else {
					temp.right = new TreeNode(data);
					return root;
				}
				
			}
		}
		
		
		return root;
	}
	
	
	public static  TreeNode myPractice(TreeNode root,int data) {
				
//		if(root.left==null) {
//			root.left = new TreeNode(data);
//		}
		TreeNode current = root;
		if(current.left == null) {
			
			current.left = new TreeNode(data);
			return root;
		}
		
		else {
			 myPractice(current.right,data);
		}
		
		if(current.right==null) {
			current.right = new TreeNode(data);
		}
		else {
			 myPractice(current.right,data);

		}
		
		return root;

	}
	
	
/*	public  TreeNode insert(TreeNode root,int data) {
		if(root==null) {
			root = new TreeNode(data);
			return root;
		}
		else {
			return insertHelper(root,data);
		}
		
	}
	
	public TreeNode insertHelper(TreeNode root,int data) {
		
		if(root.getData() >= data) {
			if(root.left==null) {
				 return root.left = new TreeNode(data);
			}
			else {
				return insertHelper(root.right,data);
			}
			
		}
		
		else {
			if(root.right==null) {
				return root.right = new TreeNode(data);
			}
			else {
				 return insertHelper(root.right,data);

			}
		}
		
	}
	*/
	
	public static int findMax(TreeNode root) {
		int max = Integer.MIN_VALUE;
		
		if(root != null) {
			
			int left = findMax(root.left);
			int right = findMax(root.right);
			if(left>right) {
				max = left;
			}
			else {
				max = right;

			}
			if(root.getData()>max) {
				max = root.getData();
			}
		}
		return max;
	}
	
	
	public  static int findMaxItr(TreeNode root) {
		int max = Integer.MIN_VALUE;
		
			if(root==null) {
			return max;
		}
			
		Queue<TreeNode> myQueue = new LinkedList<>();
		myQueue.offer(root);
		
		while(!myQueue.isEmpty()) {
			TreeNode temp = myQueue.poll();
			if(temp != null) {
				if(temp.left != null) {
					myQueue.offer(temp.left);
				}
				if(temp.right != null) {
					myQueue.offer(temp.right);
				}
				if(temp.getData() > max) {
					max = temp.getData();
				}
			}
		}
		return max;
	}
	
	public static boolean searchVal(TreeNode root, int data) {
		
		if(root==null) {
			return false;
		}
		if(root.getData()== data) {
			return true;
		}
		return searchVal(root.left,data)|| searchVal(root.right,data);		
	}
	
	public static boolean searchValItr(TreeNode root,int data) {
		
		if(root == null) {
			return false;
		}
		
		Queue<TreeNode> myQueue = new LinkedList<>();
		myQueue.offer(root);
		while(!myQueue.isEmpty()) {
			TreeNode temp = myQueue.poll();
			
			if(temp != null) {
				if(temp.left != null) {
					myQueue.offer(temp.left);
				}
				if(temp.right != null) {
					myQueue.offer(temp.right);
				}
				
				if(temp.getData()==data) {
					return true;
				}
				
			}
			
		}
		
		
		
		return false;
		
	}
	
	public static List<ArrayList<Integer>> levelOrderTraver(TreeNode root){
		 
		List<ArrayList<Integer>> res = new ArrayList<>();

		if(root==null) {
			return res;
		}
		Queue<TreeNode> myQueue = new LinkedList<>();
		myQueue.offer(root);
		myQueue.offer(null);
		ArrayList<Integer> levelList = new ArrayList<Integer>();
		
		while(!myQueue.isEmpty()) {
			TreeNode temp = myQueue.poll();
			if(temp != null) {
				levelList.add(temp.getData());
			
			if(temp.left != null) {
				myQueue.offer(temp.left);
			}
			if(temp.right != null) {
				myQueue.offer(temp.right);
			}
			
		   }
			else {
				res.add(new ArrayList<>(levelList));
				levelList.clear();
				if(!myQueue.isEmpty()) {
					myQueue.offer(null);
				}
				
				
			}
		}	
		return res;
	}
	
	public static int depthCal(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		
		int left = depthCal(root.left);
		int right = depthCal(root.right);
		return (left>right)?left+1:right+1;
		
	}
	
	public static void postOrderRec(TreeNode root) {
		
		if(root != null) {
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.getData()+" ");

		}
		
	}
	
	public static List<Integer> postOrderItr(TreeNode root){
		
		List<Integer> res = new ArrayList<>();
		
		TreeNode prev = null;
		
		Stack<TreeNode> st = new Stack<>();
	     st.push(root);
	     while(!st.isEmpty()) {
	    	 TreeNode curr = st.peek();
	    	 if(prev==null || prev.left==curr || prev.right==curr) {
	    		 if(curr.left!=null) {
	    			 st.push(curr.left);
	    		 }
	    		 else if(curr.right != null) {
	    			 st.push(curr.right);
	    		 }
	    	 }
	    	 else if(curr.left==prev) {
	    		 if(curr.right != null) {
	    			 st.push(curr.right);
	    		 }
	    	 }
	    	 else {
	    		 res.add(curr.getData());
	    		 st.pop();

	    	 }
	    	 prev = curr;
	     }
		
		return res;
		
	}
	
	public static int depthTreeItr(TreeNode root) {
		
		int maxDepth = 0;
		if(root==null) {
			return maxDepth;
		}
		Stack<TreeNode> st = new Stack<>();
		TreeNode prev = null;
		st.push(root);
		while(!st.isEmpty()) {
			TreeNode temp = st.peek();
			if(prev==null || prev.left==temp || prev.right==temp) {
				if(temp.left!=null) {
					st.push(temp.left);
				}
				else if(temp.right != null) {
					st.push(temp.right);
				}
			}
			else if(temp.left==prev) {
				if(temp.right != null) {
					st.push(temp.right);
				}
			}
			else {
				st.pop();
			}
			prev = temp;
			if(st.size()>maxDepth) {
				maxDepth = st.size();
			}
		}
		
		return maxDepth;
		
	}
	
	public static int depthLevel(TreeNode root) {
		
		if(root==null){
			return 0;
		}		
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.offer(root);
		queue.offer(null);
		int count = 1;
		while(!queue.isEmpty()) {
			TreeNode current = queue.poll();
			if(current != null) {
				if(current.left==null && current.right==null) {
					return count;
				}			
				if(current.left != null) {
					queue.offer(current.left);
				}
				if(current.right != null) {
					queue.offer(current.right);
				}
				
			}
			
			else {
				if(!queue.isEmpty()) {
					count++;
					queue.offer(null);
				}
			}
			
		}
		
		return count;
		
	}
	
	public static TreeNode deepestNode(TreeNode root) {
		if(root==null) {
			return root;
		}
		
		Queue<TreeNode> myQueue = new LinkedList<>();
		myQueue.offer(root);
		TreeNode temp = null;
		while(!myQueue.isEmpty()) {
			temp = myQueue.poll();
			if(temp.left != null){
				myQueue.offer(temp.left);
			}
			if(temp.right != null) {
				myQueue.offer(temp.right);
			}
		}
		
		return temp;
	}
	
	public static int leafNodes(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int count=0;
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			if(temp.left== null && temp.right ==null) {
				count++;
			}
			
			if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
		}
		
		return count;
		
	}
	
	public static int eitherLeftOrRight(TreeNode root) {
		int count = 0;

		if(root==null) {
			return count;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			if((temp.left ==null && temp.right != null) || (temp.right ==null && temp.left != null)) {
				count++;
			}
			if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
		}
		
		
		return count;
	}
	
	// to be continued
	
	
	private static boolean structIdenticalOrNot(TreeNode root1, TreeNode root2) {
		
		if(root1==null && root2==null) {
			return true;
		}
		if(root1==null || root2==null) {
			return false;
		}
		
		return structIdenticalOrNot(root1.left,root2.left) && structIdenticalOrNot(root1.right,root2.right);
	}
	
   public static int height(TreeNode root) {
	    int h = 0;
	   if(root==null) {
		   return 0;
	   }
	   
	   int left = height(root.left);
	   int right = height(root.right);
	   if(left>right) {
		   h = left+1;
	   }
	   else {
		   h = right +1;
	   }
	   
	    return h;
   }
   
   public static int heightItr(TreeNode root) {
	   
	   Queue<TreeNode> queue = new LinkedList<>();
	   int height = 0;
	   if(root==null) {
		   return height;
	   }
	    queue.offer(root);
	    queue.offer(null);
	    
	    while(!queue.isEmpty()) {
	    	TreeNode temp = queue.poll();
	    	if(temp != null) {
		    	if(temp.left != null) {
		    		queue.offer(temp.left);
		    		
		    	}
		    	if(temp.right != null) {
		    		queue.offer(temp.right);
		    	}

	    	}
	    	else {
	    		if(!queue.isEmpty()) {
	    			queue.offer(null);

	    		}
	    		height++;

	    	}
	    }
	   
	   
	   return height;
   }
	
}
