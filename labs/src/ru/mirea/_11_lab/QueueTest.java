package ru.mirea._11_lab;

class QueueTest
{
	public static void main(String[] args)
	{
		ArrayQueueModule<Integer> q = new ArrayQueueModule<>(6);

		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		System.out.println(q.element());
		System.out.println(q.isEmpty());

		System.out.println(q);

		q.enqueue(4);
		q.enqueue(5);

		q.dequeue();
		q.dequeue();
		q.dequeue();

		System.out.println(q);
		
		q.enqueue(6);
		q.enqueue(7);

		System.out.println(q);

		q.enqueue(8);
		q.dequeue();
		q.dequeue();
		q.dequeue();

		System.out.println(q);

		q.clear();
		System.out.println(q);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q);

		ArrayQueueModule<String> q2 = new ArrayQueueModule<>(6);
		q2.enqueue("Hello");
		q2.enqueue("World");
		q2.enqueue("!!!");
		q2.dequeue();
		System.out.println(q2);
	}
}
