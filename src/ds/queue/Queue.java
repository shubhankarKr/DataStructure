package ds.queue;

public class Queue {
	private int front, rear, maxSize;
	private int arr[];

	boolean enQueue(int ele) throws Exception {
		if (rear == maxSize - 1) {
			throw new Exception("Queue is full");
		} else {
			rear++;
			arr[rear] = ele;
			return true;
		}
	}

	boolean deQueue() throws Exception {
		if (front > rear) {
			throw new Exception("Queue is empty");
		} else {
			front++;
			return true;
		}
	}

	void display() {
		int temp = front;
		while (temp <= rear) {
			System.out.print(arr[temp] + " ");
			temp++;
		}
		System.out.println();
	}

	public Queue(int size) {
		this.front = 0;
		this.rear = -1;
		this.arr = new int[size];
		this.maxSize = size;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public int[] getArr() {
		return arr;
	}
}
