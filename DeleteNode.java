public class DeleteNode {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	private void delete(int position)
	{
		if (head == null)
			return;
		Node temp = head;
		if (position == 0)
		{
			head = temp.next;
			return;
		}
		for (int i = 0; temp != null & i < position - 1; i++)
		{
			temp = temp.next;
		}
		if (temp == null || temp.next == null)
			return;
		
		Node next = temp.next.next;
		temp.next = next; 
	}

	public static void main(String[] args) {
		DeleteNode node = new DeleteNode();
		node.push(11);
		node.push(12);
		node.push(13);
		node.push(14);
		node.push(15);
		node.push(16);
		node.push(17);
		node.push(18);
		node.printList();
		node.delete(5);
		System.out.println();
		node.printList();

	}
}