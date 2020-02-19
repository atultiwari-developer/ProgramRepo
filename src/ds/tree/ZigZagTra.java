package ds.tree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import javafx.util.Pair;

public class ZigZagTra {
	
    public static void main(String[] args) {
		CharNode root = null;
		root = new CharNode('a');
		root.left = new CharNode('b');
		root.right = new CharNode('c');
		
		root.left.left = new CharNode('d');
		root.left.right = new CharNode('e');
		
		root.right.left = new CharNode('f');
		root.right.right = new CharNode('g');
		
		root.left.left.left = new CharNode('h');
		root.left.left.right = new CharNode('i');
		root.left.left.right.left = new CharNode('m');
		root.left.left.right.right = new CharNode('n');
		
		root.right.left.left = new CharNode('j');
		root.right.left.right = new CharNode('k');
		
		root.right.left.right.left = new CharNode('p');
		root.right.left.right.right = new CharNode('q');

		root.right.right.right = new CharNode('l');
		
		Map<Integer,ArrayList<CharNode>> map = new LinkedHashMap<>();
		map = getLevelOrdTra(root);
		printLevelOrder(map);
		
		//zigZagTra(root);
		//printLeafRec(root);
//		printLeftBoundry(root);
//		printRightBoundry(root.right);
//		printLeaf(root);
		//printLeftBoundry(root);
		
	}
    private static Map<Integer, ArrayList<CharNode>> getLevelOrdTra(CharNode root) {
    	Map<Integer, ArrayList<CharNode>> res= new LinkedHashMap<>();
    	if(root==null)
    		return res;
    	Queue<Pair<CharNode,Integer>> queue = new LinkedList<>();
    	int hd = 0;
    	queue.offer(new Pair<CharNode,Integer>(root,hd));
    	while(!queue.isEmpty()) {
    		Pair<CharNode,Integer> temp = queue.poll();
    		hd = temp.getValue();
    		if(res.containsKey(hd)) {
    			ArrayList<CharNode> list = res.get(hd);
    			list.add(temp.getKey());
    			res.put(hd, list);
    		}
    		else {
    			ArrayList<CharNode> list = new ArrayList<CharNode>();
    			list.add(temp.getKey());

        		res.put(hd,list);

    		}
     		if(temp.getKey().left != null) {
     	    	queue.offer(new Pair<CharNode,Integer>(temp.getKey().left,hd-1));
    			
    		}
     		if(temp.getKey().right != null) {
     	    	queue.offer(new Pair<CharNode,Integer>(temp.getKey().right,hd+1));
    			
    		}
    		
    	}
    	
		
		return res;
	}
    
    public static void printLevelOrder(Map<Integer, ArrayList<CharNode>> map) {
    	
    	for(Map.Entry<Integer, ArrayList<CharNode>> entry:map.entrySet()) {
    		System.out.print(entry.getKey()+"/t"+"");
    		 ArrayList<CharNode> listNode = entry.getValue();
    		 listNode.stream().forEach(node->System.out.print(node.ch+" "));   		 
    		 System.out.println();
    	}
    	
    }
    
	public static void zigZagTra(CharNode root) {   	
    	if(root==null)
    		return ;
    	Stack<CharNode> s1 = new Stack<>();
    	Stack<CharNode> s2 = new Stack<>();
    	s1.push(root);   	
    	while(!s1.isEmpty()) {
    		CharNode temp = s1.pop();
    		
    		System.out.print(temp.ch+" ");
    		if(temp.left != null) {
    			s2.push(temp.left);
    		}
    		if(temp.right != null) {
    			s2.push(temp.right);    			
    		}
    		if(s1.isEmpty()) {
    			while(!s2.isEmpty()) {
    				CharNode temp1 = s2.pop();
    	    		System.out.print(temp1.ch+" ");   	    		
    	       		if(temp1.right != null) {
    	    			s1.push(temp1.right);
    	    		}
    	    		if(temp1.left != null) {
    	    			s1.push(temp1.left);    			
    	    		}
    	 

    			}
    		}
    	}
//    	if(!s2.isEmpty())
//    	System.out.print(s2.pop().ch+" ");
    	   	
    	
    }
    
    public static  void printLeaf(CharNode root) {
    	
    	if(root==null)
    		return;
    	Queue<CharNode> queue = new LinkedList<>();
    	
    	queue.offer(root);
    	while(!queue.isEmpty()) {
    		CharNode temp = queue.poll();
    		if(temp != null) {
    			if(temp.left==null && temp.right==null) {
    				System.out.print(temp.ch+" ");
    			}
    			if(temp.left != null) {
    				queue.offer(temp.left);
    			}
    			if(temp.right != null) {
    				queue.offer(temp.right);
    			}
    		}
    		
    	}
    	
    	
    }
    
    
    public  static void printLeafRec(CharNode root) {
    	if(root != null) {
        	printLeaf(root.left);
        	if(root.left == null && root.right==null) {
        		System.out.print(root.ch+" ");
        	}
        	printLeaf(root.right);

    	}
    	    	
    }
    
	public static  void printLeftBoundry(CharNode root){
		
		if(root != null) {
		     if(root.left != null) {
					System.out.print(root.ch+" ");
					printLeftBoundry(root.left);
		     }
		     else if(root.right != null) {
					System.out.print(root.ch+" ");
					printLeftBoundry(root.right);

		     }
			
		}
		
	}
	
	public static void printRightBoundry(CharNode root) {
		if(root != null) {
			if(root.right != null) {
				System.out.print(root.ch+" ");
				printLeftBoundry(root.right);
			}
			else if(root.left != null) {
				System.out.print(root.ch+" ");
				printLeftBoundry(root.left);

			}
		}
	}

	

}
