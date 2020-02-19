package ds.linkedlist;

public class PairwiseSwap {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(2);
		root.next.next.next = new Node(4);
		root.next.next.next.next = new Node(5);
		root.next.next.next.next.next = new Node(6);
		root.next.next.next.next.next.next = new Node(7);
		root.next.next.next.next.next.next.next = new Node(8);
		
		Node temp = root;
		while(temp != null) {
			if(temp.next != null) {
				int x = temp.data;
				temp.data = temp.next.data;
				temp.next.data = x;
			}
			temp = temp.next.next;
		}
		
		while(root != null) {
			System.out.print(root.data+" ");
			root = root.next;
		}

	}


}
