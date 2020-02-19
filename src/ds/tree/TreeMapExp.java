package ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TreeMapExp {
	
	
	public static void main(String[] args) {
		
	    TreeNode root = new TreeNode(1);
	    root.left = new TreeNode(2);
	   
	    root.left.left  = new TreeNode(3);
	    //bottomView(root);
	   // printSibling(root);
	    topView1(root);
	}
	
    public static void printSibling(TreeNode root){
    	
    	if(root==null)
    		return;
    	if(root.left != null && root.right != null) {
    		printSibling(root.left);
    		printSibling(root.right);

    	}
    	else if(root.left != null) {
    		printSibling(root.left);
       		System.out.println(root.left.getData()+" ");
 
    	}

    	
    	else if(root.right!=null) {
    		System.out.println(root.right.getData()+" ");
    		printSibling(root.right);
    	}
    		
    	 
     }
    
    public static void bottomView(TreeNode root)
    {
        if(root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        root.hd = 0;
        queue.offer(root);
        Map<Integer,ArrayList<Integer>> tp = new TreeMap<>();
        int myhd = 0;
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            myhd = temp.hd;
            if(tp.containsKey(myhd)){
                ArrayList<Integer> al = tp.get(myhd);
                al.add(temp.data);
                tp.put(myhd,al);
            }
            else{
                ArrayList<Integer> newal = new ArrayList<Integer>();
                newal.add(temp.data);
                tp.put(myhd,newal);
            }
            if(temp.left != null){
                temp.left.hd = myhd-1;
                queue.offer(temp.left);
            }
            if(temp.right != null){
                temp.right.hd = myhd+1;
                queue.offer(temp.right);
            }
            
        }
        
        for(Map.Entry<Integer,ArrayList<Integer>> entry:tp.entrySet()){
            ArrayList<Integer> tempal = entry.getValue();
            System.out.print(tempal.get(tempal.size()-1)+" ");
        }
      
    }
    
    static void topView(TreeNode root)
    {
        // add your code
        if(root==null)
        return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            
            if(temp != null){
            al.add(temp.data);
            if(temp.left !=null){
                queue.offer(temp.left);
            }
            if(temp.right != null){
                queue.offer(temp.right);
            }
            } 
            else{
            	
            	ArrayList<Integer> tempal = new ArrayList<Integer>(al);
                res.add(tempal);
                al.clear();
 
                if(!queue.isEmpty()){
                	
                    queue.offer(null);
                }
            }
        }
        int x = res.size();
        ArrayList<Integer> myal = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=x-1;i>=0;i--){
            myal = res.get(i);
            sb.append(myal.get(0)+" ");
            
        }
    for(int j=1;j<x;j++){
            myal = res.get(j);
            sb.append(myal.get(myal.size()-1)+" ");
            
        }

System.out.print(sb);
    }
    
    
    
    public static void topView1(TreeNode root)
    {
        if(root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        root.hd = 0;
        queue.offer(root);
        Map<Integer,ArrayList<Integer>> tp = new TreeMap<>();
        int myhd = 0;
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            myhd = temp.hd;
            if(tp.containsKey(myhd)){
                ArrayList<Integer> al = tp.get(myhd);
                al.add(temp.data);
                tp.put(myhd,al);
            }
            else{
                ArrayList<Integer> newal = new ArrayList<Integer>();
                newal.add(temp.data);
                tp.put(myhd,newal);
            }
            if(temp.left != null){
                temp.left.hd = myhd-1;
                queue.offer(temp.left);
            }
            if(temp.right != null){
                temp.right.hd = myhd+1;
                queue.offer(temp.right);
            }
            
        }
        
        for(Map.Entry<Integer,ArrayList<Integer>> entry:tp.entrySet()){
            ArrayList<Integer> tempal = entry.getValue();
            System.out.print(tempal.get(0)+" ");
        }
      
    }
    


}
