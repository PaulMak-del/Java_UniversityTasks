package ru.mirea._14_lab;

class Application
{
	public static void main(String[] args)
	{
		AbstractChairFactory factory;
		Client client = new Client();

		factory = new ChairFactory();

		client.setChair(factory.createVictorianChair());	
		client.sit();
		doAction(client.chair);
		client.setChair(factory.createMagicanChair());
		client.sit();
		doAction(client.chair);
		client.setChair(factory.createFunctionalChair());
		client.sit();
		doAction(client.chair);
	}
	
	public static void doAction(Chair chair)
	{
		if (chair instanceof VictorianChair)
		{
			VictorianChair ch = (VictorianChair) chair;
			System.out.println(ch.getAge());
		}
		else if (chair instanceof MagicChair)
		{
			MagicChair ch = (MagicChair) chair;
			ch.doMagic();
		}
		else if (chair instanceof FunctionalChair)
		{
			FunctionalChair ch = (FunctionalChair) chair;
			System.out.println(ch.sum(10, 20));
		}
		else
		{
			assert false : "There is some mistake";
		}
	}
}
