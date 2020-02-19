package ds.linkedlist;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		Node root = new Node(5);
		root.next = new Node(2);
		root.next.next = new Node(2);
		root.next.next.next = new Node(4);
//		root.next.next.next.next = new Node(3);
//		root.next.next.next.next.next = new Node(7);
//		root.next.next.next.next.next.next = new Node(5);
//		root.next.next.next.next.next.next.next = new Node(6);

       
        
		Node temp  =root;
		Node prev = null;
		boolean isDuplicate = false;
		while(temp != null){
			Node in = root;
			if(prev != null) {
				while(in != temp) {
					if(in.data==temp.data) {
						isDuplicate = true;
						break;
					}
					in = in.next;
				}

			}
			
			if(prev != null && isDuplicate==true ) {
				prev.next =  temp.next;	
				isDuplicate = false;
			}
			else {
				prev = temp;
			}
			temp = temp.next;
		}
		
		while(root != null) {
			System.out.print(root.data+" ");
			root= root.next;
		}



	}

}
