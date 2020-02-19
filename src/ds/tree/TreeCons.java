package ds.tree;

public class TreeCons {

	
	public static int indexpre = 0;
	
	public static void main(String[] args) {
		char[]inArr = { 'D', 'B', 'E', 'A', 'F', 'C' }; 
		char[]preArr = { 'A', 'B', 'D', 'E', 'C', 'F' };
		int len = inArr.length;
		CharNode root = null;
		root = constructTree(inArr,preArr,0,len-1);
		
         preorder(root);
		
	}

	private static CharNode constructTree(char[] inArr, char[] preArr, int start, int end) {
		
		if(start>end) {
			return null;
		}
		
		CharNode newNode = new CharNode(preArr[indexpre++]);
		
		if(start==end) {
			return newNode;
		}
		int index = serachInd(inArr,start,end,newNode.ch);
		
		newNode.left = constructTree(inArr,preArr,start,index-1);
		newNode.right = constructTree(inArr,preArr,index+1,end);
		
		return newNode;
	}

	private static int serachInd(char[] inArr, int start, int end, char ch) {
		int i;
		
		for(i=start;i<=end;i++) {
			if(inArr[i]==ch) {
				return i;
			}
		}
		
		return i;
	}

	private static void preorder(CharNode root) {
		
		if(root != null) {
			System.out.print(root.ch+" ");
			preorder(root.left);
			preorder(root.right);
		}
		
		
	}

}
