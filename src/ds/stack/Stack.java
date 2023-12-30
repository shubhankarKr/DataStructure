package ds.stack;

public class Stack {
	private int top;
	private int arr[];

	Stack(int size) {
		this.top = -1;
		this.arr = new int[size];
	}

	void push(int ele) throws Exception {
		if (top == arr.length - 1) {
			throw new Exception("Stack is full");
		}
		top++;
		arr[top] = ele;
	}

	int peek() {
		return this.arr[top];
	}

	int pop() throws Exception {
		if (top == -1) {
			throw new Exception("Stck is empty ");
		}
		int ele = this.arr[arr.length - 1];
		top--;
		return ele;
	}

	void display() {
		int top = getTop();
		while (top != -1) {
			System.out.print(arr[top] + " ");
			top--;
		}
		System.out.println();

	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getTop() {
		return top;
	}

}
