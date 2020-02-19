package ds.tree;

public class AncestorPro {
	
	public static void main(String[] args) {
	
		CharNode root = new CharNode('a');
		root.left = new CharNode('b');
		root.right = new CharNode('c');
		
		root.left.left = new CharNode('d');
		root.left.right = new CharNode('e');
		
		root.right.left = new CharNode('f');
		root.right.right = new CharNode('g');
		
		root.left.left.left = new CharNode('h');
		root.left.left.right = new CharNode('i');
		
		root.right.left.left = new CharNode('j');
		root.right.left.right = new CharNode('k');
		root.right.right.right = new CharNode('l');
		CharNode p = new CharNode('j');
		CharNode q = new CharNode('l');
	//	char res = getLCAItr(root,p,q);
		
			}

//	private static char getLCAItr(CharNode root, CharNode p, CharNode q) {
//		
//		ArrayList<>
//		return 0;
//	}

	private static CharNode getLCA(CharNode root, CharNode p, CharNode q) {
		if(root==null) {
			return null;
		}
		if(root.ch==p.ch || root.ch==q.ch)
			return root;
		CharNode left = getLCA(root.left,p,q);
		CharNode right = getLCA(root.right,p,q);
		if(left!=null && right != null) {
			return root;
		}
		
		return left==null?right:left;
	}

}
