package ds.ls;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.addNode(2);
		ls.addNode(3);
		ls.addNode(4);
		ls.addNode(5);
		ls.display();
//		System.out.println("ls head +ls tail " + ls.getHead().getData() + " - " + ls.getTail().getData());
		ls.addFirstNode(9);
		ls.display();
		ls.addAfterNode(3, 7);
		ls.display();
		ls.deleteNode(4);
		ls.display();
	}
}
