package ru.mirea._11_lab;

interface Queue<E>
{
	void enqueue(E element);
	E dequeue();
	E element();
	int size();
	boolean isEmpty();
	void clear();
}
