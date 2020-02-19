package arrray.dp;

import java.util.LinkedList;
import java.util.Queue;

public class TreeDemo {	
	public static void main(String[] args) {
	   Node root = new Node(15);
	   root.left = new Node(10);
	   root.right = new Node(28);
	   root.left.left = new Node(8);
	   root.left.right = new Node(12);
	   root.right.left = new Node(16);
	   root.right.right = new Node(25);
	   printCorner(root);
		
	}	
	
	
	  public static void printCorner(Node root)
	    {
	        
	        if(root==null)
	        return;
	        Queue<Node> queue = new LinkedList<>();
	        Node node = root;
	        queue.offer(node);
	        queue.offer(null);
	        boolean first = true;
	        Node last = null;
	        while(!queue.isEmpty()){
	            Node temp = queue.poll();
	            if(temp != null){
	                 last = temp;
	                if(first){
	                    System.out.print(temp.data+" ");
	                }
	             if(temp.left != null){
	                queue.offer(temp.left);
	            }
	            if(temp.right != null)
	            {
	                queue.offer(temp.right);
	            }
                first = false;
	 
	            }
	            else{
	                if(last != root)
	              System.out.print(last.data+" ");

	                if(!queue.isEmpty()){
	                    queue.offer(null);
	                    first = true;
	                }
	            }
	        }
	    }
	

}
