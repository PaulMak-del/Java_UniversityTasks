package ru.mirea._14_lab;

class Client
{
	public Chair chair;

	public void sit()
	{
		System.out.println("You sitting at chair now (" + this.chair.getClass() + ")");
	}

	public void setChair(Chair chair)
	{
		this.chair = chair;
	}
}


