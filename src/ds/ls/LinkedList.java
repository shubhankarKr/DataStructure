package ds.ls;

public class LinkedList {
	private Node head;
	private Node tail;

	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = tail = node;
		} else {
			Node temp = getHead();
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
			tail = node;

		}
	}

	public void addFirstNode(int data) {
		Node node = new Node(data);
		node.setNext(getHead());
		head = node;

	}

	public void addAfterNode(int condition, int data) {
		// logic
		Node node = new Node(data);
		Node temp = getHead();
		while (temp.getData() != condition) {
			temp = temp.getNext();
		}
		node.setNext(temp.getNext());
		temp.setNext(node);
	}

	public void deleteNode(int data) {
		Node node = new Node(data);
		Node temp = getHead();
		while (temp.getNext().getData() != data) {
			temp = temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());

	}

	public void display() {
		Node temp = this.getHead();
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

}
