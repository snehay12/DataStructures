import java.util.HashSet;
import java.util.Set;

class Node {
	Node next;
	Integer value;

	public Node(int value) {
		this.value = value;
	}
}

public class EliminateDuplicate {
	private Node head;
	private int size;
	public void add(Integer val) {
		Node newNode = new Node(val);
		if (head == null)
			head = newNode;
		else
			newNode.next = head;
		head = newNode;
		size++;
	}

	public void removeDuplicate() {
		Set<Integer> uniqueValues = new HashSet<Integer>();
		Node current = head, previous=null;
		while (current != null) {
			if (uniqueValues.contains(current.value))
			{
				previous.next = current.next;
				size--;
			}
			else {
				uniqueValues.add(current.value);
				previous=current;
			}
			current = current.next;
		}
	}
	
	public int size()
	{
		return size;
	}
	
	public void clearAll()
	{
		head=null;
		size=0;
	}
}
