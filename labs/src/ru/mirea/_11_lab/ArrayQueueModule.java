package ru.mirea._11_lab;

import java.util.ArrayList;

class ArrayQueueModule<E> implements Queue<E>
{
	private E[] queue;
	private int size;
	private int rearIndex;
	private int frontIndex;

	public ArrayQueueModule(int size)
	{	
		this.queue = (E[]) new Object[size]; 
		this.size = size;
		this.rearIndex = -1;
		this.frontIndex = -1;
	}

	public void enqueue(E element) 
	{
		if (this.frontIndex == -1 && this.rearIndex == -1)
		{
			this.frontIndex++;
			this.rearIndex++;
			queue[rearIndex] = element;
			return;
		} 

		int nextIndex = (this.rearIndex + 1) % size;	//Проверка на полноту масссива
		assert (nextIndex != this.frontIndex) : "ERROR: Queue is full";

		this.rearIndex = (this.rearIndex + 1) % this.size;
		queue[this.rearIndex] = element;

	}	

	public E dequeue() 
	{
		assert !isEmpty() : "Queue is empty";
		
		E elem = queue[this.frontIndex];
		queue[this.frontIndex] = null;
	        this.frontIndex = (this.frontIndex + 1) % size;	
		return elem; 
	}

	public E element()  
	{
		assert !isEmpty() : "Queue is empty";
		return this.queue[this.rearIndex];
	}

	public int size()
	{
		return this.size;
	}

	public boolean isEmpty()
	{
		return this.frontIndex + 1 == this.rearIndex;
	}

	public void clear()
	{
		this.rearIndex = -1;
		this.frontIndex = -1;

		for (int i = 0; i < this.size; i++)
		{
			this.queue[i] = null;
		}
	}

	public String toString()
	{
		String str = "[ ";

		for (int i = 0; i < size; i++)
		{
			str += queue[i] + ", ";
		}

		return str + "]";
	}
}

