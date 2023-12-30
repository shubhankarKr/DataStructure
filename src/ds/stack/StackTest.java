package ds.stack;

public class StackTest {
	public static void main(String[] args) throws Exception {
		Stack stack = new Stack(5);
		stack.push(5);
		stack.push(3);
		stack.push(6);
		stack.push(1);
//		System.out.println("peek " + stack.peek());
//		stack.display();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
		stack.push(9);
		stack.push(9);
		stack.display();
//		stack.pop();
	}
}
