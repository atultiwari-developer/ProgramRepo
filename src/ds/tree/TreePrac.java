package ds.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreePrac {
	static int level= 0;
	public static void main(String[] args) {
		TNode root = new TNode(10);
		root.left = new TNode(20);
		root.right = new TNode(30);
		
//		root.left.left = new TNode(4);
//		root.left.right = new TNode(5);
		//int level = 0;
		root.left.left = new TNode(40);
		root.left.right = new TNode(60);
		System.out.println(check(root));
		//System.out.println(isCousin(root,4,5));
		
	}
	
	public static int calcLevle(TNode root,int key) {
		return nodeLevelUtil(root,key,1);
	}
	public static void inOrderTra(TNode root){
		if(root != null) {
			inOrderTra(root.left);
			System.out.print(root.data+" ");
			inOrderTra(root.right);
			
		}
	}

	private static int nodeLevelUtil(TNode root, int key, int level) {
		
		if(root==null) {
			return 0;
		}
		if(root.data==key) {
			return level;
		}
		int dleft = nodeLevelUtil(root.left,key,level+1);
		if(dleft != 0) {
			return dleft;
		}
		dleft = nodeLevelUtil(root.right,key,level+1);
		
		return dleft;
	}
	
	public int myLevelCal(TNode root,int key) {
		if(root==null)
			return 0;
		else {
			return myLevelUtill(root,key,1);
		}
	}

	private int myLevelUtill(TNode root, int key, int level) {
		
		if(root==null)
			return 0;
		if(root.data==key)
			return level;
		int x = myLevelUtill(root.left,key,level+1);
		if(x != 0)
			return x;
		x = myLevelUtill(root.right,key,level+1);		
		return x;
	}
	
	public static  Stack<Integer> getPath(TNode root,int data){
		if(root==null) {
			return null;
		}
		Stack<Integer> s = new Stack<Integer>();
		getPathUtil(root,data,s);
			return s;
		
	}

	private static boolean getPathUtil(TNode root, int data, Stack<Integer> s) {
		
		if(root==null) {
			return false;
		}
		s.push(root.data);
		if(root.data==data) {
			return true;
		}
		
		  if(getPathUtil( root.left,data,s)) {
			  return true;
		  }
		  if(getPathUtil( root.right,data,s)) {
			return true;
		}
	
		s.pop();
		return false;
	}
	
	static int getLevel(TNode root, TNode node, int level)  
	{  
	    // base cases  
	    if (root == null)  
	        return 0;  
	    if (root.data == node.data)  
	        return level;  
	  
	    // If node is present in left subtree  
	    int downlevel = getLevel(root.left, node, level+1);  
	    if (downlevel != 0)  
	        return downlevel;  
	  
	    // If node is not present in left subtree  
	    return getLevel(root.right, node, level+1);  
	} 
	
	static void printGivenLevel(TNode root, TNode node, int level)  
	{  
	    // Base cases  
	    if (root == null || level < 2)  
	        return;  
	  
	    // If current node is parent of a node with  
	    // given level  
	    if (level == 2)  
	    {  
	        if (root.left.data == node.data || root.right.data == node.data)  
	            return;  
	        if (root.left != null)  
	        System.out.print(root.left.data + " ");  
	        if (root.right != null)  
	        System.out.print(root.right.data + " ");  
	    }  
	  
	    // Recur for left and right subtrees  
	    else if (level > 2)  
	    {  
	        printGivenLevel(root.left, node, level-1);  
	        printGivenLevel(root.right, node, level-1);  
	    }  
	}  

	static void printCousins(TNode root, TNode node)  
	{  
	    // Get level of given node  
	    int level = getLevel(root, node, 1);  
	  
	    // Print nodes of given level.  
	    printGivenLevel(root, node, level);  
	}  
	  
	public static TNode deleteNode(TNode root,int data) {
		if(root==null) {
			return null;
		}
		if(root.left==null && root.right==null) {
			if(root.data==data)
				root = null;
			else return root;
		}
		
		TNode keyNode=null;
		TNode temp = root;
		Queue<TNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			temp = queue.poll();
			if(temp.data==data) {
				keyNode = temp;
			}
			if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
				
		}
		if(keyNode != null) {
			int x = temp.data;
			deleteDeepestNode(root,temp.data);
			keyNode.data = x;
		}
		
		return root;
		
	}

	private static void deleteDeepestNode(TNode root, int data) {
		Queue<TNode> queue = new LinkedList<>();
		queue.offer(root);
		TNode temp = null;
		while(!queue.isEmpty()) {
			temp = queue.poll();
			if(temp.data==data) {
				temp = null;
				return;
			}
			if(temp.left != null) {
				if(temp.left.data==data) {
					temp.left = null;
					return;
				}
				else
					queue.offer(temp.left);
			}
			
			if(temp.right != null) {
				if(temp.right.data==data) {
					temp.right = null;
					return;
				}
				else
					queue.offer(temp.right);
			}
			
		}		
		
	}
	
	
	public static Stack<Integer> getPath1(TNode root,int data){
		if(root==null)
			return null;
		Stack<Integer> s = new Stack<Integer>();
		int x = getPathUtil1(root,s,data);
		return s;
	}
	
	public static int getPathUtil1(TNode root,Stack<Integer> s,int data) {
		
		if(root==null) {
			return 0;
		}
		s.push(root.data);

		if(root.data==data){
			return 1;
		}
	   if(getPathUtil1(root.left,s,data)==1) {
		   return 1;
	   }
	if(getPathUtil1(root.right,s,data)==1) {
		return 1;
	}
		s.pop();
		return 0;
	}
	
	
	
	public static boolean isCousin(TNode root,int x,int y) {
		if(root==null) {
			return false;
		}
		int firstFounndLevel = 0;
		boolean firstFound = false;
		boolean lastFound = false;
		Queue<TNode> queue = new LinkedList<>();
		queue.offer(root);
		queue.offer(null);
		boolean res =false;
		int currentLevel= 0;
		while(!queue.isEmpty()) {
			TNode temp  = queue.poll();
			if(temp != null) {
			if(temp.left != null && temp.right != null) {
				if((temp.left.data==x&& temp.right.data==y)||
						(temp.left.data==y && temp.right.data==x)){
					res = false;
					break;
				}
			}
			if(temp.left != null) {
				if(firstFound==false && temp.left.data==x && firstFounndLevel==currentLevel) {
					firstFound = true;
				}
				else if(lastFound==false && temp.left.data==y && firstFounndLevel==currentLevel) {
					lastFound = true;
				}
               queue.offer(temp.left);
			}
			if(temp.right != null) {
				if(firstFound==false && temp.right.data==x && firstFounndLevel==currentLevel) {
					firstFound = true;
				}
				else if(lastFound==false && temp.right.data==y && firstFounndLevel==currentLevel) {
					lastFound = true;
				}
               queue.offer(temp.right);
			}
			if(firstFound==true && lastFound==true) {
				res = true;
				break;
			}
			else if((firstFound==true && firstFounndLevel!=currentLevel) || (lastFound==true && firstFounndLevel!=currentLevel)) {
				res = false;
				break;
			}
			}else {
				if(!queue.isEmpty()) {
					queue.offer(null);
				}
				if(firstFound==false && lastFound==false) {
					firstFounndLevel++;
				}
				currentLevel++;
			}
			
		}
		return res;
	}
	
   public static boolean check(TNode root)
    {
	if(root==null){
	    return  false;
	}
	
	boolean res = true;
	boolean leafFound = false;
	
	Queue<TNode> queue = new LinkedList<>();
	queue.offer(root);
	queue.offer(null);
	while(!queue.isEmpty()){
	    TNode temp = queue.poll();
	    if(temp != null){
	        if(temp.left==null && temp.right==null){
	            leafFound = true;
	        }
	        if(temp.left != null){
	            queue.offer(temp.left);
	        }
	        if(temp.right != null){
	            queue.offer(temp.right);
	        }
	    }
	    else{
	        if(!queue.isEmpty() &&  leafFound==false){
	            queue.offer(null);
	        }
	        else if(!queue.isEmpty() && leafFound==true){
	            res = false;
	            break;
	        }
	    }

    }
    return res;
    }
	
	
	
	
	

}
