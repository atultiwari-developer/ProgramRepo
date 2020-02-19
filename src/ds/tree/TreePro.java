package ds.tree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
public class TreePro {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		TreeNode root = null;
		//int[]arr = {1,2,3,4,5,6,7};
		//int n = arr.length;
		
//		for(int i=0;i<arr.length;i++) {
//			root = insertBinary(root,arr[i]);
	
//		}
		
	/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test>0){
		    String line = br.readLine();
		    String[]str = line.trim().split("\\s+");
		    int n = str.length;
		    TreeNode root = null;
		    root = constructBst(str,0,n-1);
		    preOrderTra(root);
		    
		    test--;
		    
		}
	*/
		
		
		
		
	//	root = constructBst(arr,0,n-1);

		root = new TreeNode(87);
		root.left = new TreeNode(20);
		root.right = new TreeNode(96);
		
		root.left.left = new TreeNode(17);
		root.left.right = new TreeNode(58);
		root.left.right.left = new TreeNode(32);
		root.left.right.right = new TreeNode(64);
		root.left.right.left.right = new TreeNode(47);
		root.left.right.left.right.right = new TreeNode(55);


		
		inOrderTra(root);
		System.out.println();
		delete(root,20);
		inOrderTra(root);

		
		//printKdistance(root,2);
//		root.left.right.left = new TreeNode(6);
//		root.left.right.right = new TreeNode(7);
//		
//		root.right.right = new TreeNode(8);
//		root.right.right.right = new TreeNode(9);
		
		/*	root.right.right.right.left = new TreeNode(10);
		root.right.right.right.right = new TreeNode(11);
		root.right.right.right.left.left = new TreeNode(12);
		root.right.right.right.left.right = new TreeNode(13);

		
*/		
		
	//	int res = isSum(root);
		
	//	System.out.println("the res is"+res);
		
		//System.out.println("the final diameter"+diameter(root));
		
		
		
		//preOrderTra(root);
		
		
	}
	
	
	public static void  inOrderTra(TreeNode root) {
		
		if(root != null) {
			inOrderTra(root.left);
			System.out.print(root.getData()+" ");
			inOrderTra(root.right);
		}
		
	}
	public static TreeNode insertBinary(TreeNode root,int data) {
		
		TreeNode temp  =root;
		if(temp ==null) {
			root = new TreeNode(data);
			return root;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(temp);
		while(!queue.isEmpty()) {
			temp  = queue.poll();
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
	
	public static void preOrderTra(TreeNode root) {
		if(root != null) {
		System.out.print(root.getData()+" ");
		preOrderTra(root.left);
		preOrderTra(root.right);
		
		}
		
	}
	
    public static int isSumProperty(TreeNode node)
    {
        int res = 1;
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return node.getData();
        }
        
        int left = isSumProperty(node.left);
        int right = isSumProperty(node.right);
        if(left+right==node.getData()){
            return node.getData();
        }
        else{
            res =  0;
        }
       return res; 
    }
    
    public static int isSum(TreeNode root) {
    	
    	if(root==null) {
    		return 0;
    	}
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.offer(root);
    	int res = 0;
    	while(!queue.isEmpty()) {
    		TreeNode temp = queue.poll();
    		int left = 0;
    		int right = 0;
    		if(temp != null) {
    			if(temp.left!= null) {
    				left = temp.left.getData();
    				queue.offer(temp.getLeft());
    			}
    			if(temp.right != null) {
    				right = temp.right.getData();
    				queue.offer(temp.right);
    			}
    			if(temp.left==null && temp.right==null) {
    				continue;
    			}
    			if(left+right==temp.getData()) {
    				res = 1;
    			}
    			else {
    				res = 0;
    				break;
    			}
    		}
    		
    	}
   	
    	
    	return res;
    	
    }
    
    public static int height(TreeNode root) {
    	
    	if(root==null) {
    		return 0;
    	}
    	
    	int high = 0;
    	Queue<TreeNode> queue = new LinkedList<>();
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
    			high++;
    		}
    		
    	}
    	
    	return high++;    	
    }
    
    public static int diameter(TreeNode root) {
    	if(root==null)
    		return 0;
    	int leftHeight = height(root.left);
    	int rightHeight = height(root.right);
    	
    	int leftdiameter = diameter(root.left);
    	int rightDiaMeter = diameter(root.right);
    	
    	int fianldia = Math.max(leftHeight + rightHeight +1, Math.max(leftdiameter, rightDiaMeter));
    	
    	
    	return fianldia;
    }

   public static TreeNode constructBst(String[]arr,int start,int end) {
	   
	   if(start>end)
		   return null;
	   
	   int index = (start+end)/2;
	   TreeNode newNode = new TreeNode(Integer.parseInt(arr[index]));
	   if(start==end) {
		   return newNode;
	   }
	   newNode.left = constructBst(arr,start,index-1);
	   newNode.right = constructBst(arr,index+1,end); 
	   
	   return newNode;
   }
   
   
   public static TreeNode delete(TreeNode root,int data) {
	   TreeNode temp ;
	   if(root==null) {
		   System.out.println("no ele found bhadue");
	   }
	   if(data<root.getData())
		   root.left = delete(root.left,data);
	   else if(data>root.getData())
		   root.right = delete(root.right,data);
	   else {
		   if(root.left != null && root.right != null)
		   {
			   temp = findMax(root.left);
			   root.setData(temp.getData());
			   root.left = delete(root.left,root.getData());
		   }
		   else {
			   temp =root;
			   if(temp.left == null) {
				   root = temp.getRight();
			   }
			   if(temp.right==null) {
				   root = temp.left;
			   }
		   }
	   }
	   
	   return root;
	   
   }
   
   
   public static TreeNode deleteMe(TreeNode root,int data) {
	   TreeNode temp;
	   if(root==null)
		   System.out.println("no node found like this");
	   if(data<root.getData())
	   root.left = deleteMe(root.left,data);
	   else if(data>root.getData())
		   root.right = deleteMe(root.right,data);
	   else {
		   if(root.left != null && root.right != null) {
			   temp = findMax(root);
			   root.setData(temp.getData());
			   root.left  = deleteMe(root.left,data);
		   }
		   else {
			   temp = root;
			   if(temp.left == null)
				   root= temp.right;
			   if(temp.right==null)
				   root = temp.left;
		   }
	   }
	   
	   
	   return root;
   }
   
   private static TreeNode findMax(TreeNode root) {
	if(root==null)
		return null;
	while(root.right != null)
		root = root.right;
	return root;
}

public static int maxNodeLevel(TreeNode node)
   {
       if(node==null)
       return 0;
       Queue<TreeNode> queue = new LinkedList<>();
       queue.offer(node);
       queue.offer(null);
       int nodeCount = 0;
       int res = 0;
       while(!queue.isEmpty()){
           TreeNode temp = queue.poll();
           if(temp != null){
               nodeCount++;
               if(temp.left != null){
                   queue.offer(temp.left);
               }
               if(temp.right != null){
                   queue.offer(temp.right);
               }
               
           }
           else{
               if(!queue.isEmpty()){
                   queue.offer(null);
               }
               if(nodeCount>res){
                   res = nodeCount;
               }
               nodeCount = 0;
           }
       }
      return res;        
   }
   
public static boolean isBST(TreeNode root) {
	
	if(root==null)
		return true;
	if(root.left != null) {
		TreeNode node  = findMax(root.left);
		if(node.getData()>root.getData()) {
			return false;
		}
	}
	
	if(root.right != null) {
		TreeNode node  = findMin(root.left);
		if(node.getData()<root.getData()) {
			return false;
		}

	}
	
	if(! isBST(root.left)|| !isBST(root.right))
		return false;
	return true;
	
}



















public static TreeNode findMin(TreeNode root) {
	
	if(root==null) {
		return null;
	}
	else {
		while(root.left != null)
			root = root.left;
	}
	return root;
}

  public static void printKdistance(TreeNode root, int k)
   {
       if(root==null){
           return;
       }
       Queue<TreeNode> queue = new LinkedList<>();
       queue.offer(root);
       queue.offer(null);
       int high = 0;
       
       while(!queue.isEmpty()){
           TreeNode temp = queue.poll();
           if(high != k){
           if(temp != null){
               if(temp.left != null){
                   queue.offer(temp.left);
               }
               if(temp.right != null){
                   queue.offer(temp.right);
               }
           }
           else{
               if(!queue.isEmpty()){
                   high++;
                   queue.offer(null);
               }
           }
           
           }else{
        	   if(temp != null)
               System.out.print(temp.getData()+" ");
           }
           
       }   
   
   }
   }

   
