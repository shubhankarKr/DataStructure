package ds.queue;

public class QueueTest {
	public static void main(String[] args) throws Exception {
		Queue q = new Queue(3);
		q.enQueue(4);
		q.display();
		q.enQueue(8);
		q.enQueue(7);
		q.display();
//		q.enQueue(0);
		q.deQueue();
		q.deQueue();
		q.display();
		q.deQueue();
		q.display();
		q.deQueue();
	}
}
