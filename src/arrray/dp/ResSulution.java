package arrray.dp;

class ResSulution{
	public static void main(String[] args) {
		Res obj = new Res();
		ResSulution res = new ResSulution();
		
		Node root = new Node(78);
		root.left = new Node(34);
		root.right = new Node(97);
		root.left.left = new Node(12);
		root.left.right = new Node(45);
        int key = 34;
        Res p = new Res();
        Res s = new Res();
        res.findPreSuc(root,p,s,key);
       
        if(p.pre != null) {
        	System.out.print(p.pre.data+" ");
        }
        else {
        	System.out.print(-1+" ");
        }
        
        if(s.succ != null) {
        	System.out.print(p.succ.data+" ");
        }
        else {
        	System.out.print(-1+" ");
        }

        
		System.out.println(obj.pre.data);
		
	}
	
	
	
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       if(root==null)
       {
           if(key<root.data){
           findPreSuc(root.left,p,s,key);
       }
       else if(key>root.data){
          findPreSuc(root.right,p,s,key);
       }
//       else if(root.data){ 
//           p.pre = findMax(root.right);
//           s.succ = findMin(root.left);
//       }

       }
       
    }
    
    public static Node findMax(Node root){
        if(root==null)
        return null;
        else{
            while(root.right != null)
            root = root.right;
        }
        return root;
    }
    
    public static Node findMin(Node root){
        if(root==null)
        return null;
        else{
            while(root.left != null){
                root = root.left;
            }
        }
        return root;
    }

}
